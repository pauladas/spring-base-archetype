package br.com.paulojof.service;

import br.com.paulojof.model.request.ExampleRequest;
import br.com.paulojof.model.response.ExampleResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ExampleService {

	public ExampleResponse exampleMethod(ExampleRequest request) {
		log.info("Running example method with request: {}", request);

		ExampleResponse response = new ExampleResponse("Created response!");

		log.info("Return response: {}", response);
		return response;
	}

}
