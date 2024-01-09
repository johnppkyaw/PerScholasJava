import java.io.*;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    final static String SALES_REPS_FILE = "/Users/johnppkyaw/Downloads/SalesReps.csv";
    final static String COMPANY_FILE = "/Users/johnppkyaw/Downloads/Company.csv";

    public static void main(String[] args) throws IOException {
        ArrayList<Company> companyList = new ArrayList<>();
//        try {
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
                String website = companyData[4];
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
            //System.out.println(companyList);

            //get salesRep List<lastname, repId>
            Map<String, String> salesRep = readSalesRepsAndCompanies();

            //ask for last name;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the sale person's last name: ");
            String lastName = input.next();
            input.close();
            //get repId based on the input
            String repIdOfInput = salesRep.get(lastName);

            //result company List
            ArrayList<Company> resultList = new ArrayList<>();

            //find company based on salesRepId in companyData;
            for(Company company: companyList) {
                String currRepId = company.getSalesRepId();
                if(repIdOfInput.equals(currRepId)) {
                    resultList.add(company);
                }
            }
            for(Company company: resultList) {
                //display organizationId, name, country, industry, numberofemployees;
                System.out.println(company.getOrganizationId() + " " + company.getName() + " " + company.getCountry() + " " + company.getIndustry() + " " + company.getNumEmployees());
            }
//        } catch(Exception e) {
//            System.out.println(e.getMessage());
//        }
    }

    private static Map<String, String> readSalesRepsAndCompanies() {
        Map<String, String> salesToCompanyMap = new HashMap<>();

        try {
            BufferedReader salesReader = new BufferedReader(new FileReader(SALES_REPS_FILE));

            // Skip header lines
            salesReader.readLine(); // Skip Sales Reps header


            // Read Sales Reps data
            String salesLine;
            while ((salesLine = salesReader.readLine()) != null) {
                String[] salesData = salesLine.split(",");

                //last Name of salesRep;
                String userId = salesData[0].trim();
                String lastName = salesData[2].trim();
                salesToCompanyMap.put(lastName, userId);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return salesToCompanyMap;
    }
}