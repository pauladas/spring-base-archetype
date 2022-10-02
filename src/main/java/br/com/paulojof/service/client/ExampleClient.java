package br.com.paulojof.service.client;

import br.com.paulojof.configuration.ApplicationConfig;
import br.com.paulojof.exception.ExampleClientException;
import br.com.paulojof.model.request.ExampleClientRequest;
import br.com.paulojof.model.response.ExampleClientResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;

@Slf4j
@Service
@RequiredArgsConstructor
public class ExampleClient {

	private final ApplicationConfig applicationConfig;

	private final RestTemplateBuilder restTemplateBuilder;

	public ExampleClientResponse callEndpoint(ExampleClientRequest request) throws ExampleClientException {
		log.info("Calling endpoint X");

		HttpHeaders headers = new HttpHeaders();

		HttpEntity<?> entity = new HttpEntity<>(request, headers);
		try {
			return restTemplateBuilder.build()
					.exchange(applicationConfig.getExampleUrl(), HttpMethod.POST, entity, ExampleClientResponse.class)
					.getBody();
		} catch (HttpStatusCodeException exception) {
			log.error("Error while calling X.", exception);
			throw new ExampleClientException("422.000", exception.getMessage());
		}
	}

}
