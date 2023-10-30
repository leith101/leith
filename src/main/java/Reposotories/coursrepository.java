package Reposotories;

import Entities.cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface coursrepository extends JpaRepository<cours,Long> {
}