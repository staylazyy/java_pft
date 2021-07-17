package ru.stqa.pft.jivo.model;

public class ContactData {
  private final String firstname;
  private final String secondname;
  private final String nickname;
  private final String phoneMobile;
  private String group;

  public String getGroup() {
    return group;
  }

  public ContactData(String firstname, String secondname, String nickname, String phoneMobile, String group) {
    this.firstname = firstname;
    this.secondname = secondname;
    this.nickname = nickname;
    this.phoneMobile = phoneMobile;
    this.group = group;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getSecondname() {
    return secondname;
  }

  public String getNickname() {
    return nickname;
  }

  public String getPhoneMobile() {
    return phoneMobile;
  }
}
