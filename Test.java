import java.nio.charset.Charset;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(textModifier());



    }
    public static String textModifier(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите текст одной строкой и нажимите “enter”");
        String inp = (String)scanner.nextLine();
        String a= deleteDoubleBlank(inp);
        String b= changeSymbols(a);
        return b;
    }
    private static String changeSymbols(String inp){
        int len=inp.length();
        char[] chars=inp.toCharArray();
        String out="";
        if(len>2) {
            for (int i = 1; i <(len-1); i++) {
                if (chars[i] == '-') {
                    char temp=chars[i-1];
                    chars[i-1]=chars[i+1];
                    chars[i+1]=temp;
                    chars[i]=0;
                }
                /*else {
                    out=out.substring(0,out.length()-1)+inp.charAt(i+1)+inp.charAt(i-1);
                    i=i+1;
                }*/
            }
            //out = out+inp.charAt(len-1);
        }
        int count=0;
        for(int i=0;i<len;i++){
            switch (chars[i]) {
                case '+':
                    out = out + '!';
                    break;
                case '1':
                    count=count + 1;
                    break;
                case '2':
                    count=count + 2;
                    break;
                case '3':
                    count=count + 3;
                    break;
                case '4':
                    count=count + 4;
                    break;
                case '5':
                    count=count + 5;
                    break;
                case '6':
                    count=count + 6;
                    break;
                case '7':
                    count=count + 7;
                    break;
                case '8':
                    count=count + 8;
                    break;
                case '9':
                    count=count + 9;
                    break;
                case '0':
                    break;
                case 0:
                    break;
                default:
                    out=out + chars[i];
            }

        }
        if(count!=0)out=out+count;
        return out;
    }

    private static String deleteDoubleBlank(String inp){       //удаление пробелов
        int len=inp.length();
        String out="";
        if(len>1) {
            out = out+inp.charAt(0);
            for (int i = 1; i < len; i++) {
                if (inp.charAt(i)!=' ') {
                    out = out+inp.charAt(i);
                }else if(inp.charAt(i)==' '&inp.charAt(i-1)!=' '){
                    out = out+inp.charAt(i);
                }
            }
        }else out=inp;
        return out;
    }
}
