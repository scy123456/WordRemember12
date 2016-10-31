package wordremember.hxx.com.wordremember.model;

/**
 * Created by Administrator on 2016/10/27.
 * 记录用户的姓名，性别，手机，密码等
 */

public class Accout {

    /** 表名 */
    public static final String TABLE_NAME = "account_table";
    /** 英文单词名称 */
    public static final String NAME = "name";
    public static final String PHOTO = "photo";
    public static final String GENDER = "gender";
    public static final String PHONENUMBER = "phonenumber";
    public static final String PWD = "pwd";
    public static final String LOCATION = "location";
    public static final String SCHOOL = "school";
    public static final String GRADE = "grade";
    public static final String CLASSNAME = "classname";
    public static final String BIRTHDAY = "birthday";
//    public static final String ISLOGIN = "is_login";

    private String name;
    private String photo;
    //性别：男0，女1
    private int gender;
    private int phoneNumber;
    private String pwd;
    private String location;
    private String school;
    //年级
    private String grade;
    //几班
    private String className;
    private String birthday;


    public Accout(String name, String pwd, int phoneNumber, int gender, String photo, String location,String school, String grade, String className, String birthday) {
        this.location = location;
        this.pwd = pwd;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.photo = photo;
        this.name = name;
        this.grade = grade;
        this.className = className;
        this.birthday = birthday;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
