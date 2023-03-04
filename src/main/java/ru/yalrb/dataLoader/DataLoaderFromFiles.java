package ru.yalrb.dataLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import ru.yalrb.entity.models.Transport;
import ru.yalrb.entity.models.yalObject.LeisureSubType;
import ru.yalrb.entity.models.yalObject.LeisureType;
import ru.yalrb.entity.models.yalObject.YalObjectType;
import ru.yalrb.services.LeisureSubTypeService;
import ru.yalrb.services.LeisureTypeService;
import ru.yalrb.services.TransportService;
import ru.yalrb.services.YalObjectTypeService;

import java.io.*;
import java.util.Objects;

@Component
public class DataLoaderFromFiles {

    private final String DELIMITER = "\\|";

    @Autowired
    private TransportService transportService;

    @Autowired
    private LeisureTypeService leisureTypeService;

    @Autowired
    private LeisureSubTypeService leisureSubTypeService;

    @Autowired
    private YalObjectTypeService yalObjectTypeService;

    ClassLoader classLoader = getClass().getClassLoader();


    @EventListener(ApplicationReadyEvent.class)
    public void loadTransportTypeData() throws FileNotFoundException {
        File file = new File(Objects.requireNonNull(classLoader.getResource("data/transportTypes.dat")).getFile());
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String nextLine;
        String[] transportData;
        try {
            while (reader.ready()) {
                nextLine = reader.readLine();
                transportData = nextLine.split(DELIMITER);
                Transport transport = new Transport();
                transport.setName(transportData[0]);
                transport.setDescription(transportData[1]);
                transportService.save(transport);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @EventListener(ApplicationReadyEvent.class)
    public void loadLeisureTypesData() {
        File file = new File(Objects.requireNonNull(classLoader.getResource("data/leisureTypes.dat")).getFile());
        try (
                BufferedReader reader = new BufferedReader(new FileReader(file))
        ) {
            String[] leisureTypeLine;
            while (reader.ready()) {
                leisureTypeLine = reader.readLine().split(DELIMITER);
                LeisureType leisureType = new LeisureType();
                leisureType.setName(leisureTypeLine[0]);
                leisureType.setDescription(leisureTypeLine[1]);
                leisureTypeService.save(leisureType);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @EventListener(ApplicationReadyEvent.class)
    public void loadLeisureSubTypes() {
        File file = new File(Objects.requireNonNull(classLoader.getResource("data/leisureSubTypes.dat")).getFile());

        try (
                BufferedReader reader = new BufferedReader(new FileReader(file))
        ) {
            String[] leisureSubTypeLine;
            while (reader.ready()) {
                leisureSubTypeLine = reader.readLine().split(DELIMITER);
                LeisureSubType leisureSubType = new LeisureSubType();
                leisureSubType.setName(leisureSubTypeLine[0]);
                leisureSubType.setDescription(leisureSubTypeLine[1]);
                leisureSubTypeService.save(leisureSubType);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @EventListener(ApplicationReadyEvent.class)
    public void loadYalObjectTypes() {
        File file = new File(Objects.requireNonNull(classLoader.getResource("data/yalObjectTypes.dat")).getFile());

        try (
                BufferedReader reader = new BufferedReader(new FileReader(file))
        ) {
            String[] yalObjectTypeParts;
            while (reader.ready()) {
                yalObjectTypeParts = reader.readLine().split(DELIMITER);
                YalObjectType yalObjectType = new YalObjectType();
                yalObjectType.setName(yalObjectTypeParts[0]);
                yalObjectType.setDescription(yalObjectTypeParts[1]);
                yalObjectTypeService.save(yalObjectType);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
