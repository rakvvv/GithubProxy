package pl.rliszcz.githubproxy;

public record BranchResponseDto(
        String name,
        String lastCommitSha
) {
}