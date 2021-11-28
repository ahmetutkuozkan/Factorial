import java.io.*;
import java.math.BigInteger;

public class Factorial
{
    
    public static void main(String[] args) throws IOException{
    BigInteger f = new BigInteger("1");
    int i=1;
    int first_number=1;
    int last_number=0;
    for(int j=1;j<1000000;j++){
        first_number=i;
        File file = new File(j+".txt");
        FileWriter fw = new FileWriter(file,true);
        PrintWriter pw = new PrintWriter(fw);
        
        for(;i<=1000000;i++){
            
            f = f.multiply(BigInteger.valueOf(i));
            pw.println(i+"!= "+f);
                if((file.length()/(200*1024*1024))>=1){
                    last_number=i;
                    break;
                }
        }
        
        pw.close();
        File file2 = new File(first_number+"!-"+last_number+"!.txt");
        file.renameTo(file2);
        if(i>=1000000){
            last_number=i;
            File file3 = new File(first_number+"!-"+last_number+"!.txt");
            file.renameTo(file3);
            break;
        }
    }
    
    }
}
