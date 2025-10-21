public class Calculate {
    public static void main(String[] args){
        int x = Integer.parseInt(args[1]);  // definir valor a um argumento
        int y = Integer.parseInt(args[2]);

        if(args[0].equals("somar")) {
            sum(x, y);
        } if (args[1].equals("subtrair")){
            menus(x, y);
        } if(args[2].equals("dividir")){
            divide(x, y);

        } else if(args[3].equals("multiplicar")){
            multi(x, y);
        }
    }

    static void sum(int x, int y){
        System.out.println(x + y);
    }
    static void menus(int x, int y){
        System.out.println(x - y);
    }
    static void divide(int x, int y){
        System.out.println(x / y);
    }
    static void multi(int x, int y){
        System.out.println(x * y);
    }
}