package ie.atu.enrolmentsevice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
        private long enrollmentId;

        private long studentId;

        private String studentName;

        private String courseCode;

        private String enrolmentDate;


    }
