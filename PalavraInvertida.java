import javax.swing.JOptionPane;

public class PalavraInvertida {

    public static String Func(String k) {
        String temp = "";
        for (int i = k.length() - 1; i >= 0; i--)
            temp += k.charAt(i);
        return temp;
    }

    public static void main(String[] args) {
        String lin = String.valueOf(JOptionPane.showInputDialog("Escreva a palavra"));
        System.out.println(PalavraInvertida.Func(lin));
    }

}
