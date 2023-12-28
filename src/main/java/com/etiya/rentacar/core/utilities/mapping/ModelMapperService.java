package com.etiya.rentacar.core.utilities.mapping;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public interface ModelMapperService {
    ModelMapper forResponse();
    ModelMapper forRequest();
}

