package pl.rliszcz.githubproxy;

import java.util.List;

public record RepositoryResponseDto(
        String repositoryName,
        String ownerLogin,
        List<BranchResponseDto> branches
) {
}