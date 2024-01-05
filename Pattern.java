public class Pattern {
    public static void rectangle(){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangle(){
        for(int i=0;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangle_1234(){
        for(int i=0;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //rectangle();
        //triangle();
        triangle_1234();
    }
}
