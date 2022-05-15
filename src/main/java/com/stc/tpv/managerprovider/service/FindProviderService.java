package com.stc.tpv.managerprovider.service;

import com.stc.tpv.managerprovider.controller.ProviderController;
import com.stc.tpv.managerprovider.dto.ProviderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FindProviderService {
    private ProviderController providerController;


    @Autowired
    public FindProviderService(ProviderController providerController) {
        this.providerController = providerController;
    }

    public List<ProviderDTO> providerList(){
        return providerController.providers().stream()
                .map(providerDTO->(ProviderDTO) providerDTO)
                .collect(Collectors.toList());
    }
}
