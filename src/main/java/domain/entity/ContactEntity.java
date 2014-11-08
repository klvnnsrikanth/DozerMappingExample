package domain.entity;

import java.util.SortedSet;

public class ContactEntity {
    private Long id;

    private CustomerEntity customer;

    private PersonEntity person;

    private AccountEntity account;

    private CustomerAccountEntity customerAccount;

    private SortedSet<RoleEntity> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }

    public PersonEntity getPerson() {
        return person;
    }

    public void setPerson(PersonEntity person) {
        this.person = person;
    }

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }

    public CustomerAccountEntity getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(CustomerAccountEntity customerAccount) {
        this.customerAccount = customerAccount;
    }

    public SortedSet<RoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(SortedSet<RoleEntity> roles) {
        this.roles = roles;
    }
}
