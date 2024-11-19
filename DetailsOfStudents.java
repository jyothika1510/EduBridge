  import java.util.Scanner;  
class DetailsOfStudents{
        public static void detailsOfStudent(String name,int age,double marks,int semester,char grade,long mobile,String address){
               
            System.out.println("The Name is:"+ name);
            System.out.println("The Age is:"+ age );
            System.out.println("The Marks is:"+ marks);
            System.out.println("The semester is:"+ semester);
            System.out.println("The  Grade is:"+ grade);
            System.out.println("The Mobile is:"+ mobile);
            System.out.println("The Address is:"+ address);
}
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the Name :");
          String name= sc.next();
         System.out.println("enter the Age :");
            int age= sc.nextInt();
         System.out.println("enter the Marks :");
              double marks= sc.nextDouble();
         System.out.println("enter the Semester:");
               int semester= sc.nextInt();
         System.out.println("enter the Grade :");
                 char grade= sc.next().charAt(0);
         System.out.println("enter the Mobile :");
              int mobile= sc.nextInt();
         System.out.println("enter the Address :");
              String address= sc.next();
         detailsOfStudent();
}
}