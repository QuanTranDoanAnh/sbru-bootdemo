package vn.quantda.sbrbootdemo.repository;

import org.springframework.data.repository.CrudRepository;

import vn.quantda.sbrbootdemo.domain.Coffee;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {
}
