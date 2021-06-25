package cl.pablone.api.petstore.viewmodel;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * RegisterRequest
 */

public class RegisterRequest   {
  @JsonProperty("username")
  private String username;

  @JsonProperty("mail")
  private String mail;

  @JsonProperty("role")
  private String role;

  @JsonProperty("password")
  private String password;

  @JsonProperty("birthday")
  private String birthday;

  public RegisterRequest username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  @ApiModelProperty(example = "user1234", value = "")


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public RegisterRequest mail(String mail) {
    this.mail = mail;
    return this;
  }

  /**
   * Get mail
   * @return mail
  */
  @ApiModelProperty(example = "mail@m.com", value = "")


  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public RegisterRequest role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  @ApiModelProperty(example = "administrador", value = "")


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public RegisterRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  @ApiModelProperty(example = "asd1234", value = "")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public RegisterRequest birthday(String birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * Get birthday
   * @return birthday
  */
  @ApiModelProperty(example = "dd/mm/yy", value = "")


  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterRequest registerRequest = (RegisterRequest) o;
    return Objects.equals(this.username, registerRequest.username) &&
        Objects.equals(this.mail, registerRequest.mail) &&
        Objects.equals(this.role, registerRequest.role) &&
        Objects.equals(this.password, registerRequest.password) &&
        Objects.equals(this.birthday, registerRequest.birthday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, mail, role, password, birthday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterRequest {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
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

