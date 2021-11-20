package acme.system;

import acme.medical_plan.MedicalPlan;
import acme.recommendation.RecommendatorType;
import acme.recommendation.RegularRecommendator;
import acme.recommendation.VIPRecommendator;
import acme.system.beans.RecommendationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationServiceProxy {

    @Autowired
    RegularRecommendator regularRecommendator;

    @Autowired
    VIPRecommendator vipRecommendator;

    public List<MedicalPlan> recommendMedicalPlanByRecommendator(RecommendationRequest recommendationRequest){
        if(recommendationRequest.getUser().getRecommendatorType().equals(RecommendatorType.REGULAR)){
            regularRecommendator.getRecomendation(recommendationRequest);
        }
        else{
            vipRecommendator.getRecomendation(recommendationRequest);
        }
        return null;
    }
}
