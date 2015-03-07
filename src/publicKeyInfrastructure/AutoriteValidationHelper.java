package publicKeyInfrastructure;

/** 
 * Helper class for : AutoriteValidation
 *  
 * @author OpenORB Compiler
 */ 
public class AutoriteValidationHelper
{
    /**
     * Insert AutoriteValidation into an any
     * @param a an any
     * @param t AutoriteValidation value
     */
    public static void insert(org.omg.CORBA.Any a, publicKeyInfrastructure.AutoriteValidation t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract AutoriteValidation from an any
     * @param a an any
     * @return the extracted AutoriteValidation value
     */
    public static publicKeyInfrastructure.AutoriteValidation extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return publicKeyInfrastructure.AutoriteValidationHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the AutoriteValidation TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"AutoriteValidation");
        }
        return _tc;
    }

    /**
     * Return the AutoriteValidation IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:publicKeyInfrastructure/AutoriteValidation:1.0";

    /**
     * Read AutoriteValidation from a marshalled stream
     * @param istream the input stream
     * @return the readed AutoriteValidation value
     */
    public static publicKeyInfrastructure.AutoriteValidation read(org.omg.CORBA.portable.InputStream istream)
    {
        return(publicKeyInfrastructure.AutoriteValidation)istream.read_Object(publicKeyInfrastructure._AutoriteValidationStub.class);
    }

    /**
     * Write AutoriteValidation into a marshalled stream
     * @param ostream the output stream
     * @param value AutoriteValidation value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, publicKeyInfrastructure.AutoriteValidation value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to AutoriteValidation
     * @param obj the CORBA Object
     * @return AutoriteValidation Object
     */
    public static AutoriteValidation narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof AutoriteValidation)
            return (AutoriteValidation)obj;

        if (obj._is_a(id()))
        {
            _AutoriteValidationStub stub = new _AutoriteValidationStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to AutoriteValidation
     * @param obj the CORBA Object
     * @return AutoriteValidation Object
     */
    public static AutoriteValidation unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof AutoriteValidation)
            return (AutoriteValidation)obj;

        _AutoriteValidationStub stub = new _AutoriteValidationStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
