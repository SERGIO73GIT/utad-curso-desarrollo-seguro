package com.utad.curso.desarrollo.seguro.dto;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Sergio
 *
 */
public class DummyRequestBodyDto {

    private String attribute1;

    @NotNull
    @Min(0)
    @Max(10)
    private Long attribute2;

    @Valid
    private DummyRequestSubAttribute attribute3;

    private List<@NotBlank String> attribute4;

    private List<@Valid DummyRequestSubAttribute> attribute5;

    public List<DummyRequestSubAttribute> getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(
            List<DummyRequestSubAttribute> attribute5) {
        this.attribute5 = attribute5;
    }

    public DummyRequestSubAttribute getAttribute3() {
        return attribute3;
    }

    public List<String> getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(
            List<String> attribute4) {
        this.attribute4 = attribute4;
    }

    public void setAttribute3(
            DummyRequestSubAttribute attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(
            String attribute1) {
        this.attribute1 = attribute1;
    }

    public Long getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(
            Long attribute2) {
        this.attribute2 = attribute2;
    }

}
