package fr.piarre.CDN.Repository;

import fr.piarre.CDN.Model.Image;
import org.springframework.data.repository.CrudRepository;

public interface ImageRepository extends CrudRepository<Image, Long> {
}
