package policy.service.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Policy {

    @Id
    private String policyNo;
    private String userId;
    private String policyDate;
    private String policyAmount;
    private int policyStatus;
}
