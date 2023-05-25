package com.revature.SpringDataJPA.entity;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(generator = "users_id_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(allocationSize = 1, name = "users_id_seq")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Order> orders;

    public User() {
    }

    public User(Long id, String name, String email, Set<Order> orders) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.orders = orders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(email, user.email) && Objects.equals(orders, user.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, orders);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", orders=" + orders +
                '}';
    }
}
