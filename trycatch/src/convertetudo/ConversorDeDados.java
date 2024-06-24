package convertetudo;

import java.text.ParseException;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class ConversorDeDados {

  public static void main(String[] args) {
    String padraoCep = "##.###-###";
    String padraoCpf = "###.###.###-##";
    String padraotelefone = "(##) # ####-####";

    JTextField cpfField = new JTextField(8);
    JTextField cepField = new JTextField(8);
    JTextField telefoneField = new JTextField(8);

    JPanel myPanel = new JPanel();

    myPanel.add(new JLabel("CPF:"));
    myPanel.add(cpfField);

    myPanel.add(Box.createHorizontalStrut(5)); // a spacer
    
    myPanel.add(new JLabel("CEP:"));
    myPanel.add(cepField);

    myPanel.add(Box.createHorizontalStrut(5)); // a spacer

    myPanel.add(new JLabel("TELEFONE:"));
    myPanel.add(telefoneField);

    int result = JOptionPane.showConfirmDialog(null, myPanel,
        "Formatador de dados", JOptionPane.OK_CANCEL_OPTION);
    if (result == JOptionPane.OK_OPTION) {
      try {
        String cepFormatado = FormartaCep(cepField, padraoCep);
        String cpfFormatado = FormartaCpf(cpfField, padraoCpf);
        String telefoneFormatado = FormartaTelefone(telefoneField, padraotelefone);

        JOptionPane.showMessageDialog(null, "CPF: " + cpfFormatado +
        "\nCEP: " + cepFormatado + "\nTelefone: " + telefoneFormatado);

      } catch (CepInvalido e) {
        System.out.println(e.getMessage());
      } catch (CpfInvalido f) {
        System.out.println(f.getMessage());
      } catch (TelefoneInvalido g) {
        System.out.println(g.getMessage());
      }

    }

}

  public static String FormartaCpf(JTextField cpfField, String padraoCpf) throws CpfInvalido {
    MaskFormatter mascara;
    String cpf = cpfField.getText();
    try {
      if (cpf.length() < 11) {
        throw new CpfInvalido("A quantidade de caracteres do CPF é menor de 11 ou está vazia.");
      } else if (cpf.length() > 11) {
        throw new CpfInvalido("A quantidade de caracteres de CPF é maior de 11");
      } else {
        mascara = new MaskFormatter(padraoCpf);
        mascara.setValueContainsLiteralCharacters(false);
        return mascara.valueToString(cpf);
      }
    } catch (ParseException e) {
      throw new RuntimeException("Caracterer inválido");
    }
  }

  public static String FormartaCep(JTextField cepField, String padraoCep) throws CepInvalido {
    MaskFormatter mascara;
    String cep = cepField.getText();
    try {
      if (cep.length() < 8) {
        throw new CepInvalido("A quantidade de caracteres do CEP é menor de 8 ou está vazia.");
      } else if (cep.length() > 8) {
        throw new CepInvalido("A quantidade de caracteres do CEP é maior de 8");
      } else {
        mascara = new MaskFormatter(padraoCep);
        mascara.setValueContainsLiteralCharacters(false);
        return mascara.valueToString(cep);
      }
    } catch (ParseException e) {
      throw new RuntimeException(e.getMessage());
    }
  }

  public static String FormartaTelefone(JTextField telefoneField, String padraoTelefone) throws TelefoneInvalido {
    String telefone = telefoneField.getText();
    MaskFormatter mascara;
    try {
      if (telefone.length() < 11) {
        throw new TelefoneInvalido("A quantidade de caracteres Telefone é menor de 11 ou está vazia.");
      } else if (telefone.length() > 11) {
        throw new TelefoneInvalido("A quantidade de caracteres Telefone é maior de 11");
      } else {
        mascara = new MaskFormatter(padraoTelefone);
        mascara.setValueContainsLiteralCharacters(false);
        return mascara.valueToString(telefone);
      }
    } catch (ParseException e) {
      throw new RuntimeException(e.getMessage());
    }
  }

}
