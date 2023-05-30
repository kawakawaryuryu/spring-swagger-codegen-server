package io.swagger.api;

import io.swagger.model.ExpenseRequest;
import io.swagger.model.ExpenseResponse;
import io.swagger.model.ExpensesResponse;
import org.threeten.bp.LocalDate;
import io.swagger.model.NotFound;
import io.swagger.model.ResultResponse;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class V1ApiControllerIntegrationTest {

    @Autowired
    private V1Api api;

    @Test
    public void addExpenseTest() throws Exception {
        ExpenseRequest body = new ExpenseRequest();
        ResponseEntity<Void> responseEntity = api.addExpense(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getExpenseTest() throws Exception {
        String expenseId = "expenseId_example";
        ResponseEntity<ExpenseResponse> responseEntity = api.getExpense(expenseId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getExpensesTest() throws Exception {
        LocalDate beginDate = new LocalDate();
        LocalDate endDate = new LocalDate();
        ResponseEntity<ExpensesResponse> responseEntity = api.getExpenses(beginDate, endDate);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getResultTest() throws Exception {
        String resultId = "resultId_example";
        ResponseEntity<ResultResponse> responseEntity = api.getResult(resultId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
