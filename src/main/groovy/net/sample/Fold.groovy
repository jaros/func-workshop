package net.sample


def numbers = [3, 7, 5, 5, 100]

int sum = findSum(0, numbers)

int findSum(Integer acc, List<Integer> nums) {
    if (nums == null || nums.empty) {
        acc
    } else findSum(acc + nums.pop(), nums)
}

println sum