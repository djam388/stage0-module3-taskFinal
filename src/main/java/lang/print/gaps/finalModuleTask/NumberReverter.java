package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public static void main(String[] args) {
        revert(489);
    }
    public static void revert(int number) {
        int first, second, third;

        third = number / 100;
        second = (number - (third * 100)) / 10;
        first = (number - (third * 100)) - second * 10;

        System.out.print(first);
        System.out.print(second);
        System.out.println(third);
    }
}
