package publicKeyInfrastructure;

/**
 * Interface definition : AutoriteEnregistrement
 * 
 * @author OpenORB Compiler
 */
public class _AutoriteEnregistrementStub extends org.omg.CORBA.portable.ObjectImpl
        implements AutoriteEnregistrement
{
    static final String[] _ids_list =
    {
        "IDL:publicKeyInfrastructure/AutoriteEnregistrement:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = publicKeyInfrastructure.AutoriteEnregistrementOperations.class;

    /**
     * Operation changerEtatCertificat
     */
    public void changerEtatCertificat(String etat)
        throws publicKeyInfrastructure.PermissionNonAccordee, publicKeyInfrastructure.certificatIntrouvable
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("changerEtatCertificat",true);
                    _output.write_string(etat);
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
                    if (_exception_id.equals(publicKeyInfrastructure.PermissionNonAccordeeHelper.id()))
                    {
                        throw publicKeyInfrastructure.PermissionNonAccordeeHelper.read(_exception.getInputStream());
                    }

                    if (_exception_id.equals(publicKeyInfrastructure.certificatIntrouvableHelper.id()))
                    {
                        throw publicKeyInfrastructure.certificatIntrouvableHelper.read(_exception.getInputStream());
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("changerEtatCertificat",_opsClass);
                if (_so == null)
                   continue;
                publicKeyInfrastructure.AutoriteEnregistrementOperations _self = (publicKeyInfrastructure.AutoriteEnregistrementOperations) _so.servant;
                try
                {
                    _self.changerEtatCertificat( etat);
                    return;
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation genererCertificat
     */
    public publicKeyInfrastructure.Certificat genererCertificat(String login, String password, String identite, String clefPublique, String usage)
        throws publicKeyInfrastructure.PermissionNonAccordee
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("genererCertificat",true);
                    _output.write_string(login);
                    _output.write_string(password);
                    _output.write_string(identite);
                    _output.write_string(clefPublique);
                    _output.write_string(usage);
                    _input = this._invoke(_output);
                    publicKeyInfrastructure.Certificat _arg_ret = publicKeyInfrastructure.CertificatHelper.read(_input);
                    return _arg_ret;
                }
                catch(org.omg.CORBA.portable.RemarshalException _exception)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _exception)
                {
                    String _exception_id = _exception.getId();
                    if (_exception_id.equals(publicKeyInfrastructure.PermissionNonAccordeeHelper.id()))
                    {
                        throw publicKeyInfrastructure.PermissionNonAccordeeHelper.read(_exception.getInputStream());
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("genererCertificat",_opsClass);
                if (_so == null)
                   continue;
                publicKeyInfrastructure.AutoriteEnregistrementOperations _self = (publicKeyInfrastructure.AutoriteEnregistrementOperations) _so.servant;
                try
                {
                    return _self.genererCertificat( login,  password,  identite,  clefPublique,  usage);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation recupererCertificat
     */
    public publicKeyInfrastructure.Certificat recupererCertificat(String identite)
        throws publicKeyInfrastructure.certificatIntrouvable
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("recupererCertificat",true);
                    _output.write_string(identite);
                    _input = this._invoke(_output);
                    publicKeyInfrastructure.Certificat _arg_ret = publicKeyInfrastructure.CertificatHelper.read(_input);
                    return _arg_ret;
                }
                catch(org.omg.CORBA.portable.RemarshalException _exception)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _exception)
                {
                    String _exception_id = _exception.getId();
                    if (_exception_id.equals(publicKeyInfrastructure.certificatIntrouvableHelper.id()))
                    {
                        throw publicKeyInfrastructure.certificatIntrouvableHelper.read(_exception.getInputStream());
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
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("recupererCertificat",_opsClass);
                if (_so == null)
                   continue;
                publicKeyInfrastructure.AutoriteEnregistrementOperations _self = (publicKeyInfrastructure.AutoriteEnregistrementOperations) _so.servant;
                try
                {
                    return _self.recupererCertificat( identite);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

}
