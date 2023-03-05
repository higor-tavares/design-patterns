package com.higortavares.designpatterns.command

//Concrete command
class OrderListCommand(private val receiver: TextFile): FileCommand {

    override fun execute(item: String) {
        item?.let { receiver.write(item)}
    }

    override fun undo() {
        println("Removing last item...")
        receiver.deleteLastLine()
        println("Last item removed successfully!")
    }
}