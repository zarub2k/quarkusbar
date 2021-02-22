package xyz.tham.quarkusbar.health;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

import javax.enterprise.context.ApplicationScoped;

@Readiness
@ApplicationScoped
public class DatabaseReadiness implements HealthCheck {
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse
            .down("Database Readiness");
    }
}
