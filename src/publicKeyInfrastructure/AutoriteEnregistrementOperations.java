package publicKeyInfrastructure;

/**
 * Interface definition : AutoriteEnregistrement
 * 
 * @author OpenORB Compiler
 */
public interface AutoriteEnregistrementOperations
{
    /**
     * Operation changerEtatCertificat
     */
    public void changerEtatCertificat(String etat)
        throws publicKeyInfrastructure.PermissionNonAccordee, publicKeyInfrastructure.certificatIntrouvable;

    /**
     * Operation genererCertificat
     */
    public publicKeyInfrastructure.Certificat genererCertificat(String login, String password, String identite, String clefPublique, String usage)
        throws publicKeyInfrastructure.PermissionNonAccordee;

    /**
     * Operation recupererCertificat
     */
    public publicKeyInfrastructure.Certificat recupererCertificat(String identite)
        throws publicKeyInfrastructure.certificatIntrouvable;

}
