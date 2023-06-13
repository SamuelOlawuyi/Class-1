package org.example.entities;

import org.example.entities.Applicant;

import org.example.entities.service.Implementation.PrincipalServiceImplementation;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      Principal principal = new Principal("John","BSCEng",100000,234);
     Applicant applicant = new Applicant(" Samuel ",18,250);
        PrincipalServiceImplementation principalServiceImplementation = new PrincipalServiceImplementation();
        String admit = principalServiceImplementation.admitApplicant(principal,applicant);

        System.out.println(admit);
        }
    }
