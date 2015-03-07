package publicKeyInfrastructure;

/**
 * Interface definition : Porteur
 * 
 * @author OpenORB Compiler
 */
public class PorteurPOATie extends PorteurPOA
{

    //
    // Private reference to implementation object
    //
    private PorteurOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public PorteurPOATie(PorteurOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public PorteurPOATie(PorteurOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public PorteurOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(PorteurOperations delegate_)
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
     * Read accessor for identite attribute
     */
    public String identite()
    {
        return _tie.identite();
    }

    /**
     * Read accessor for monCertificat attribute
     */
    public publicKeyInfrastructure.Certificat monCertificat()
    {
        return _tie.monCertificat();
    }

    /**
     * Operation afficherMessageSigne
     */
    public void afficherMessageSigne(String message, String signature)
    {
        _tie.afficherMessageSigne( message,  signature);
    }

    /**
     * Operation afficherMessageChiffre
     */
    public void afficherMessageChiffre(String message)
    {
        _tie.afficherMessageChiffre( message);
    }

    /**
     * Operation afficherMessageSigneChiffre
     */
    public void afficherMessageSigneChiffre(String message, publicKeyInfrastructure.Certificat certificat)
    {
        _tie.afficherMessageSigneChiffre( message,  certificat);
    }

    /**
     * Operation afficherMessageClair
     */
    public void afficherMessageClair(String message)
    {
        _tie.afficherMessageClair( message);
    }

}
