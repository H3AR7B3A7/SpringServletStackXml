package be.dog.d.steven.controller;

import org.junit.jupiter.api.Test;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.ModelMap;
import org.springframework.validation.DataBinder;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;
import org.springframework.web.servlet.view.RedirectView;

import static org.junit.jupiter.api.Assertions.*;

public class FlashScopedObjectControllerTest {
    @Test
    public void testOldLogin() {
        assertEquals("old_login", (new FlashScopedObjectController()).oldLogin());
    }

    @Test
    public void testRedirectView() {
        FlashScopedObjectController flashScopedObjectController = new FlashScopedObjectController();
        RedirectView actualRedirectViewResult = flashScopedObjectController.redirectView(new RedirectAttributesModelMap(),
                "janedoe", "iloveyou");
        assertFalse(actualRedirectViewResult.isExposePathVariables());
        assertEquals("/redirectViewOld", actualRedirectViewResult.getUrl());
        assertFalse(actualRedirectViewResult.isPropagateQueryProperties());
        assertEquals("text/html;charset=ISO-8859-1", actualRedirectViewResult.getContentType());
    }

    @Test
    public void testRedirectView2() {
        RedirectAttributesModelMap atts = new RedirectAttributesModelMap(new DataBinder("target"));
        RedirectView actualRedirectViewResult = (new FlashScopedObjectController()).redirectView(atts, "janedoe",
                "iloveyou");
        assertFalse(actualRedirectViewResult.isExposePathVariables());
        assertEquals("/redirectViewOld", actualRedirectViewResult.getUrl());
        assertFalse(actualRedirectViewResult.isPropagateQueryProperties());
        assertEquals("text/html;charset=ISO-8859-1", actualRedirectViewResult.getContentType());
    }

    @Test
    public void testRedirectView3() {
        FlashScopedObjectController flashScopedObjectController = new FlashScopedObjectController();
        RedirectView actualRedirectViewResult = flashScopedObjectController.redirectView(new RedirectAttributesModelMap(),
                "username", "iloveyou");
        assertFalse(actualRedirectViewResult.isExposePathVariables());
        assertEquals("/redirectViewOld", actualRedirectViewResult.getUrl());
        assertFalse(actualRedirectViewResult.isPropagateQueryProperties());
        assertEquals("text/html;charset=ISO-8859-1", actualRedirectViewResult.getContentType());
    }

    @Test
    public void testResultPageOld() {
        FlashScopedObjectController flashScopedObjectController = new FlashScopedObjectController();
        assertEquals("old_result_page", flashScopedObjectController.resultPageOld(new ConcurrentModel()));
    }

    @Test
    public void testNewLogin() {
        assertEquals("new_login", (new FlashScopedObjectController()).newLogin());
    }

    @Test
    public void testModelAndView() {
        FlashScopedObjectController flashScopedObjectController = new FlashScopedObjectController();
        assertTrue(flashScopedObjectController.modelAndView(new ModelMap(), "janedoe", "iloveyou").isReference());
    }

    @Test
    public void testModelAndView2() {
        FlashScopedObjectController flashScopedObjectController = new FlashScopedObjectController();
        assertTrue(flashScopedObjectController.modelAndView(new ModelMap(), "username", "iloveyou").isReference());
    }

    @Test
    public void testResultPageNew() {
        FlashScopedObjectController flashScopedObjectController = new FlashScopedObjectController();
        assertEquals("new_result_page",
                flashScopedObjectController.resultPageNew(new ConcurrentModel(), "janedoe", "iloveyou", "Loginform"));
    }

    @Test
    public void testResultPageNew2() {
        RedirectAttributesModelMap model = new RedirectAttributesModelMap(new DataBinder("target"));
        assertEquals("new_result_page",
                (new FlashScopedObjectController()).resultPageNew(model, "janedoe", "iloveyou", "Loginform"));
    }

    @Test
    public void testResultPageNew3() {
        ConcurrentModel model = new ConcurrentModel(42);
        assertEquals("new_result_page",
                (new FlashScopedObjectController()).resultPageNew(model, "janedoe", "iloveyou", "Loginform"));
    }
}

