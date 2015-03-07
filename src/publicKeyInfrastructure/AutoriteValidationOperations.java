package publicKeyInfrastructure;

/**
 * Interface definition : AutoriteValidation
 * 
 * @author OpenORB Compiler
 */
public interface AutoriteValidationOperations
{
    /**
     * Operation validerCertificat
     */
    public void validerCertificat(publicKeyInfrastructure.Certificat certificatAValider)
        throws publicKeyInfrastructure.certificatInvalide;

}
