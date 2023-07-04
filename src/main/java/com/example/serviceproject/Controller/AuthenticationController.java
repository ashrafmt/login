package com.example.serviceproject.Controller;

import com.example.serviceproject.Request.LoginRequest;
import com.example.serviceproject.Response.WebResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/auth")
    public class AuthenticationController {

        @PostMapping("/signIn")
        @Operation(
                description = "SignIn service",
                responses = {
                        @ApiResponse(
                                responseCode = "200",
                                description = "Successfully Sign In !",
                                content = @Content(
                                        mediaType ="application/json",
                                        examples = {
                                                @ExampleObject(
                                                        value = "{\"code\" : 200, \"Status\" : \"OK!\", \"Message\" :\"Successfully SignIn!\"}"
                                                ),
                                        }
                                )
                        )
                }
        )
        public ResponseEntity<?> signIn(@io.swagger.v3.oas.annotations.parameters.RequestBody(
                content = @Content(
                        mediaType = "application/json",
                        examples = {
                                @ExampleObject(
                                        value = "{\"username\" : \"Ashraf Mtor\", \"password\" : \"meme\"}"
                                ),
                        }
                )) @RequestBody LoginRequest request) {
            return new ResponseEntity<>(new WebResponse(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), "Successfully signed in!"), HttpStatus.OK);
        }
    }
