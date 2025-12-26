package JavaBasicsAssignments01;

public class $08_1D_arrays {
    int sum;

    public void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(numbers[2]);
        numbers[0] = 99;
        System.out.println(numbers[0]);
        for (int num : numbers) {
            sum += num; // sum+num
        }
        System.out.println("The sum of all elements is: " + sum);
    }
}
