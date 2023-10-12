package com.nartkoc.oidcdemo.repository;

import com.nartkoc.oidcdemo.entity.Language;

import java.util.UUID;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Long> {

	Language findByLanguageUuid(UUID languageUuid);

}
