import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Shuffle{
    public static void main(String[] args) throws Exception {
        BufferedReader fis = new BufferedReader(new FileReader("word.txt"));
        Scanner sc = new Scanner(System.in);
        List<String> list;
        list = fis.lines().collect(Collectors.toList());
        while (true){
            System.out.println("--------------------------");
            Collections.shuffle(list);
            list.stream().forEach(System.out::println);
            sc.next();
        }
    }
}