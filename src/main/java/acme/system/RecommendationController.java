package acme.system;

import acme.system.beans.RecommendationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationController {

    @Autowired
    RecommendationServiceProxy recommendationServiceProxy;

    @GetMapping
    @ResponseBody
    public ResponseEntity recommendation(RecommendationRequest recommendationRequest){
        recommendationServiceProxy.recommendMedicalPlanByRecommendator(recommendationRequest);
        return new ResponseEntity<>("Result Successful",
                HttpStatus.OK);
    }
}
