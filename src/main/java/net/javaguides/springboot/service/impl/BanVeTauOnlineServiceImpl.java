package net.javaguides.springboot.service.impl;

import net.javaguides.springboot.model.GaTau;
import net.javaguides.springboot.repository.GaTauRepository;
import net.javaguides.springboot.service.BanVeTauOnlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BanVeTauOnlineServiceImpl implements BanVeTauOnlineService {

    @Autowired
    private GaTauRepository gaTauRepository;

    @Override
    public List<GaTau> getGaTau() {
        return gaTauRepository.findAll();
    }
}
