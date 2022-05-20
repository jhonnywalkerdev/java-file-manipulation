package FileManipulation;

import javax.xml.crypto.Data;

public class UseDataManipulation {
    public static void main(String[] args) {
        DataManipulation.writeData();
        System.out.println("Recorded data sucefully.");
        System.out.println("Showing data...");
        DataManipulation.readData();

        DataManipulation.writeDataText();
        System.out.println("Recorded data sucefully.");
        System.out.println("Showing data...");
        DataManipulation.readDataText();
    }

}
