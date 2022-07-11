package controllers;

import Service.CityService;
import dto.CityDto;
import dto.CityDtoResponse;
import dto.StringRequestDTO;
import dto.StringResponseDTO;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.*;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
@Singleton
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    FormFactory formFactory;
    CityService cityService;

    @Inject
    public HomeController(FormFactory formFactory, CityService cityService) {
        this.formFactory = formFactory;
        this.cityService=cityService;

    }

    public Result index() {
        return ok(views.html.index.render());
    }

    public Result addCity(Http.Request request)
     {
         //binds request data to form format and store in form object
         Form<CityDto> cityDtoForm=formFactory.form(CityDto.class).bindFromRequest(request);
         //from the form object get the concrete value only if the form is submitted without any validation errors
         CityDto dto=cityDtoForm.get();
         //passing the service method the dto request object having the format of dto request class
         //inside the service class the method builds a response dto object and returns it
         CityDtoResponse cityDtoResponse=cityService.addCity(dto);
         //the response generated in the format of response dto class is converted back to json and returned from the
         //controller as a response
         return ok(Json.toJson(cityDtoResponse));

     }

     public Result reverseString(Http.Request request)
     {
        Form<StringRequestDTO> stringRequestDTOForm=formFactory.form(StringRequestDTO.class).bindFromRequest(request);
        StringRequestDTO requestDTO=stringRequestDTOForm.get();
         String response =cityService.reverseOfString(requestDTO);
         return ok(Json.toJson(response));
     }

}
