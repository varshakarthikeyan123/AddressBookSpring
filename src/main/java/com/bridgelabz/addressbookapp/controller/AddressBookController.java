package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBook;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @PostMapping("/create")
    public AddressBook createAddress(@RequestBody AddressBookDTO dto) {
        return new AddressBook(dto);
    }
}