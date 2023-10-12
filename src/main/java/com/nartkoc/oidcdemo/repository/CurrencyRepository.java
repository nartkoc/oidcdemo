package com.nartkoc.oidcdemo.repository;

import com.nartkoc.oidcdemo.entity.Currency;

import java.util.UUID;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {

	Currency findByCurrencyUuid(UUID currencyUuid);

}
