package com.nicollet.rmiserver;

import com.nicollet.rmiserver.services.HelloWorldRMI;
import com.nicollet.rmiserver.services.HelloWorldRMIImpl;
import com.nicollet.rmiserver.services.StudentService;
import com.nicollet.rmiserver.services.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.remoting.support.RemoteExporter;

@Configuration
public class Config {

    @Bean
    RemoteExporter registerRMIExporter() {

        RmiServiceExporter exporter = new RmiServiceExporter();

        exporter.setServiceName("studentrmi");
        exporter.setServiceInterface(StudentService.class);
        exporter.setService(new StudentServiceImpl());

        return exporter;
    }
}
