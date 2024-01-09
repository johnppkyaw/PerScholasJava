class Company {
    private String organizationId;
    private String name;
    private String country;
    private String industry;
    private String numEmployees;

    private String salesRepId;

    public Company(String organizationId, String salesRepId, String name, String country, String industry, String numEmployees) {
        this.organizationId = organizationId;
        this.name = name;
        this.country = country;
        this.industry = industry;
        this.numEmployees = numEmployees;
        this.salesRepId = salesRepId;
    }
    String getOrganizationId() {
        return organizationId;
    }
    String getSalesRepId() {
        return salesRepId;
    }
    String getName() {
        return name;
    }
    String getCountry() {
        return country;
    }
    String getIndustry() {
        return industry;
    }
    String getNumEmployees() {
        return numEmployees;
    }

}