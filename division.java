/**
 * Classe Division
 */
public class Division extends Operation {
    public Division(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    @Override
    public int valeur() {
        if (operande2.valeur() == 0) {
            throw new ArithmeticException("Division par zéro");
        }
        return operande1.valeur() / operande2.valeur();
    }

    @Override
    public String toString() {
        return "(" + operande1 + " / " + operande2 + ")";
    }
}
