package com.alem.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubActionApplication {

    public static void main(String[] args) {

        SpringApplication.run(GithubActionApplication.class, args);
    }
    public String getMessage(){
        return "Hello World";
    }
   /* echo "# github-action" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/awoubshet2024/github-action.git
    git push -u origin main*/
}
