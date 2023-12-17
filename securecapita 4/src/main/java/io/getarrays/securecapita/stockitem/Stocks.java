/**
 * kunal
 * SpringBootNamedParametreJdbcTemplate
 * com.org.kunal.parametrejdbc.stockitemnew
 */
package io.getarrays.securecapita.stockitem;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

/**
 * Kumar.Kunal
 * SpringBootNamedParameterJdbcTemplate
 * 2023
 */
@Data
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Stocks {

	@Id
	private int id;
	private String username;
    private String password;
    
    private String departmentRequesting;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING)
    private Date stockRequestDate;
    private Integer departmentCode;
    private String purposeOfIssue;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING)
    private Date stockDate;
    private Integer itemNo;
    private String itemReferenceNo;
    private String itemDescription;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING)
    private Date dateOfPreviousIssue;
    private Integer previousIssueQuantity;
    private Integer quantityRequested;
    private String departmentInitiatedBy;
    private String departmentAuthorisedBy;
    private String departmentConfirmedBy;
    private String departmentReceivedBy;
    private String designatedPersonApprovalName;
    private String signature;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING)
    private Date dateOfConfirmation;
    private String role;

	private List<StockRequest> stockRequests;
    private String lookupDepartmentCode(String department) {
        // Implement the logic to lookup the department code based on the requesting department
        // This could involve querying a database or using a predefined mapping
        // Return the appropriate department code
        // For example:
        if ("AUDIT".equals(department)) {
            return "AUD45";
        } else if ("Marketing".equals(department)) {
            return "MAR456";
        } else if ("PROCUREMENT".equals(department)) {
            return "PRO23";
        } else if ("TRANSPORT".equals(department)) {
            return "TRANS125";
        } else if ("administration".equals(department)) {
            return "ADMIN456";
        } else if ("finance".equals(department)) {
            return "FIN456";
        } else if ("accounts".equals(department)) {
            return "ACCO456";
        } else if ("Finance".equals(department)) {
            return "789";
        }
        // Handle other departments or return a default code if not found
        return "999";
    }

}
