package ro.laflamme.meditrack.util;

import ro.laflamme.meditrack.domain.Pharm;
import ro.laflamme.meditrack.places.models.Place;

/**
 * Created by motan on 10.05.2015.
 */
public class Adapter {

    public static Pharm toPharm(Place place) {
        Pharm pharm = new Pharm();
        pharm.setPlaceId(place.getId());
        pharm.setName(place.getName());
        pharm.setDesc(place.getAddress());
        pharm.setRefference(place.getReference());
        pharm.setLatitude(place.getLatitude());
        pharm.setLongitude(place.getLongitude());
        pharm.setOpenNow(place.isOpenNow());
        return pharm;
    }
}
