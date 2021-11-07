public class Course {
    private Integer courseId;
    private String courseName;
    private String courseCategory;

    public Integer getId() {
        return courseId;
    }

    public void setId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return courseName;
    }

    public void setName(String courseName) {
        this.courseName = courseName;
    }

    public String getCategory() {
        return courseCategory;
    }

    public void setCategory(String courseCategory) {
        this.courseCategory = courseCategory;
    }
}
