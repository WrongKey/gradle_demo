package com.wrongkey.authentication.model;

import com.wrongkey.authentication.util.AccountRole;
import com.wrongkey.authentication.util.AccountStatus;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TMIS_AUTHENTICATION")
public class AuthenticationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false, length = 20, unique = true)
    private long id;

    @Column(name = "time_created", nullable = false, updatable = false)
    private Date timeCreated;

    @Column(name = "account_id", nullable = false, length = 64, unique = true)
    private String accountId;

    @Enumerated(EnumType.STRING)
    @Column(name = "account_role", nullable = false, length = 16)
    private AccountRole role;

    @Column(name = "password", nullable = false, length = 64)
    private String password;

    @Column(name = "display_name", nullable = true, length = 64)
    private String displayName;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, length = 64)
    private AccountStatus status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountRole getRole() {
        return role;
    }

    public void setRole(AccountRole role) {
        this.role = role;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }
}
