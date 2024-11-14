public class Addition extends Operation {
/**
 * Classe Addition 
*/
    public Addition(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    @Override
    public int valeur() {
    /** 
 * @param operande1 : un entier quelconque
   @param opearnde2 : un entier quelconque
   @return la somme des deux operandes
   */
        return operande1.valeur() + operande2.valeur();
    }

    @Override
    public String toString() {
        return "(" + operande1 + " + " + operande2 + ")";
    }
}

public class Soustraction extends Operation {
    public Soustraction(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    @Override
    public int valeur() {
        return operande1.valeur() - operande2.valeur();
    }

    @Override
    public String toString() {
        return "(" + operande1 + " - " + operande2 + ")";
    }
}

public class Multiplication extends Operation {
    public Multiplication(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    @Override
    public int valeur() {
        return operande1.valeur() * operande2.valeur();
    }

    @Override
    public String toString() {
        return "(" + operande1 + " * " + operande2 + ")";
    }
}

public class Division extends Operation {
    public Division(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    @Override
    public int valeur() {
        return operande1.valeur() / operande2.valeur();
    }

    @Override
    public String toString() {
        return "(" + operande1 + " / " + operande2 + ")";
    }
}
