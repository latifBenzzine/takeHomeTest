package com.monsanto.climate.model;

import java.util.Date;
import java.util.Locale;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

	@Entity
	public class AppUser {
		@Id
		@GeneratedValue
		private Long id;
		private String name;
		private String email;
		private String phoneNumber;
		private Locale locale;
		private String   birthDate;
		
		public AppUser() {
			super();
		}

		public AppUser(Long id, String name, String email, String phoneNumber, String Locale, String birthDate) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.birthDate = birthDate;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
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

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public Locale getLocale() {
			return locale;
		}

		public void setLocale(Locale locale) {
			this.locale = locale;
		}

		public String getBirthDate() {
			return birthDate;
		}

		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;
		}
		
			
	}


