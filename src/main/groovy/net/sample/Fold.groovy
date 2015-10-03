package net.sample


def numbers = [3, 7, 5, 5, 100]

int sum = numbers.inject{ a, b -> a + b }

println sum