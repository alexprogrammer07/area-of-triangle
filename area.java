import java.io.*;
class AreaOfTriangle
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter 1. for Equilateral, \n2. for Isoceles and, \n3. for Scalene");
        int choice = Integer.parseInt(br.readLine());

        double area = 0.0;
        int flag=0;

        if(choice == 1)
        {
            System.out.println("Enter the side :");
            double side = Double.parseDouble(br.readLine());

            area = Math.sqrt(3)/4.0 * (Math.pow(side, 2));
        }
        else if(choice == 2)
        {
            System.out.println("Enter the side a (Equal side)");
            double a = Double.parseDouble(br.readLine());

            System.out.println("Enter the base:");
            double b = Double.parseDouble(br.readLine());

            area = 1.0/4 * b * Math.sqrt(4*Math.pow(a,2) - Math.pow(b,2));
        }
        else if(choice == 3)
        {
            System.out.println("Enter first side of Triangle :");
            double m = Double.parseDouble(br.readLine());

            System.out.println("Enter second side of Triangle :");
            double n = Double.parseDouble(br.readLine());

            System.out.println("Enter third side of Triangle :");
            double p = Double.parseDouble(br.readLine());

            double s = (m + n + p)/4.0;

            area = Math.sqrt(s*(s-m)*(s-n)*(s-p));
        }
        else
        {
            System.out.println("Invalid Choice");
            flag=1;
        }

        if(flag==0)
            System.out.println("Area of Triangle : "+area);
    }
}
