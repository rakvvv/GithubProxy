package pl.rliszcz.githubproxy;

public record GithubBranchDto(
        String name,
        GithubCommitDto commit
) {
}