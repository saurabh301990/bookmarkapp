package com.backend.bookmarkApp.controller;

import com.backend.bookmarkApp.dto.BookmarkDto;
import com.backend.bookmarkApp.service.BookMarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/bookmarks")
@RequiredArgsConstructor
public class BookMarkController {

    private final BookMarkService bookMarkService;

    @GetMapping("/getBookmark")
    public ResponseEntity<BookmarkDto> getBookmark(@RequestParam(name = "page" ,defaultValue = "1") Integer page){
        return new ResponseEntity<>(bookMarkService.findAllBookMark(page), HttpStatus.OK);
    }
}
