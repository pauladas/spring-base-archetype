package br.com.paulojof.controller;

import br.com.paulojof.model.request.ExampleRequest;
import br.com.paulojof.model.response.ExampleResponse;
import br.com.paulojof.service.ExampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/example")
public class ExampleController {

	private final ExampleService exampleService;

	@PostMapping("/post-mapping")
	@ResponseStatus(HttpStatus.CREATED)
	public ExampleResponse postMapping(@RequestBody ExampleRequest request) {
		return exampleService.exampleMethod(request);
	}

}
