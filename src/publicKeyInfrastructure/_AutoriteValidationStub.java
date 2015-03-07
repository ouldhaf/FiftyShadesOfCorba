package publicKeyInfrastructure;

/**
 * Interface definition : AutoriteValidation
 * 
 * @author OpenORB Compiler
 */
public class _AutoriteValidationStub extends org.omg.CORBA.portable.ObjectImpl
        implements AutoriteValidation
{
    static final String[] _ids_list =
    {
        "IDL:publicKeyInfrastructure/AutoriteValidation:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = publicKeyInfrastructure.AutoriteValidationOperations.class;

    /**
     * Operation validerCertificat
     */
    public void validerCertificat(publicKeyInfrastructure.Certificat certificatAValider)
        throws publicKeyInfrastructure.certificatInvalide
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("validerCertificat",true);
                    publicKeyInfrastructure.CertificatHelper.write(_output,certificatAValider);
                    _input = this._invoke(_output);
                    return;
                }
                catch(org.omg.CORBA.portable.RemarshalException _exception)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _exception)
                {
                    String _exception_id = _exception.getId();
                    if (_exception_id.equals(publicKeyInfrastructure.certificatInvalideHelper.id()))
                    {
                        throw publicKeyInfrastructure.certificatInvalideHelper.read(_exception.getInputStream());
                    }

                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                }
                finally
                {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("validerCertificat",_opsClass);
                if (_so == null)
                   continue;
                publicKeyInfrastructure.AutoriteValidationOperations _self = (publicKeyInfrastructure.AutoriteValidationOperations) _so.servant;
                try
                {
                    _self.validerCertificat( certificatAValider);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

}
