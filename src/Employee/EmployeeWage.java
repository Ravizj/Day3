package Employee;

public class EmployeeWage {
    public static void present(){
                //Constants
                int is_Full_Time=1;
                //Computation
                double empcheck = Math.floor(Math.random() *10)%2;
                if (empcheck == is_Full_Time)
                    System.out.println("Employee is Present");
                else
                    System.out.println("Employee is Abscent");

            }
    public static void main(String[] args) {
        present();

     /*   System.out.println("Welcome to Employee Wage");
        double x=Math.random();
        System.out.println(x);
        double y=Math.floor(x*5);
        System.out.println(y);
        int z=(int) y%2;
        System.out.println(z);
        */
        int empCheck=(int) Math.floor(Math.random()*10)%2;
        System.out.println(empCheck);

    }
}
