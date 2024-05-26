package com.backend.bookmarkApp.persistance.repo;

import com.backend.bookmarkApp.persistance.entity.BookMark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookMarkRepo extends JpaRepository<BookMark,Long> {


}
