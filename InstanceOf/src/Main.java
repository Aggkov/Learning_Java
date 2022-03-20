public class Main {


    public static Object mult(Object v,int times) {
        //Basically we are trying to find what type is the argument we are given in main.
        if (v instanceof Number) {
            //1. Unbox v(v.intValue() 2. Object has not defined the method intValue. In order to use intValue() we must first cast Object v to Number
            int x = ((Number) v).intValue();
            return x * times;
        }
        else if (v instanceof String) {
            String s = (String) v;
            //Again Object does not have method repeat defined. Cast it to String first.
            return s.repeat(times);
        }
        else throw new IllegalArgumentException("Not valid argument");
    }

    public static void main(String[] args) {

        // Parameter: Object ===> An object of type Integer is created (Autoboxing)
        System.out.println(mult(4, 5));
        System.out.println(mult(4.2f,5));
        System.out.println(mult("abra ", 5));
    }
}
