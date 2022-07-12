package bni.assignment.core.repositories;

import bni.assignment.core.models.NasabahModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NasabahRepository extends JpaRepository<NasabahModel,Long> {
    List<NasabahModel> findByNoKtp(String noKtp);
}
