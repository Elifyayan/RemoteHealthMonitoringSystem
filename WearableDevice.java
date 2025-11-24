public class WearableDevice {
    private String deviceId;
    private Patient patient;
    
    public WearableDevice(String deviceId, Patient patient) {
        this.deviceId = deviceId;
        this.patient = patient;
    }
    
    public VitalSignRecord collectVitalSigns() {
        System.out.println("Device " + deviceId + " collecting data from " + patient.getName());
        
        double heartRate = 65 + Math.random() * 40;
        double bloodPressure = 95 + Math.random() * 35;
        double temperature = 36.2 + Math.random() * 2.0;
        
        return new VitalSignRecord(heartRate, bloodPressure, temperature);
    }
}