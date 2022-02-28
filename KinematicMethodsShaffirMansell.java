//Authors: Isaac Mansell and Noah Shaffir
//Purpose: To find kinematic values using the formula d = v1t + a/2 * t^2 .
//Date: January 22, 2020
import java.util.*;
public class KinematicMethodsShaffirMansell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please press 1 to find acceleration 2 to find time, 3 to find initial velocity and 4 to find displacement.");
        double variable=0;
        boolean badData = true;
        do {
            sc = new Scanner(System.in);
            try {
                variable = sc.nextInt();
                //ensures that data given must be 1-5
                //otherwise an Exception will be thrown.
                if (variable < 1 || variable > 4) {
                    throw new Exception();
                }
                badData = false;

            } catch (Exception e) {
                System.out.println("That was bad data. Please enter again.");
            }//end of catch
        } while (badData == true);
        if (variable == 1) {

            System.out.println("Please enter the distance in meters");
            double distance1 =0;
            distance1= trycatch();
            System.out.println("Please enter the initial speed");
            double velocity1=0;
            velocity1 =trycatch();
            System.out.println("Please enter the time in seconds");
            double time1 =0;
            trycatch();
            time1=trycatch();
            double sari= equation(distance1,velocity1,time1);
            System.out.println(+sari+" is the acceleration in meters per second squared");

        } else if (variable == 2) {
            System.out.println("Please enter the distance in meters");
            double distance2 =0;
            distance2=trycatch();
            System.out.println("Please enter the initial speed");
            double velocity2 =0;
            velocity2=trycatch();
            System.out.println("Please enter the acceleration in meters/seconds squared");
            double acceleration2 =0;
            acceleration2=trycatch();
            double sari4=equation4(distance2, velocity2,acceleration2);
            System.out.println(+sari4+" is the time in seconds");

        } else if (variable == 3) {
            System.out.println("Please enter the distance in meters");
            double distance3 = 0;
            distance3 = trycatch();
            System.out.println("Please enter the acceleration in meters/seconds squared");
            double acceleration3 = 0;
            acceleration3=trycatch();
            System.out.println("Please enter the time in seconds");
            double time3 = 0;
            time3=trycatch();
            double sari2= equation2(distance3,acceleration3,time3);
            System.out.println(+sari2+" is the initial velocity in meters per second");

        } else if (variable == 4) {
            System.out.println("Please enter the acceleration in meter/second squared");
            double acceleration4 = 0;
            acceleration4=trycatch();
            System.out.println("Please enter the initial speed");
            double velocity4 = 0;
            velocity4=trycatch();
            System.out.println("Please enter the time in seconds");
            double time4 = 0;
            time4=trycatch();
            double sari3= equation3(acceleration4,velocity4,time4);
            System.out.println(+sari3+" is the distance in meters");
        }

    }

    public static double equation(double d1, double v1, double t1){
        double acceleration = ((v1*t1) - d1)/0.5*t1*t1;
        return acceleration;
    }
    public static double equation2(double d3, double t3, double a3){
        double velocity = ((((0.5*a3)*(t3*t3))-d3)/t3);
        return velocity;
    }
    public static double equation3(double a4, double t4, double v4) {
        double distance = ((v4 * t4) + (0.5 * a4 * (t4 * t4)));
        return distance;
    }
    public static double equation4(double d2, double v2, double a2){
        double time= (d2+v2+a2);
        return time;
    }

    public static double trycatch(){
        boolean badData=true;
        double x =0;
        do {
            Scanner sc = new Scanner(System.in);
            try {
                x = sc.nextDouble();
                badData=false;
            } catch (Exception e) {
                System.out.println("That was bad data. Please enter again");
            }//end of catch
        }while(badData==true);
        return x;

    }
}
