package com.ccms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ccms.domain.CrdMember;

@Repository
public interface CrdMemberRepository extends JpaRepository<CrdMember, Integer> {

}
