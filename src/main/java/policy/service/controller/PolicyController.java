package policy.service.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import policy.service.entities.Policy;
import policy.service.services.PolicyService;

import java.util.List;

@RestController
@RequestMapping("/policy")
public class PolicyController {

    @Autowired
    private PolicyService policyService;


    //createPolicy
    @PostMapping("/payPolicy")
    public ResponseEntity<Policy> createPolicy(@RequestBody Policy policy){
       Policy policyCreated =  policyService.savePolicy(policy);

       return  ResponseEntity.status(HttpStatus.CREATED).body(policyCreated);
    }

    
    //getUser
    @GetMapping("/{policyNo}")
    public ResponseEntity<Policy> getPolicy(@PathVariable  String policyNo){
        Policy fetchPolicy =  policyService.getPolicy(policyNo);

        return  ResponseEntity.ok(fetchPolicy);
    }

    //getUser
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Policy>> getPolicyByUsers(@PathVariable  String userId){
        List<Policy> fetchPolicies =  policyService.getPolicyByUser(userId);

        return  ResponseEntity.ok(fetchPolicies);
    }



}
