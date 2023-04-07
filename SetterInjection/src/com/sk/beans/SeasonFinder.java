package com.sk.beans;
import java. time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	private LocalDate date;
	@Autowired
	public void setDatetime (LocalDate date) {
		this.date = date;
	}
	public String currentSeason () {
		int month = date.getMonthValue() ;
		if (month==3 || month==4 || month==5 || month==6)
			return "Summer";
		else if (month==7 || month==8 || month==9 || month==10)
			return "Rainy";
		else
			return "Winter";
	}
}