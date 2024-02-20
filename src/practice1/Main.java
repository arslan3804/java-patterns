package practice1;

public class Main {
    public static void main(String[] args){
        Comparator<Integer> comparator = (a, b) -> {
            if (a > b) {
                return 1;
            }
            else if (a < b) {
                return -1;
            }
            return 0;
        };

        System.out.println(comparator.compare(1, 3));
    }
}
