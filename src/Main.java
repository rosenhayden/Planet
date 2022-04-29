public class Main {

    public static void main(String[] args) {
	// write your code here
    Planet p1 = new Planet(100000000, true, true, 60, true, 4000);
    Planet cold = new Planet(5000, true, true, 20, true, 1000000001);
        System.out.println(p1.isHabitable());
        System.out.println(p1.willSnow());
        System.out.println(cold.isHabitable());
        System.out.println(cold.willSnow());


    }
}
