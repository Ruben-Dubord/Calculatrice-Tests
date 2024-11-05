import org.junit.Assert;
import org.junit.Test;

public class TestAddition{

	@Test
	public void methodeTestAddition(){
		Operation add1 = new Addition(2,2);
	    assertTest(valeur(add1) == 4);
	    System.out.println("Test des additions réussi !");
	}

}