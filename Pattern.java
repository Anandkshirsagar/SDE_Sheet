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
    
    public static void triangle_122333(){
        for(int i=0;i<=5;i++){
        for(int j=0;j<i;j++){
            System.out.print(i);
        }
        System.out.println();
        }
    }

    public static void DecTraingle(){
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void DecTraingle123(){
        for(int i=0;i<5;i++){
            for(int j=1;j<5-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //rectangle();
        //triangle();
        //triangle_1234();
        //triangle_122333();
       // DecTraingle();
       DecTraingle123();
       jsj
    }
}
