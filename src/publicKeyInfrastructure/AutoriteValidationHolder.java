package publicKeyInfrastructure;

/**
 * Holder class for : AutoriteValidation
 * 
 * @author OpenORB Compiler
 */
final public class AutoriteValidationHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal AutoriteValidation value
     */
    public publicKeyInfrastructure.AutoriteValidation value;

    /**
     * Default constructor
     */
    public AutoriteValidationHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public AutoriteValidationHolder(publicKeyInfrastructure.AutoriteValidation initial)
    {
        value = initial;
    }

    /**
     * Read AutoriteValidation from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = AutoriteValidationHelper.read(istream);
    }

    /**
     * Write AutoriteValidation into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        AutoriteValidationHelper.write(ostream,value);
    }

    /**
     * Return the AutoriteValidation TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return AutoriteValidationHelper.type();
    }

}
