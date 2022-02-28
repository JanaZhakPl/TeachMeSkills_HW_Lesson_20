public class Student {
    private  int id;
    private String name;
    private String last_name;
    private  String language;
    private  int city_id;

    public Student() {
    }

    public Student(String name, String last_name, String language, int cityId) {
        this.name = name;
        this.last_name = last_name;
        this.language = language;
        this.city_id = cityId;
    }

    public Student(int id, String name, String last_name, String language, int cityId) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.language = language;
        this.city_id = cityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getCity_id(int cityId) {
        return cityId;
    }

    public void setCity_id(int cityId) {
        this.city_id = cityId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id " + id +
                ", name '" + name + '\'' +
                ", last_name '" + last_name + '\'' +
                ", language '" + language + '\'' +
                ", city_ID '" + city_id + '\'' +
                '}';
    }
}
