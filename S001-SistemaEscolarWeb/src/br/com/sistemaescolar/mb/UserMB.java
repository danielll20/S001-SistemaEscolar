package br.com.sistemaescolar.mb;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import br.com.sistemaescolar.fachada.UserSFLocal;
import br.com.sistemaescolar.to.UserTO;

@SessionScoped
@ManagedBean
public class UserMB {
	
	private List<UserTO> userTOList;
	
	@EJB
	private UserSFLocal userSF;
	
	public List<UserTO> getUser(){
		if(userTOList == null){
			ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
			String userEmail = context.getUserPrincipal().getName();
			
			userTOList = userSF.findUserByEmail(userEmail);
		}
		
		return userTOList;
	}
	
	public boolean isUserAdmin(){
		return getRequest().isUserInRole("ADMIN");
	}
	
	public String logOut(){
		getRequest().getSession().invalidate();
		return "logout";
	}

	private HttpServletRequest getRequest() {
		return (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
	}
}