package publicKeyInfrastructure;

/**
 * Interface definition : Utilisateur
 * 
 * @author OpenORB Compiler
 */
public class UtilisateurPOATie extends UtilisateurPOA
{

    //
    // Private reference to implementation object
    //
    private UtilisateurOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public UtilisateurPOATie(UtilisateurOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public UtilisateurPOATie(UtilisateurOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public UtilisateurOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(UtilisateurOperations delegate_)
    {
        _tie = delegate_;
    }

    /**
     * _default_POA method
     */
    public org.omg.PortableServer.POA _default_POA()
    {
        if (_poa != null)
            return _poa;
        else
            return super._default_POA();
    }

    /**
     * Operation afficherMessageClair
     */
    public void afficherMessageClair(String message)
    {
        _tie.afficherMessageClair( message);
    }

}
