package com.corexfin.pk_id_generator;

import com.corexfin.model.Branch;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class IfscCodeGenerator implements IdentifierGenerator {
    @Override
    public Object generate(SharedSessionContractImplementor session, Object object) {
        Branch branch = (Branch) object;
        String sufix=branch.getId();
        String bank_id=branch.getBankId();
        String [] str=bank_id.split("-");
        String prefix=str[0];
        return prefix+"N0"+sufix;
    }
}
