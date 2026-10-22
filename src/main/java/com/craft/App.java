
package com.craft;
import jakarta.persistence.*;
import java.util.List;

public class App {

    // Factory created once for the whole application
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentPU");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // --- CRUD OPERATIONS ---

    public static void createStudent(Student student) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
    }

    public static Student getStudentById(int id) {
        EntityManager em = getEntityManager();
        Student student = em.find(Student.class, id);
        em.close();
        return student;
    }

    public static void updateStudentName(String newName, int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Student student = em.find(Student.class, id);
        if (student != null) {
            student.setName(newName);
        }
        em.getTransaction().commit();
        em.close();
    }

    public static void updateStudentNameAndTech(String newName, String newTech, int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Student student = em.find(Student.class, id);
        if (student != null) {
            student.setName(newName);
            student.setTech(newTech); // Fixed PDF typo here
        }
        em.getTransaction().commit();
        em.close();
    }

    public static void deleteStudentById(int id) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Student student = em.find(Student.class, id);
        if (student != null) {
            em.remove(student);
        }
        em.getTransaction().commit();
        em.close();
    }

    // --- JPQL SELECT QUERIES ---

    public static List<Student> getAllStudents() {
        EntityManager em = getEntityManager();
        TypedQuery<Student> query = em.createQuery("SELECT s FROM Student s", Student.class);
        List<Student> students = query.getResultList();
        em.close();
        return students;
    }

    public static List<Student> getStudentsByTech(String tech) {
        EntityManager em = getEntityManager();
        TypedQuery<Student> query = em.createQuery("SELECT s FROM Student s WHERE s.tech = :tech", Student.class);
        query.setParameter("tech", tech);
        List<Student> students = query.getResultList();
        em.close();
        return students;
    }

    public static List<Student> getStudentsByName(String name) {
        EntityManager em = getEntityManager();
        TypedQuery<Student> query = em.createQuery("SELECT s FROM Student s WHERE s.name = :name", Student.class);
        query.setParameter("name", name);
        List<Student> students = query.getResultList();
        em.close();
        return students;
    }

    public static List<Student> getStudentsByNameCaseInsensitive(String name) {
        EntityManager em = getEntityManager();
        TypedQuery<Student> query = em.createQuery("SELECT s FROM Student s WHERE LOWER(s.name) = LOWER(:name)", Student.class);
        query.setParameter("name", name);
        List<Student> students = query.getResultList();
        em.close();
        return students;
    }

    // --- PAGINATION & ORDERING ---

    public static List<Student> getFirstNStudents(int n) {
        EntityManager em = getEntityManager();
        TypedQuery<Student> query = em.createQuery("SELECT s FROM Student s ORDER BY s.id ASC", Student.class);
        query.setMaxResults(n);
        List<Student> students = query.getResultList();
        em.close();
        return students;
    }
    public static List<Student> getStudentsWithPagination(int offset, int limit) {
        EntityManager em = getEntityManager();
        TypedQuery<Student> query = em.createQuery("SELECT s FROM Student s ORDER BY s.id ASC", Student.class);
        query.setFirstResult(offset);
        query.setMaxResults(limit);
        List<Student> students = query.getResultList();
        em.close();
        return students;
    }

    // --- AGGREGATIONS & ADVANCED QUERIES ---

    public static long countAllStudents() {
        EntityManager em = getEntityManager();
        Query query = em.createQuery("SELECT COUNT(s) FROM Student s");
        long count = (long) query.getSingleResult();
        em.close();
        return count;
    }

    public static List<Object[]> countStudentsByTech() {
        EntityManager em = getEntityManager();
        Query query = em.createQuery("SELECT s.tech, COUNT(s) FROM Student s GROUP BY s.tech");
        List<Object[]> results = query.getResultList();
        em.close();
        return results;
    }

    public static List<String> getDistinctTechs() {
        EntityManager em = getEntityManager();
        TypedQuery<String> query = em.createQuery("SELECT DISTINCT s.tech FROM Student s", String.class);
        List<String> techs = query.getResultList();
        em.close();
        return techs;
    }

    public static double getAverageId() {
        EntityManager em = getEntityManager();
        Query query = em.createQuery("SELECT AVG(s.id) FROM Student s");
        double avg = (double) query.getSingleResult();
        em.close();
        return avg;
    }

    public static int getMaxId() {
        EntityManager em = getEntityManager();
        Query query = em.createQuery("SELECT MAX(s.id) FROM Student s");
        int maxId = (int) query.getSingleResult();
        em.close();
        return maxId;
    }

    public static List<Student> getStudentsWithLongestNames() {
        EntityManager em = getEntityManager();
        TypedQuery<Student> query = em.createQuery(
                "SELECT s FROM Student s WHERE LENGTH(s.name) = (SELECT MAX(LENGTH(s2.name)) FROM Student s2)", Student.class);
        List<Student> students = query.getResultList();
        em.close();
        return students;
    }

    public static List<Student> getStudentsByTechAndNamePattern(String tech, String pattern) {
        EntityManager em = getEntityManager();
        TypedQuery<Student> query = em.createQuery("SELECT s FROM Student s WHERE s.tech = :tech AND s.name LIKE :pattern", Student.class);
        query.setParameter("tech", tech);
        query.setParameter("pattern", "%" + pattern + "%");
        List<Student> students = query.getResultList();
        em.close();
        return students;
    }

    // --- BULK UPDATES & DELETES ---

    public static int updateStudentTech(int id, String newTech) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Query query = em.createQuery("UPDATE Student s SET s.tech = :newTech WHERE s.id = :id");
        query.setParameter("newTech", newTech);
        query.setParameter("id", id);
        int updatedCount = query.executeUpdate();
        tx.commit();
        em.close();
        return updatedCount;
    }

    public static int deleteStudentsByTech(String tech) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Query query = em.createQuery("DELETE FROM Student s WHERE s.tech = :tech");
        query.setParameter("tech", tech);
        int deletedCount = query.executeUpdate();
        tx.commit();
        em.close();
        return deletedCount;
    }


    // --- MAIN METHOD TO TEST EVERYTHING ---
    public static void main(String[] args) {
        System.out.println("--- 1. Creating Students ---");
        Student s1 = new Student();
        s1.setName("John Snow");
        s1.setTech("Java");
        createStudent(s1);
     Student s2 = new Student();
        s2.setName("Mohammed Ali");
        s2.setTech("Python");
        createStudent(s2);

        System.out.println("--- 2. Get All Students (JPQL) ---");
        List<Student> allStudents = getAllStudents();
        allStudents.forEach(System.out::println);

        System.out.println("--- 3. Update a Student ---");
        updateStudentNameAndTech("Alemayehu", "Java", 2);
        System.out.println("Updated ID 2: " + getStudentById(2));

        System.out.println("--- 4. Count All Students ---");
        System.out.println("Total students: " + countAllStudents());

        System.out.println("--- 5. Find Distinct Techs ---");
        System.out.println(getDistinctTechs());

        System.out.println("--- 6. Delete a Student ---");
        deleteStudentById(1);
        System.out.println("Remaining students after delete:");
        getAllStudents().forEach(System.out::println);

        // Close factory when done
        emf.close();
    }
}