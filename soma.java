
public class soma {
    public static void main(String[] args) {
        int[] vet = { 1, 2, 9, 3 };
        int result = soma2(vet, 0);
        System.out.println(result);

    }

    private static int soma2(int[] v, int i) {
        if (i < v.length)
            return v[i] + soma2(v, i + 1);
        else
            return 0;

    }

}
