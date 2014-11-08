package domain.entity;

public class CustomerAccountEntity {
    private Long id;

    private Long accountNumber;

    private AccountTypeEntity accountType;

    private String accountName;

    private String accountStatus;

    private CustomerEntity customer;

    private CustomerAccountEntity parentCustomerAccount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountTypeEntity getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountTypeEntity accountType) {
        this.accountType = accountType;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }

    public CustomerAccountEntity getParentCustomerAccount() {
        return parentCustomerAccount;
    }

    public void setParentCustomerAccount(CustomerAccountEntity parentCustomerAccount) {
        this.parentCustomerAccount = parentCustomerAccount;
    }
}
