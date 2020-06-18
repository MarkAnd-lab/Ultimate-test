package se.lexicon.se.Ultimatetest;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, String> {
    List<Owner> findAllByOwnerId(int id);
}
