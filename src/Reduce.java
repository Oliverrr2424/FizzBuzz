public class Reduce {
    public static void main(String[] args) {
        int x = 100;
        int counts = 0;

        while (x != 0) {
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x -= 1;
            }
            counts++;
        }

        System.out.println("It takes " + counts + " steps to reduce " + x + " to 0.");
    }
}