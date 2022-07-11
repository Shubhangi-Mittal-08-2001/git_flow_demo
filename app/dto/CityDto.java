package dto;

public class CityDto {

    private int id;
    private String city_name;
    private String pincode;

    public CityDto() {
    }

    public CityDto(int id, String city_name, String pincode) {
        this.id = id;
        this.city_name = city_name;
        this.pincode = pincode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "CityDto{" +
                "id=" + id +
                ", city_name='" + city_name + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
