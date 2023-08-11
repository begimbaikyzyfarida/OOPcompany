public class Group {
    private String groupName;
    private String startDate;
    private String mentor;
    private String person;
    public Group(String groupName, String startDate, String mentor,String person ) {
        this.groupName = groupName;
        this.startDate = startDate;
        this.mentor = mentor;
        this.person = person;
    }

    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", startDate='" + startDate + '\'' +
                ", mentor='" + mentor + '\'' +
                '}';
    }

}
