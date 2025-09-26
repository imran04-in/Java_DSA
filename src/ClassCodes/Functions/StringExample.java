package ClassCodes.Functions;

public class StringExample {
    public static void main(String[] args) {

//        String message=greet();
//        System.out.println(message);


  String mess= greeting("imran");
        System.out.println(mess);




    }



//    static String greet(){
//        String message="Hello imran";
//        return message;
//    }



    static String greeting(String name){
        String message = "Hello "+name;
        return message;
    }
}
