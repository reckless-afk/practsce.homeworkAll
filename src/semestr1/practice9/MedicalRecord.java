package semestr1.practice9;
import java.util.Arrays;

public class MedicalRecord {
    private final String patientId;
    private String fullName;
    private int bloodGroup;
    private boolean rhPositive;
    private String[] allergies;

    public MedicalRecord (String patientId,String fullName,int bloodGroup,boolean rhPositive,String[] allergies){
        this.patientId = patientId;
        this.fullName = fullName;

        if (bloodGroup >= 1 && bloodGroup <= 4) {
            this.bloodGroup = bloodGroup;
        } else {
            throw new IllegalArgumentException("Невідома група крові!");
        }

        this.rhPositive = rhPositive;

        if(allergies != null){
            this.allergies = allergies.clone();}
        else {
            this.allergies = new String[0];

        }
    }
    public String[] getAllergies() {
        return allergies.clone();
    }
public boolean hasAllergyTo(String substance) {
    for (String allergy : allergies) {
        if (allergy.equalsIgnoreCase(substance)) {
            return true;
        }
    }

    return false;
   }
    @Override
    public String toString() {

        String group;

        switch (bloodGroup) {
            case 1:
                group = "I (0)";
                break;
            case 2:
                group = "II (A)";
                break;
            case 3:
                group = "III (B)";
                break;
            case 4:
                group = "IV (AB)";
                break;
            default:
                group = "Unknown";
        }

        String rh = rhPositive ? "Rh+" : "Rh-";

        return "Patient ID: " + patientId
                + ", Name: " + fullName
                + ", Blood Group: " + group + " " + rh
                + ", Allergies: " + Arrays.toString(allergies);
    }
}

