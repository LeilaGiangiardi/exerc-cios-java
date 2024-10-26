import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class conversão {
	public static void main(String[] args) {
		
		LocalDate d4 = LocalDate.parse("2024-08-28");
		LocalDateTime d5 = LocalDateTime.parse("2024-08-28T01:30:26");
		Instant d6 = Instant.parse("2024-08-28T01:30:26Z");		
		
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//para horario global (instant)
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		//Vai pegar o horario do computador que estiver rodando
		
		System.out.println("d4= "+d4.format(f1));
		System.out.println("d4= "+ f1.format(d4));
		
		System.out.println("d5= "+ d5.format(f1));
		System.out.println("d5= "+ d5.format(f2));
		System.out.println("d6= "+ f3.format(d6));
		
		
		
		
	
	
	
	
	
	
	
	
	}
}
