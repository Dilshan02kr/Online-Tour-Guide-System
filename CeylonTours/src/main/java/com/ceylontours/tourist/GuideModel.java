package com.ceylontours.tourist;

public class GuideModel {
	int id;
	String name;
	String email;
	String pwd;
	String country;
	String phone = "07*-***-**-**" ;
	String description = "Welcome to Cyelon Tourguide! Your decription";
	String profilePic = "https://th.bing.com/th/id/OIP.srNFFzORAaERcWvhwgPzVAHaHa?rs=1&pid=ImgDetMain";
	String coverPic = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRBHnPo0bFH3LqcO4SPcddMob7hhXgX6d3nhw&s";
	String role = "guide";
	
	public GuideModel(String name,String email,String pwd,String country,String phone) {
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.country = country;
		this.phone = phone;
		
	}
	
	public GuideModel(int id, String name, String email, String pwd, String country, String phone, 
            String description, String profilePic, String coverPic, String role) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.country = country;
		this.phone = phone;
		this.description = description;
		this.profilePic = profilePic;
		this.coverPic = coverPic;
		this.role = role;
	}
	
	public GuideModel(int id2, String username, String email2, String role2) {
		this.id = id2;
		this.name = username;
		this.email = email2;
		this.role = role2;
		
	}
	
	public GuideModel(int id2, String name2, String country2, String telephone, String description2, String pimg, String cimg) {
		this.id = id2;
		this.name = name2;
		this.country = country2;
		this.phone = telephone;
		this.description = description2;
		this.profilePic = pimg;
		this.coverPic = cimg;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getProfilePic() {
		return profilePic;
	}
	
	public String getCoverPic() {
		return coverPic;
	}

	public String getDescription() {
		return description;
	}
	
	public String getRole() {
		return role;
	}
}
