package io.swagger.api;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.annotations.ApiParam;
import io.swagger.model.RestaDatos;
import io.swagger.model.SumaDatos;
import io.swagger.service.OperacionService;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-26T07:54:49.951Z")

@Controller
public class OperacionApiController implements OperacionApi {

    private static final Logger log = LoggerFactory.getLogger(OperacionApiController.class);

    @Autowired
    private OperacionService operacionService;

    public ResponseEntity<Long> restarEnteros(@ApiParam(value = "" ,required=true )  @Valid @RequestBody RestaDatos restaDatos) {
        log.info("Inicio de resta entera con params={}", restaDatos);
        Long resultado = operacionService.restar(restaDatos);
        log.debug("Resultado de resta params={} => {}", restaDatos, resultado);
        return ResponseEntity.ok(resultado);
    }

    public ResponseEntity<Long> sumarEnteros(@ApiParam(value = "" ,required=true )  @Valid @RequestBody SumaDatos sumaDatos) {
        log.info("Inicio de suma entera con params={}", sumaDatos);
        Long resultado = operacionService.sumar(sumaDatos);
        log.debug("Resultado de suma: params={} => {}", resultado);
        return ResponseEntity.ok(resultado);
    }

}
