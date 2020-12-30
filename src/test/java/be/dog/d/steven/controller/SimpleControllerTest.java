package be.dog.d.steven.controller;

import org.junit.jupiter.api.Test;
import org.springframework.ui.ConcurrentModel;
import org.springframework.validation.DataBinder;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleControllerTest {
    @Test
    public void testProcessGetRequest() {
        SimpleController simpleController = new SimpleController();
        assertEquals("get", simpleController.processGetRequest(new ConcurrentModel()));
    }

    @Test
    public void testProcessGetRequest2() {
        RedirectAttributesModelMap model = new RedirectAttributesModelMap(new DataBinder("target"));
        assertEquals("get", (new SimpleController()).processGetRequest(model));
    }

    @Test
    public void testProcessGetRequest3() {
        ConcurrentModel model = new ConcurrentModel(42);
        assertEquals("get", (new SimpleController()).processGetRequest(model));
    }

    @Test
    public void testPrecessPostRequest() {
        SimpleController simpleController = new SimpleController();
        assertEquals("post", simpleController.precessPostRequest(new ConcurrentModel()));
    }

    @Test
    public void testPrecessPostRequest2() {
        RedirectAttributesModelMap model = new RedirectAttributesModelMap(new DataBinder("target"));
        assertEquals("post", (new SimpleController()).precessPostRequest(model));
    }

    @Test
    public void testPrecessPostRequest3() {
        ConcurrentModel model = new ConcurrentModel(42);
        assertEquals("post", (new SimpleController()).precessPostRequest(model));
    }
}

