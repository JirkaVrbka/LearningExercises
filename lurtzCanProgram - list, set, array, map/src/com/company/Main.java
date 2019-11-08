package com.company;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {


    /*
    * TASK 1 - letter frequency
    * finish letterFreq() so that it counts how many times each character is in the text in total and print it on standard output each letter on new line, order does not matter
    *
    * example:
    * a = 45
    * b = 22
    *   = 67
    * , = 12
    * use Map
    * */
    private static String freq = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum at lacus sit amet magna ornare dapibus eget vitae risus. Nullam ultricies odio tellus, a facilisis ante ornare at. Donec sollicitudin rutrum viverra. Donec vel nunc in mi sagittis lacinia. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed lobortis augue arcu, et volutpat nisl accumsan at. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Suspendisse viverra placerat tempus. Mauris in dolor congue, tristique diam a, congue ex. Cras nisl felis, ornare et suscipit ac, hendrerit sed erat.\n" +
            "\n" +
            "Aliquam eu pretium felis, vel blandit urna. Donec id sem a nisi ornare dapibus. Pellentesque condimentum massa quis erat ultricies tempus. Phasellus nec rhoncus elit, accumsan eleifend tortor. Phasellus nec augue ante. Suspendisse potenti. Sed eget auctor dolor, vitae semper velit. In sit amet risus nunc. Integer luctus tortor sit amet placerat volutpat. Proin condimentum, tellus non accumsan ornare, sapien ante semper velit, ullamcorper sagittis massa risus id sapien.\n" +
            "\n" +
            "Curabitur sollicitudin viverra risus vitae rhoncus. Sed nunc felis, sodales viverra porta quis, pellentesque eget nisi. Nullam dictum mattis nulla id scelerisque. Pellentesque mattis a tortor ac egestas. Etiam imperdiet ex diam, eget condimentum sem hendrerit at. Suspendisse condimentum est non tortor viverra volutpat. Quisque molestie nisi non nisi ultrices, vitae sodales dolor tempus.\n" +
            "\n" +
            "Curabitur elementum odio eu ligula fermentum sagittis. Duis consectetur, est nec fermentum consequat, mi nisl pharetra ipsum, a sodales odio ipsum ac purus. Proin congue varius congue. Vivamus eget est metus. Vestibulum in vestibulum quam. Etiam eget dignissim est, eget vulputate felis. Morbi vitae pulvinar dolor. Aenean varius, turpis et tincidunt lacinia, lacus lorem dignissim lorem, ac viverra nulla sem ut mauris. Maecenas eu erat nec eros ultricies varius. Nulla at fermentum ipsum. Proin bibendum quam vitae rhoncus ornare.\n" +
            "\n" +
            "Etiam pharetra interdum urna, eu molestie lectus viverra eget. Proin facilisis interdum tristique. Nam est orci, bibendum quis augue ac, porttitor venenatis nisi. Ut odio ante, convallis quis venenatis sed, tincidunt blandit quam. Donec finibus mollis sem, ac malesuada mi finibus id. Phasellus porttitor eget arcu nec tempus. Curabitur sed nibh egestas, dictum nisl vitae, lobortis felis. Mauris sem leo, consequat ac nulla vitae, hendrerit condimentum enim. Curabitur pharetra elementum porta. Aenean nec mattis tellus. Suspendisse porta sem vitae orci sollicitudin, et ultricies tortor hendrerit. Proin blandit rutrum porta. In euismod orci id fringilla euismod. Integer id augue turpis. Aenean iaculis risus vel ligula condimentum interdum. Nullam vel dignissim libero.";

    public static void letterFreq (String string){
        //TODO
    }

    /*
    * TASK 2 - intersection() prints all unique numbers (each number just once) from arr1 and arr2 on std output each set on new line and on the third line it prints intersection of these sets(numbers that are in both arrays)
    *
    * use Set
    * */

    private int [] arr1 = {1,2,5,4,8,6,2,4,3,5};
    private int [] arr2 = {2,12,4,99,81};

    public void intersection (){
        //TODO
    }

    /*
    * TASK 3 - finish mySort(). It returns given array of integers ordered. You may not create new variables. You may not use Array.sort() function. Dont google sort algorithms.
    * */

    public int[] mySort (int [] original){
        int tmp;
        int i;
        int j;
        //TODO
        return original;
    }

    /*
     * TASK 4 - finish variations () in such a way that it returns structure that has all possible variations of chars in abc ( a,b and c) in it. solution :([['a','a','a'], ['a','a','b'], ... ['c','c','c']])
     * */
    private String a = "a";
    private String b = "b";
    private String c = "c";

    public List<List<Character>> variations (){
        List<List<Character>> result = new ArrayList<List<Character>>();
        //TODO
        return result;
    }

    /*
    TASK 5 -
    What does this code write on std output when called  printSmth(foo);?
     */
    private static int ee = 4;
    private static String[] foo = {"bar","rab","arb","bra"};
    public static void printSmth (String[] ss){
        String[] a = {"aa", "aaa"};
        for (int i = 0; i< ee; i++){
            if(i == foo.length){
                break;
            }
            for(String c : ss){
                System.out.print(foo[i]);
            }
        }
        foo = a;
    }

    /*
    Correct mistakes in wheresMyMistake()
     *//*
    public static List<Boolean> wheresMyMistake(){
        List<Boolean> ret= new ArrayList<Boolean>();
        int [16] arr3 = {1,2,5,48,6,6,1,134,64,6,46,7,64,6};
        Set<String> strings = new HashSet<String>();
        strings.add("a");
        strings.add("b");
        strings.add("cc");
        strings.add("aa");
        strings.add("a");

        List<Integer> list1 = new List<Integer>();
        for(int i = 0; i < 888; i++){
            list1.add(i + strings.size());
        }
        int omg = 0;
        for(int alpha : arr3){
            if (list1.contains(alpha)){
                ret.add(alpha == list1.get(alpha));
            }
            omg++;
            //if ret on omg position is false set it to true
            if(ret[1].equals(false)){
                ret.get(omg) = true;
            }
        }
        return ret;
    }
*/
    public static void main(String[] args) {
	    printSmth(foo);
	    //wheresMyMistake();
    }
}
