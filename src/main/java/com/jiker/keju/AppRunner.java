package com.jiker.keju;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AppRunner {
    public static void main(String[] args) {
        String testDataFile = "testData.txt";
        String receipt = "";
        try {
            receipt = getReceipt(testDataFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print(receipt);
    }

    public static String getReceipt(String testDataFile) throws IOException {
        String receipt = "";
        Utils utils = new Utils();
        File file = utils.getFileFromResources(testDataFile);
        BufferedReader br = new BufferedReader(new FileReader(file));
        receipt = readLine(br);
        return receipt;
    }

    public static String readLine(BufferedReader br) throws IOException {
        String line = "";
        String receipt = "";
        Utils utils = new Utils();
        while ((line = br.readLine()) != null) {
            int[] lineResult = utils.getInputs(line);
            receipt = execute(lineResult);
        }
        return receipt;
    }

    public static String execute(int[] lineResult) {
        String receipt = "";
        TaxiPriceCalculate calculate = new TaxiPriceCalculate(lineResult[0], lineResult[1]);
        TaxiController txController = new TaxiController();
        receipt += calculate.displayPrice(txController);
        return receipt;
    }
}
