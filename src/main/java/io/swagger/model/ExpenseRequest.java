package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExpenseRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-10-28T15:54:29.791Z[GMT]")
public class ExpenseRequest   {
  @JsonProperty("amount")
  private Integer amount = null;

  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("content")
  private String content = null;

  public ExpenseRequest amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * 支出額
   * minimum: 0
   * @return amount
  **/
  @ApiModelProperty(example = "100", required = true, value = "支出額")
  @NotNull

@Min(0)  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public ExpenseRequest date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * 支出日付
   * @return date
  **/
  @ApiModelProperty(example = "Tue Oct 22 00:00:00 GMT 2019", required = true, value = "支出日付")
  @NotNull

  @Valid
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public ExpenseRequest content(String content) {
    this.content = content;
    return this;
  }

  /**
   * 支出内容
   * @return content
  **/
  @ApiModelProperty(example = "おにぎり", required = true, value = "支出内容")
  @NotNull

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpenseRequest expenseRequest = (ExpenseRequest) o;
    return Objects.equals(this.amount, expenseRequest.amount) &&
        Objects.equals(this.date, expenseRequest.date) &&
        Objects.equals(this.content, expenseRequest.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, date, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenseRequest {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
