package org.example.entities.service.Implementation;

import org.example.entities.Applicant;
import org.example.entities.Principal;
import org.example.entities.service.PrincipalService;

public class PrincipalServiceImplementation implements PrincipalService {

    @Override
    public String admitApplicant(Principal principal, Applicant applicant) {
            if(applicant.getAge() >= 15 ){
                return "Hello" + applicant.getName() + "you're admitted";
            }
        return "you are not admited";
    }
}
