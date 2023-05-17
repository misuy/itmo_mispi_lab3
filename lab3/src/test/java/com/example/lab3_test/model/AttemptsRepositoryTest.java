package com.example.lab3_test.model;

import com.example.lab3.entities.Dot;
import com.example.lab3.model.DotProcessor;
import com.example.lab3.model.AttemptsRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class AttemptsRepositoryTest {

    private static AttemptsRepository repository;

    @BeforeAll
    public static void initRepository() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("local").createEntityManager();
        repository = new AttemptsRepository(entityManager);
        System.out.println(repository.getAllAttempts());
    }

    @Test
    void testDotProcessorSuccess() {
        Dot dot = new Dot(1.0, 1.0, 3.0);
        Assertions.assertTrue(DotProcessor.processDot(dot));
    }

    @Test
    void testDotProcessorFail() {
        Dot dot = new Dot(2.0, 2.0, 3.99);
        Assertions.assertFalse(DotProcessor.processDot(dot));
    }
}
