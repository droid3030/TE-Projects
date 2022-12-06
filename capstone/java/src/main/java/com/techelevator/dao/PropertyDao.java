package com.techelevator.dao;

import com.techelevator.model.Property;

import java.util.List;

public interface PropertyDao {

    List<Property> getAllProperties();
    Property getPropertyByID(int ID);
    Property createProperty(Property property);
    List<Property> getPropertiesByLandlordID(int landlordID);
}
