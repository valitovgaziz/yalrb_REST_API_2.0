package ru.yalrb.entity.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import ru.yalrb.entity.models.Transport;
import ru.yalrb.entity.models.yalObject.LeisureType;
import ru.yalrb.services.LeisureTypeService;
import ru.yalrb.services.TransportService;

import java.io.*;
import java.util.Objects;

@Component
public class DataLoaderFromFiles {

    private final String DELIMITER = "\\|";

    @Autowired
    private TransportService transportService;

    @Autowired
    private LeisureTypeService leisureTypeService;


    @EventListener(ApplicationReadyEvent.class)
    public void loadTransportTypeData() throws FileNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(Objects.requireNonNull(classLoader.getResource("data/transportTypes.data")).getFile());
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
    public void loadLeisureTypesData() throws FileNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(Objects.requireNonNull(classLoader.getResource("data/leisureTypes.dat")).getFile());
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String nextLine;
        String[] leisureTypeLine;
        try {
            while (reader.ready()) {
                nextLine = reader.readLine();
                leisureTypeLine = nextLine.split(DELIMITER);
                LeisureType leisureType = new LeisureType();
                leisureType.setName(leisureTypeLine[0]);
                leisureType.setDescription(leisureTypeLine[1]);
                leisureTypeService.save(leisureType);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
