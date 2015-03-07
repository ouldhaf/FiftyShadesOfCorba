package publicKeyInfrastructure;

/** 
 * Helper class for : Utilisateur
 *  
 * @author OpenORB Compiler
 */ 
public class UtilisateurHelper
{
    /**
     * Insert Utilisateur into an any
     * @param a an any
     * @param t Utilisateur value
     */
    public static void insert(org.omg.CORBA.Any a, publicKeyInfrastructure.Utilisateur t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract Utilisateur from an any
     * @param a an any
     * @return the extracted Utilisateur value
     */
    public static publicKeyInfrastructure.Utilisateur extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return publicKeyInfrastructure.UtilisateurHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the Utilisateur TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"Utilisateur");
        }
        return _tc;
    }

    /**
     * Return the Utilisateur IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:publicKeyInfrastructure/Utilisateur:1.0";

    /**
     * Read Utilisateur from a marshalled stream
     * @param istream the input stream
     * @return the readed Utilisateur value
     */
    public static publicKeyInfrastructure.Utilisateur read(org.omg.CORBA.portable.InputStream istream)
    {
        return(publicKeyInfrastructure.Utilisateur)istream.read_Object(publicKeyInfrastructure._UtilisateurStub.class);
    }

    /**
     * Write Utilisateur into a marshalled stream
     * @param ostream the output stream
     * @param value Utilisateur value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, publicKeyInfrastructure.Utilisateur value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to Utilisateur
     * @param obj the CORBA Object
     * @return Utilisateur Object
     */
    public static Utilisateur narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof Utilisateur)
            return (Utilisateur)obj;

        if (obj._is_a(id()))
        {
            _UtilisateurStub stub = new _UtilisateurStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to Utilisateur
     * @param obj the CORBA Object
     * @return Utilisateur Object
     */
    public static Utilisateur unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof Utilisateur)
            return (Utilisateur)obj;

        _UtilisateurStub stub = new _UtilisateurStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
