package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class SampleCompile {
    public static void main(String[] args) throws FileNotFoundException {
        try {
        int x = 0;
        int y = 10;
        int z = y / x;
        int[] num = new int[5];
        num[5] = 0;
        FileReader fr = new FileReader("myfile.txt");
        }catch(FileNotFoundException e)
        {

        }
    }
}

