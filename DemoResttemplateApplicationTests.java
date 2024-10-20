
package com.example.demo_resttemplate;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcResultMatchersDsl;
import org.springframework.test.web.servlet.ResultActions;

import com.fasterxml.jackson.databind.ObjectMapper;

import static org.assertj.core.api.Assertions.contentOf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.stream.Stream;

import static org.springframework.test.web.servlet.request.Mock
import static java.lang.System.*;

@SpringBootTest
@AutoConfigureMockMvc
class DemoResttemplateApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	
	
	@Test
	void testGetTicket() throws Exception {
		ResultActions resultActions = mockMvc.perform(get("/redbus/8"))// Sending GET request with url
		.andExpect(status().isOk())// checking response Http status code
		.andExpect(content().contentType(MediaType.APPLICATION_JSON))//Verifying the contentType
		.andExpect(jsonPath("$.fromplace").value("pqrs"));
		.andDo(print());
		
		String jsonresponse = resultActions.andReturn().getResponse().getContentAsString();
		resultActions
		.andReturn()
		.getResponse()
		.getContentAsString();
		
		System.out.println("Json Response:" + jsonresponse);
	
		//json string to java object
		ObjectMapper omapper = new ObjectMapper();
		//FileInputStream fis = new FileInputStream(null);
		Ticket ticket = omapper.readValue(jsonresponse, Ticket.class);//
		
		System.out.println("From place"+ticket.getFromplace());
	
	}
	
	private Stream<Argument> readFromExcel(){
		List<Arguments> args = new ArrayList<>();
		try
		{
			FileInputSteam fis = new FileInputStream("D:\\hari\\excell.xls");
			
			no_of_rows = st.getPhysicalNumberOfRows();
			//read rows
			Row row = st.getRow(i);
			int no_of_cols = row.getCell();
			
			//read first column
			Cell cell1 = row.getCell(0);
			int col1 = (int)
		}
		catch(Exception e) {
			
		}
	}
	
	private Stream<Integer>fetchTicketIds(){
		return Stream.of(Arguments.of(8,"pqrs", "mnpo")),
				Arguments.of(9, "gggg","hhhh"),
				Arguments.of(10,"gggg", "hhhh")
				);
	}
	@Test
	//@Disabled
	@ParameterizedTest //inorder to paramerize.
	@MethodSource("fetchTicketIds")
	void testBookTicket() {
		mockMvc.perform(post("/redbus")).contentType(MediaType.APPLICATION_JSON)
		.content("{\"username\":\"user456\","
				+ "\"fromplace\":\"tuvw\","
				+ "\"toplace\":\"klmn\","
				+ "\"email\":\"987652@gmail.com\","
				+ "\"price\":"9876.5}"))
				.andExpect(status().isCreated())
				.andDo(print())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.username").value("user456"));
	}

private static Stream<Argument> fetchTicketIds(){
	return Stream.of(null);

@Test
void testUpdateTest throws Exception{
	mockMvc.perform(put("/redbus/27").contentType(MediaType.APPLICATION_JSON)))
		.content(
				//"{\"username\":\"user456\","
				"\"fromplace\":\"jjjjjj\","
				+ "\"toplace\":\"kkkk\","
				+ "\"email\":\"987652@gmail.com\","
				+ "\"price\":9876.5}"))
				.andExpect(status().isCreated());
}

@Test
void cancelTicket() throws Exception
mockMvc.perform(delete("/redbus/27"))
.andExpect(status().isOk());
	
}