package tech.dexdev.javascripts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.dexdev.javascripts.entity.JavaScript;

import java.util.List;

@Repository
public interface JavaScriptsRepository extends JpaRepository<JavaScript, Long> {
//    List<JavaScript> findAllByContentType(String type);
}
