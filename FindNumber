import javax.swing.JOptionPane;

public class FindNumber {
    int[][] nums = { { 1, 4, 60, 6 } };
    boolean encontrei = false;
    int valor;

    public static void main(String[] args) {
        FindNumber test = new FindNumber();
        test.valor = Integer.valueOf(JOptionPane.showInputDialog("Informe o numero que deseja encontrar"));
        System.out.println(test.recur());

    }

    public boolean recur() {

        for (int i = 0; i < nums.length; i++) {
            var each = nums[i];
            for (int j = 0; j < each.length; j++) {

                if (nums[i][j] == valor) {
                    return encontrei = true;
                }

            }

        }
        return encontrei;

    }

}
