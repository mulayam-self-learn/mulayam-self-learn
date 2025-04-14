import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface Test2 {
    abstract String addCity(Integer a);


}

@FunctionalInterface
interface Test3 extends Test2{
    abstract String addCity(Integer a);

}



public class Product {
    public static void main(String[] args) {



    }

    int id;
    String name;
    int subMarks1;
    int subMarks2;


    public Product(int id, String name, int subMarks1, int subMarks2) {
        this.id = id;
        this.name = name;
        this.subMarks1 = subMarks1;
        this.subMarks2 = subMarks2;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSubMarks1() {
        return subMarks1;
    }

    public int getSubMarks2() {
        return subMarks2;
    }
}
