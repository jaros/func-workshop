package net.sample


List<Integer> numbers = Arrays.asList(3, 7, 5, 5, 100)
int sum = 0

for (Integer num : numbers) {
    sum = sum + num
}

println sum