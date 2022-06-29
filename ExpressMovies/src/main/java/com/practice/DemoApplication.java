package com.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;

import com.practice.DTO.DirectorDTO;
import com.practice.DTO.MovieDTO;
import com.practice.Service.MovieService;

@SpringBootApplication
public class DemoApplication {


	@SuppressWarnings("unused")
	public static void main(String[] args) {
		AbstractApplicationContext context = (AbstractApplicationContext)SpringApplication.run(DemoApplication.class, args);
	    
		
		MovieService service = (MovieService)context.getBean("movieservice");
		//Insert 
		MovieDTO dto = new MovieDTO("Prem",LocalDate.now(),LocalDateTime.now());
		List<DirectorDTO> directorList = Arrays.asList(
				new DirectorDTO("mohit", "suri", "Mumbai","mohit@infosys.com",9877543210L),
				new DirectorDTO("rishab","rai","Banglore","rishab@infy.com",9099786734L)
				);
	
		
		//Uncomment below code to add New Entries in Movie
		service.add(dto,directorList);  //this automates mapping of DIRECTORS IN MOVIE
		
		
//        service.searchBasedOnTitle("BNC");
        
        
//        service.updateReleaseDate(LocalDate.of(2024, 6, 1), "ABC");
        
        
        /**
         * Get all Directors from Movie Title
         */
//      System.out.println("================= Get all Directors from Movie Title ===================");
////        
//        service.getDirectorListFromTitle("BNC");
        
        /**
         * Get all Movies from Director Name
         */
//        System.out.println(" ===================Get all Movies from Director Name=============");
//        service.getMovieListFromDirectorName("xyz");
        
        
        //Get All movies
        //Display Log At Info Level
        System.out.println(service.displayAll().toString());       
	}

}
