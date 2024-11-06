package cz.ivosahlik.notes.repositories;

import cz.ivosahlik.notes.models.AppRole;
import cz.ivosahlik.notes.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);

}