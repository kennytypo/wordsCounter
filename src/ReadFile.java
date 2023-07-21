import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
    private static ArrayList<String> list = new ArrayList<>();
    private static String result;
    public static int countWords(String path){
        File file = new File(path);


        try(BufferedReader reader = new BufferedReader(new java.io.FileReader(file))){
            while (reader.ready()){
                result = reader.readLine();
                String[] array = result.split(" ");

                for (int i = 0; i < array.length; i++) {
                    list.add(array[i]);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        return list.size();
    }
}
