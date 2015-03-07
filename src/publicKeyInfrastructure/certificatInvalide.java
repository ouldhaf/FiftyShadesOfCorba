package publicKeyInfrastructure;

/**
 * Exception definition : certificatInvalide
 * 
 * @author OpenORB Compiler
 */
public final class certificatInvalide extends org.omg.CORBA.UserException
{
    /**
     * Exception member raison
     */
    public String raison;

    /**
     * Default constructor
     */
    public certificatInvalide()
    {
        super(certificatInvalideHelper.id());
    }

    /**
     * Constructor with fields initialization
     * @param raison raison exception member
     */
    public certificatInvalide(String raison)
    {
        super(certificatInvalideHelper.id());
        this.raison = raison;
    }

    /**
     * Full constructor with fields initialization
     * @param raison raison exception member
     */
    public certificatInvalide(String orb_reason, String raison)
    {
        super(certificatInvalideHelper.id() +" " +  orb_reason);
        this.raison = raison;
    }

}
