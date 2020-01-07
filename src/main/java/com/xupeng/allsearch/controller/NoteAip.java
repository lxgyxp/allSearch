package com.xupeng.allsearch.controller;

import com.xupeng.allsearch.example.AipResult;
import com.xupeng.allsearch.example.Note;
import com.xupeng.allsearch.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteAip {

    @Autowired
    private NoteService noteService;

    @RequestMapping(value = "/note-select")
    public AipResult noteSave(String title){
        Note note = noteService.selectByTitle(title);
        if (null != note){
            return new AipResult(true,note);
        }
        return new AipResult(false,"没有查询结果");
    }
}
