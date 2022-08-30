public class SalesManage {
    protected long[] sales;

    public SalesManage(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (max < sale) {
                max = sale;
            }
        }
        return max;
    }
}
