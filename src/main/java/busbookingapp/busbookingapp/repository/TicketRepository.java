package busbookingapp.busbookingapp.repository;

import org.springframework.data.repository.CrudRepository;
import busbookingapp.busbookingapp.entity.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, String> {
  public Ticket findByPnr(String pnr);

  public Iterable<Ticket> findAllByEmail(String email);
}
