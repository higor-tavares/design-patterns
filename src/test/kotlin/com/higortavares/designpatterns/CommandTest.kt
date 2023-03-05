package com.higortavares.designpatterns

import com.higortavares.designpatterns.command.Invoker
import com.higortavares.designpatterns.command.OrderListCommand
import com.higortavares.designpatterns.command.TextFile
import org.junit.jupiter.api.Test

class CommandTest {

    @Test
    fun test() {
        val orderList = TextFile("order_list");
        val command = OrderListCommand(orderList);
        val invoker = Invoker();
        invoker.addCommand("order", command);
        invoker.execute("order", "macã");
        invoker.execute("order", "banana");
        invoker.execute("order", "goiaba");
        invoker.undo("order");
    }
}