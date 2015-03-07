package publicKeyInfrastructure;

/**
 * Holder class for : certificatPerime
 * 
 * @author OpenORB Compiler
 */
final public class certificatPerimeHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal certificatPerime value
     */
    public publicKeyInfrastructure.certificatPerime value;

    /**
     * Default constructor
     */
    public certificatPerimeHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public certificatPerimeHolder(publicKeyInfrastructure.certificatPerime initial)
    {
        value = initial;
    }

    /**
     * Read certificatPerime from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = certificatPerimeHelper.read(istream);
    }

    /**
     * Write certificatPerime into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        certificatPerimeHelper.write(ostream,value);
    }

    /**
     * Return the certificatPerime TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return certificatPerimeHelper.type();
    }

}
