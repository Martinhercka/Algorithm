import java.util.Arrays;

public class First
{

    public void homework()
    {
    String a="1010";
    String b ="1010";
    String result = "";

    while(b.length()<a.length())
    {
        b=b+"0";
    }

    while(a.length()<b.length())
    {
        a=a+"0";
    }



    int[] aInt = new int[a.length()];
    int[] bInt = new int[b.length()];

    for (int i = 0; i < a.length(); i++) {
        aInt[i] = Character.digit(a.charAt(i), 10);

    }

    for (int i = 0; i < b.length(); i++) {
        bInt[i] = Character.digit(b.charAt(i), 10);

    }

    for(int i=0;i< aInt.length;i++)
    {
        aInt[i]=aInt[i]+bInt[i];


    }



}




}
