package com.example.demo.location;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class LocationController {
	@Autowired
    LocationService us;

	@RequestMapping(value="/locations")
	@RequestMapping(value = "/locations/{id}")
	public Location getLocation(@PathVariable String id) {
		return us.getLocation(id);
	}

}
