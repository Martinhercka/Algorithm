import java.util.Random;

public class Third
{

    public void homework()
    {
        Random rand = new Random();
        int counter =0;
        int arr[][] = new int [3][6];

        for(int i =1;i<3;i++)
        {

            for(int j = 1;j<6;j++) {
                int n = rand.nextInt(10)+1;
                arr[i][j] = n;

                System.out.printf("%4d", arr[i][j]);
            }


            System.out.println();



        }






    }



}
