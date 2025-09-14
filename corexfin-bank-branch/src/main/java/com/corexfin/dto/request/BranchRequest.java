package com.corexfin.dto.request;

import com.corexfin.pk_id_generator.IfscCodeGenerator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.SequenceGenerator;
import org.hibernate.annotations.GenericGenerator;

public record BranchRequest(
        String  name,
    String ifscCode,
 String  micrCode,
 String  email,
 String  phone,
 String  type,
 String addressDetails,
 String  bankId


) {

}
