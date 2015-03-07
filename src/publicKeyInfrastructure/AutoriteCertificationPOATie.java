package publicKeyInfrastructure;

/**
 * Interface definition : AutoriteCertification
 * 
 * @author OpenORB Compiler
 */
public class AutoriteCertificationPOATie extends AutoriteCertificationPOA
{

    //
    // Private reference to implementation object
    //
    private AutoriteCertificationOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public AutoriteCertificationPOATie(AutoriteCertificationOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public AutoriteCertificationPOATie(AutoriteCertificationOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public AutoriteCertificationOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(AutoriteCertificationOperations delegate_)
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
     * Read accessor for autoriteRacine attribute
     */
    public publicKeyInfrastructure.AutoriteCertification autoriteRacine()
    {
        return _tie.autoriteRacine();
    }

    /**
     * Operation genererCertificat
     */
    public publicKeyInfrastructure.Certificat genererCertificat(String identite, String clefPublique, String usage)
    {
        return _tie.genererCertificat( identite,  clefPublique,  usage);
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
