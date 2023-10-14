//Q.2)Create Car Entity class with different annotation.
//packages
package com.mypack1.HibernetCar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//entity
@Entity
public class Car {
	@Id
 private int carId;
	@Column
 private String carName;
	@Column
 private String carColour;
 public int getcarId()
 {
	 return carId;
 }
 //getter and setter for all variable
public int getCarId() {
	return carId;
}
public void setCarId(int carId) {
	this.carId = carId;
}
public String getCarName() {
	return carName;
}
public void setCarName(String carName) {
	this.carName = carName;
}
public String getCarColour() {
	return carColour;
}
public void setCarColour(String carColour) {
	this.carColour = carColour;
}
 
}
