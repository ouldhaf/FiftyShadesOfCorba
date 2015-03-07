package publicKeyInfrastructure;

/**
 * Holder class for : AutoriteCertification
 * 
 * @author OpenORB Compiler
 */
final public class AutoriteCertificationHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal AutoriteCertification value
     */
    public publicKeyInfrastructure.AutoriteCertification value;

    /**
     * Default constructor
     */
    public AutoriteCertificationHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public AutoriteCertificationHolder(publicKeyInfrastructure.AutoriteCertification initial)
    {
        value = initial;
    }

    /**
     * Read AutoriteCertification from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = AutoriteCertificationHelper.read(istream);
    }

    /**
     * Write AutoriteCertification into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        AutoriteCertificationHelper.write(ostream,value);
    }

    /**
     * Return the AutoriteCertification TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return AutoriteCertificationHelper.type();
    }

}
