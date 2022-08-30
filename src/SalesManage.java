public class SalesManage {
    protected int[] sales;

    public SalesManage(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (max < sale) {
                max = sale;
            }
        }
        return max;
    }
}
