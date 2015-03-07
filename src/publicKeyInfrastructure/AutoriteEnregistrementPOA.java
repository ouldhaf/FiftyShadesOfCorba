package publicKeyInfrastructure;

/**
 * Interface definition : AutoriteEnregistrement
 * 
 * @author OpenORB Compiler
 */
public abstract class AutoriteEnregistrementPOA extends org.omg.PortableServer.Servant
        implements AutoriteEnregistrementOperations, org.omg.CORBA.portable.InvokeHandler
{
    public AutoriteEnregistrement _this()
    {
        return AutoriteEnregistrementHelper.narrow(_this_object());
    }

    public AutoriteEnregistrement _this(org.omg.CORBA.ORB orb)
    {
        return AutoriteEnregistrementHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:publicKeyInfrastructure/AutoriteEnregistrement:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("changerEtatCertificat")) {
                return _invoke_changerEtatCertificat(_is, handler);
        } else if (opName.equals("genererCertificat")) {
                return _invoke_genererCertificat(_is, handler);
        } else if (opName.equals("recupererCertificat")) {
                return _invoke_recupererCertificat(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke_changerEtatCertificat(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        String arg0_in = _is.read_string();

        try
        {
            changerEtatCertificat(arg0_in);

            _output = handler.createReply();

        }
        catch (publicKeyInfrastructure.PermissionNonAccordee _exception)
        {
            _output = handler.createExceptionReply();
            publicKeyInfrastructure.PermissionNonAccordeeHelper.write(_output,_exception);
        }
        catch (publicKeyInfrastructure.certificatIntrouvable _exception)
        {
            _output = handler.createExceptionReply();
            publicKeyInfrastructure.certificatIntrouvableHelper.write(_output,_exception);
        }
        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_genererCertificat(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        String arg0_in = _is.read_string();
        String arg1_in = _is.read_string();
        String arg2_in = _is.read_string();
        String arg3_in = _is.read_string();
        String arg4_in = _is.read_string();

        try
        {
            publicKeyInfrastructure.Certificat _arg_result = genererCertificat(arg0_in, arg1_in, arg2_in, arg3_in, arg4_in);

            _output = handler.createReply();
            publicKeyInfrastructure.CertificatHelper.write(_output,_arg_result);

        }
        catch (publicKeyInfrastructure.PermissionNonAccordee _exception)
        {
            _output = handler.createExceptionReply();
            publicKeyInfrastructure.PermissionNonAccordeeHelper.write(_output,_exception);
        }
        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_recupererCertificat(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        String arg0_in = _is.read_string();

        try
        {
            publicKeyInfrastructure.Certificat _arg_result = recupererCertificat(arg0_in);

            _output = handler.createReply();
            publicKeyInfrastructure.CertificatHelper.write(_output,_arg_result);

        }
        catch (publicKeyInfrastructure.certificatIntrouvable _exception)
        {
            _output = handler.createExceptionReply();
            publicKeyInfrastructure.certificatIntrouvableHelper.write(_output,_exception);
        }
        return _output;
    }

}
