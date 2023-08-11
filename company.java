import java.util.Arrays;
public class company {
    private String companyName;
    private String country;
    private String yearOfFoundation;
    private String founder;
    private Group [] groups;
    String person;
    public company(String companyName, String country, String yearOfFoundation, String founder, Group[] groups,String person) {
        this.companyName = companyName;
        this.country = country;
        this.yearOfFoundation = yearOfFoundation;
        this.founder = founder;
        this.groups = groups;
        this.person=person;
    }
    @Override
    public String toString() {
        return "company{" +
                "companyName='" + companyName + '\'' +
                ", country='" + country + '\'' +
                ", yearOfFoundation='" + yearOfFoundation + '\'' +
                ", founder='" + founder + '\'' +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
