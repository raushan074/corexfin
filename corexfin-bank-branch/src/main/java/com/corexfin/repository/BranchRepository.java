package com.corexfin.repository;

import com.corexfin.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch,String> {
}
