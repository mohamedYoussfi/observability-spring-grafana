package net.youssfi.observabilityspringgrafana.repository;

import net.youssfi.observabilityspringgrafana.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author mohamedyoussfi
 **/
public interface ProductRepository extends JpaRepository<Product, Long> {
}
