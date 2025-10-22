package lib;
import java.io.*;
public class Lab1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("data"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line + " - From Java");
        }
        br.close();
    }
}

