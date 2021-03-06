package com.juniorstart.juniorstart.repository;

import com.juniorstart.juniorstart.model.UserAdditionalSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAdditionalSkillRepository extends JpaRepository<UserAdditionalSkill, Long> {

}
