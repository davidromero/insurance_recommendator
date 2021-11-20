package acme.user;

import acme.model.BaseEntity;
import acme.recommendation.RecommendatorType;

public class User extends BaseEntity {

    private String FirstName;
    private String lastName;
    private RecommendatorType recommendatorType;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public RecommendatorType getRecommendatorType() {
        return recommendatorType;
    }

    public void setRecommendatorType(RecommendatorType recommendatorType) {
        this.recommendatorType = recommendatorType;
    }
}
