import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("file.txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
            fileReader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
