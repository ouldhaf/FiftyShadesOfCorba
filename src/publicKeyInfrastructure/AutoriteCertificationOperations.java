package publicKeyInfrastructure;

/**
 * Interface definition : AutoriteCertification
 * 
 * @author OpenORB Compiler
 */
public interface AutoriteCertificationOperations extends publicKeyInfrastructure.PorteurOperations
{
    /**
     * Read accessor for autoriteRacine attribute
     * @return the attribute value
     */
    public publicKeyInfrastructure.AutoriteCertification autoriteRacine();

    /**
     * Operation genererCertificat
     */
    public publicKeyInfrastructure.Certificat genererCertificat(String identite, String clefPublique, String usage);

}
