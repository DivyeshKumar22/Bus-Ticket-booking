package busbookingapp.busbookingapp.repository;

import org.springframework.data.repository.CrudRepository;
import busbookingapp.busbookingapp.entity.UserTicket;

public interface UserTicketRepository
extends CrudRepository<UserTicket, Integer> {
  Iterable<UserTicket> findAllByPnr(String pnr);
}
