package com.example.livraisonsmypack.router;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.mvc.RedirectScoped;

import java.io.Serializable;

@Named("AdminRouter")
@RequestScoped
public class AdminRouter implements Serializable {
    public String render(String view) {
        try {
            if(!view.equals(null) && !view.equals("")) {
                switch (view) {
                    case "home": return "./src/admin/index.xhtml";
                    case "managers": return "./src/admin/views/managers/index.xhtml";
                    default: return "./src/admin/index.xhtml";
                }
            }else {
                return "./src/admin/index.xhtml";
            }
        }catch (Exception e){
            return "./src/admin/index.xhtml";
        }
    }
}
