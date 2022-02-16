package dupradosantini.myfirstapi.controllers.exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class StandardError {
    private Integer status;
    private Long timestamp;
    private String message;

    public StandardError(Integer status, Long timestamp, String message) {
        this.status = status;
        this.timestamp = timestamp;
        this.message = message;
    }
}
