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

//@CrossOrigin(maxAge = 3600)
//@RequestMapping("/graphql")
//@RestController
//public class GraphQlController {
//    
//    private static Logger logger = LoggerFactory.getLogger(GraphQlController.class);
//
//    @Autowired
//    private GraphQLService graphQLService;   
//    
//    @PostMapping
//    public ResponseEntity<Object> query(@RequestBody String query){
//        logger.info("Entering query@GraphQlController");
//        ExecutionResult execute = graphQLService.getGraphQL().execute(query);
//        return new ResponseEntity<>(execute, HttpStatus.OK);
//    }
//
//
//}

@CrossOrigin(maxAge = 3600)
@RestController
public class GraphQLController {

	@Autowired
	GraphQLProvider graphQLProvider;
	
	private final Logger log = LoggerFactory.getLogger(GraphQLController.class);

	@CrossOrigin()
	@PostMapping(value = "/graphql")
	public ResponseEntity<Object> query(@RequestBody GraphQLRequest graphQLRequest) {		
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