import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class testmain {
    public static void main(String[] args) {


        String binary = Integer.toBinaryString(21);
        System.out.println("binary :"+binary);

        int ints1 = binary.chars().map(x -> x - '0').sum();
        System.out.println("no :"+ints1);

        /*List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP", 40, 30));
        productsList.add(new Product(2, "Dell", 50,40));
        productsList.add(new Product(3, "Lenevo", 38,31));
        productsList.add(new Product(4, "Sony", 41,31));
        productsList.add(new Product(5, "Apple", 31,33));

        int totalSalary = productsList.stream().flatMapToInt(e -> IntStream.of(e.getSubMarks2())).sum();

        System.out.println("Total : "+totalSalary);*/
    /*   Product productPriceList2 =
                productsList.stream()
                        .sorted(Comparator.comparing(Product::getSubMarks1).reversed()).findFirst().get();
        System.out.println(productPriceList2.id+" : "+productPriceList2.name+" : "+productPriceList2.subMarks1+" : "+productPriceList2.subMarks2+" total : "+Integer.parseInt(String.valueOf(productPriceList2.subMarks1+productPriceList2.subMarks2)));
*/

    /*    // Use streem sorted to sorted and collect value
       // List<Product> productPriceList3 =
                productsList.stream()
                        //.sorted(Comparator.comparing(Product::getSubMarks2).reversed()).collect(Collectors.toList());
                        //.sorted((o1, o2)-> String.valueOf(IntStream.of(o1.getSubMarks1()+ o1.getSubMarks2()).sum()).compareTo(String.valueOf(IntStream.of(o1.getSubMarks1()+ o1.getSubMarks2()).sum())))

                      .sorted((o1, o2)-> String.valueOf(o1.getSubMarks1()+ o1.getSubMarks2()).compareTo(String.valueOf(o1.getSubMarks1()+ o1.getSubMarks2())))
                      .forEach(product ->
                         System.out.println(product.id+" : "+product.name+" : "+product.subMarks1+" : "+product.subMarks2+" total : "+Integer.parseInt(String.valueOf(product.subMarks1+product.subMarks2))));

*/




        //Output = [1,2,3,5,8,9,10,11,12,15,17,18,20]
        Integer[] firstArray = new Integer[]{1, 10, 15, 20}; //source array
        Integer[] secondArray = new Integer[]{2, 3, 8, 12, 18}; //destination array
        Integer[] thirdArray = new Integer[]{11, 5, 9, 17, 6};
        Object[] ab = Stream.of(firstArray, secondArray,thirdArray).flatMap(Stream::of).sorted().toArray();
        System.out.println(Arrays.asList(ab));



       /* String[] str = {"lucknow","pune","bangalore","mumbai","akabarpur"};
        //Operation with lemda
        //Arrays.stream(str).sorted().forEach(n -> System.out.println(n));
        //Arrays.stream(str).sorted(Comparator.reverseOrder()).forEach(n -> System.out.println(n));
        List<String> list = Arrays.stream(str)
                .sorted()
                //.sorted(Comparator.reverseOrder())
                .map(n -> n.substring(0,1).toUpperCase()+n.substring(1))
                .collect(Collectors.toList());
                System.out.println("list :"+list);
        //Operation without lemda
        String[] str1 = new String[str.length];
        List<String> str2 = new ArrayList<>();
        int i = 0;
        for (String s:str) {
            str1[i] = s.substring(0,1).toUpperCase()+s.substring(1);
            str2.add(s.substring(0,1).toUpperCase()+s.substring(1));
                    i++;
        }
        System.out.println("str1 : "+Arrays.toString(str1));
        System.out.println("str2 : "+(str2));*/


        //int[] numbers = {5, 9, 11, 2, 9, 21, 1};

        //Arrays.stream(numbers).boxed().sorted().forEach(n -> System.out.println(n));
        //Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).forEach(n -> System.out.println(n));

  /*      // Use streem map to modify and collect value
        List<Integer> input = asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> newList = input.stream()
                .map(n -> n%2 ==0 ? n : n+1)
                .collect(Collectors.toList());
        System.out.println(newList );*/

        /*int secondLargestNumber =
                Arrays
                .stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .get();
        System.out.println(secondLargestNumber);*/

        // Functional interface using java 8
       /* Test s = (str) -> str + "  Bangalore";
        Test s1 = (str) -> str +" Pune";
        String sum = s.addCity("Ram");
        System.out.println(sum);
        String mul = s1.addCity("Shyam");
        System.out.println(mul);*/

     /*   List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 95000));
        productsList.add(new Product(2, "Dell Laptop", 30000));
        productsList.add(new Product(3, "Lenevo Laptop", 28000));
        productsList.add(new Product(4, "Sony Laptop", 48000));
        productsList.add(new Product(5, "Apple Laptop", 20000));

        // Use streem sorted to sorted and collect value
        List<Product> productPriceList2 =
                productsList.stream()
                        .sorted((p1, p2) -> p1.price < p2.price ? -1 : 1)
                        .collect(Collectors.toList());
        productPriceList2.forEach((p) -> System.out.println(p.id +" , "+ p.name+" , "+p.price));*/


    }

}
