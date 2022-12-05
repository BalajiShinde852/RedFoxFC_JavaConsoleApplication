package Util;

public class ApplicationStop extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public ApplicationStop() {
	super();
    }

    public ApplicationStop(String string) {
	super(string);
    }
}
