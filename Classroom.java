public class Classroom{

static Wilder omar = new Wilder("Omar",true);
static Wilder bryce = new Wilder("Bryce", true);
static Wilder jamal = new Wilder("Jamal", false);
static Wilder karl = new Wilder("Karl",false);


public static void main(String[] args) {
   System.out.println(omar.whoAmi());
   System.out.println(bryce.whoAmi());
   System.out.println(jamal.whoAmi());
    System.out.println(karl.whoAmi());
}

}