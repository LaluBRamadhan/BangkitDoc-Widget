package com.code.widgets

import java.util.Random

class NumberGenerator {
    internal object NumberGenerator {
        fun generate(max: Int): Int {
            val random = Random()
            return random.nextInt(max)
        }
    }
}
