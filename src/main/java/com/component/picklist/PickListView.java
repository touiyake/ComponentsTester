package com.component.picklist;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;
import org.primefaces.model.DualListModel;

import lombok.Getter;
import lombok.Setter;

@Named
@ViewScoped
@Setter
@Getter
public class PickListView implements Serializable {

	@Inject
	private ThemeService service;

	private DualListModel<String> cities;
	private DualListModel<Theme> themes;

	@PostConstruct
	public void init() {
		// Cities
		List<String> citiesSource = new ArrayList<String>();
		List<String> citiesTarget = new ArrayList<String>();

		citiesSource.add("San Francisco");
		citiesSource.add("London");
		citiesSource.add("Paris");
		citiesSource.add("Istanbul");
		citiesSource.add("Berlin");
		citiesSource.add("Barcelona");
		citiesSource.add("Rome");

		cities = new DualListModel<String>(citiesSource, citiesTarget);

		// Themes
		List<Theme> themesSource = service.getThemes().subList(0, 5);
		List<Theme> themesTarget = new ArrayList<Theme>();

		themes = new DualListModel<Theme>(themesSource, themesTarget);

	}

}
