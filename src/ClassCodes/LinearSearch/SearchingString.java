package ClassCodes.LinearSearch;

public class SearchingString {
    public static void main(String[] args) {

        String name = "Imran";
        char target = 'I';

        System.out.println(search(name,target));
    }

    private static boolean search(String name, char target) {
        if (name.length()==0){
            return false;
        }
//        for (int i = 0; i < name.length(); i++) {
//            if (target==name.charAt(i)){
//                return true;
//            }
//
//        }

        for (char ch : name.toCharArray()){
            if (target==ch){
                return true;
            }

        }

        return false;
    }


}
