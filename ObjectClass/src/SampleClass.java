import javax.swing.text.StyleContext;
import java.util.Objects;

public class SampleClass {
    int x;
    int y;

    SampleClass(int x, int y) {
        this.x = x;
        this.y = y;
    }
    SampleClass(SampleClass ob) {
        this.x = ob.x;
        this.y = ob.y;
    }

    @Override
    public String toString() {
        return "SampleClass{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;             //checks if references are equal
        if (o == null || getClass() != o.getClass()) return false;
        SampleClass that = (SampleClass) o;
        return x == that.x &&
                y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
