package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PeopleService {
    @Autowired
    PeopleRepository repo;

    public void save(People people) {
        repo.save(people);
    }

    public List<People> listAll() {
        return (List<People>) repo.findAll();
    }

    public People get(Long id) {
        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
