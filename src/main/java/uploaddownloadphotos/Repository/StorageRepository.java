package uploaddownloadphotos.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uploaddownloadphotos.Entity.ImageData;

import java.util.Optional;

public interface StorageRepository extends JpaRepository<ImageData,Long> {


    Optional<ImageData> findByName(String fileName);
}