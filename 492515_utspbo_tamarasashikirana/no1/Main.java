public class Main {
    public static void main(String[] args) {
        Chart pieChart = new Chart();
        pieChart.addChart(new Subject(5, "IPA"));
        pieChart.addChart(new Subject(15, "B.IND"));
        pieChart.printChart();
        System.out.println();
        pieChart.addChart(new Subject(30, "B.ING"));
        pieChart.printChart();
    }
}