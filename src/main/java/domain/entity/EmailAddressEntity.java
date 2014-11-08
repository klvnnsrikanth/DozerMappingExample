package domain.entity;

public class EmailAddressEntity {
    private Long id;

    private PersonEntity person;

    private String address;

    private boolean isPrimary;

    private Integer invalid;

    private String comment;

//    @XmlAnyElement(lax = true)
//    protected List<Object> any;
//    @XmlAttribute(name = "primary")
//    protected Boolean primary;
//    @XmlAttribute(name = "address", required = true)
//    protected String address;
//    @XmlAnyAttribute
//    private Map<QName, String> otherAttributes = new HashMap<QName, String>();


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    public void setPrimary(boolean primary) {
        isPrimary = primary;
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
