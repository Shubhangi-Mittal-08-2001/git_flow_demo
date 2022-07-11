package dto;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder(toBuilder=true)
public class CityDtoResponse {
    private String city_name;
    private String city_pincode;

}
