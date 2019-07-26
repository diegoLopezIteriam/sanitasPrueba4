package io.swagger.service;

import io.swagger.model.RestaDatos;
import io.swagger.model.SumaDatos;

public interface OperacionService {

	Long restar(RestaDatos restaDatos);

	Long sumar(SumaDatos sumaDatos);

}
