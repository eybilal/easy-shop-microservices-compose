package io.coodle.easyshop.customerservice.model.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;

@MappedSuperclass
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class NamedEntity extends BaseEntity {
    @Column(name = "name")
    @NotBlank
    private String name;
}
