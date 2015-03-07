package publicKeyInfrastructure;

/**
 * Exception definition : certificatIntrouvable
 * 
 * @author OpenORB Compiler
 */
public final class certificatIntrouvable extends org.omg.CORBA.UserException
{
    /**
     * Exception member raison
     */
    public String raison;

    /**
     * Default constructor
     */
    public certificatIntrouvable()
    {
        super(certificatIntrouvableHelper.id());
    }

    /**
     * Constructor with fields initialization
     * @param raison raison exception member
     */
    public certificatIntrouvable(String raison)
    {
        super(certificatIntrouvableHelper.id());
        this.raison = raison;
    }

    /**
     * Full constructor with fields initialization
     * @param raison raison exception member
     */
    public certificatIntrouvable(String orb_reason, String raison)
    {
        super(certificatIntrouvableHelper.id() +" " +  orb_reason);
        this.raison = raison;
    }

}
