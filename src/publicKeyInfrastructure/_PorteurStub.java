package publicKeyInfrastructure;

/**
 * Interface definition : Porteur
 * 
 * @author OpenORB Compiler
 */
public class _PorteurStub extends org.omg.CORBA.portable.ObjectImpl
        implements Porteur
{
    static final String[] _ids_list =
    {
        "IDL:publicKeyInfrastructure/Porteur:1.0", 
        "IDL:publicKeyInfrastructure/Utilisateur:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = publicKeyInfrastructure.PorteurOperations.class;

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
