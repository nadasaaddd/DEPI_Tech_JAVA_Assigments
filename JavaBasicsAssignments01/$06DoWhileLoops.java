package JavaBasicsAssignments01;

// title Single Execution Loop

public class $06DoWhileLoops {
    int limit = 0;
    int i = 1;

    public void main(String[] args) {
        do {
            System.out.println("The loop ran at least once.");
            i++;
        } while (i < limit);

        System.out.println("Loop ended \n i=" + i);
    }
}
