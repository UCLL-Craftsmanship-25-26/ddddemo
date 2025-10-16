package be.ucll.craftmanship.DDDDemo.library.catalog.domain;

import org.hibernate.validator.internal.constraintvalidators.hv.ISBNValidator;

public record Isbn(String value) {
    private static final ISBNValidator VALIDATOR = new ISBNValidator();

    public Isbn {
        if (!VALIDATOR.isValid(value, null)) {
            throw new IllegalArgumentException("invalid isbn: " + value);
        }
    }
}
