package publicKeyInfrastructure;

/**
 * Interface definition : Porteur
 * 
 * @author OpenORB Compiler
 */
public interface PorteurOperations extends publicKeyInfrastructure.UtilisateurOperations
{
    /**
     * Read accessor for identite attribute
     * @return the attribute value
     */
    public String identite();

    /**
     * Read accessor for monCertificat attribute
     * @return the attribute value
     */
    public publicKeyInfrastructure.Certificat monCertificat();

    /**
     * Operation afficherMessageSigne
     */
    public void afficherMessageSigne(String message, String signature);

    /**
     * Operation afficherMessageChiffre
     */
    public void afficherMessageChiffre(String message);

    /**
     * Operation afficherMessageSigneChiffre
     */
    public void afficherMessageSigneChiffre(String message, publicKeyInfrastructure.Certificat certificat);

}
