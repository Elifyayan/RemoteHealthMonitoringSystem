public class Patient {
    private String patientId;
    private String name;
    private int age;
    private String chronicCondition;
    // Doctor referansını SONRA ekleyeceğiz
    
    public Patient(String patientId, String name, int age, String chronicCondition) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.chronicCondition = chronicCondition;
    }
    
    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getChronicCondition() { return chronicCondition; }
}