package gugus.pleco.excetion;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.logging.Logger;

@Data
@AllArgsConstructor
public class ErrorDto {

    String message;
    boolean success;
}
