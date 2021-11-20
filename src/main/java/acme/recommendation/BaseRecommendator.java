package acme.recommendation;

import acme.medical_plan.MedicalPlan;
import acme.system.beans.RecommendationRequest;

import java.util.List;

public interface BaseRecommendator {
    List<MedicalPlan> getRecomendation(RecommendationRequest recommendationRequest);
}
