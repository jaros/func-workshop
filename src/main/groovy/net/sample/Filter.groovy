package net.sample


public class Filter {


    public static void main(String[] args) {

        def input = [-3, -2, -1, 0, 1, 2, 3]


        List<Integer> result = filterEven(input)
        println result
    }

    private static def filterEven(def input) {
        input.grep { it % 2 == 0 }
    }

}
