package io.swagger.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.google.gson.Gson;

import io.swagger.model.SumaDatos;

@RunWith(SpringRunner.class)
@WebMvcTest
@AutoConfigureMockMvc
public class OperacionApiTest {

	private static final String ENDPOINT_SUMA = "suma";

	private static final String ENDPOINT_RESTA = "resta";

	@Autowired
	private MockMvc mockMvc;

	/**
	 Verifica que el resultado de la suma es correcto
	 */
	@Test
	public void testSumaCorrecta() throws Exception {
		SumaDatos datos = new SumaDatos();
		datos.setSumando1(2l);
		datos.setSumando1(3l);
		String resultadoEsperado = "5";
		ResultActions respuesta = llamarAURLOperacion(ENDPOINT_SUMA, datos);
		respuesta
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().json(resultadoEsperado))
				.andExpect(MockMvcResultMatchers.content()
						.contentType(MediaType.APPLICATION_JSON_UTF8));
	}

	/**
	Comprobaría que, en caso de parámetros nulos, el error lanzado es el esperado.
	Si se lanza un codigo interno se verificaría que se recibe o que en el contenido figura el error por defecto de parametro nulo
	 */
	@Test
	public void testSumaParametrosNull() throws Exception {
		SumaDatos datos = new SumaDatos();
		ResultActions respuesta = llamarAURLOperacion(ENDPOINT_SUMA, datos);
		respuesta
				.andExpect(MockMvcResultMatchers.status().isBadRequest())
				.andExpect(MockMvcResultMatchers.content()
						.contentType(MediaType.APPLICATION_JSON_UTF8));
	}

	/**
	 * El objeto de este test es validar que, en caso de una entrada de letras o caracteres no esperados, se controla el error
	 * @throws Exception
	 */
	@Test
	public void testSumaParametrosAlfanumericos() throws Exception {
		String datos = "{ \"sumando1\": \"dos\", \"sumando2\": \"dos\" }";
		ResultActions respuesta = llamarAURLOperacion(ENDPOINT_SUMA, datos);
		respuesta
				.andExpect(MockMvcResultMatchers.status().isBadRequest())
				.andExpect(MockMvcResultMatchers.content()
						.contentType(MediaType.APPLICATION_JSON_UTF8));
	}

	@Test
	public void testRestaCorrecta() {

	}

	@Test
	public void testRestaParametrosNull() {

	}

	private ResultActions llamarAURLOperacion(String endpointOperacion, Object pojoEntrada) throws Exception {
		Gson gson = new Gson();
		return mockMvc.perform(MockMvcRequestBuilders.post("/operacion/".concat(endpointOperacion))
				.content(gson.toJson(pojoEntrada))
				.contentType(MediaType.APPLICATION_JSON_UTF8));
	}

}
