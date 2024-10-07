public enum Season {
    Winter (-10, 44),
    Spring (16, 51),
    Summer (24, 79),
    Autumn (7, 58);
    private final int avg_prec;
    private final int avg_temp;
    Season(int avg_temp, int avg_prec) {
        this.avg_temp = avg_temp;
        this.avg_prec = avg_prec;
    }

    public int getAvg_temp() {
        return avg_temp;
    }
    public int getAvg_prec() {
        return avg_prec;
    }
    public String getDescription() {
        if (this == Season.Autumn || this == Season.Winter) {
            return("Холодное время года");
        }
        if (this == Season.Spring || this == Season.Summer) {
            return ("Тёплое время года");
        }
        else {
            return "error";
        }
    }

    @Override
    public String toString() {
        return this.name() + ": Средняя среднее количество осадков: " + avg_prec +
                "мм, Средняя температура:  " + avg_temp +
                'C';
    }
}