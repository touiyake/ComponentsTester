package com.component.picklist;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.primefaces.component.picklist.PickList;
import org.primefaces.model.DualListModel;

@FacesConverter(value = "themeConverter")
public class ThemeConverter implements Converter<Object> {

	@SuppressWarnings("unchecked")
	@Override
	public Object getAsObject(FacesContext fc, UIComponent ui, String value) {
		DualListModel<Theme> model = (DualListModel<Theme>) ((PickList) ui).getValue();
		for (Theme theme : model.getSource()) {
			if (theme.getDisplayName().equalsIgnoreCase(value)) {
				return theme;
			}
		}
		
		for (Theme theme : model.getTarget()) {
			if (theme.getDisplayName().equalsIgnoreCase(value)) {
				return theme;
			}
		}
		
		return null;
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent ui, Object value) {
		return ((Theme) value).getDisplayName();
	}

}
