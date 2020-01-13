package com.stock.history.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stock.history.graphQL.GraphQLProvider;

import graphql.ExecutionInput;
import graphql.ExecutionResult;
import graphql.GraphQLError;
import graphql.servlet.core.internal.GraphQLRequest;

@CrossOrigin(maxAge = 3600)
@RestController
public class GraphQlsController {

	@Autowired
	GraphQLProvider graphQLProvider;

	private final Logger log = LoggerFactory.getLogger(GraphQlsController.class);

	@CrossOrigin()
	@PostMapping(value = "/graphql")
	public ResponseEntity<Object> mutateGraphQL(@RequestBody GraphQLRequest graphQLRequest) {
		
		ExecutionInput executionInput = ExecutionInput.newExecutionInput()
				.query(graphQLRequest.getQuery())
				.variables(graphQLRequest.getVariables())
				.operationName(graphQLRequest.getOperationName())
				.build();
		ExecutionResult executionResult = graphQLProvider.graphQL().execute(executionInput);
		Object data = executionResult.getData();
		List<GraphQLError> errors = executionResult.getErrors();
		return ResponseEntity.ok(data);
	}
}