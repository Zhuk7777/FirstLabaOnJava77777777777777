import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        ContList obj = new ContList();
        int size=in.nextInt(),value;

        for(int i=0;i<size;i++)
        {
            value=in.nextInt();
            obj.contInsert(value);
        }

        for(int i=0;i<size;i++)
        {
            System.out.println(obj.contExtract(i));
        }

        value=in.nextInt();
        obj.contDelete(value);

        for(int i=0;i<obj.getSize();i++)
        {
            System.out.println(obj.contExtract(i));
        }

    }
}
