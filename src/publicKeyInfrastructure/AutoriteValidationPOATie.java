package publicKeyInfrastructure;

/**
 * Interface definition : AutoriteValidation
 * 
 * @author OpenORB Compiler
 */
public class AutoriteValidationPOATie extends AutoriteValidationPOA
{

    //
    // Private reference to implementation object
    //
    private AutoriteValidationOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public AutoriteValidationPOATie(AutoriteValidationOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public AutoriteValidationPOATie(AutoriteValidationOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public AutoriteValidationOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(AutoriteValidationOperations delegate_)
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
     * Operation validerCertificat
     */
    public void validerCertificat(publicKeyInfrastructure.Certificat certificatAValider)
        throws publicKeyInfrastructure.certificatInvalide
    {
        _tie.validerCertificat( certificatAValider);
    }

}
