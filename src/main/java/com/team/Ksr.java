package com.team;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="KsrStatus")

public class Ksr {
  @Id
  public ObjectId _id;
  
  public String number;
  public String url;
 
  
  // Constructors
  public Ksr() {}
  
  public Ksr(ObjectId _id, String number ,String url) {
    this._id = _id;
    this.number = number;
    this.url = url;
    
  }
  
  // ObjectId needs to be converted to string
  public String get_id() {
	  return _id.toHexString(); 
  }
  public void set_id(ObjectId _id) {
	  this._id = _id; 
}
  
  public String getNumber() { 
	  return number; 
	  }
  public void setNumber(String number) { 
	  this.number = number;
  }
  
  public String getUrl() {
	  return url;
	 }
  public void setUrl(String url) { 
	  this.url = url; 
	  }
  
  
}