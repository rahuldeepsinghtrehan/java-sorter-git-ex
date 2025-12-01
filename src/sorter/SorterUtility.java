package sorter;

import java.io.*;
import java.util.*;

public class SorterUtility {

    public static int[] readNumbers(String filePath) throws Exception {
        List<Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = br.readLine()) != null) {
            list.add(Integer.parseInt(line.trim()));
        }
        br.close();
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void printArray(int[] nums) {
        for (int n : nums) System.out.print(n + " ");
        System.out.println();
    }
}
