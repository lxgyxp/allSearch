package com.xupeng.allsearch.mapper;

import com.xupeng.allsearch.example.Note;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesMapper {

    Note selectByTitle(String tilte);

    void updateByTitle(Note note);
}
