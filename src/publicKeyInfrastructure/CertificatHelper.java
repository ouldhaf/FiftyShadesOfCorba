package publicKeyInfrastructure;

/** 
 * Helper class for : Certificat
 *  
 * @author OpenORB Compiler
 */ 
public class CertificatHelper
{
    private static final boolean HAS_OPENORB;
    static {
        boolean hasOpenORB = false;
        try {
            Thread.currentThread().getContextClassLoader().loadClass("org.openorb.CORBA.Any");
            hasOpenORB = true;
        }
        catch(ClassNotFoundException ex) {
        }
        HAS_OPENORB = hasOpenORB;
    }
    /**
     * Insert Certificat into an any
     * @param a an any
     * @param t Certificat value
     */
    public static void insert(org.omg.CORBA.Any a, publicKeyInfrastructure.Certificat t)
    {
        a.insert_Streamable(new publicKeyInfrastructure.CertificatHolder(t));
    }

    /**
     * Extract Certificat from an any
     * @param a an any
     * @return the extracted Certificat value
     */
    public static publicKeyInfrastructure.Certificat extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        if (HAS_OPENORB && a instanceof org.openorb.CORBA.Any) {
            // streamable extraction. The jdk stubs incorrectly define the Any stub
            org.openorb.CORBA.Any any = (org.openorb.CORBA.Any)a;
            try {
                org.omg.CORBA.portable.Streamable s = any.extract_Streamable();
                if(s instanceof publicKeyInfrastructure.CertificatHolder)
                    return ((publicKeyInfrastructure.CertificatHolder)s).value;
            } catch (org.omg.CORBA.BAD_INV_ORDER ex) {
            }
            publicKeyInfrastructure.CertificatHolder h = new publicKeyInfrastructure.CertificatHolder(read(a.create_input_stream()));
            a.insert_Streamable(h);
            return h.value;
        }
        return read(a.create_input_stream());
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;
    private static boolean _working = false;

    /**
     * Return the Certificat TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            synchronized(org.omg.CORBA.TypeCode.class) {
                if (_tc != null)
                    return _tc;
                if (_working)
                    return org.omg.CORBA.ORB.init().create_recursive_tc(id());
                _working = true;
                org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
                org.omg.CORBA.StructMember []_members = new org.omg.CORBA.StructMember[7];

                _members[0] = new org.omg.CORBA.StructMember();
                _members[0].name = "id";
                _members[0].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_string);
                _members[1] = new org.omg.CORBA.StructMember();
                _members[1].name = "clefPublique";
                _members[1].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_string);
                _members[2] = new org.omg.CORBA.StructMember();
                _members[2].name = "usageCle";
                _members[2].type = orb.get_primitive_tc(org.omg.CORBA.TCKind.tk_string);
                _members[3] = new org.omg.CORBA.StructMember();
                _members[3].name = "autoriteAssociee";
                _members[3].type = publicKeyInfrastructure.AutoriteCertificationHelper.type();
                _members[4] = new org.omg.CORBA.StructMember();
                _members[4].name = "porteurAssocie";
                _members[4].type = publicKeyInfrastructure.PorteurHelper.type();
                _members[5] = new org.omg.CORBA.StructMember();
                _members[5].name = "valideDebut";
                _members[5].type = publicKeyInfrastructure.DateHelper.type();
                _members[6] = new org.omg.CORBA.StructMember();
                _members[6].name = "valideFin";
                _members[6].type = publicKeyInfrastructure.DateHelper.type();
                _tc = orb.create_struct_tc(id(),"Certificat",_members);
                _working = false;
            }
        }
        return _tc;
    }

    /**
     * Return the Certificat IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:publicKeyInfrastructure/Certificat:1.0";

    /**
     * Read Certificat from a marshalled stream
     * @param istream the input stream
     * @return the readed Certificat value
     */
    public static publicKeyInfrastructure.Certificat read(org.omg.CORBA.portable.InputStream istream)
    {
        publicKeyInfrastructure.Certificat new_one = new publicKeyInfrastructure.Certificat();

        new_one.id = istream.read_string();
        new_one.clefPublique = istream.read_string();
        new_one.usageCle = istream.read_string();
        new_one.autoriteAssociee = publicKeyInfrastructure.AutoriteCertificationHelper.read(istream);
        new_one.porteurAssocie = publicKeyInfrastructure.PorteurHelper.read(istream);
        new_one.valideDebut = publicKeyInfrastructure.DateHelper.read(istream);
        new_one.valideFin = publicKeyInfrastructure.DateHelper.read(istream);

        return new_one;
    }

    /**
     * Write Certificat into a marshalled stream
     * @param ostream the output stream
     * @param value Certificat value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, publicKeyInfrastructure.Certificat value)
    {
        ostream.write_string(value.id);
        ostream.write_string(value.clefPublique);
        ostream.write_string(value.usageCle);
        publicKeyInfrastructure.AutoriteCertificationHelper.write(ostream,value.autoriteAssociee);
        publicKeyInfrastructure.PorteurHelper.write(ostream,value.porteurAssocie);
        publicKeyInfrastructure.DateHelper.write(ostream,value.valideDebut);
        publicKeyInfrastructure.DateHelper.write(ostream,value.valideFin);
    }

}
