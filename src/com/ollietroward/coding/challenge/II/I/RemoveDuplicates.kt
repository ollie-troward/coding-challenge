package com.ollietroward.coding.challenge.II.I

class LinkedList(item: Int) {
    var head: LinkNode? = LinkNode(item)

    fun add(item: Int) {
        val end = LinkNode(item)
        var current = this.head
        while (current?.next != null) {
            current = current.next!!
        }
        current?.next = end
    }

    fun remove(data: Int) {
        var current = head
        while (current != null) {
            var runner = current
            while (runner!!.next != null) {
                if (runner.next!!.data == data) {
                    runner.next = runner.next!!.next
                } else {
                    runner = runner.next
                }
            }
            current = current.next
        }
    }

    fun printList() {
        var current = this.head
        println(current!!.data)
        while (current?.next != null) {
            current = current.next!!
            println(current.data)
        }
    }
}

class LinkNode(var data: Int) {
    var next: LinkNode? = null
}

