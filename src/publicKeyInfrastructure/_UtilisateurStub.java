package publicKeyInfrastructure;

/**
 * Interface definition : Utilisateur
 * 
 * @author OpenORB Compiler
 */
public class _UtilisateurStub extends org.omg.CORBA.portable.ObjectImpl
        implements Utilisateur
{
    static final String[] _ids_list =
    {
        "IDL:publicKeyInfrastructure/Utilisateur:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = publicKeyInfrastructure.UtilisateurOperations.class;

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
