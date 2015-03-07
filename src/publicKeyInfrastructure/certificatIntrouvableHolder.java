package publicKeyInfrastructure;

/**
 * Holder class for : certificatIntrouvable
 * 
 * @author OpenORB Compiler
 */
final public class certificatIntrouvableHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal certificatIntrouvable value
     */
    public publicKeyInfrastructure.certificatIntrouvable value;

    /**
     * Default constructor
     */
    public certificatIntrouvableHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public certificatIntrouvableHolder(publicKeyInfrastructure.certificatIntrouvable initial)
    {
        value = initial;
    }

    /**
     * Read certificatIntrouvable from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = certificatIntrouvableHelper.read(istream);
    }

    /**
     * Write certificatIntrouvable into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        certificatIntrouvableHelper.write(ostream,value);
    }

    /**
     * Return the certificatIntrouvable TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return certificatIntrouvableHelper.type();
    }

}
