package domain;

public class Exercise
{
    public static void main(String[] args)
    {

        int[] a=new int [10];

        System.out.println("Array is:");
        for(int i=0; i<10; i++)
        {
            a[i]=(int)(Math.random()*10);
            System.out.print(a[i]+", ");
        }

        System.out.println("\n\nIndices of duplicate elements in the array are elements:");
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i]==a[j])
                {
                    System.out.print(j+", ");
                }
            }
        }
    }
}
