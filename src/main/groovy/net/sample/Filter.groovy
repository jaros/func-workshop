package net.sample


class Filter {


    public static void main(String[] args) {

        def input = [-3, -2, -1, 0, 1, 2, 3]


        List<Integer> result = filterEven(input)
        println result
    }

    private static List<Integer> filterEven(List<Integer> input) {
        List<Integer> result = new ArrayList<>()
        input.each {
            if (it % 2 == 0) {
                result.add(it)
            }
        }
        result
    }

}
