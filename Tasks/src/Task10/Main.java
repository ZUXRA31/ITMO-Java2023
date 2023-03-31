package Task10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<String> readLinesFromText(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            List<String> fileText = new ArrayList<>();
            while (reader.ready()) {
                fileText.add(reader.readLine());
            }
            reader.close();
            return fileText;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void fileWriter(String filename, String text) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void fileConnector(String filename1, String filename2){
        try (FileReader reader = new FileReader(filename1)) {
            String res = "";
            int c;
            while ((c = reader.read()) > 0) {
                res += (char) c;
            }
            FileWriter writer = new FileWriter(filename2, true);
            writer.write(res);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void fileDollars(String filename){
        try (FileReader reader = new FileReader(filename)) {
            String res = "";
            int c;
            while ((c = reader.read()) > 0) {
                res += (char) c;
            }
            res = res.replaceAll("[^0-9A-Za-zА-Яа-я]", "\\$");
            FileWriter writer = new FileWriter(filename);
            writer.write(res);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        /*
        List<String> arrayText = readText("TextProject.txt");
        System.out.println(arrayText);
        fileConnector("TextProject.txt","TextProjectSecond.txt");
        List<String> arrayTextSecond = readText("TextProjectSecond.txt");
        System.out.println(arrayTextSecond);
        */
        System.out.println(readLinesFromText("TextProject.txt"));
    }
}