package io.swagger.model;

import java.util.Objects;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SumaDatos
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-26T07:54:49.951Z")

public class SumaDatos   {

  /**
   * Se definirá la longitud maxima de digitos admitidos. Con decimalMin = 0 impedimos valores negativos
   * Se hace con propósito de jugar con alguna validación más. Podría haberse admitido la suma de números negativos
   */
  @Digits(integer = 15, fraction = 0)
  @DecimalMin("0")
  @NotNull
  @JsonProperty("sumando1")
  private Long sumando1 = null;

  @Digits(integer = 15, fraction = 0)
  @DecimalMin("0")
  @NotNull
  @JsonProperty("sumando2")
  private Long sumando2 = null;

  public SumaDatos sumando1(Long sumando1) {
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

  public SumaDatos sumando2(Long sumando2) {
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
    SumaDatos sumaDatos = (SumaDatos) o;
    return Objects.equals(this.sumando1, sumaDatos.sumando1) &&
        Objects.equals(this.sumando2, sumaDatos.sumando2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sumando1, sumando2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SumaDatos {\n");
    
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

