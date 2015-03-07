package publicKeyInfrastructure;

/**
 * Exception definition : PermissionNonAccordee
 * 
 * @author OpenORB Compiler
 */
public final class PermissionNonAccordee extends org.omg.CORBA.UserException
{
    /**
     * Exception member raison
     */
    public String raison;

    /**
     * Default constructor
     */
    public PermissionNonAccordee()
    {
        super(PermissionNonAccordeeHelper.id());
    }

    /**
     * Constructor with fields initialization
     * @param raison raison exception member
     */
    public PermissionNonAccordee(String raison)
    {
        super(PermissionNonAccordeeHelper.id());
        this.raison = raison;
    }

    /**
     * Full constructor with fields initialization
     * @param raison raison exception member
     */
    public PermissionNonAccordee(String orb_reason, String raison)
    {
        super(PermissionNonAccordeeHelper.id() +" " +  orb_reason);
        this.raison = raison;
    }

}
