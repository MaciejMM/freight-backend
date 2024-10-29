package com.example.freight.v1.vehicleOffer.model.timocon.request;


import lombok.Data;

@Data
public class LoadingAddress {
    private String objectType;
    private String city;
    private String country;
    private String postalCode;
}
