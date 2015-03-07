package publicKeyInfrastructure;

/**
 * Interface definition : AutoriteEnregistrement
 * 
 * @author OpenORB Compiler
 */
public class AutoriteEnregistrementPOATie extends AutoriteEnregistrementPOA
{

    //
    // Private reference to implementation object
    //
    private AutoriteEnregistrementOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public AutoriteEnregistrementPOATie(AutoriteEnregistrementOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public AutoriteEnregistrementPOATie(AutoriteEnregistrementOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public AutoriteEnregistrementOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(AutoriteEnregistrementOperations delegate_)
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
     * Operation changerEtatCertificat
     */
    public void changerEtatCertificat(String etat)
        throws publicKeyInfrastructure.PermissionNonAccordee, publicKeyInfrastructure.certificatIntrouvable
    {
        _tie.changerEtatCertificat( etat);
    }

    /**
     * Operation genererCertificat
     */
    public publicKeyInfrastructure.Certificat genererCertificat(String login, String password, String identite, String clefPublique, String usage)
        throws publicKeyInfrastructure.PermissionNonAccordee
    {
        return _tie.genererCertificat( login,  password,  identite,  clefPublique,  usage);
    }

    /**
     * Operation recupererCertificat
     */
    public publicKeyInfrastructure.Certificat recupererCertificat(String identite)
        throws publicKeyInfrastructure.certificatIntrouvable
    {
        return _tie.recupererCertificat( identite);
    }

}
