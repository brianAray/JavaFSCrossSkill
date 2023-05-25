package com.revature.SpringDataJPA.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(generator = "orders_id_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(allocationSize = 1, name = "orders_id_seq")
    private Long id;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    public Order() {
    }

    public Order(Long id, String description, User user) {
        this.id = id;
        this.description = description;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(description, order.description) && Objects.equals(user, order.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, user);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", user=" + user +
                '}';
    }
}
