package pl.rliszcz.githubproxy;

public record ErrorResponseDto(
        int status,
        String message
) {
}