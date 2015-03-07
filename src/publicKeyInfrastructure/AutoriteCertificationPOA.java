package publicKeyInfrastructure;

/**
 * Interface definition : AutoriteCertification
 * 
 * @author OpenORB Compiler
 */
public abstract class AutoriteCertificationPOA extends org.omg.PortableServer.Servant
        implements AutoriteCertificationOperations, org.omg.CORBA.portable.InvokeHandler
{
    public AutoriteCertification _this()
    {
        return AutoriteCertificationHelper.narrow(_this_object());
    }

    public AutoriteCertification _this(org.omg.CORBA.ORB orb)
    {
        return AutoriteCertificationHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:publicKeyInfrastructure/AutoriteCertification:1.0", 
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

        if (opName.equals("_get_autoriteRacine")) {
                return _invoke__get_autoriteRacine(_is, handler);
        } else if (opName.equals("_get_identite")) {
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
        } else if (opName.equals("genererCertificat")) {
                return _invoke_genererCertificat(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke__get_autoriteRacine(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        publicKeyInfrastructure.AutoriteCertification arg = autoriteRacine();
        _output = handler.createReply();
        publicKeyInfrastructure.AutoriteCertificationHelper.write(_output,arg);
        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_genererCertificat(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        String arg0_in = _is.read_string();
        String arg1_in = _is.read_string();
        String arg2_in = _is.read_string();

        publicKeyInfrastructure.Certificat _arg_result = genererCertificat(arg0_in, arg1_in, arg2_in);

        _output = handler.createReply();
        publicKeyInfrastructure.CertificatHelper.write(_output,_arg_result);

        return _output;
    }

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
