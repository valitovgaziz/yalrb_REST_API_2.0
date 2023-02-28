package ru.yalrb.entity.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import ru.yalrb.entity.models.Transport;
import ru.yalrb.services.TransportService;

import java.io.*;
import java.util.Objects;

@Component
public class DataLoaderFromFiles {


    @Autowired
    private TransportService transportService;


    @EventListener(ApplicationReadyEvent.class)
    public void loadTransportTypeData() throws FileNotFoundException {

        ClassLoader classLoader = getClass().getClassLoader();

        File file = new File(Objects.requireNonNull(classLoader.getResource("data/data.dat")).getFile());

        BufferedReader reader = new BufferedReader(new FileReader(file));

        String nextLine;
        String[] transportData;

        try {
            while (reader.ready()) {
                nextLine = reader.readLine();
                transportData = nextLine.split("\\|");
                Transport transport = new Transport();
                transport.setName(transportData[0]);
                transport.setDescription(transportData[1]);
                transportService.save(transport);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
