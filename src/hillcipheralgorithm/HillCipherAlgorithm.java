
package hillcipheralgorithm;

import java.util.Scanner;


public class HillCipherAlgorithm {
  
    int keymatrix[][];
    int linematrix[];
    int resultmatrix[];
 
//    public void dividePalinTextWithRes(String temp, int s)
//    {
//        while (temp.length() > s)
//        {
//            String sub = temp.substring(0, s);
//            temp = temp.substring(s, temp.length());
//            perform(sub);
//        }
//        if (temp.length() == s)
//            perform(temp);
//        else if (temp.length() < s)
//        {
//            for (int i = temp.length(); i < s; i++)
//                temp = temp + 'x';
//            perform(temp);
//        }
//    }
 
//    public void perform(String line)
//    {
//        linetomatrix(line);
//        linemultiplykey(line.length());
//        result(line.length());
//    }
 
    public void keytomatrix(String key, int len)
    {
        keymatrix = new int[len/2][len/2];
        int c = 0;
        for (int i = 0; i <key.length(); i++)
        {
            for (int j = 0; j <key.length(); j++)
            {
                if(key.charAt(c)==' '){
                    c++;
                }
                else{
                keymatrix[i][j] = key.charAt(c);
                c++;
                }
            }
        }
        for(int i=0;i<len/2;i++){
            for(int j=0;j<len/2;j++){
                System.out.println(keymatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
 
//    public void linetomatrix(String line)
//    {
//        linematrix = new int[line.length()];
//        int count=0;
//        for (int i = 0; i < line.length(); i++)
//        {
//            if(line.charAt(i)==' '){
//                count++;
//            }
//            else{
//            linematrix[i] = line.charAt(i);
//            count++;
//        }   
//        }
//    }
// 
//    public void linemultiplykey(int len)
//    {
//        resultmatrix = new int[len];
//        for (int i = 0; i < len; i++)
//        {
//            for (int j = 0; j < len; j++)
//            {
//                resultmatrix[i] += keymatrix[i][j] * linematrix[j];
//            }
//            resultmatrix[i] %= 26;
//        }
//    }
// 
//    public void result(int len)
//    {
//        String result = "";
//        for (int i = 0; i < len; i++)
//        {
//            result += (char) (resultmatrix[i] + 97);
//        }
//        System.out.print(result);
//    }
//   
//  
    
    
    
    
   
    public static void main(String[] args){
        
        Scanner scan=new Scanner(System.in);
        String key=scan.next();
        int len=scan.nextInt();
        HillCipherAlgorithm  l=new HillCipherAlgorithm ();
        l.keytomatrix(key, len);
        
  
    }
    
}


