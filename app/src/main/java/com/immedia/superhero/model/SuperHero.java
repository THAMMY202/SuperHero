package com.immedia.superhero.model;

public class SuperHero {

  private final String name;
  private final String photo;
  private final boolean isAvenger;
  private final String description;

  public SuperHero(String name, String photo, boolean isAvenger, String description) {
    this.name = name;
    this.photo = photo;
    this.isAvenger = isAvenger;
    this.description = description;
  }


  public String getName() {
    return name;
  }

  public String getPhoto() {
    return photo;
  }

  public boolean isAvenger() {
    return isAvenger;
  }

  public String getDescription() {
    return description;
  }
}
