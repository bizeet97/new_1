package com.team;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.team.KsrRepository;
import com.team.Ksr;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/postKsr")
public class KsrController {
  @Autowired
  private KsrRepository repository;
  
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<Ksr> getAll() {
    return repository.findAll();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Ksr getKsrById(@PathVariable("id") ObjectId id) {
    return repository.findBy_id(id);
  }
  
  /*@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public void modifyPetById(@PathVariable("id") ObjectId id, @Valid @RequestBody Pets pets) {
    pets.set_id(id);
    repository.save(pets);
  }*/
  
  @RequestMapping(value = "/", method = RequestMethod.POST)
  public Ksr createKsr(@Valid @RequestBody Ksr ksr) {
    ksr.set_id(ObjectId.get());
    repository.save(ksr);
    return ksr;
  }
  
  /*@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deletePet(@PathVariable ObjectId id) {
    repository.delete(repository.findBy_id(id));
  }*/
}