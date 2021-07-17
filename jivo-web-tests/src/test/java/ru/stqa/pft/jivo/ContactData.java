package ru.stqa.pft.jivo;

public class ContactData {
  private final String firstname;
  private final String secondname;
  private final String nickname;
  private final String phoneMobile;

  public ContactData(String firstname, String secondname, String nickname, String phoneMobile) {
    this.firstname = firstname;
    this.secondname = secondname;
    this.nickname = nickname;
    this.phoneMobile = phoneMobile;
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
