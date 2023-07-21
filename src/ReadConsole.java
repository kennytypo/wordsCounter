import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadConsole {
    private static ArrayList<String> list = new ArrayList<>();
    private static String result;
    private static int length = 0;
    public static int countWords(){
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

        }catch (IOException e){
            e.printStackTrace();
        }

        return length;
    }
}
