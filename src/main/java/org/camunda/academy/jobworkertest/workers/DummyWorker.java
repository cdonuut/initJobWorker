package org.camunda.academy.jobworkertest.workers;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DummyWorker {
    @JobWorker(type = "dummy")
    public Map<String, Object> dummyWorker(final ActivatedJob job) {
        Map<String, Object> variables = new HashMap<>();
        variables.put("isDuplicate", false);

        return variables;
    }
}
