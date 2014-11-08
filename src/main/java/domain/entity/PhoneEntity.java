package domain.entity;

public class PhoneEntity {

    private Long id;

    private PersonEntity person;

    private String number;

    private PhoneTypeEntity phoneType;

    private String country;

    private String mask;

    private Integer invalid;

    private String comment;


    /**
     *     @XmlAnyElement(lax = true)
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();
     * @return
     */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PersonEntity getPerson() {
        return person;
    }

    public void setPerson(PersonEntity person) {
        this.person = person;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PhoneTypeEntity getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneTypeEntity phoneType) {
        this.phoneType = phoneType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public Integer getInvalid() {
        return invalid;
    }

    public void setInvalid(Integer invalid) {
        this.invalid = invalid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
