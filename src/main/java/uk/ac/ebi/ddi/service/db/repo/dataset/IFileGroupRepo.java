package uk.ac.ebi.ddi.service.db.repo.dataset;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import uk.ac.ebi.ddi.service.db.model.dataset.FileGroup;

@Repository
public interface IFileGroupRepo extends MongoRepository<FileGroup, ObjectId> {

}
