package com.example.demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
	
	private List<Ticket>tickets = new ArrayList<>();
	
	//initialize some sample tickets
	public TicketController() {
		tickets.add()new Ticket(1, "Ticket 1", "User 1");
		tickets.add()new Ticket(2, "Ticket 2", "User 2");
	}
	
	//Get all tickets
	@GetMapping("/tickets/{id}")
	public Ticket getTicketById(@PathVariable int id) {
		return tickets.stream().filter(ticket->ticket.getId()==id).findFirst().orElse(null);
		
	}
	
	//Create new ticket
	@PostMapping("/tickets")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		ticket.add(ticket);
		return ticket;
	}
	
	//Update existing ticket
	@PutMapping("/tickets/{id}")
	public Ticket updateTicket(@PathVariable int id, @RequestBody Ticket updatedTicket)
}
