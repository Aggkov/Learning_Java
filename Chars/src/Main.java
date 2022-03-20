public class Main {

    public static void main(String[] args) {
        //Extraction
        String s = "This is a string";
        System.out.println(s.charAt(3));
        char[] ext = new char[10];
        //Start to End -1, Store in ext array in position 0
        s.getChars(5,7,ext,0);
        System.out.println(ext);
        ext = s.toCharArray();
        System.out.println(ext);

    }
}