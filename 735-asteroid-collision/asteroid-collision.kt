class Solution {
    fun asteroidCollision(asteroids: IntArray): IntArray {
        val stack = Stack<Int>()
        
        asteroids.forEach { current ->
            do {
                if(stack.isEmpty()) {
                    stack.push(current)
                    break
                }

            
            val previous = stack.peek()

            if(previous > 0 && current < 0) {
                val absPrevious = Math.abs(previous)
                val absCurrent = Math.abs(current)

                if(absPrevious == absCurrent) {
                    stack.pop()
                    break
                }

                if(absPrevious > absCurrent) {
                    break
                }

                if(absPrevious < absCurrent) {
                    stack.pop()
                }

                if(stack.isEmpty()) {
                    stack.push(current)
                    break
                }
            } else {
                stack.push(current)
                break
            }
        } while (!stack.isEmpty())
    }
    val result = IntArray(stack.size)
    stack.forEachIndexed {
        index, v -> result[index] = v
    }
    return result
  }
}