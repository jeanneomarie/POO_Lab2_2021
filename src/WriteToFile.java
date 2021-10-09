import java.io.FileWriter;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("file.txt");
            writer.write("Hello");
            writer.write("\r\n");
            writer.write("Bye");
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
