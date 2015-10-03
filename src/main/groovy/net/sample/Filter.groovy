package net.sample

def input = [-3, -2, -1, 0, 1, 2, 3]

println input.grep { it % 2 == 0 }
