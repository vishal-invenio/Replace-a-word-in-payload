import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;


public class Replace implements Callable {

	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		Object ob = eventContext.getMessage().getPayload();
		String input = ob.toString();
		String output = input.replaceAll("Vishal", "Sirisha");
		return output;
	}

	
}
