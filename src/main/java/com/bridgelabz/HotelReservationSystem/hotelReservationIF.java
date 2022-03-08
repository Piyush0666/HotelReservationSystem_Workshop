package com.bridgelabz.HotelReservationSystem;

import java.util.ArrayList;

public interface hotelReservationIF
{
    public void addHotel(String hotelName,int rate, double weekDayRate,double weekendRate);
    public int getHotelListSize();
    public void printHotelList();
    public ArrayList<Hotel> getHotelList();
}
