package pl.rliszcz.githubproxy;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(GithubUserNotFoundException.class)
    public ResponseEntity<ErrorResponseDto> handleGithubUserNotFound(
            GithubUserNotFoundException ex
    ) {
        ErrorResponseDto re = new ErrorResponseDto(
                HttpStatus.NOT_FOUND.value(),
                ex.getMessage()
        );
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(re);
    }

}
