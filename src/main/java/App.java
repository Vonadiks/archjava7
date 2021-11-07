public class App {
    public static void main(String[] args) {
        Course model = retriveCourseFromDatabase();
        CourseView view = new CourseView();
        CourseController controller = new CourseController(model, view);
        controller.updateView();
        System.out.println("----------------------------------------");
        controller.setCourseName("Python");
        controller.setCourseId(2);
        System.out.println("Change id and name of course after update");
        System.out.println("----------------------------------------");
        controller.updateView();
    }
    public static Course retriveCourseFromDatabase() {
        Course course = new Course();
        course.setId(1);
        course.setName("Java");
        course.setCategory("Programming");
        return course;
    }
}
