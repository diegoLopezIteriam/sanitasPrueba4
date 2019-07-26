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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-26T09:45:06.495Z")

public class RestaDatos   {

  /**
   * Se definirá la longitud maxima de digitos admitidos. Con decimalMin = 0 impedimos valores negativos
   * Según la especificación podría ser fuente de conflictos si se restara un numero negativo(suma de valores absolutos)
   * se debería tener en cuenta
   */
  @Digits(integer = 15, fraction = 0)
  @DecimalMin("0")
  @NotNull
  @JsonProperty("minuendo")
  private Long minuendo = null;

  @Digits(integer = 15, fraction = 0)
  @DecimalMin("0")
  @NotNull
  @JsonProperty("sustraendo")
  private Long sustraendo = null;

  public RestaDatos minuendo(Long minuendo) {
    this.minuendo = minuendo;
    return this;
  }

  /**
   * Get minuendo
   * @return minuendo
   **/
  @ApiModelProperty(value = "")


  public Long getMinuendo() {
    return minuendo;
  }

  public void setMinuendo(Long minuendo) {
    this.minuendo = minuendo;
  }

  public RestaDatos sustraendo(Long sustraendo) {
    this.sustraendo = sustraendo;
    return this;
  }

  /**
   * Get sustraendo
   * @return sustraendo
   **/
  @ApiModelProperty(value = "")


  public Long getSustraendo() {
    return sustraendo;
  }

  public void setSustraendo(Long sustraendo) {
    this.sustraendo = sustraendo;
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
    return Objects.equals(this.minuendo, restaDatos.minuendo) &&
            Objects.equals(this.sustraendo, restaDatos.sustraendo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minuendo, sustraendo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestaDatos {\n");

    sb.append("    minuendo: ").append(toIndentedString(minuendo)).append("\n");
    sb.append("    sustraendo: ").append(toIndentedString(sustraendo)).append("\n");
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

