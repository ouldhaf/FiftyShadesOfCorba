package publicKeyInfrastructure;

/**
 * Holder class for : AutoriteEnregistrement
 * 
 * @author OpenORB Compiler
 */
final public class AutoriteEnregistrementHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal AutoriteEnregistrement value
     */
    public publicKeyInfrastructure.AutoriteEnregistrement value;

    /**
     * Default constructor
     */
    public AutoriteEnregistrementHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public AutoriteEnregistrementHolder(publicKeyInfrastructure.AutoriteEnregistrement initial)
    {
        value = initial;
    }

    /**
     * Read AutoriteEnregistrement from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = AutoriteEnregistrementHelper.read(istream);
    }

    /**
     * Write AutoriteEnregistrement into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        AutoriteEnregistrementHelper.write(ostream,value);
    }

    /**
     * Return the AutoriteEnregistrement TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return AutoriteEnregistrementHelper.type();
    }

}
