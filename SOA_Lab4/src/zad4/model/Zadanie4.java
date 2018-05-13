package zad4.model;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;

@ManagedBean
@SessionScoped
public class Zadanie4 {
	String name;
	String email;
	String age;
	String sex;
	String education;
	String height;
	
	//Dla kobiety
	String bust;
	String cup;
	String hips;
	
	
	//Dla Mêzczyzny
	String chest;
	
	//Wspolne
	String legs;
	String weist;
	
	boolean partTwo = false;
	String pytanie1;
	String pytanie2;
	List<String> pytanie3; 
	List<String> pytanie4;
	String pytanie5;
	String pytanie6;
	String pytanie7;
	String pytanie8;

	
	
	public Zadanie4() {	}
	
	public void acceptPartOne() throws IOException {
		if(partTwo == false) {
			partTwo = true;
		}
		else {
			System.out.println(toString());
			ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		    ec.redirect(ec.getRequestContextPath() + "/zad4/podsumowanie.xhtml");
		}
	}
	
    public String getBaner(){
		int wylosowana = ThreadLocalRandom.current().nextInt(0, 4);
        return "baner" + wylosowana + ".jpg";
}
	
	
	public String getPytanie1() {
		return pytanie1;
	}

	public void setPytanie1(String pytanie1) {
		this.pytanie1 = pytanie1;
	}

	public String getPytanie2() {
		return pytanie2;
	}

	public void setPytanie2(String pytanie2) {
		this.pytanie2 = pytanie2;
	}

	public List<String> getPytanie3() {
		return pytanie3;
	}

	public void setPytanie3(List<String> pytanie3) {
		this.pytanie3 = pytanie3;
	}

	public List<String> getPytanie4() {
		return pytanie4;
	}

	public void setPytanie4(List<String> pytanie4) {
		this.pytanie4 = pytanie4;
	}

	public String getPytanie5() {
		return pytanie5;
	}

	public void setPytanie5(String pytanie5) {
		this.pytanie5 = pytanie5;
	}

	public String getPytanie6() {
		return pytanie6;
	}

	public void setPytanie6(String pytanie6) {
		this.pytanie6 = pytanie6;
	}

	public String getPytanie7() {
		return pytanie7;
	}

	public void setPytanie7(String pytanie7) {
		this.pytanie7 = pytanie7;
	}

	public String getPytanie8() {
		return pytanie8;
	}

	public void setPytanie8(String pytanie8) {
		this.pytanie8 = pytanie8;
	}

	public boolean isPartTwo() {
		return partTwo;
	}

	public void setPartTwo(boolean partTwo) {
		this.partTwo = partTwo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getBust() {
		return bust;
	}

	public void setBust(String bust) {
		this.bust = bust;
	}

	public String getCup() {
		return cup;
	}

	public void setCup(String cup) {
		this.cup = cup;
	}

	public String getTalia() {
		return weist;
	}
	
	public String getWeist() {
		return weist;
	}

	public void setWeist(String weist) {
		this.weist = weist;
	}

	public String getHips() {
		return hips;
	}

	public void setHips(String hips) {
		this.hips = hips;
	}

	public String getChest() {
		return chest;
	}

	public void setChest(String chest) {
		this.chest = chest;
	}


	public String getLegs() {
		return legs;
	}

	public void setLegs(String legs) {
		this.legs = legs;
	}

	@Override
	public String toString() {
		return "Zadanie4 [imie=" + name + ", mail=" + email + ", wiek=" + age + ", plec=" + sex + ", wyksztalcenie="
				+ education + ", wzrost=" + height + ", obwodBiustu=" + bust + ", wielkoscMiseczki="
				+ cup + ", talia=" + weist + ", biodra=" + hips + ", klatka=" + chest 
				+ ", dlugoscNogi=" + legs + ", pytanie1=" + pytanie1 + ", pytanie2=" + pytanie2 + ", pytanie3="
				+ pytanie3 + ", pytanie4=" + pytanie4 + ", pytanie5=" + pytanie5 + ", pytanie6=" + pytanie6
				+ ", pytanie7=" + pytanie7 + ", pytanie8=" + pytanie8 + "]";
	}
	
	
	
}
