package net.sample


class Filter {


    static void main(String[] args) {

        def input = [-3, -2, -1, 0, 1, 2, 3]


        List<Integer> result = input.grep { it % 2 == 0 }
        println result
    }


}
