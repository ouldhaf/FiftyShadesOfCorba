package publicKeyInfrastructure;

/** 
 * Helper class for : AutoriteEnregistrement
 *  
 * @author OpenORB Compiler
 */ 
public class AutoriteEnregistrementHelper
{
    /**
     * Insert AutoriteEnregistrement into an any
     * @param a an any
     * @param t AutoriteEnregistrement value
     */
    public static void insert(org.omg.CORBA.Any a, publicKeyInfrastructure.AutoriteEnregistrement t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract AutoriteEnregistrement from an any
     * @param a an any
     * @return the extracted AutoriteEnregistrement value
     */
    public static publicKeyInfrastructure.AutoriteEnregistrement extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return publicKeyInfrastructure.AutoriteEnregistrementHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the AutoriteEnregistrement TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"AutoriteEnregistrement");
        }
        return _tc;
    }

    /**
     * Return the AutoriteEnregistrement IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:publicKeyInfrastructure/AutoriteEnregistrement:1.0";

    /**
     * Read AutoriteEnregistrement from a marshalled stream
     * @param istream the input stream
     * @return the readed AutoriteEnregistrement value
     */
    public static publicKeyInfrastructure.AutoriteEnregistrement read(org.omg.CORBA.portable.InputStream istream)
    {
        return(publicKeyInfrastructure.AutoriteEnregistrement)istream.read_Object(publicKeyInfrastructure._AutoriteEnregistrementStub.class);
    }

    /**
     * Write AutoriteEnregistrement into a marshalled stream
     * @param ostream the output stream
     * @param value AutoriteEnregistrement value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, publicKeyInfrastructure.AutoriteEnregistrement value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to AutoriteEnregistrement
     * @param obj the CORBA Object
     * @return AutoriteEnregistrement Object
     */
    public static AutoriteEnregistrement narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof AutoriteEnregistrement)
            return (AutoriteEnregistrement)obj;

        if (obj._is_a(id()))
        {
            _AutoriteEnregistrementStub stub = new _AutoriteEnregistrementStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to AutoriteEnregistrement
     * @param obj the CORBA Object
     * @return AutoriteEnregistrement Object
     */
    public static AutoriteEnregistrement unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof AutoriteEnregistrement)
            return (AutoriteEnregistrement)obj;

        _AutoriteEnregistrementStub stub = new _AutoriteEnregistrementStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
