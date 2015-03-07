package publicKeyInfrastructure;

/**
 * Struct definition : Certificat
 * 
 * @author OpenORB Compiler
*/
public final class Certificat implements org.omg.CORBA.portable.IDLEntity
{
    /**
     * Struct member id
     */
    public String id;

    /**
     * Struct member clefPublique
     */
    public String clefPublique;

    /**
     * Struct member usageCle
     */
    public String usageCle;

    /**
     * Struct member autoriteAssociee
     */
    public publicKeyInfrastructure.AutoriteCertification autoriteAssociee;

    /**
     * Struct member porteurAssocie
     */
    public publicKeyInfrastructure.Porteur porteurAssocie;

    /**
     * Struct member valideDebut
     */
    public publicKeyInfrastructure.Date valideDebut;

    /**
     * Struct member valideFin
     */
    public publicKeyInfrastructure.Date valideFin;

    /**
     * Default constructor
     */
    public Certificat()
    { }

    /**
     * Constructor with fields initialization
     * @param id id struct member
     * @param clefPublique clefPublique struct member
     * @param usageCle usageCle struct member
     * @param autoriteAssociee autoriteAssociee struct member
     * @param porteurAssocie porteurAssocie struct member
     * @param valideDebut valideDebut struct member
     * @param valideFin valideFin struct member
     */
    public Certificat(String id, String clefPublique, String usageCle, publicKeyInfrastructure.AutoriteCertification autoriteAssociee, publicKeyInfrastructure.Porteur porteurAssocie, publicKeyInfrastructure.Date valideDebut, publicKeyInfrastructure.Date valideFin)
    {
        this.id = id;
        this.clefPublique = clefPublique;
        this.usageCle = usageCle;
        this.autoriteAssociee = autoriteAssociee;
        this.porteurAssocie = porteurAssocie;
        this.valideDebut = valideDebut;
        this.valideFin = valideFin;
    }

}
