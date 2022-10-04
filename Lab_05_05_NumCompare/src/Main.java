public class Main
{
    public static void main(String[] args)
    {
        int num = 2;
        int num2 = 2;
        if( num == num2 )
            System.out.println("the numbers are equal");
        else if( num != num2)
        {
            System.out.println("the numbers do not equal ");
                if(num > num2 )
                    System.out.println("the greater number is " + num);
                else
                    System.out.println("the Great number is " + num2);
                }
        else
            System.out.println("this is not a number");
    }
}