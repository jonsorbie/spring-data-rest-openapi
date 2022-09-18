package sorbie.jon.springdatarestopenapi.config;

import org.springframework.data.rest.core.config.*;
import org.springframework.data.rest.webmvc.config.*;
import org.springframework.stereotype.*;
import org.springframework.web.servlet.config.annotation.*;

import static org.springframework.http.HttpMethod.*;

/**
 * This class disables Http verbs globally across all entities.
 */
@Component
public class RestExposureConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration restConfig, CorsRegistry cors) {
        restConfig.getExposureConfiguration()
            .withItemExposure((metadata, httpMethods) -> httpMethods.disable(DELETE, PATCH, PUT))
            .withCollectionExposure((metadata, httpMethods) -> httpMethods.disable(DELETE, PATCH, PUT));
    }
}
