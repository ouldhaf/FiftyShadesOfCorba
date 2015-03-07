package publicKeyInfrastructure;

/**
 * Holder class for : PermissionNonAccordee
 * 
 * @author OpenORB Compiler
 */
final public class PermissionNonAccordeeHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal PermissionNonAccordee value
     */
    public publicKeyInfrastructure.PermissionNonAccordee value;

    /**
     * Default constructor
     */
    public PermissionNonAccordeeHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public PermissionNonAccordeeHolder(publicKeyInfrastructure.PermissionNonAccordee initial)
    {
        value = initial;
    }

    /**
     * Read PermissionNonAccordee from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = PermissionNonAccordeeHelper.read(istream);
    }

    /**
     * Write PermissionNonAccordee into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        PermissionNonAccordeeHelper.write(ostream,value);
    }

    /**
     * Return the PermissionNonAccordee TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return PermissionNonAccordeeHelper.type();
    }

}
