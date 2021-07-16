public class MethodOverLoading {

    public Integer add(int i, int j){
        return i+j;
    }


    public Integer add(int i, int j, int k){
        return i+j+k;
    }

    public static void main(String[] args) {
        MethodOverLoading loading = new MethodOverLoading();
        System.out.println(loading.add(5,6));
        System.out.println(loading.add(4,5,6));
    }
}

class Example extends MethodOverLoading{
    public Integer add(int i, int j){
        return i-j;
    }

    public static void main(String[] args) {
        MethodOverLoading loading = new MethodOverLoading();
        System.out.println(loading.add(5,6));
    }
}

