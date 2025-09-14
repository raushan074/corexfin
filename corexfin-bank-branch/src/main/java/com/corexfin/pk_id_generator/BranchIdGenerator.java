package com.corexfin.pk_id_generator;

import com.corexfin.model.Branch;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class BranchIdGenerator implements IdentifierGenerator {
    @Override
    public Object generate(SharedSessionContractImplementor session, Object object) {

        Branch branch = (Branch) object;
        int sufix=100000+(int)(Math.random()*500000);
        return ""+sufix;
    }
}
