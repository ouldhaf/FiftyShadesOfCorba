package publicKeyInfrastructure;

/** 
 * Helper class for : AutoriteCertification
 *  
 * @author OpenORB Compiler
 */ 
public class AutoriteCertificationHelper
{
    /**
     * Insert AutoriteCertification into an any
     * @param a an any
     * @param t AutoriteCertification value
     */
    public static void insert(org.omg.CORBA.Any a, publicKeyInfrastructure.AutoriteCertification t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract AutoriteCertification from an any
     * @param a an any
     * @return the extracted AutoriteCertification value
     */
    public static publicKeyInfrastructure.AutoriteCertification extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return publicKeyInfrastructure.AutoriteCertificationHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the AutoriteCertification TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"AutoriteCertification");
        }
        return _tc;
    }

    /**
     * Return the AutoriteCertification IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:publicKeyInfrastructure/AutoriteCertification:1.0";

    /**
     * Read AutoriteCertification from a marshalled stream
     * @param istream the input stream
     * @return the readed AutoriteCertification value
     */
    public static publicKeyInfrastructure.AutoriteCertification read(org.omg.CORBA.portable.InputStream istream)
    {
        return(publicKeyInfrastructure.AutoriteCertification)istream.read_Object(publicKeyInfrastructure._AutoriteCertificationStub.class);
    }

    /**
     * Write AutoriteCertification into a marshalled stream
     * @param ostream the output stream
     * @param value AutoriteCertification value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, publicKeyInfrastructure.AutoriteCertification value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to AutoriteCertification
     * @param obj the CORBA Object
     * @return AutoriteCertification Object
     */
    public static AutoriteCertification narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof AutoriteCertification)
            return (AutoriteCertification)obj;

        if (obj._is_a(id()))
        {
            _AutoriteCertificationStub stub = new _AutoriteCertificationStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to AutoriteCertification
     * @param obj the CORBA Object
     * @return AutoriteCertification Object
     */
    public static AutoriteCertification unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof AutoriteCertification)
            return (AutoriteCertification)obj;

        _AutoriteCertificationStub stub = new _AutoriteCertificationStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
