package net.sample


class Filter {


    public static void main(String[] args) {

        List<Integer> input = new ArrayList<>(Arrays.asList(-3, -2, -1, 0, 1, 2, 3));

        // filter only even number
        List<Integer> result = new ArrayList<>();
        for (Integer number : input) {
            if (number %2 == 0) {
                result.add(number);
            }
        }
        println result;
    }

}
