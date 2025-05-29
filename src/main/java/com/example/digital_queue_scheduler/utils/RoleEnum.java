package com.example.digital_queue_scheduler.utils;

public enum RoleEnum {
    ADMIN,
    USER,
    MODERATOR;

    public static RoleEnum fromString(String role) {
        switch (role.toUpperCase()) {
            case "ADMIN":
                return ADMIN;
            case "USER":
                return USER;
            case "MODERATOR":
                return MODERATOR;
            default:
                throw new IllegalArgumentException("Unknown role: " + role);
        }
    }
}
