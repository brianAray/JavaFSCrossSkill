package com.revature.SpringDataJPA.dto;

import java.util.Objects;

public class OrderDTO {

    private Long userId;
    private String description;

    public OrderDTO() {
    }

    public OrderDTO(Long userId, String description) {
        this.userId = userId;
        this.description = description;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDTO orderDTO = (OrderDTO) o;
        return Objects.equals(userId, orderDTO.userId) && Objects.equals(description, orderDTO.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, description);
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "userId=" + userId +
                ", description='" + description + '\'' +
                '}';
    }
}
