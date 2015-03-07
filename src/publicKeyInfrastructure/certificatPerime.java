package publicKeyInfrastructure;

/**
 * Exception definition : certificatPerime
 * 
 * @author OpenORB Compiler
 */
public final class certificatPerime extends org.omg.CORBA.UserException
{
    /**
     * Exception member raison
     */
    public String raison;

    /**
     * Default constructor
     */
    public certificatPerime()
    {
        super(certificatPerimeHelper.id());
    }

    /**
     * Constructor with fields initialization
     * @param raison raison exception member
     */
    public certificatPerime(String raison)
    {
        super(certificatPerimeHelper.id());
        this.raison = raison;
    }

    /**
     * Full constructor with fields initialization
     * @param raison raison exception member
     */
    public certificatPerime(String orb_reason, String raison)
    {
        super(certificatPerimeHelper.id() +" " +  orb_reason);
        this.raison = raison;
    }

}
