/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Azusu
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(backend.service.AdminFacadeREST.class);
        resources.add(backend.service.CommentFacadeREST.class);
        resources.add(backend.service.ImageFacadeREST.class);
        resources.add(backend.service.TagFacadeREST.class);
        resources.add(backend.service.UserFacadeREST.class);
    }
    
}
