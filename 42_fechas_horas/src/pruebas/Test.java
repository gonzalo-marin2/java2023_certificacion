package pruebas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test {

	public static void main(String[] args) {
		LocalDate ldt1=LocalDate.of(2023, 11, 30);
		LocalDate ldt2=LocalDate.of(2023, 11, 30);
		LocalTime lt1=LocalTime.of(13, 30);
		LocalTime lt2=LocalTime.of(21, 15);
		System.out.println(Duration.between(lt1, lt2));//PT7H45M
		
		ZonedDateTime zldt1=ZonedDateTime.of(ldt1, lt1, ZoneId.of("GMT+2"));
		ZonedDateTime zldt2=ZonedDateTime.of(ldt2, lt2, ZoneId.of("GMT-3"));
		System.out.println(zldt1);//2023-11-30T13:30+02:00[GMT+02:00]
		System.out.println(zldt2);//2023-11-30T21:15-03:00[GMT-03:00]
		//Hay 7h45m de diferencia, si sumas 2 a una y restas 3 a la otra, son 12h45m
		System.out.println(Duration.between(zldt1, zldt2));//PT12H45M
		
		LocalDateTime ld1=LocalDateTime.of(2022, 3, 13,1,30,30); 
		ZonedDateTime zd1=ZonedDateTime.of(ld1, ZoneId.of("America/New_York"));
		ZonedDateTime zd2=zd1.plusHours(1);
		ZonedDateTime zd3=zd1.minusHours(1);
		System.out.println(zd1+"-"+zd2+"-"+zd3);//OJO con los GMT
		System.out.println(Duration.between(zd3,zd2));


	}

}
