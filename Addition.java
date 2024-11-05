/**
* 
* Reportez vous également à la classe {@link Operation} 
* @author Ruben Dubord & Ahash Parthipan
* 
*/
public class Addition extends Operation {
    
    /**
        * Cette fonction est le constructeur champs à champs de la classe. 
        * <p>
        * Elle se base sur le constructeur de la classe Operation
        *
        * @param  e1 : Un objet de type Expression
        * @param  e2 : Un autre objet de type Expression
    */
    
    public Addition(Expression e1, Expression e2){
        super(e1,e2);
    }

    /**
        * Cette fonction donne la valeur de l'addition entre deux opérandes
        * <p>
        * @return double de l'addition entre les deux opérandes de l'objet
    */

    public double valeur(){
        return (this.getOperande1().valeur() + this.getOperande2().valeur());
    }

    /**
        * Cette fonction est la toString de la classe.
        * <p>
        * Elle affiche le calcul de façon lisible
        *
        * @return une chaîne de caractère propre de l'addition
    */

    public String toString(){
        return "(" + this.getOperande1() + " + " + this.getOperande2()+")";
    }