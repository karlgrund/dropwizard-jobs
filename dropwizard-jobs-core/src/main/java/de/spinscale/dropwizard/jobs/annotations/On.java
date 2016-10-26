package de.spinscale.dropwizard.jobs.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface On {
    String value();

    /**
     * The name of this job. If not specified, the name of the job will default to the canonical name of the annotated
     * class
     */
    String jobName() default "";
}
