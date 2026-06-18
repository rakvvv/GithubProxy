package pl.rliszcz.githubproxy;

public record Branch(
        String name,
        String lastCommitSha
) {
}