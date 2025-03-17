package com.api_ninjas;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BreedItem{

	@JsonProperty("other_pets_friendly")
	private int otherPetsFriendly;

	@JsonProperty("children_friendly")
	private int childrenFriendly;

	@JsonProperty("image_link")
	private String imageLink;

	@JsonProperty("origin")
	private String origin;

	@JsonProperty("family_friendly")
	private int familyFriendly;

	@JsonProperty("length")
	private String length;

	@JsonProperty("max_life_expectancy")
	private Object maxLifeExpectancy;

	@JsonProperty("shedding")
	private int shedding;

	@JsonProperty("min_life_expectancy")
	private Object minLifeExpectancy;

	@JsonProperty("playfulness")
	private int playfulness;

	@JsonProperty("intelligence")
	private int intelligence;

	@JsonProperty("general_health")
	private int generalHealth;

	@JsonProperty("max_weight")
	private Object maxWeight;

	@JsonProperty("meowing")
	private int meowing;

	@JsonProperty("grooming")
	private int grooming;

	@JsonProperty("name")
	private String name;

	@JsonProperty("stranger_friendly")
	private int strangerFriendly;

	@JsonProperty("min_weight")
	private Object minWeight;

	public void setOtherPetsFriendly(int otherPetsFriendly){
		this.otherPetsFriendly = otherPetsFriendly;
	}

	public int getOtherPetsFriendly(){
		return otherPetsFriendly;
	}

	public void setChildrenFriendly(int childrenFriendly){
		this.childrenFriendly = childrenFriendly;
	}

	public int getChildrenFriendly(){
		return childrenFriendly;
	}

	public void setImageLink(String imageLink){
		this.imageLink = imageLink;
	}

	public String getImageLink(){
		return imageLink;
	}

	public void setOrigin(String origin){
		this.origin = origin;
	}

	public String getOrigin(){
		return origin;
	}

	public void setFamilyFriendly(int familyFriendly){
		this.familyFriendly = familyFriendly;
	}

	public int getFamilyFriendly(){
		return familyFriendly;
	}

	public void setLength(String length){
		this.length = length;
	}

	public String getLength(){
		return length;
	}

	public void setMaxLifeExpectancy(Object maxLifeExpectancy){
		this.maxLifeExpectancy = maxLifeExpectancy;
	}

	public Object getMaxLifeExpectancy(){
		return maxLifeExpectancy;
	}

	public void setShedding(int shedding){
		this.shedding = shedding;
	}

	public int getShedding(){
		return shedding;
	}

	public void setMinLifeExpectancy(Object minLifeExpectancy){
		this.minLifeExpectancy = minLifeExpectancy;
	}

	public Object getMinLifeExpectancy(){
		return minLifeExpectancy;
	}

	public void setPlayfulness(int playfulness){
		this.playfulness = playfulness;
	}

	public int getPlayfulness(){
		return playfulness;
	}

	public void setIntelligence(int intelligence){
		this.intelligence = intelligence;
	}

	public int getIntelligence(){
		return intelligence;
	}

	public void setGeneralHealth(int generalHealth){
		this.generalHealth = generalHealth;
	}

	public int getGeneralHealth(){
		return generalHealth;
	}

	public void setMaxWeight(Object maxWeight){
		this.maxWeight = maxWeight;
	}

	public Object getMaxWeight(){
		return maxWeight;
	}

	public void setMeowing(int meowing){
		this.meowing = meowing;
	}

	public int getMeowing(){
		return meowing;
	}

	public void setGrooming(int grooming){
		this.grooming = grooming;
	}

	public int getGrooming(){
		return grooming;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setStrangerFriendly(int strangerFriendly){
		this.strangerFriendly = strangerFriendly;
	}

	public int getStrangerFriendly(){
		return strangerFriendly;
	}

	public void setMinWeight(Object minWeight){
		this.minWeight = minWeight;
	}

	public Object getMinWeight(){
		return minWeight;
	}

	@Override
 	public String toString(){
		return 
			"BreedItem{" + 
			"other_pets_friendly = '" + otherPetsFriendly + '\'' + 
			",children_friendly = '" + childrenFriendly + '\'' + 
			",image_link = '" + imageLink + '\'' + 
			",origin = '" + origin + '\'' + 
			",family_friendly = '" + familyFriendly + '\'' + 
			",length = '" + length + '\'' + 
			",max_life_expectancy = '" + maxLifeExpectancy + '\'' + 
			",shedding = '" + shedding + '\'' + 
			",min_life_expectancy = '" + minLifeExpectancy + '\'' + 
			",playfulness = '" + playfulness + '\'' + 
			",intelligence = '" + intelligence + '\'' + 
			",general_health = '" + generalHealth + '\'' + 
			",max_weight = '" + maxWeight + '\'' + 
			",meowing = '" + meowing + '\'' + 
			",grooming = '" + grooming + '\'' + 
			",name = '" + name + '\'' + 
			",stranger_friendly = '" + strangerFriendly + '\'' + 
			",min_weight = '" + minWeight + '\'' + 
			"}";
		}
}