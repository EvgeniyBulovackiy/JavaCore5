package Module7.Module5WithCollections;

import java.util.*;

public class TripAdvisorAPI implements API {

    @Override
    public String toString() {
        return  "\n"+
                "TripAdvisorAPI{" +
                "rooms=" + rooms +
                '}';
    }

    public Set<Room> rooms = new HashSet<>();

    public TripAdvisorAPI() {
        rooms.add(new Room(356L, 2450, 2, new Date(2016,11,21), "Bontiak", "Kiev"));
        rooms.add(new Room(357L, 1350, 2, new Date(2016,10,30), "Bontiak", "Kiev"));
        rooms.add(new Room(358L, 3300, 1, new Date(2016,10,25), "Ramada",  "Donetsk"));
        rooms.add(new Room(345L, 5500, 3, new Date(2016,11,27), "Ramada",  "Donetsk"));
        rooms.add(new Room(340L, 2540, 2, new Date(2016,11,04), "Reikartz","Lviv"));
    }

    @Override
    public Set<Room> findRooms(int price, int person, String city, String hotel) {
        Set<Room> foundRooms = new HashSet<>();
        for (Room room : rooms){
            if(room.getPrice() <= price && room.getPersons() == person &&
                    room.getCityName() == city && room.getHotelName() == hotel){
                foundRooms.add(room);
            }
        }
        return foundRooms;
    }

    @Override
    public Set<Room> getAllRoom() {
        return rooms;
    }
}
