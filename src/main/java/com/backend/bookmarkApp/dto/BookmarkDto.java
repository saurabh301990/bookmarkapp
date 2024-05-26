package com.backend.bookmarkApp.dto;

import com.backend.bookmarkApp.persistance.entity.BookMark;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;


import java.util.List;

@Getter
@Setter
public class BookmarkDto {

   private List<BookMark> bookMarks;
   private long totalElements;
   private int totalPages;
   private int currentPage;
   @JsonProperty("isFirst")
   private boolean isFirst;
   @JsonProperty("isLast")
   private boolean isLast;
   private boolean hasNext;
   private boolean hasPreviousPage;

   public BookmarkDto(Page<BookMark> bookMarkPage){
       this.setBookMarks(bookMarkPage.getContent());
       this.setTotalElements(bookMarkPage.getTotalElements());
       this.setTotalPages(bookMarkPage.getTotalPages());
       this.setCurrentPage(bookMarkPage.getNumber() + 1);
       this.setFirst(bookMarkPage.isFirst());
       this.setLast(bookMarkPage.isLast());
       this.setHasNext(bookMarkPage.hasNext());
       this.setHasPreviousPage(bookMarkPage.hasPrevious());
   }
}
