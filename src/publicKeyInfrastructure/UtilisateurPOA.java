package publicKeyInfrastructure;

/**
 * Interface definition : Utilisateur
 * 
 * @author OpenORB Compiler
 */
public abstract class UtilisateurPOA extends org.omg.PortableServer.Servant
        implements UtilisateurOperations, org.omg.CORBA.portable.InvokeHandler
{
    public Utilisateur _this()
    {
        return UtilisateurHelper.narrow(_this_object());
    }

    public Utilisateur _this(org.omg.CORBA.ORB orb)
    {
        return UtilisateurHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:publicKeyInfrastructure/Utilisateur:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("afficherMessageClair")) {
                return _invoke_afficherMessageClair(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke_afficherMessageClair(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        String arg0_in = _is.read_string();

        afficherMessageClair(arg0_in);

        _output = handler.createReply();

        return _output;
    }

}
