package be.dog.d.steven.controller;

import org.junit.jupiter.api.Test;
import org.springframework.ui.ConcurrentModel;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RedirectBeanControllerTest {
    @Test
    public void testProcessRequestBeansRedirect() {
        RedirectBeanController redirectBeanController = new RedirectBeanController();
        assertEquals("beanscopes2", redirectBeanController.processRequestBeansRedirect(new ConcurrentModel()));
    }

    @Test
    public void testProcessRequestBeansRedirect2() {
        ConcurrentModel model = new ConcurrentModel(42);
        assertEquals("beanscopes2", (new RedirectBeanController()).processRequestBeansRedirect(model));
    }
}

