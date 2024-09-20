package org.kbalakin.repository;

import org.kbalakin.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // Дополнительные методы поиска можно добавлять здесь, если необходимо
}
