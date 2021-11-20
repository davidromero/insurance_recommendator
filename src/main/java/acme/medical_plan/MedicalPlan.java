package acme.medical_plan;

import acme.model.NamedEntity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class MedicalPlan extends NamedEntity {

    @Column(name = "description")
    private String description;

    public String getDescriptione() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
