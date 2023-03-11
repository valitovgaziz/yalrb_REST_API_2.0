package ru.yalrb.dataLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;
import ru.yalrb.entity.models.AgeRange;
import ru.yalrb.entity.models.RiskFactor;
import ru.yalrb.entity.models.Transport;
import ru.yalrb.entity.models.yalObject.LeisureSubType;
import ru.yalrb.entity.models.yalObject.LeisureType;
import ru.yalrb.entity.models.yalObject.YalObjectType;
import ru.yalrb.services.*;

import java.io.*;
import java.util.Objects;

@Component
public class DataLoaderFromFiles {

    private final String DELIMITER = "\\|";

    @Autowired
    private RiskFactorService riskFactorService;

    @Autowired
    private TransportService transportService;

    @Autowired
    private LeisureTypeService leisureTypeService;

    @Autowired
    private LeisureSubTypeService leisureSubTypeService;

    @Autowired
    private YalObjectTypeService yalObjectTypeService;

    @Autowired
    private AgeRangeService ageRangeService;

    @EventListener(ApplicationReadyEvent.class)
    public void loadTransportTypeData() throws FileNotFoundException {
        File file = ResourceUtils.getFile("classpath:data/transportTypes.dat");
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
        File file = ResourceUtils.getFile("classpath:data/leisureTypes.dat");
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
    public void loadLeisureSubTypes() throws FileNotFoundException {
        File file = ResourceUtils.getFile("classpath:data/leisureSubTypes.dat");

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
    public void loadYalObjectTypes() throws FileNotFoundException {
        File file = ResourceUtils.getFile("classpath:data/yalObjectTypes.dat");

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

    @EventListener(ApplicationReadyEvent.class)
    public void loadAgeRangeData() throws FileNotFoundException {
        File file = ResourceUtils.getFile("classpath:data/ageRange.dat");


        try (
                BufferedReader reader = new BufferedReader(new FileReader(file))
        ) {
            String[] rangeDataParts;
            while (reader.ready()) {
                rangeDataParts = reader.readLine().split(DELIMITER);
                AgeRange ageRange = AgeRange.builder()
                        .fromAge(Integer.parseInt(rangeDataParts[0]))
                        .toAge(Integer.parseInt(rangeDataParts[1]))
                        .name(rangeDataParts[2])
                        .description(rangeDataParts[3])
                        .build();
                ageRangeService.save(ageRange);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @EventListener(ApplicationReadyEvent.class)
    public void loadRiskFactorsData() throws FileNotFoundException {
        File file = ResourceUtils.getFile("classpath:data/riskFactors.dat");

        try (
                BufferedReader reader = new BufferedReader(new FileReader(file))
        ) {
            String[] riskFactorsParts;
            while (reader.ready()) {
                riskFactorsParts = reader.readLine().split(DELIMITER);
                RiskFactor riskFactor = RiskFactor.builder()
                        .name(riskFactorsParts[0])
                        .description(riskFactorsParts[1])
                        .build();

                riskFactorService.save(riskFactor);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
