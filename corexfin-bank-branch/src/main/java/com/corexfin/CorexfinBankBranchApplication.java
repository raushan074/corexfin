package com.corexfin;

import com.corexfin.model.Branch;
import com.corexfin.repository.BranchRepository;
import com.netflix.discovery.EurekaNamespace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.domain.Sort;

@SpringBootApplication
@EnableDiscoveryClient
public class CorexfinBankBranchApplication implements CommandLineRunner {

    @Autowired
    private BranchRepository branchRepository;

    public static void main(String[] args) {
        SpringApplication.run(CorexfinBankBranchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Branch branch = new Branch();
        branch.setName("Main Branch"); // Set your branch name
        branch.setIfscCode("ABC123456"); // Set your IFSC code
        branch.setMicrCode("250005000"); // Set your MICR code
        branch.setEmail("branch@example.com"); // Set email
        branch.setPhone("1234567890"); // Set phone
        branch.setType("Commercial"); // Set branch type
        branch.setAddressDetails("123 Main St, City, State, Country"); // Set address
        branch.setBankId("BANK001"); // Set bank ID
        branchRepository.save(branch);
        System.out.println(branchRepository.findAll(Sort.by("name")));

    }
}
