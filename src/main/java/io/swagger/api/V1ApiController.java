package io.swagger.api;

import io.swagger.model.ExpenseRequest;
import io.swagger.model.ExpenseResponse;
import io.swagger.model.ExpensesResponse;
import org.threeten.bp.LocalDate;
import io.swagger.model.NotFound;
import io.swagger.model.ResultResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-10-28T15:54:29.791Z[GMT]")
@Controller
public class V1ApiController implements V1Api {

    private static final Logger log = LoggerFactory.getLogger(V1ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public V1ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addExpense(@ApiParam(value = "expense object"  )  @Valid @RequestBody ExpenseRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ExpenseResponse> getExpense(@ApiParam(value = "",required=true) @PathVariable("expenseId") String expenseId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ExpenseResponse>(objectMapper.readValue("{\n  \"date\" : \"2019-10-22T00:00:00.000+0000\",\n  \"amount\" : 100,\n  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",\n  \"content\" : \"おにぎり\"\n}", ExpenseResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ExpenseResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ExpenseResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ExpensesResponse> getExpenses(@ApiParam(value = "開始日") @Valid @RequestParam(value = "beginDate", required = false) LocalDate beginDate,@ApiParam(value = "終了日") @Valid @RequestParam(value = "endDate", required = false) LocalDate endDate) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ExpensesResponse>(objectMapper.readValue("{\n  \"expenses\" : [ {\n    \"date\" : \"2019-10-22T00:00:00.000+0000\",\n    \"amount\" : 100,\n    \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",\n    \"content\" : \"おにぎり\"\n  }, {\n    \"date\" : \"2019-10-22T00:00:00.000+0000\",\n    \"amount\" : 100,\n    \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",\n    \"content\" : \"おにぎり\"\n  } ]\n}", ExpensesResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ExpensesResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ExpensesResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResultResponse> getResult(@ApiParam(value = "",required=true) @PathVariable("resultId") String resultId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResultResponse>(objectMapper.readValue("{\n  \"expenseGoal\" : 5000,\n  \"balance\" : -5000,\n  \"id\" : \"2000-01-23\",\n  \"totalExpense\" : 10000\n}", ResultResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResultResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResultResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
