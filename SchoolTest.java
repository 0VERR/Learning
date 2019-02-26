public class SchoolTest {
    public static void main(String[] args) throws NoMoreSpaceException {
        School school = new School(3);
        try {
            school.add(new Student(1, "Bart", "Dzban"));
            school.add(new Student(2, "Oksi", "Pajac"));
            school.add(new Student(3,"Mr_Swat", "Rzucane_tnt"));
            school.add(new Student(4, "Endek100", "Idiota"));
        }
        catch (NoMoreSpaceException ex){
            System.err.println("Nie dodasz studenta! Szkola dla debili jest pelna!");

        }

        try {
            System.out.println(school.find("Bart", "Dzban"));
            System.out.println(school.find("Easy", "Peasy"));
        } catch (NoElementFoundException e) {
            System.err.println("Nie znaleziono studenta" );
            System.err.println(e.getMessage());
        }
    }
}

