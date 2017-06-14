# SocialApplication
Using Spring Security to learn about OAuth2.

This app will securely log into GitHub and Facebook through their respective authentication servers provided you can present valid credentials.

You do not need to have developer accounts for GitHub and Facebook to make this application work. The credentials I used in this application for GitHub and Facebook belong to Spring. You can follow the example that I followed at: https://spring.io/guides/tutorials/spring-boot-oauth2/

GitHub's developer portal: https://developer.github.com/

Facebook's developer portal: https://developers.facebook.com/

Missing from this repository is the `application.properties` file which contains the credentials I used to validate my application with the respective authentication servers.  If you wish to pick this up and use it as your own, you will need to provide an `application.properties` file under the `src/main/resources` directory.

In this file, you will want to provide the following:

```
github.client.clientId: <provided in the Spring tutorial or when you register your application through GitHub's developer portal>
github.client.clientSecret: <provided in the Spring tutorial or when you register your application through GitHub's developer portal>
github.client.accessTokenUri: https://github.com/login/oauth/access_token
github.client.userAuthorizationUri: https://github.com/login/oauth/authorize
github.client.clientAuthenticationScheme: form
github.resource.userInfoUri: https://api.github.com/user

facebook.client.clientId: <provided in the Spring tutorial or when you register your application through GitHub's developer portal>
facebook.client.clientSecret: <provided in the Spring tutorial or when you register your application through GitHub's developer portal>
facebook.client.accessTokenUri: https://graph.facebook.com/oauth/access_token
facebook.client.userAuthorizationUri: https://www.facebook.com/dialog/oauth
facebook.client.tokenName: oauth_token
facebook.client.authenticationScheme: query
facebook.client.clientAuthenticationScheme: form
facebook.resource.userInfoUri: https://graph.facebook.com/me
```

## How to Run
Run `LocalSocialApplication.java` and open your browser to http://localhost:8080.