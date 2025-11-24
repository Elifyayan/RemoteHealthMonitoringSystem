public class Main {
    public static void main(String[] args) {
        System.out.println("=== REMOTE HEALTH MONITORING SYSTEM ===\n");
        
        // Basit test
        Patient patient = new Patient("PAT001", "Mehmet Kaya", 62, "Hypertension");
        Doctor doctor = new Doctor("DOC001", "Ahmet Yıldız", "Cardiology");
        WearableDevice device = new WearableDevice("DEV001", patient);
        MonitoringService service = new MonitoringService();
        
        // Test işlemi
        VitalSignRecord vitalSigns = device.collectVitalSigns();
        Alert alert = service.checkVitalSigns(patient, vitalSigns);
        
        if (alert != null) {
            alert.sendAlert();
        } else {
            System.out.println("Vital signs normal for " + patient.getName());
        }
        
        System.out.println("\n=== SYSTEM TEST COMPLETED ===");
    }
}