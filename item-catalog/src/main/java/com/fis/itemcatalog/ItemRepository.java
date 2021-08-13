package com.fis.itemcatalog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;


@RepositoryRestResource
interface ItemRepository extends JpaRepository<Item, Long> {}
