/**
 * Classe Addition
 */
public class Addition extends Operation {
    public Addition(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    /**
     * @param operande1 un entier quelconque
     * @param operande2 un entier quelconque
     * @return la somme des deux operandes
     */
    @Override
    public int valeur() {
        return operande1.valeur() + operande2.valeur();
    }

    @Override
    public String toString() {
        return "(" + operande1 + " + " + operande2 + ")";
    }
}
