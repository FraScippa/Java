
public class Main {
    static int n1 = 3;
    static int n2 = 11;

    public static void main(String[] args) {

        var a1 = new Autoveicolo(1000,
                                  18,
                                  30,
                                  "blu",
                                  31000,
                                  180);

        var a2 = new Autoveicolo(
                1500,
                15,
                40,
                "verde militare",
                45000,
                210);

        var a3 = new Autoveicolo(
                1200,
                16,
                35,
                "rossa",
                16000,
                145);

        var a4 = new Autoveicolo(
                3000,
                11,
                48,
                "nera cromata",
                187000,
                335);

                var c1 = a1.calcoloKM(n1);
                var c2 =a2.calcoloKM(n1);
                var c3 = a3.calcoloKM(n1);
                var c4 =a4.calcoloKM(n1);

                var c5 =a1.calcoloKM(n2);
                var c6 =a2.calcoloKM(n2);
                var c7 =a3.calcoloKM(n2);
                var c8 =a4.calcoloKM(n2);

            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);
            System.out.println(a4);
            System.out.println(c1+"km");
            System.out.println(c2+"km");
            System.out.println(c3+"km");
            System.out.println(c4+"km");
            System.out.println(c5+"km");
            System.out.println(c6+"km");
            System.out.println(c7+"km");
            System.out.println(c8+"km");

    }
}