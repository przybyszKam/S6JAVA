package projektJava;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tabela {
	/**
	 * Numer albumu
	 */
    private Integer albumNumber;
    /**
	 * Numer PESEL
	 */
    private String person;
    /**
	 * Grupa
	 */
    private String group;
    /**
	 * Punkty z pracy domowej
	 */
    private Integer homework;
    /**
	 * Punkty z aktywnoœci
	 */
    private Integer activity;
    /**
	 * Punkty z projektu
	 */
    private Integer project;
    /**
	 * Punkty z kolokwium 1
	 */
    private Integer kolokwium1;
    /**
	 * Punkty z kolokwium 2
	 */
    private Integer kolokwium2;
    /**
	 * Punkty z egzaminu
	 */
    private Integer exam;
    /**
	 * Suma punktów
	 */
    private Integer suma;
}
