package com.xupeng.allsearch.controller;

import com.xupeng.allsearch.example.Note;
import com.xupeng.allsearch.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginContorller {

    @Autowired
    private NoteService noteService;

    @RequestMapping(value = "/login")
    public String login(Model model) {
        Note note = noteService.selectByTitle("1");
        model.addAttribute("test",note.getNotes());
        return "index";
    }
}
