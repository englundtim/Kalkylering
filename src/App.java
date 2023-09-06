public class App {
    public static void main(String[] args) throws Exception {

        double tal1 = 23.0;
        int tal2 = 45;
        double summa;  
        int produkt;

        summa = tal1+tal2;
        System.out.println(tal1+" + "+tal2+" = "+summa);

        summa = tal1-tal2;
        System.out.println(tal1+" - "+tal2+" = "+summa);

        int tal3 = 234232;
        int tal4 = 3424;

        produkt = tal3*tal4;
        System.out.println(tal3+"*"+tal4+"="+produkt);
        produkt = tal2*tal3*tal4;
        System.out.println(tal2+"*"+tal3+"*"+tal4+"="+produkt);
        System.out.println("det blir fel");

        double kvot;
        kvot = tal1/tal2;
        System.out.println(tal1+"/"+tal2+"="+kvot);

        double tal5 = 10.0;
        double tal6 = 3.0;

        kvot=tal6/tal3;
        System.out.println(tal6+"/"+tal3+"="+kvot);
    
    }
}
