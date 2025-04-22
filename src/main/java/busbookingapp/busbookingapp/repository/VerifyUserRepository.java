package busbookingapp.busbookingapp.repository;

import org.springframework.data.repository.CrudRepository;
import  busbookingapp.busbookingapp.entity.VerifyUser;

public interface VerifyUserRepository
  extends CrudRepository<VerifyUser, String> {
  public VerifyUser findByEmail(String email);

  public void deleteByEmail(String email);
  }