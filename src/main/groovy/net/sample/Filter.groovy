package net.sample

import org.codehaus.groovy.runtime.InvokerHelper


class Filter extends Script {

    @Override
    def run() {
        def input = [-3, -2, -1, 0, 1, 2, 3]

        println input.grep { it % 2 == 0 }
    }

    static void main(String[] args) {
        InvokerHelper.runScript(Filter, args)

    }

}
