package lesson3;



public class MainApp {
    public static void main(String[] args) {

        MyStack<String> myStack = new MyStack<>();
        System.out.println(myStack.reverse("message"));

        Deque deque = new Deque(15);
        for (int i = 0; i < 15; i++) {
            deque.insertLeft(i);
        }
        System.out.println(deque);
        System.out.println(deque.removeLeft());
        System.out.println(deque.removeRight());
        System.out.println(deque.removeLeft());
        System.out.println(deque.removeRight());
        deque.insertLeft(22);
        System.out.println(deque.getTail());
        deque.insertLeft(33);
        System.out.println(deque.getTail());
        deque.insertLeft(44);
        System.out.println(deque.getTail());
        deque.insertRight(55);
        System.out.println(deque.getTail());
        System.out.println(deque);
        for (int i = 0; i < 15; i++) {
            deque.removeRight();
        }

        for (int i = 0; i < 15; i++) {
            deque.insertLeft(i + 10);
        }
        System.out.println(deque);

        System.out.println(deque.getCapacity() + " " + deque.getSize());
        System.out.println(deque.isFull());
        System.out.println(deque.getHead() + " " + deque.getTail());
        deque.removeRight();
        System.out.println(deque.getHead() + " " + deque.getTail());
        deque.insertLeft(77);
        System.out.println(deque.getHead() + " " + deque.getTail());
        System.out.println(deque);

    }

}
