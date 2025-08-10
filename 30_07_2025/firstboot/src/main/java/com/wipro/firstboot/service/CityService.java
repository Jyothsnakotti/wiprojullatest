package com.wipro.firstboot.service;
import com.wipro.firstboot.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public List<String> getCityList() {
        return cityRepository.getCities();
    }
}