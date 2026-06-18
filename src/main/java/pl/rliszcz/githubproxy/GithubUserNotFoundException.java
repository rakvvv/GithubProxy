package pl.rliszcz.githubproxy;


public class GithubUserNotFoundException extends RuntimeException {

    public GithubUserNotFoundException(String username) {
        super("GitHub user not found: " + username);
    }
}