package io.swagger.service.impl;

import org.springframework.stereotype.Service;

import io.swagger.model.RestaDatos;
import io.swagger.model.SumaDatos;
import io.swagger.service.OperacionService;

@Service
public class OperacionServiceImpl implements OperacionService {

	@Override public Long restar(RestaDatos restaDatos) {
		return restaDatos.getSustraendo() - restaDatos.getMinuendo();
	}

	@Override public Long sumar(SumaDatos sumaDatos) {
		return sumaDatos.getSumando1() + sumaDatos.getSumando2();
	}
}
