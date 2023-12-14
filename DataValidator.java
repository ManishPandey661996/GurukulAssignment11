/*5) Create a class "DataValidator" with overloaded methods to validate
different types of data. Implement methods to validate email addresses,
phone numbers, and dates. Write a program to test the implementation*/
import java.util.Scanner;
class DataValidator{
    private String email;
    private long phoneNumbers;
    private String date;

    public DataValidator(String email , long phoneNumbers , String date){
        this.email = email;
        this.phoneNumbers = phoneNumbers;
        this.date = date;

    }

    public String validator(String email){
        boolean s= email.endsWith("@gmail.com");
        if( s== true)
            return "Email is valid";
        else 
            return "Email is invalid";    
    }

    public String validator(int n , String date ){
        int[] a = new int[8];
        char c ; 
        for( int i =0 ; i < 8 ; i++){
             c = date.charAt(i);
             if (c >= 48 && c <= 57){
                a[i] = ((int)c)-48 ;

             }
        }
         int day = (a[0] * 10 ) + a[1];
         int month = (a[2] * 10 ) + a[3];
         int year = (a[4] * 1000 ) + (a[5] * 100) + (a[6] * 10 ) + a[7];

         switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                     if(day > 0 && day <=31){
                        if(year >= 1970 && year <= 2023){
                            return "Date is valid";
                        }
                        else{
                            return "Date is invalid";
                        }
                     }
                     break;
            case 4:
            case 6:
            case 9:
            case 11:
                       if(day > 0 && day <31){
                        if(year >= 1970 && year <= 2023){
                            return "Date is valid";
                        }
                        else{
                           return "Date is invalid";
                        }
                     }
                     break; 

            case 2 : 
                        if(day > 0 && day >30){
                        if(year >= 1970 && year <= 2023){
                            return "Date is valid";
                        }
                        else{
                            return "Date is invalid";
                        }
                     }
                     break;  

            default :
                     return "Date is invalid";                                                   
         }

         return  "Date is invalid";



        }

        public String validator(long phoneNumber){
            if (phoneNumber > 6000_0000_00l && phoneNumber <= 9999_9999_99l){
                return "Phone number is valid ";
            }
            else 
                return "Phone number is invalid";
        }
    
}

class DataValidatorTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String dates , email;
        long phoneNumber;
        int m=0;
        System.out.println("Enter email :");
        email = sc.nextLine();
        System.out.println("Enter dates :");
        dates = sc.nextLine();
        System.out.println("Enter phone number :");
        phoneNumber = sc.nextLong();
        
        DataValidator dv = new DataValidator(email , phoneNumber , dates);
        String s = dv.validator(email);
        System.out.println(s);
        s= dv.validator(phoneNumber);
        System.out.println(s);
        s= dv.validator(m,dates);
        System.out.println(s);




    }
}