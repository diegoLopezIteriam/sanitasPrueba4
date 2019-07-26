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
 * RestaDatos
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-26T07:54:49.951Z")

public class RestaDatos   {
  @JsonProperty("sumando1")
  private Long sumando1 = null;

  @JsonProperty("sumando2")
  private Long sumando2 = null;

  public RestaDatos sumando1(Long sumando1) {
    this.sumando1 = sumando1;
    return this;
  }

  /**
   * Get sumando1
   * @return sumando1
  **/
  @ApiModelProperty(value = "")


  public Long getSumando1() {
    return sumando1;
  }

  public void setSumando1(Long sumando1) {
    this.sumando1 = sumando1;
  }

  public RestaDatos sumando2(Long sumando2) {
    this.sumando2 = sumando2;
    return this;
  }

  /**
   * Get sumando2
   * @return sumando2
  **/
  @ApiModelProperty(value = "")


  public Long getSumando2() {
    return sumando2;
  }

  public void setSumando2(Long sumando2) {
    this.sumando2 = sumando2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestaDatos restaDatos = (RestaDatos) o;
    return Objects.equals(this.sumando1, restaDatos.sumando1) &&
        Objects.equals(this.sumando2, restaDatos.sumando2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sumando1, sumando2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestaDatos {\n");
    
    sb.append("    sumando1: ").append(toIndentedString(sumando1)).append("\n");
    sb.append("    sumando2: ").append(toIndentedString(sumando2)).append("\n");
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

