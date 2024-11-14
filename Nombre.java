/** 
 * classe Nombre 
*/
public class Nombre extends Expression {
    private int valeur;
    
    public static void main(String[] args{
                    Scanner scan = new Scanner(System.in);
                    System.out.print("entrez un entier : ");
                    try {
                        int number= scanner.nextInt(); // we expect an integer
                        system.out.println("vous avez entrer : " + number);
                    } catch (InputMismatchException e ) { 
                        System.out.println("erreur : ce n'est pas un entier valide ");
                    } finally {
                        scanner.close ();
                    }
                }
            }
            
    @Test(expected = Exception.class) 
    public void test() throws Exception {
        
            
    public Nombre(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public int valeur() {
        return valeur;
    }

    @Override
    public String toString() {
        return Integer.toString(valeur);
    }
}    
