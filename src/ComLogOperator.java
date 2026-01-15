public class ComLogOperator {
    public static void main (String [] args){
        // Relational operator = Comparison Operator --> ==,!=,>,<,>=,<=
        int a = 10;
        int b=20;
        System.out.println("10 ==20 --> "+ (10 == 20));// false
        System.out.println("10 !=20 --> "+ (10 != 20));// true
        System.out.println("10 >20 --> "+ (10 > 20));// false
        System.out.println("10 <20 --> "+ (10 < 20));// true
        System.out.println("10 <=20 --> "+ (10 <= 20));// true
        System.out.println("10 >=20 --> "+ (10 >= 20));// false



        System.out.println("-----------------------");


        // Logical operator --> && = and , || = or , ! = not
        System.out.println("----------------------");
        // && = and
        System.out.println ((20 > 10) && ( 25> 15));// true && true --> true
        System.out.println((20>10 && (20<15) ));// true && false --> false
        // || = or
        System.out.println((20>10) || (25>15));// true || true --> true
        System.out.println((20>10 ) || (25<15));// True || false--> true
        System.out.println((20<10)|| (20<15));// false || false --> false
        // ! = not
        System.out.println(!(20==10));// !false ---> true
        System.out.println(!(20>10));// !true --> false


    }
}
