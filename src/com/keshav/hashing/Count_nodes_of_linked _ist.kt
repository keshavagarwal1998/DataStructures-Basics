import java.util.*

internal class Node(var data: Int) {
    var next: Node? = null

}

internal object LinkedList {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        var t = sc.nextInt()
        while (t-- > 0) {
            val n = sc.nextInt()
            val head = Node(sc.nextInt())
            var tail: Node? = head
            for (i in 0 until n - 1) {
                tail!!.next = Node(sc.nextInt())
                tail = tail.next
            }

//            CountNodes g = new CountNodes();
            println(getCount(head))
        }
    }

    // } Driver Code Ends
    /*Complete the function below*/ /*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/
    fun getCount(head: Node?): Int {
        var count = 0
        var curr = head
        while (curr != null) {
            count++
            curr = curr.next
        }
        return count

        //Code here
    } // { Driver Code Starts.
}