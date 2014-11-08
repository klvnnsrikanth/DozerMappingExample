package domain.entity;

import java.util.List;
import java.util.Set;

public class CustomerEntity {
    private Long id;

    private Integer customerNumber;

    private List<CustomerAccountEntity> customerAccounts;

    private String name;

    private CustomerTypeEntity customerType;

    private CustomerEntity parentCustomer;

    private Set<CustomerEntity> childCustomers;

    private Set<ContactEntity> contacts;

    private Set<CustomerCharacteristicEntity> customerCharacteristics;

    private String referrer;

    private Integer movedToCustomerNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Integer customerNumber) {
        this.customerNumber = customerNumber;
    }

    public List<CustomerAccountEntity> getCustomerAccounts() {
        return customerAccounts;
    }

    public void setCustomerAccounts(List<CustomerAccountEntity> customerAccounts) {
        this.customerAccounts = customerAccounts;
    }
}
