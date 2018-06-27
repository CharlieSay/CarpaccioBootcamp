package com.ocelotcr.utility;

import org.junit.Assert;
import org.junit.Test;

public class FileReaderTest {

    private FileReader fileReader;

    @Test
    public void should_getContent_WhenFileExists(){
        fileReader = new FileReader("DB_CARPACCIO_P.txt");

        Assert.assertNotNull(fileReader.getLine(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void should_CreateEmptyList_WhenFileDoesntExist(){
        fileReader = new FileReader("somethingFunny.txt");

       fileReader.getLine(0);
    }

}