package publicKeyInfrastructure;

/**
 * Interface definition : AutoriteCertification
 * 
 * @author OpenORB Compiler
 */
public class _AutoriteCertificationStub extends org.omg.CORBA.portable.ObjectImpl
        implements AutoriteCertification
{
    static final String[] _ids_list =
    {
        "IDL:publicKeyInfrastructure/AutoriteCertification:1.0", 
        "IDL:publicKeyInfrastructure/Porteur:1.0", 
        "IDL:publicKeyInfrastructure/Utilisateur:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = publicKeyInfrastructure.AutoriteCertificationOperations.class;

    /**
     * Read accessor for autoriteRacine attribute
     * @return the attribute value
     */
    public publicKeyInfrastructure.AutoriteCertification autoriteRacine()
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try {
                    org.omg.CORBA.portable.OutputStream _output = this._request("_get_autoriteRacine",true);
                    _input = this._invoke(_output);
                    return publicKeyInfrastructure.AutoriteCertificationHelper.read(_input);
                } catch (final org.omg.CORBA.portable.RemarshalException _exception) {
                    continue;
                } catch (final org.omg.CORBA.portable.ApplicationException _exception) {
                    final String _exception_id = _exception.getId();
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                } finally {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("_get_autoriteRacine",_opsClass);
                if (_so == null)
                   continue;
                publicKeyInfrastructure.AutoriteCertificationOperations _self = (publicKeyInfrastructure.AutoriteCertificationOperations) _so.servant;
                try
                {
                    return _self.autoriteRacine();
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
    public publicKeyInfrastructure.Certificat genererCertificat(String identite, String clefPublique, String usage)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("genererCertificat",true);
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
                publicKeyInfrastructure.AutoriteCertificationOperations _self = (publicKeyInfrastructure.AutoriteCertificationOperations) _so.servant;
                try
                {
                    return _self.genererCertificat( identite,  clefPublique,  usage);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Read accessor for identite attribute
     * @return the attribute value
     */
    public String identite()
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try {
                    org.omg.CORBA.portable.OutputStream _output = this._request("_get_identite",true);
                    _input = this._invoke(_output);
                    return _input.read_string();
                } catch (final org.omg.CORBA.portable.RemarshalException _exception) {
                    continue;
                } catch (final org.omg.CORBA.portable.ApplicationException _exception) {
                    final String _exception_id = _exception.getId();
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                } finally {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("_get_identite",_opsClass);
                if (_so == null)
                   continue;
                publicKeyInfrastructure.PorteurOperations _self = (publicKeyInfrastructure.PorteurOperations) _so.servant;
                try
                {
                    return _self.identite();
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Read accessor for monCertificat attribute
     * @return the attribute value
     */
    public publicKeyInfrastructure.Certificat monCertificat()
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try {
                    org.omg.CORBA.portable.OutputStream _output = this._request("_get_monCertificat",true);
                    _input = this._invoke(_output);
                    return publicKeyInfrastructure.CertificatHelper.read(_input);
                } catch (final org.omg.CORBA.portable.RemarshalException _exception) {
                    continue;
                } catch (final org.omg.CORBA.portable.ApplicationException _exception) {
                    final String _exception_id = _exception.getId();
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                } finally {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("_get_monCertificat",_opsClass);
                if (_so == null)
                   continue;
                publicKeyInfrastructure.PorteurOperations _self = (publicKeyInfrastructure.PorteurOperations) _so.servant;
                try
                {
                    return _self.monCertificat();
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation afficherMessageSigne
     */
    public void afficherMessageSigne(String message, String signature)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("afficherMessageSigne",true);
                    _output.write_string(message);
                    _output.write_string(signature);
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
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                }
                finally
                {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("afficherMessageSigne",_opsClass);
                if (_so == null)
                   continue;
                publicKeyInfrastructure.PorteurOperations _self = (publicKeyInfrastructure.PorteurOperations) _so.servant;
                try
                {
                    _self.afficherMessageSigne( message,  signature);
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
     * Operation afficherMessageChiffre
     */
    public void afficherMessageChiffre(String message)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("afficherMessageChiffre",true);
                    _output.write_string(message);
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
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                }
                finally
                {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("afficherMessageChiffre",_opsClass);
                if (_so == null)
                   continue;
                publicKeyInfrastructure.PorteurOperations _self = (publicKeyInfrastructure.PorteurOperations) _so.servant;
                try
                {
                    _self.afficherMessageChiffre( message);
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
     * Operation afficherMessageSigneChiffre
     */
    public void afficherMessageSigneChiffre(String message, publicKeyInfrastructure.Certificat certificat)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("afficherMessageSigneChiffre",true);
                    _output.write_string(message);
                    publicKeyInfrastructure.CertificatHelper.write(_output,certificat);
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
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                }
                finally
                {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("afficherMessageSigneChiffre",_opsClass);
                if (_so == null)
                   continue;
                publicKeyInfrastructure.PorteurOperations _self = (publicKeyInfrastructure.PorteurOperations) _so.servant;
                try
                {
                    _self.afficherMessageSigneChiffre( message,  certificat);
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
     * Operation afficherMessageClair
     */
    public void afficherMessageClair(String message)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("afficherMessageClair",true);
                    _output.write_string(message);
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
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                }
                finally
                {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("afficherMessageClair",_opsClass);
                if (_so == null)
                   continue;
                publicKeyInfrastructure.UtilisateurOperations _self = (publicKeyInfrastructure.UtilisateurOperations) _so.servant;
                try
                {
                    _self.afficherMessageClair( message);
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
