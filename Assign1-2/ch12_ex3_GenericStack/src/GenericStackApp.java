public class GenericStackApp {

    public static void main(String[] args) {
        Stack<String> list = new Stack<>();
        list.push("Apples");
        System.out.println("Push: Apples");
        list.push("Oranges");
        System.out.println("Push: Oranges");
        list.push("Bananas");
        System.out.println("Push: Bananas");
        int size = list.size();
        System.out.println("The stack contains " + size + " items\n");
        
        String peekresults = list.peek();
        System.out.println("Peek: " + peekresults);
        int size2 = list.size();
        System.out.println("The stack contains " + size2 + " items\n");

        String pop1 = list.pop();
        System.out.println("Pop: " + pop1);
        String pop2 = list.pop();
        System.out.println("Pop: " + pop2);
        String pop3 = list.pop();
        System.out.println("Pop: " + pop3);
        int size3 = list.size();
        System.out.println("The stack contains " + size3 + " items");        
    } 
}
