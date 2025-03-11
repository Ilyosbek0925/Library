package spring.librarian.conf;

import jakarta.servlet.annotation.WebFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import spring.librarian.service.AuthService;

@Configuration
@EnableWebSecurity
public class AllConfiguration {

    @Autowired
    AuthService authService;

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }
//l crud


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf(AbstractHttpConfigurer::disable).authorizeHttpRequests(auth ->
                auth.requestMatchers("/book/createBook", "/book/updateBook", "book/delete/").hasAuthority("LIBRARIAN").
                        requestMatchers("/order/createBook", "/order/delete/").hasAuthority("USER").
                        requestMatchers("/book/findById/", "book/getAll", "/order/getAll", "/order/findById/", "/order/updateBook").
                        hasAnyAuthority("LIBRARIAN", "USER").
                        requestMatchers("/book/getAll").permitAll().anyRequest().permitAll()).httpBasic(Customizer.withDefaults()).build();

    }


}
