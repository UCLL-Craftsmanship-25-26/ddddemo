package be.ucll.craftmanship.DDDDemo.library.catalog.copies.domain;

import org.springframework.util.Assert;

public record BarCode(String code) {

    public BarCode {
        Assert.notNull(code, "code must not be null");
    }
}
