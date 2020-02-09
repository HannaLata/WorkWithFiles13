package com.mainacad;

import com.mainacad.service.FileService;

import java.util.logging.Logger;

public class AppRunner {

    private static final Logger LOGGER = Logger.getLogger(AppRunner.class.getName());

    public static void main(String[] args) {

        String text = "Some new text\nI wanted to be written\n";

        FileService.writeTextToFile(text, "test.txt", false);

        String inputText = FileService.readTextFromFile("test.txt");

        LOGGER.info("\n" + inputText);

        FileService.copyFile("cat.jpg", "cat_copy.jpg");

    }
}
