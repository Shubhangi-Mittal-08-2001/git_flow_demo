package Service;

import dto.CityDto;
import dto.CityDtoResponse;
import dto.StringRequestDTO;
import dto.StringResponseDTO;

import javax.inject.Singleton;

@Singleton
public class CityServiceImpl implements CityService {
    @Override
    public CityDtoResponse addCity(CityDto cityDto) {
        String cityName= cityDto.getCity_name();
        String cityPincode=cityDto.getPincode();
        //building the response object
        CityDtoResponse cityDtoResponse= CityDtoResponse.builder().city_name(cityName).city_pincode(cityPincode).build();


        return cityDtoResponse;
    }

    @Override
    public String reverseOfString(StringRequestDTO requestDTO) {
        String str=requestDTO.getOriginal_string();
        String reverse="";
        String[] splittedString=str.split("");
//        for(int i=0;i< splittedString.length;i++)
//            System.out.println(splittedString[i]);
        for(int i=splittedString.length-1;i>=0;i--)
            reverse=reverse+splittedString[i];
        //StringResponseDTO responseDTO= StringResponseDTO.builder().build();

        return reverse;
    }
}
