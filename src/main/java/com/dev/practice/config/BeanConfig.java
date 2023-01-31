package com.dev.practice.config;

import com.dev.practice.car.CarRepository;
import com.dev.practice.car.CarService;
import com.dev.practice.car.CarServiceImpl;
import com.dev.practice.car.SonarTarRepository;
import com.dev.practice.user.UserRepository;
import com.dev.practice.user.UserRepositoryImpl;
import com.dev.practice.user.UserService;
import com.dev.practice.user.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public UserService userService() {
        return new UserServiceImpl(carService(), userRepository());
    }

    @Bean
    public UserRepository userRepository(){
        return new UserRepositoryImpl();
    }

    @Bean
    public CarService carService(){
        return new CarServiceImpl(carRepository());
    }

    @Bean
    public CarRepository carRepository(){
        return new SonarTarRepository();
    }
}