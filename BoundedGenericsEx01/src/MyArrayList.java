// We would like our ArrayList to manipulate only Numbers

import java.util.ArrayList;

public class MyArrayList <T extends Number> {
    private ArrayList<T> al;

    MyArrayList() {
        al = new ArrayList<>();
    }
    public void add(T num) {
        al.add(num);
    }
    public double average() {
        if(al.isEmpty())
            return 0;

        double sum = 0.0;
        for(var num: al)
            sum += num.doubleValue();
        return sum / al.size();
    }


}
