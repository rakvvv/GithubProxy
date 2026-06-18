package pl.rliszcz.githubproxy;

public record GithubRepositoryDto(
        String name,
        GithubOwnerDto owner,
        boolean fork
) {
}