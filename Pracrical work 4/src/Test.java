public class Test {
    public enum Seasons{
        WINTER(-10),
        SPRING(15),
        SUMMER(25){
            public String getDescription(){
                return "Warm season!";
            }
        },
        AUTUMN(10);

        private final double AvgTmp;

        Seasons(double AvgTmp){
            this.AvgTmp = AvgTmp;
        }

        public double getAvgTmp() {
            return AvgTmp;
        }
        public String getDescription(){
            return "Cold season!";
        }

    }

    public static void outputSeasons(Seasons season){
        switch (season){
            case WINTER -> System.out.println("I like winter!");
            case SPRING -> System.out.println("I like spring!");
            case SUMMER -> System.out.println("I like summer!");
            case AUTUMN -> System.out.println("I like autumn!");
        }
    }

    public static void printAllValues(){
        for (Seasons s : Seasons.values()){
            System.out.println(s + " " + s.getAvgTmp() + " " + s.getDescription());
        }
    }

    public static void main(String[] args) {
        Seasons favSeasons = Seasons.SUMMER;
        System.out.println("My favourite season is " + favSeasons);
        outputSeasons(Seasons.AUTUMN);
        printAllValues();
    }




}
