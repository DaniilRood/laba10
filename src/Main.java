import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            // 1. Создаем университет
            University university = new University("Воронежский Государственный Университет");
            System.out.println("=== Создание университетской системы ===");
            System.out.println(university);

            // 2. Создаем факультет
            Faculty fkn = new Faculty("Факультет компьютерных наук");
            university.addFaculty(fkn);
            System.out.println("\n=== Создание факультета ===");
            System.out.println(fkn);

            // 3. Создаем сотрудников
            Employee dean = new Employee("123-45-6789", "Петров А.В.", "petrov@vsu.ru");
            AdministrativePersonal admin = new AdministrativePersonal("234-56-7890", "Сидорова И.И.", "sidorova@vsu.ru", "Учебный отдел");
            Research researcher1 = new Research("345-67-8901", "Иванов С.П.", "ivanov@vsu.ru", "Искусственный интеллект");
            Lecturer lecturer1 = new Lecturer("456-78-9012", "Смирнова О.Л.", "smirnova@vsu.ru", "Базы данных");

            // Добавляем сотрудников в университет
            university.addEmployee(dean);
            university.addEmployee(admin);
            university.addEmployee(researcher1);
            university.addEmployee(lecturer1);

            // Назначаем декана
            fkn.setDean(dean);

            // 4. Создаем кафедры
            Institute progInstitute = new Institute("Кафедра программирования", "ул. Университетская, 1, ауд. 305");
            Institute aiInstitute = new Institute("Кафедра искусственного интеллекта", "ул. Университетская, 1, ауд. 410");

            // Добавляем кафедры на факультет
            fkn.addInstitute(progInstitute);
            fkn.addInstitute(aiInstitute);

            // 5. Прикрепляем научных сотрудников к кафедрам
            researcher1.assignToInstitute(aiInstitute);
            lecturer1.assignToInstitute(progInstitute);

            // 6. Создаем проекты
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            Date startDate1 = sdf.parse("01.09.2024");
            Date endDate1 = sdf.parse("31.05.2025");
            Project project1 = new Project("Разработка нейросети", startDate1, endDate1);

            Date startDate2 = sdf.parse("01.10.2024");
            Date endDate2 = sdf.parse("30.06.2025");
            Project project2 = new Project("Исследование алгоритмов", startDate2, endDate2);

            // 7. Назначаем сотрудников на проекты
            researcher1.joinProject(project1, 40);
            lecturer1.joinProject(project2, 20);

            // 8. Создаем курсы
            Course course1 = new Course("CS101", "Основы программирования", 6);
            Course course2 = new Course("CS201", "Базы данных", 4);

            // 9. Назначаем преподавателя на курсы
            lecturer1.assignCourse(course1);
            lecturer1.assignCourse(course2);

            // Вывод информации
            System.out.println("\n=== Итоговая информация ===");
            System.out.println("Всего сотрудников в университете: " + university.calculateTotalEmployees());

            System.out.println("\nФакультеты:");
            for (Faculty faculty : university.getFaculties()) {
                System.out.println("  " + faculty);
                System.out.println("  Кафедры на факультете:");
                for (Institute institute : faculty.getInstitutes()) {
                    System.out.println("    " + institute);
                    System.out.println("    Сотрудники кафедры:");
                    for (Research research : institute.getResearchEmployees()) {
                        System.out.println("      " + research);
                    }
                }
            }

            System.out.println("\nПроекты и участники:");
            System.out.println("  " + project1);
            for (ProjectParticipation pp : project1.getParticipations()) {
                System.out.println("    " + pp);
            }

            System.out.println("\n  " + project2);
            for (ProjectParticipation pp : project2.getParticipations()) {
                System.out.println("    " + pp);
            }

            System.out.println("\nКурсы и преподаватели:");
            System.out.println("  " + course1 + " | Преподаватель: " +
                    (course1.getLecturer() != null ? course1.getLecturer().getName() : "не назначен"));
            System.out.println("  " + course2 + " | Преподаватель: " +
                    (course2.getLecturer() != null ? course2.getLecturer().getName() : "не назначен"));

            System.out.println("\nПреподаватель " + lecturer1.getName() + " ведет курсы:");
            for (Course course : lecturer1.getCourses()) {
                System.out.println("  " + course);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}