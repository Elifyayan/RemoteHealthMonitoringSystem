public class MonitoringService {
    public Alert checkVitalSigns(Patient patient, VitalSignRecord vitalSigns) {
        if (!vitalSigns.isNormal()) {
            String message = "Abnormal vital signs for " + patient.getName() + 
                           " - HR: " + vitalSigns.getHeartRate() + 
                           ", BP: " + vitalSigns.getBloodPressure();
            return new Alert(message);
        }
        return null;
    }
}