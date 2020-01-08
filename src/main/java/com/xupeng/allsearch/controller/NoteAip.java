package com.xupeng.allsearch.controller;

import com.xupeng.allsearch.example.AipResult;
import com.xupeng.allsearch.example.Note;
import com.xupeng.allsearch.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/note")
public class NoteAip {

    @Autowired
    private NoteService noteService;


    @RequestMapping(value = "/save")
    public String noteSave(String notes){
        Note note = new Note();
        note.setTitle("1");
        note.setNotes(notes);
        noteService.updateByTitle(note);
        return "redirect:/login";
    }
}
