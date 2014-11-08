package domain.entity;

import java.util.Set;

public class PersonEntity {
    private Long id;

    private Integer personNumber;

    private String firstName;

    private String lastName;

    private String middleName;

    private String suffix;

    private String title;

    private Integer invalid;

    private String legacyId;

    private String userId;

    private String legacyNumber;

    private String comment;

    private Set<AddressEntity> addresses;

    private Set<PhoneEntity> phones;

    private Set<EmailAddressEntity> emailAddresses;

    private Set<AccountEntity> accounts;

    private Set<ContactEntity> contacts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(Integer personNumber) {
        this.personNumber = personNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getInvalid() {
        return invalid;
    }

    public void setInvalid(Integer invalid) {
        this.invalid = invalid;
    }

    public String getLegacyId() {
        return legacyId;
    }

    public void setLegacyId(String legacyId) {
        this.legacyId = legacyId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLegacyNumber() {
        return legacyNumber;
    }

    public void setLegacyNumber(String legacyNumber) {
        this.legacyNumber = legacyNumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Set<AddressEntity> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<AddressEntity> addresses) {
        this.addresses = addresses;
    }

    public Set<PhoneEntity> getPhones() {
        return phones;
    }

    public void setPhones(Set<PhoneEntity> phones) {
        this.phones = phones;
    }

    public Set<EmailAddressEntity> getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(Set<EmailAddressEntity> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public Set<AccountEntity> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<AccountEntity> accounts) {
        this.accounts = accounts;
    }

    public Set<ContactEntity> getContacts() {
        return contacts;
    }

    public void setContacts(Set<ContactEntity> contacts) {
        this.contacts = contacts;
    }
}
