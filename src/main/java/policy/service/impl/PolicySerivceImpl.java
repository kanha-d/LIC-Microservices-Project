package policy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import policy.service.entities.Policy;
import policy.service.exception.ResourceNotFoundException;
import policy.service.repositories.PolicyRepo;
import policy.service.services.PolicyService;

import java.util.List;
import java.util.UUID;

@Service
public class PolicySerivceImpl implements PolicyService {

    @Autowired
    private PolicyRepo policyRepo;

    @Override
    public Policy savePolicy(Policy user) {
        return policyRepo.save(user);
    }

    @Override
    public List<Policy> getPolicyByUser(String userId) {
        return policyRepo.findByUserId(userId);
    }

    @Override
    public Policy getPolicy(String policyNo) {
        return policyRepo
                .findById(policyNo)
                .orElseThrow(()-> new ResourceNotFoundException("User with given id is not found on db ! id:" + policyNo));
    }
}
