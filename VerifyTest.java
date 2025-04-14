import sun.security.util.ArrayUtil;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class VerifyTest {

    public static void main(String arg[]) throws Exception {

        /*System.out.println("int[] arr :");
        int[] arr = {10, 15, 8, 49, 25, 98, 32,110};
        System.out.println(Arrays.toString(arr));
        IntStream.of(arr).forEach(integer -> System.out.print(integer+", "));
        System.out.println();*/

        /*System.out.println("Integer[] array  : ");
        Integer[] array = {10, 15, 8, 49, 25, 98, 32,110};
        System.out.println(Arrays.toString(array));
        Stream.of(array).forEach(integer -> System.out.print(integer+", "));
        System.out.println();*/

        String string = "testString";

        //System.out.println("String to String[] : ");//by each Character
        //String[] strArray = string.chars().mapToObj(c -> c).toArray(String[]::new);
       // System.out.println(strArray);
       // Stream.of(charObjectArray).forEach(integer -> System.out.print(integer+", "));


        /*System.out.println("String to char[] : ");
        char[] charArray = string.toUpperCase().toCharArray();
        System.out.println(Arrays.toString(charArray));
        Stream.of(charArray).forEach(c -> System.out.print(c+", "));

        System.out.println("String to Character[] : ");
        Character[] charObjectArray = string.toUpperCase().chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        System.out.println(Arrays.toString(charObjectArray));
        Stream.of(charObjectArray).forEach(integer -> System.out.print(integer+", "));
*/


        //input = "AAAbbAaMMoooPPPwwwwx";
        // output = A3b2AaM2o3P3w4x

        /*String input = "BAAAbbAaMMoooPPPwwww";
        char[] ch = input.toCharArray();
        int count = 1;
        char c = ch[0];
        String resultString = String.valueOf(c);
         for (int i=0;i< ch.length;i++){
            if(ch[i] == c){
                while (i< ch.length && ch[i] == c){
                    count++;
                    i++;
                }
                resultString += count;
                count = 1;
                i--;
            }else {
                c = ch[i];
                resultString += c;
            }
        }
        System.out.println(resultString);
*/



        /*// marged two array
        int arr1[] = { 1, 4, 3, 5};
        int arr2[] = {4, 6, 2, 8};
        int[] result =  IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
        System.out.println(Arrays.toString(result));

        String[] names1 = {"Balazs", "Vikrant", "Mohasin", "Ahmed"};
        String[] names2 = {"Vihar", "Balazs", "Roshan", "Vikrant"};
        String[] mergedNames = Stream.of(names1, names2).flatMap(Stream::of).toArray(String[]::new);
        System.out.println(Arrays.toString(mergedNames));*/






/*


        // Find the addition of two no which is closed ro given no
        int[] arr = { -2, -3, 2, 3, 6, -4};
        Arrays.sort(arr);
        int x = 5;

        int l=0,r= arr.length-1;
        int sum = 0;
        int min_l = 0, min_r=0;
        int closestSum = Integer.MAX_VALUE;

        while (l < r){
            sum = arr[l]+arr[r];
            if(Math.abs(x-sum) < Math.abs(x-closestSum)){
                closestSum =sum;
                min_l = l; min_r = r;
            }
            if(sum <= x) l++;
            else r--;
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("closestSum is "+ closestSum);
        System.out.println(" by adding Index of "+min_l +" and "+ min_r );

*/





        /*//Find a no which is closed to given no
        int[] arr = { 40, -50, -10, -30, 70, -80, -60, 90, 20};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int minvalue=0, maxvalue=0, resultValue=0, givenNo = 79;
        for(int i=0; i< arr.length; i++){
            if (arr[i] <= givenNo) {
                minvalue = arr[i];continue;
            }else if(arr[i] > givenNo) {
                maxvalue = arr[i];break;
            }
        }
        if((givenNo-minvalue) < (maxvalue-givenNo))
                System.out.println(minvalue+" no is closed to "+ givenNo);
        else System.out.println(maxvalue+" no is closed to "+ givenNo);*/





        /*//multipication of matrix
        int matrix1[][] = {{2, 4}, {3, 4}};
        int matrix2[][] = {{1, 2}, {1, 3}};
        int rows1 = 2;
        int cols2 = 2;
        if (cols2 != rows1) {
            throw new Exception("Invalid matrix given.");
        }
        int resultMatrix[][] = new int[rows1][cols2];
        for(int i=0;i<resultMatrix.length;i++){
            for(int j=0;j<resultMatrix.length;j++){
                for(int k=0;k<resultMatrix.length;k++) {
                    resultMatrix[i][j] += matrix1[i][k] *  matrix2[k][j];
                }
            }
        }
        // Display result matrix
        System.out.println("Result Matrix is:");
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix.length; j++) {
                System.out.print(resultMatrix[i][j] + "    ");
            }
            System.out.println();
        }*/







        /*// Sort map by Value
        Map<String,Integer> map = new HashMap();
        map.put("A",200);
        map.put("D",40);
        map.put("B",500);
        map.put("C",10);
        List<Map.Entry<String, Integer> > list = new LinkedList< >( map.entrySet());
        //sort by Java8
        //Collections.sort(list,(a1,a2)-> a1.getValue().compareTo(a2.getValue()));
        //sort by old way
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return o1.getValue().compareTo(o2.getValue());
                    }
                }
        );

        list.stream().forEach(a ->System.out.println(a.getKey()+" : "+ a.getValue()));
        for (Map.Entry<String, Integer> map1:list) {
            System.out.println(map1.getKey()+" : "+ map1.getValue());
        }
*/



       /* //Split numeric, alphabetic and special symbols from a String
        String str = "java01$$and02developers03!@!!";
        StringBuffer alpha = new StringBuffer();
        StringBuffer special = new StringBuffer();
        StringBuffer num = new StringBuffer();
        int sumNum = 0;
        for (int i=0; i<str.length(); i++)
        {
            char s = str.charAt(i);
            if (Character.isDigit(str.charAt(i))) {
                num.append(str.charAt(i));
                sumNum += Integer.parseInt(str.substring(i,i+1));
            }
            else if(Character.isAlphabetic(str.charAt(i)))
                alpha.append(str.charAt(i));
            else
                special.append(str.charAt(i));
        }
        System.out.println("sumNum : "+sumNum);
        System.out.println("num : "+num);
        System.out.println("alpha : "+alpha);
        System.out.println("special : "+special);*/





       /* //Sort object by multiple field
        List<Employee> list = Testclass.getEmployeeList();
        List<Employee> list1 = list.stream().sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getSalary)).collect(Collectors.toList());
        list1.forEach(e -> System.out.println(e.getId()+" "+e.getAge()+" "+e.getSalary()));
*/

        /*
        //convert list to map
        List<Employee> list = Testclass.getEmployeeList();
        Map<Integer, Employee> empList =  list.stream().collect(Collectors.toMap(Employee::getId, employee -> employee));
        System.out.print( empList.get(10).getSalary());
       */



        /*// find second highest salary where age more then a 10
       List<Employee> list = Testclass.getEmployeeList();
       int salary = list.stream().filter( e -> e.getAge() > 10)
                .map(sm ->sm.getSalary())
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.print( "  :"+salary);*/




        /*//find dublicate
        Integer[] inputList = {3,5,4,7,5,7,6,7,4,5};
        Set set = new HashSet<>();
        //Set<Integer> setDuplicate =  Stream.of(inputList).filter(a -> !set.add(a)).collect(Collectors.toSet());
        Predicate<Integer> p = integer -> set.add(integer);
        Set<Integer> setDuplicate =  Stream.of(inputList).filter(a -> !p.test(a)).collect(Collectors.toSet());
        System.out.println(setDuplicate);
        System.out.println(set);
*/



        //Find frequncy and uniqe
       // Integer[] inputList = {3,5,4,7,5,7,6,7,4,5};
        //Map<Integer,Long> mapint = Stream.of(inputList).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

       /* int[] inputList = {3,5,4,7,5,7,6,7,4,5};
        Map<Integer,Long> mapint =  Arrays.stream(inputList).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mapint);

        List arrayListint = new ArrayList();
        for (Map.Entry<Integer,Long> map : mapint.entrySet()){
            if(1 == map.getValue())
                arrayListint.add(map.getKey());
        }
        System.out.println("arrayListint : "+arrayListint);*/

        /*String[] list = {"abc","def","abc","cde"};
        Map<String,Long> mapString = Stream.of(list).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mapString);
        List arrayListString = new ArrayList();
        for (Map.Entry<String,Long> map : mapString.entrySet()){
            if(1 == map.getValue())
                arrayListString.add(map.getKey());
        }
        System.out.println("arrayListString : "+arrayListString);*/

        /*Character[] c= {'a','b','c','a','d','e','e'};
        Map<Character, Long> mapChar=Stream.of(c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mapChar);
        List arrayListChar = new ArrayList();
        for (Map.Entry<Character,Long> map : mapChar.entrySet()){
            if(1 == map.getValue())
                arrayListChar.add(map.getKey());
        }
        System.out.println("arrayListChar : "+arrayListChar);*/

       /* String str = "testString";
        char[] charArray = str.toCharArray();
        Character[] charObjectArray = str.toUpperCase().chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        Map<Character, Long> mapChar=Stream.of(charObjectArray).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mapChar);
        List arrayListChar = new ArrayList();
        for (Map.Entry<Character,Long> map : mapChar.entrySet()){
            if(1 == map.getValue())
                arrayListChar.add(map.getKey());
        }
        System.out.println("arrayListChar : "+arrayListChar);*/


        /*//Find frequncy of String
        String str = "testString";
        Stream.of(str.toUpperCase().chars().mapToObj(c -> (char)c).toArray(Character[]::new))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((character, aLong) -> System.out.println(character+" : "+aLong));
*/





        //second larges with LinkedHashSet
        /*Integer[] inputList = {3,5,4,7,5,7,6,7,4,5,6,7,8,8,8};
        int slarge = Stream.of(inputList).sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(LinkedHashSet::new)).stream().skip(1).findFirst().get();
        System.out.println(slarge);*/





        /*//second larges with distinct and distinct no.
        int[] inputListNo = {3,5,4,7,5,8,7,6,7,4,5,9,9,8,7};
        Integer slarge1 = IntStream.of(inputListNo).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("second larges with distinct :"+slarge1);
        List<Integer> slarge = IntStream.of(inputListNo).boxed().distinct().collect(Collectors.toList());
        System.out.println("distinct :"+slarge);*/



        // distinct number in reverseOrder
        /*int[] inputListNo = {3,5,4,7,5,8,7,6,7,4,5,9,9,8,7};
        List slarge1 = IntStream.of(inputListNo).boxed().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(slarge1);*/




        // distinct number in naturalOrder
        /*int[] inputListNo = {3,5,4,7,5,8,7,6,7,4,5,9,9,8,7};
        List slarge1 = IntStream.of(inputListNo).boxed().distinct().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(slarge1);*/






        /*
        // First non-repeted character in string
        //String str = "abcdefcab";
        // First repeted character in string
        String str = "abcdefc";
        char charaaray[]=str.toCharArray();
        char c = 0;
        for (int i=0; i<str.length();i++)
        {
            if (str.lastIndexOf(charaaray[i]) != str.indexOf(charaaray[i])) {      // for first repeted charactar
            //if (str.lastIndexOf(charaaray[i]) == str.indexOf(charaaray[i])) {    // for first non-repeted charactar
                c = charaaray[i];
                break;
            }
        }
        System.out.println(c);*/


        //Find string which start with given string
        /*String[] strArray = {"JavaBangalore","DotNetBnagalore","JavaTech"};
        Predicate<String> preStr = s -> s.startsWith("Java");
        Stream.of(strArray).filter(s -> preStr.test(s))
                .collect(Collectors.toList())
                .forEach(l -> System.out.println(l));
*/




        /*// write a program that start with 1 using Predicate interface
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32,110);
        Predicate<String> num = a -> a.startsWith("1");
        List<Integer> myListNew = myList.stream().filter(a -> num.test(String.valueOf(a))).collect(Collectors.toList());
        System.out.println(myListNew);
        // write a program that start with 1
        List<Integer> myListNew1 = myList.stream().filter(a -> String.valueOf(a).startsWith("1")).collect(Collectors.toList());
        System.out.println(myListNew1);
        // write a program that start with a using Predicate interface
        Predicate<String> str = a -> a.startsWith("a");
        String[] list = {"abc","def","abc","cde"};
        List<String> myListNew2 = Stream.of(list).filter(a -> str.test(String.valueOf(a))).collect(Collectors.toList());
        System.out.println(myListNew2);*/






       /* String str = "employee address line";
        String stro[] = str.split(" ");
        String str1 = "";
        for (int i = 0; i < stro.length; i++) {
            str1 += stro[i].substring(0, 1).toUpperCase() + stro[i].substring(1);
        }
        System.out.println(" Output :" + str1);
        String str2 = "";
        for (int i = 0; i < stro.length; i++) {
            str2 +=  " " + stro[i].substring(0, 1).toUpperCase() + stro[i].substring(1);
        }
        System.out.println(" Output :" + str2);
*/




        /*//Find fibonici
        int input = 8;
        int n = 0;
        int firstno = 0;
        int secondno = 0;
        int fibCount = 1;
        while (n < input) {
            firstno = secondno;
            secondno = fibCount;
            //System.out.print(fibCount+", ");
            fibCount = firstno + secondno;
            System.out.print(fibCount+", ");
            //if(n == 0)fibCount=1;
            n++;
        }
*/





        // Print ND Array into 1D
        //int n,m;
        F int n=2,m=4;
        // {{1,9,3,5},{4,7,6,7,9},{3,4,7,2},{1,5,3,8}};    n=4;m=4;
        //{{1,9,3},{4,7,6},{3,4,7}};   n=3;m=3;
        //{ { 1, 2 }, { 3, 4 } };   n=2;m=2;

        int[] array = new int[n * m];
        int pos=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
                array[pos++] = arr[i][j];
            }
            System.out.println();
        }
        System.out.print("Print Array into 1D : ");
        System.out.println(Arrays.toString(array));
        IntStream.of(array).boxed().distinct().sorted().forEach( in -> System.out.print(in+", "));





        /*List<Integer> ints = new ArrayList<>();
        //{1,{9,3},5,{4,{7},6},7,9}
        //Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
        Object[] array =    {1,new Object[]{9,3},5,new Object[]{4,new Object[]{7},6},7,9};
        Integer[] flattenedArray = flatten(array,ints);
        System.out.println(Arrays.stream(Arrays.stream(flattenedArray).toArray()).sorted().collect(Collectors.toList()));
*/

    }

    /*public static Integer[] flatten(Object[] inputArray,List<Integer> ints) throws Exception {

        for (Object inputArr : inputArray) {
            if (inputArr instanceof Object[]) {
                flatten((Object[])inputArr, ints);
            } else if (inputArr instanceof Integer) {
                ints.add((Integer)inputArr);
            } else {
                throw new IllegalArgumentException("Unexpected: " + inputArr);
            }

        }
        return ints.stream().toArray(Integer[] :: new);
    }*/
}
