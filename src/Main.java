public class Main {
    public static void main(String[] args) {
        Score score = new Score();
        int gs = score.scoreGS();
        int kh = score.scoreKopenhag();

            if (gs > kh){
                System.out.println("GALATASARAY: " + gs + " - " + "KOPENHAG: " + kh);
                System.out.println("ICARDI!!!");
            }else {
                System.out.println("The program is not working well I guess");
            }
    }
}