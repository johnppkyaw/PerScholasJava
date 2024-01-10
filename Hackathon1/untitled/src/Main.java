import java.io.*;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Company> companyList = new ArrayList<>();
        final String COMPANY_FILE = "Company.csv";
        BufferedReader companyReader = new BufferedReader(new FileReader(COMPANY_FILE));
        // Skip header lines
        companyReader.readLine(); // Skip Companies header

        // Read Sales Reps data
        String companyLine;
        while ((companyLine = companyReader.readLine()) != null) {
            String[] companyData = companyLine.split(",");
            //last Name of salesRep;
            //display organizationId, name, country, industry, numberofemployees;
            String organizationId = companyData[1];
            String salesRepId = companyData[2];
            String website = companyData[4]; //"http:..." or " Ri..."
            String name, country, industry, numEmployees, SalesRepId;
            if(!String.valueOf(website.charAt(0)).equals("h")) {
                name = companyData[3] + companyData[4];
                country = companyData[6];
                industry = companyData[9];
                numEmployees = companyData[10];
            } else {
                name = companyData[3];
                country = companyData[5];
                industry = companyData[8];
                numEmployees = companyData[9];
            }
            //String organizationId, String salesRepId, String name, String country, String industry, String numEmployees
            Company currCompany = new Company(organizationId, salesRepId, name, country, industry, numEmployees);
            companyList.add(currCompany);

        }
        ArrayList<SalesRep> salesRepList = getSalesReps();

        //ask for last name;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sale person's last name: ");
        String lastName = input.next();
        input.close();

        //get repId based on the input
        String repIdOfInput = "";
        for(SalesRep salesRep : salesRepList) {
            String currSalesRepLastName = salesRep.getLastName();
            if(currSalesRepLastName.equals(lastName)) {
                repIdOfInput = salesRep.getUserId();
                break;
            }
        }

        //result company List
        ArrayList<Company> resultList = new ArrayList<>();

        //find company based on salesRepId in companyData;
        for(Company company: companyList) {
            String currRepId = company.getSalesRepId();
            if(repIdOfInput.equals(currRepId)) {
                resultList.add(company);
            }
        }

        //Print company's detail if available
        if(resultList.isEmpty()) {
            System.out.println("Sales Rep not found.");
        } else {
            for (Company company : resultList) {
                //display organizationId, name, country, industry, numberofemployees;
                System.out.println(company.getOrganizationId() + " | " + company.getName() + " | " + company.getCountry() + " | " + company.getIndustry() + " | " + company.getNumEmployees());
            }
        }

    }

    private static ArrayList<SalesRep> getSalesReps() {
        //Map<String, String> salesToCompanyMap = new HashMap<>();
        ArrayList<SalesRep> salesRepList = new ArrayList<>();
        final String SALES_REPS_FILE = "SalesReps.csv";
        try {
            BufferedReader salesReader = new BufferedReader(new FileReader(SALES_REPS_FILE));
            // Skip header lines
            salesReader.readLine(); // Skip Sales Reps header
            // Read Sales Reps data
            String salesLine;
            while ((salesLine = salesReader.readLine()) != null) {
                String[] salesData = salesLine.split(",");
                //last Name of salesRep;
                String userId = salesData[0];
                String firstName = salesData[1];
                String lastName = salesData[2];
                String email = salesData[3];
                String phone =  salesData[4];
                String dateOfBirth = salesData[5];
//                (String id, String first, String last, String email, String phone, String dateOfBirth)
                SalesRep currRep = new SalesRep(userId, firstName, lastName, email, phone, dateOfBirth);
                salesRepList.add(currRep);
//                salesToCompanyMap.put(lastName, userId);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return salesRepList;
    }
}