package acme.recommendation;

import acme.medical_plan.MedicalPlan;
import acme.model.NamedEntity;
import acme.system.beans.RecommendationRequest;

import java.util.List;

public class VIPRecommendator extends NamedEntity implements BaseRecommendator {
    @Override
    public List<MedicalPlan> getRecomendation(RecommendationRequest recommendationRequest) {
        return null;
    }
}
