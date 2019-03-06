public class Main {
    public static void main (String[] args) {
        LinkedList<Integer> one = new LinkedList<>();
        one.add(2);
        one.addBack(3);
        one.addFront(4);
        one.add(5);
        for(int i = 0; i < one.size(); i++) {
            System.out.println(i + ". " + one.get(i).toString());
        }
        one.removeIndex(2);
        System.out.println(" ");
        for(int i = 0; i < one.size(); i++) {
            System.out.println(i + ". " + one.get(i).toString());
        }
    }
}
