package com.vkytsun.app.homework.lesson16;

public enum ListOfPeople {
    PERSON1("DiCaprio Leonardo Wilhelm",43,"alive"), //11.11.1974
    PERSON2("Kuzmenko Andriy Vіktorovich",47,"died"), //17.08.1968 - 2016
    PERSON3("Shevchenko Andriy Mykolayovych",40,"alive"), //29.09.1976
    PERSON4("Lobanovsky Valery Vasylovych",63,"died"), // 06.01.1939 — 13.06.2002
    PERSON5("Bodrov Sergei Serhiyovych",30,"died"), //(27.12.1971 — 20.09.2002
    PERSON6("Diego Armando Maradona",56,"alive"), //30.10.1960
    PERSON7("Cristiano Ronaldo dos Santos Aveiro",31,"alive"), // 5.02.1985
    PERSON8("Lionel Andrés Messi",29,"alive"), //24.06.1987
    PERSON9("Mike Tyson",50,"alive"), //30.06.1966
    PERSON10("Muhammad Ali",74,"died"), //17.01.1942 - 03.06.2016
    PERSON11("Klitschko Volodymyr Volodymyrovych",40,"alive"), //25.04.1976
    PERSON12("Angelina Jolie",41,"alive"), //04.06.1975
    PERSON13("William Bradley Pitt",53,"alive"), //18.12.1963
    PERSON14("Shevchenko Taras Grygorovych",47,"died"), //09.04.1814 - 10.04.1861
    PERSON15("Franco Ivan Yakovych",59,"died"); //27.08.1856 - 28.05.1916

    private String fullName;
    private int age;
    private String statusOfLive;

    ListOfPeople(String fullName, int age, String statusOfLive) {
        this.fullName = fullName;
        this.age = age;
        this.statusOfLive = statusOfLive;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getStatusOfLive() {
        return statusOfLive;
    }

/*    @Override
    public String toString() {
        return fullName;
    }*/
}
