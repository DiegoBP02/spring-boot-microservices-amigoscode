package com.programming.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
