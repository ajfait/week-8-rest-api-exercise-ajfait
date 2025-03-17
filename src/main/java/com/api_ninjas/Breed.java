package com.api_ninjas;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Breed{

	@JsonProperty("Breed")
	private List<BreedItem> breed;

	public void setBreed(List<BreedItem> breed){
		this.breed = breed;
	}

	public List<BreedItem> getBreed(){
		return breed;
	}

	@Override
 	public String toString(){
		return 
			"Breed{" + 
			"breed = '" + breed + '\'' + 
			"}";
		}
}