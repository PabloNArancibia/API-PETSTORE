/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package cl.pablone.api.petstore.controller;

import cl.pablone.api.petstore.viewmodel.ModelApiResponse;
import cl.pablone.api.petstore.viewmodel.PetsResponse;
import cl.pablone.api.petstore.viewmodel.RegisterRequest;
import cl.pablone.api.petstore.viewmodel.RegisterResponse;
import cl.pablone.api.petstore.viewmodel.User;
import cl.pablone.api.petstore.viewmodel.UsersResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Validated
@Api(value = "User", description = "the User API")
public interface UserApi {

    /**
     * POST /user : Add a user
     * Add a user
     *
     * @param body Adds an user (required)
     * @return successful operation (status code 200)
     *         or internal error (status code 500)
     */
    @ApiOperation(value = "Add a user", nickname = "addUser", notes = "Add a user", response = RegisterResponse.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RegisterResponse.class),
        @ApiResponse(code = 500, message = "internal error", response = RegisterResponse.class) })
    @RequestMapping(value = "/user",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<RegisterResponse> addUser(@ApiParam(value = "Adds an user" ,required=true )  @Valid @RequestBody RegisterRequest body);


    /**
     * GET /user/{idUser}/pet : List of pet from the user
     * List of pet
     *
     * @param idUser Users ID List of pets (required)
     * @return successful operation (status code 200)
     *         or Internal error (status code 500)
     */
    @ApiOperation(value = "List of pet from the user", nickname = "listPetUser", notes = "List of pet", response = PetsResponse.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PetsResponse.class),
        @ApiResponse(code = 500, message = "Internal error", response = ModelApiResponse.class) })
    @RequestMapping(value = "/user/{idUser}/pet",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<PetsResponse> listPetUser(@ApiParam(value = "Users ID List of pets",required=true) @PathVariable("idUser") String idUser);


    /**
     * GET /user/alluser : List All user in system
     * List all users
     *
     * @return successful operation (status code 200)
     *         or Internal error (status code 500)
     */
    @ApiOperation(value = "List All user in system", nickname = "listUser", notes = "List all users", response = UsersResponse.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = UsersResponse.class),
        @ApiResponse(code = 500, message = "Internal error", response = ModelApiResponse.class) })
    @RequestMapping(value = "/user/alluser",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<UsersResponse> listUser();


    /**
     * PUT /user : Update an existing User
     *
     * @param body User object that needs to be modify (required)
     * @return Invalid ID supplied (status code 400)
     *         or User not found (status code 404)
     *         or Validation exception (status code 405)
     */
    @ApiOperation(value = "Update an existing User", nickname = "updateUser", notes = "", tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "User not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/user",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateUser(@ApiParam(value = "User object that needs to be modify" ,required=true )  @Valid @RequestBody User body);

}
