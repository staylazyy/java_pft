package ru.stqa.pft.jivo.model;

public class ContactData {
  private int id;
  private final String firstname;
  private final String secondname;
  private final String nickname;
  private final String phoneMobile;
  private String group;

  public void setId(int id) {
    this.id = id;
  }

  public String getGroup() {
    return group;
  }

  public ContactData(int id, String firstname, String secondname, String nickname, String phoneMobile, String group) {
    this.id = id;
    this.firstname = firstname;
    this.secondname = secondname;
    this.nickname = nickname;
    this.phoneMobile = phoneMobile;
    this.group = group;
  }

  public int getId() {
    return id;
  }

  public ContactData(String firstname, String secondname, String nickname, String phoneMobile, String group) {
    this.id = Integer.MAX_VALUE;
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

  @Override
  public String toString() {
    return "ContactData{" +
            "firstname='" + firstname + '\'' +
            ", secondname='" + secondname + '\'' +
            ", phoneMobile='" + phoneMobile + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
    if (secondname != null ? !secondname.equals(that.secondname) : that.secondname != null) return false;
    return phoneMobile != null ? phoneMobile.equals(that.phoneMobile) : that.phoneMobile == null;
  }

  @Override
  public int hashCode() {
    int result = firstname != null ? firstname.hashCode() : 0;
    result = 31 * result + (secondname != null ? secondname.hashCode() : 0);
    result = 31 * result + (phoneMobile != null ? phoneMobile.hashCode() : 0);
    return result;
  }
}
