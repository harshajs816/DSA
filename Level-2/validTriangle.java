public class validTriangle{

    public static Boolean validTri(int a,int b , int c){
        if(a+b> c && b+c > a && a+c>b){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int a =3;
        int b =4;
        int c=5;
        if (validTri(a, b, c)){
            System.out.println("Triangle is Valid");
        }
        else{
            System.out.println("Triangle is not Valid");
        }
    }
}