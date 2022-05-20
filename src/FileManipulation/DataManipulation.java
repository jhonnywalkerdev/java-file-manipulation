package FileManipulation;

import java.io.*;

public class DataManipulation {
    public static void writeData(){
        FileOutputStream file;
        try {
            file = new FileOutputStream("data.dat");
            for(int cont = 65; cont < 90; cont++){
                file.write(cont); // write byte(8 bit) in file
            }
            file.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void readData(){
        FileInputStream file;
        int letter = 0;
        try {
            file = new FileInputStream("data.dat");
            while(letter!=-1){
                letter = file.read();
                System.out.println(letter);

            }
            file.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readDataText(){
        FileReader in = null;
        try{
            in = new FileReader("outtest.txt");
            int c;
            while((c = in.read()) != -1){
                System.out.println((char)c);
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
        finally {
            if (in != null){
                try{
                    in.close();
                } catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void writeDataText(){
        FileWriter out = null;
        int cont = 0;
        String text = "text to insert in file";
        try{
            out = new FileWriter("outtest.txt");
            while(cont < text.length()){
                out.write(text.charAt(cont));
                cont++;
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        finally{
            if(out != null){
                try{
                    out.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
