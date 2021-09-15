package com.mckession.shopping.restservice.repo;



import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;


@SpringBootTest
@Slf4j
public class ItemRepositoryTest {

  @Resource
  private ItemRepository itemRepository;

  @Test
  public void thatEverythingIsReturned() {

    Iterable<Item> items = itemRepository.findAll();

    items.forEach(item -> log.info(item.getName()));
  }
}
