package com.component.picklist;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import lombok.Getter;
import lombok.Setter;

@Named
@ApplicationScoped
@Setter
@Getter
public class ThemeService implements Serializable {
     
    private List<Theme> themes;

    @PostConstruct
    public void init() {
        themes = new ArrayList<>();
        themes.add(new Theme(0, "Nova-Light", "nova-light"));
        themes.add(new Theme(1, "Nova-Dark", "nova-dark"));
        themes.add(new Theme(2, "Nova-Colored", "nova-colored"));
        themes.add(new Theme(3, "Luna-Blue", "luna-blue"));
        themes.add(new Theme(4, "Luna-Amber", "luna-amber"));
        themes.add(new Theme(5, "Luna-Green", "luna-green"));
        themes.add(new Theme(6, "Luna-Pink", "luna-pink"));
        themes.add(new Theme(7, "Omega", "omega"));
    }

}