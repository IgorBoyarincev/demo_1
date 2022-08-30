public class Statistic {
    protected int[] statistics;

    public Statistic(int[] statistics) {
        this.statistics = statistics;
    }

    public int cutAverage() {
        int min = 100000;
        int max = -100;
        int sum = 0;
        for (int statistic : statistics) {
            if (min > statistic) {
                min = statistic;
            } else if (max < statistic) {
                max = statistic;
            }
            sum += statistic;
        }
        return (sum - min - max) / (statistics.length - 2);
    }
}
