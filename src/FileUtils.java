import java.io.*;


public class FileUtils {


    public static void writeTextFile(String filecontent, String filename) {


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename));) {

            writer.write(filecontent);

        } catch (IOException e) {

            e.printStackTrace();

        }
    }

    public static String readTextFile(String fileName){

        StringBuilder fileContent = new StringBuilder();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){

            String line;
            while((line = reader.readLine()) != null){
                fileContent.append(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println(fileName + "not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }

       return fileContent.toString();
    }

}
