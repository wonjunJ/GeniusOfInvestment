package ssafy.GeniusOfInvestment.game;

import org.springframework.data.jpa.repository.JpaRepository;
import ssafy.GeniusOfInvestment._common.entity.Information;

public interface InformationRepository extends JpaRepository<Information, Long> {
}