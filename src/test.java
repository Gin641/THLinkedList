public class test {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList mylish = new MyLinkedList(10);
        mylish.addFirst(11);
        mylish.addFirst(12);
        mylish.addFirst(13);
        mylish.add(4,8);
        mylish.add(4,6);
        mylish.prinList();
    }
}
