package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NotFound
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-10-28T15:54:29.791Z[GMT]")
public class NotFound   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("message")
  private String message = null;

  public NotFound code(String code) {
    this.code = code;
    return this;
  }

  /**
   * エラーコード
   * @return code
  **/
  @ApiModelProperty(example = "404", value = "エラーコード")

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public NotFound message(String message) {
    this.message = message;
    return this;
  }

  /**
   * エラーメッセージ
   * @return message
  **/
  @ApiModelProperty(example = "指定されたIDは存在しません", value = "エラーメッセージ")

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotFound notFound = (NotFound) o;
    return Objects.equals(this.code, notFound.code) &&
        Objects.equals(this.message, notFound.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotFound {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
