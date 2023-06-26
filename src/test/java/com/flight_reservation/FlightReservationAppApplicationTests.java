package com.flight_reservation;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.flight_reservation.utility.Pdfgenerator;


@SpringBootTest
class FlightReservationAppApplicationTests {

	@Test
	void contextLoads() {
	
		Pdfgenerator pdf = new Pdfgenerator();
		pdf.writeUsingIText();
	}
	

}
