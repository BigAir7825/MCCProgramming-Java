package adairassignment4;
import java.io.*;
public class AdairAssignment4 {
    public static void main(String[] args) {
        String filePath = "file.txt", text = "A\nB\nC\nD";
        appendToFile(filePath, text);
        String output = readFromFile(filePath);
        System.out.println(output);
    }
    public static void appendToFile(String inputFile, String inputText){
        try{
            PrintWriter writer = new PrintWriter(new BufferedWriter (new FileWriter(inputFile, true)));
            writer.write(inputText + "\n");
            writer.close();
            System.out.println("End of write operation");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    public static String readFromFile(String outputFile) {
        String text = "";
        int x = 0;
        String[] fileParts = new String[4];
        try {
        BufferedReader fileReader = new BufferedReader(new FileReader(outputFile));
        fileParts[0] = fileReader.readLine();
        fileParts[1] = fileReader.readLine();
        fileParts[2] = fileReader.readLine();
        fileParts[3] = fileReader.readLine();
        text = (fileParts[0] + "\n" + fileParts[1] + "\n" + fileParts[2] + "\n" + fileParts[3]);
        System.out.println("End of read operation");
        }
        catch(IOException e){
            System.out.println(e);
        }
        return text;
    }
}
