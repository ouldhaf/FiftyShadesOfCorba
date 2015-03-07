package publicKeyInfrastructure;

/**
 * Interface definition : AutoriteValidation
 * 
 * @author OpenORB Compiler
 */
public abstract class AutoriteValidationPOA extends org.omg.PortableServer.Servant
        implements AutoriteValidationOperations, org.omg.CORBA.portable.InvokeHandler
{
    public AutoriteValidation _this()
    {
        return AutoriteValidationHelper.narrow(_this_object());
    }

    public AutoriteValidation _this(org.omg.CORBA.ORB orb)
    {
        return AutoriteValidationHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:publicKeyInfrastructure/AutoriteValidation:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("validerCertificat")) {
                return _invoke_validerCertificat(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke_validerCertificat(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        publicKeyInfrastructure.Certificat arg0_in = publicKeyInfrastructure.CertificatHelper.read(_is);

        try
        {
            validerCertificat(arg0_in);

            _output = handler.createReply();

        }
        catch (publicKeyInfrastructure.certificatInvalide _exception)
        {
            _output = handler.createExceptionReply();
            publicKeyInfrastructure.certificatInvalideHelper.write(_output,_exception);
        }
        return _output;
    }

}
