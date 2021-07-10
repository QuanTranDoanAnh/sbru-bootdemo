package vn.quantda.sbrbootdemo.loader;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import vn.quantda.sbrbootdemo.domain.Coffee;
import vn.quantda.sbrbootdemo.repository.CoffeeRepository;

@Component
public class DataLoader {
  private final CoffeeRepository coffeeRepository;

  public DataLoader(CoffeeRepository coffeeRepository) {
    this.coffeeRepository = coffeeRepository;
  }

  @PostConstruct
  private void loadData() {
    this.coffeeRepository.saveAll(List.of(
      new Coffee("Cafe Cereza"),
      new Coffee("Cafe Grenador"),
      new Coffee("Cafe Lareno"),
      new Coffee("Cafe Tres Ponta")
    ));
  }
}
