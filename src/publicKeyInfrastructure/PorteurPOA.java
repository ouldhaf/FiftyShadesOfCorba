package publicKeyInfrastructure;

/**
 * Interface definition : Porteur
 * 
 * @author OpenORB Compiler
 */
public abstract class PorteurPOA extends org.omg.PortableServer.Servant
        implements PorteurOperations, org.omg.CORBA.portable.InvokeHandler
{
    public Porteur _this()
    {
        return PorteurHelper.narrow(_this_object());
    }

    public Porteur _this(org.omg.CORBA.ORB orb)
    {
        return PorteurHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:publicKeyInfrastructure/Porteur:1.0", 
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

        if (opName.equals("_get_identite")) {
                return _invoke__get_identite(_is, handler);
        } else if (opName.equals("_get_monCertificat")) {
                return _invoke__get_monCertificat(_is, handler);
        } else if (opName.equals("afficherMessageChiffre")) {
                return _invoke_afficherMessageChiffre(_is, handler);
        } else if (opName.equals("afficherMessageClair")) {
                return _invoke_afficherMessageClair(_is, handler);
        } else if (opName.equals("afficherMessageSigne")) {
                return _invoke_afficherMessageSigne(_is, handler);
        } else if (opName.equals("afficherMessageSigneChiffre")) {
                return _invoke_afficherMessageSigneChiffre(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke__get_identite(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        String arg = identite();
        _output = handler.createReply();
        _output.write_string(arg);
        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke__get_monCertificat(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        publicKeyInfrastructure.Certificat arg = monCertificat();
        _output = handler.createReply();
        publicKeyInfrastructure.CertificatHelper.write(_output,arg);
        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_afficherMessageSigne(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        String arg0_in = _is.read_string();
        String arg1_in = _is.read_string();

        afficherMessageSigne(arg0_in, arg1_in);

        _output = handler.createReply();

        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_afficherMessageChiffre(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        String arg0_in = _is.read_string();

        afficherMessageChiffre(arg0_in);

        _output = handler.createReply();

        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_afficherMessageSigneChiffre(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        String arg0_in = _is.read_string();
        publicKeyInfrastructure.Certificat arg1_in = publicKeyInfrastructure.CertificatHelper.read(_is);

        afficherMessageSigneChiffre(arg0_in, arg1_in);

        _output = handler.createReply();

        return _output;
    }

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
