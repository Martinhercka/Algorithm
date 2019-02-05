public class Second
{


    public void homework()
    {
        String ret ="AAAAABCDSSJKEEERMVBACCCCOUJJDDLKLKQA";

        String[] retArr = new String[ret.length()];
        int counter=0;

        int count=1;
          retArr = ret.split("");
        String ch = retArr[counter];
        String winChar="";


          for(int i = 1;i<retArr.length;i++)
          {
              if(ch.equals(retArr[i]))
              {

                  count++;
                  winChar = retArr[i];


              }
              else
              {
                  counter++;
                  ch=retArr[counter];

              }







          }

        System.out.println("Longest substring: "+count+" char: "+winChar);





    }




}
