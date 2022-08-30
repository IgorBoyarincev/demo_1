public class Main {
    public static void main(String[] args) {
        int[] statistics = {45, 17, 35, 40, 51, 23, 54, 88, 4, 77};
        Statistic st = new Statistic(statistics);
        System.out.println(st.cutAverage());
    }
}
