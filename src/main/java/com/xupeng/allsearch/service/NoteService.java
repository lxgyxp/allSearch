package com.xupeng.allsearch.service;

import com.xupeng.allsearch.example.Note;
import com.xupeng.allsearch.mapper.NotesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class NoteService {
    @Resource
    private NotesMapper notesMapper;

    public Note selectByTitle(String title){
        return notesMapper.selectByTitle(title);
    }

    public void updateByTitle(Note note){
        notesMapper.updateByTitle(note);
    }
}
