package com.example.itemservice.config;

import io.jaegertracing.internal.JaegerTracer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JaegerConfig {

    @Bean
    public static JaegerTracer jaegerTracer() {
        io.jaegertracing.Configuration.SamplerConfiguration samplerConfig =
                io.jaegertracing.Configuration.SamplerConfiguration.fromEnv().withType("const").withParam(1);
        io.jaegertracing.Configuration.ReporterConfiguration reporterConfig =
                io.jaegertracing.Configuration.ReporterConfiguration.fromEnv().withLogSpans(false);
        io.jaegertracing.Configuration config = new io.jaegertracing.Configuration("item-service").withSampler(samplerConfig).withReporter(reporterConfig);
        return config.getTracer();
    }

}