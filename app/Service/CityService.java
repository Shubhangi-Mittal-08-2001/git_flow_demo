package Service;

import com.google.inject.ImplementedBy;
import dto.CityDto;
import dto.CityDtoResponse;
import dto.StringRequestDTO;
import dto.StringResponseDTO;

@ImplementedBy(CityServiceImpl.class)
public interface CityService {

    CityDtoResponse addCity(CityDto cityDto);
    String reverseOfString(StringRequestDTO requestDTO);
}
