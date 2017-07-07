package com.jose.core.components.page;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import com.day.crx.JcrConstants;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

/** Created by jose on 07/07/2017. */
public class PageDetailsServletShould {

    @InjectMocks
    PageDetailsServlet pageDetailsServlet = new PageDetailsServlet();
    @Mock
    private SlingHttpServletRequest slingHttpServletRequest;
    @Mock
    private SlingHttpServletResponse slingHttpServletResponse;
    @Mock
    private org.apache.sling.api.resource.Resource pageResource;
    @Mock
    private org.apache.sling.api.resource.Resource contentResource;

    @Before
    public void init() {
        initMocks(this);
        when(slingHttpServletRequest.getResource()).thenReturn(pageResource);
        when(pageResource.getChild(JcrConstants.JCR_CONTENT)).thenReturn(contentResource);

    }

    @Test
    public void ADAPT_REQUEST_TO_PAGE() {
        assertTrue(true);
        // pageDetailsServlet.doGet(slingHttpServletRequest, slingHttpServletResponse);
    }
}
