package com.backend.bookmarkApp.service;


import com.backend.bookmarkApp.dto.BookmarkDto;
import com.backend.bookmarkApp.persistance.repo.BookMarkRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class BookMarkService {

    private final BookMarkRepo bookMarkRepo;

    @Transactional(readOnly = true)
    public BookmarkDto findAllBookMark(Integer page){
        int pageNo = page < 1 ? 0 : page -1;
        Pageable pageable = PageRequest.of(pageNo,10, Sort.Direction.DESC,"createdAt");
        return new BookmarkDto( bookMarkRepo.findAll(pageable));

    }
}
