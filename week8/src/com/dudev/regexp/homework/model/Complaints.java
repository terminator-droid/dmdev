package com.dudev.regexp.homework.model;

public enum Complaints {
    NOT_FOUND("404 - I'm idiot and tryin to get what doesn't exist"),
    UNAUTHORIZED("401 - Fuck token is dead"),
    BAD_REQUEST("400 - I'm idiot"),
    FORBIDDEN("403 - Not today, bro"),
    CONFLICT("409 - DO YOU WANT A CONFLICT??");

    final String description;

    Complaints(String description) {
        this.description = description;
    }
}
