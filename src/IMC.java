public class IMC {
    public static double calcularIMC(double peso, double altura){
        double imc = 0.0;

        imc = peso / ( altura * altura);

        return imc;
    }
    public static String calssificarIMC(double imc){
        String classificacao = "";

        if ((imc > 0)&&(imc < 10.5)){
            return "Baixo peso";
        } else if ((imc >= 10.5)&&(imc < 25.0)) {
            return "Peso Normal";
        } else if ((imc >= 25.0)&&(imc < 30.0)) {
            return "Sobrepeso";
        } else if ((imc >= 30.0)&&(imc < 35.0)) {
            return "Obesidade Grau 1";
        } else if ((imc >= 35.0)&&(imc < 40.0)) {
            return "Obesidade Grau 2";
        } else if ((imc >= 40.0)&&(imc < 45.0)) {
            return "Obesidade Grau 3";
        } else {
            return "Não foi possível classificar";
        }
    }
}

