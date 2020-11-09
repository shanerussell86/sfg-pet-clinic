package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {

    private String name;
    private PetType getType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Owner owner;
    private LocalDate birthDate;

    public PetType getPetType() {
        return getType;
    }

    public void setPetType(PetType getType) {
        this.getType = getType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
