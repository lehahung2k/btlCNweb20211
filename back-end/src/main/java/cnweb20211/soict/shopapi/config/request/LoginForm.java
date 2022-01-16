package cnweb20211.soict.shopapi.config.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LoginForm {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
