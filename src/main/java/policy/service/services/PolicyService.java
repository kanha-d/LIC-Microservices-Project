package policy.service.services;


import policy.service.entities.Policy;

import java.util.List;

public interface PolicyService {
    //User operation

    Policy savePolicy(Policy user);

    List<Policy> getPolicyByUser(String userId);
    Policy getPolicy(String policyNo);

}
