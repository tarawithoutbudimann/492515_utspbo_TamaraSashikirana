class Subject {
    private int beban;
    private String nama;

    public Subject(int beban, String nama) {
        this.beban = beban;
        this.nama = nama;
    }

    public int getBeban() {
        return beban;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return nama + ": " + beban + "%";
    }
}

class Chart {
    private Subject[] subjects;
    private int size;

    public Chart() {
        subjects = new Subject[10]; // Set jumlah maksimum subjek menjadi 10
        size = 0; // Awalnya belum ada subjek
    }

    public void addChart(Subject subject) {
        subjects[size++] = subject;
    }

    public void printChart() {
        System.out.println("Pie Chart Saat ini :");
        int totalBeban = 0;
        for (int i = 0; i < size; i++) {
            totalBeban += subjects[i].getBeban();
        }

        for (int i = 0; i < size; i++) {
            double persentase = ((double) subjects[i].getBeban() / totalBeban) * 100;
            System.out.printf("%.1f%% %s\n", persentase, subjects[i].getNama());
        }
    }
}
