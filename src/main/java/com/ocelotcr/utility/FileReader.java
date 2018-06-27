package com.ocelotcr.utility;

import com.ocelotcr.Carpaccio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReader {

    private static final Logger logger = LoggerFactory.getLogger(Carpaccio.class);
    private final String fileName;
    private List<String> contents = new ArrayList<>();

    public FileReader(String fileName) {
        this.fileName = fileName;
        extractContents();
    }

    private void extractContents(){
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            contents = stream
                    .map(String::toString)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            logger.info("File Name doesnt exist {}", fileName);
        }
    }

    public String getLine(Integer lineToGet){
        return contents.get(lineToGet);
    }
}
