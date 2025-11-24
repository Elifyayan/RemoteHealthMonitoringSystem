/**
 * VitalSignRecord class represents patient's vital signs measurements
 */
public class VitalSignRecord {
    private double heartRate;
    private double bloodPressure;
    private double temperature;
    private String timestamp;
    
    public VitalSignRecord(double heartRate, double bloodPressure, double temperature) {
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.temperature = temperature;
        this.timestamp = java.time.LocalDateTime.now().toString();
    }
    
    public double getHeartRate() { return heartRate; }
    public double getBloodPressure() { return bloodPressure; }
    public double getTemperature() { return temperature; }
    public String getTimestamp() { return timestamp; }
    
    public boolean isNormal() {
        return (heartRate >= 60 && heartRate <= 100) &&
               (bloodPressure >= 90 && bloodPressure <= 120) &&
               (temperature >= 36.0 && temperature <= 37.5);
    }
    
    public void displayVitalSigns() {
        System.out.println("Vital Signs - Time: " + timestamp);
        System.out.println("Heart Rate: " + heartRate + " bpm");
        System.out.println("Blood Pressure: " + bloodPressure + " mmHg");
        System.out.println("Temperature: " + temperature + " °C");
        System.out.println("Status: " + (isNormal() ? "NORMAL" : "ABNORMAL"));
    }
}