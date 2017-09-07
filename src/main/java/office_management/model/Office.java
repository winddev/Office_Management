package office_management.model;

import javax.persistence.*;

@Entity
@Table(name = "offices")
public class Office {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "companyname")
    private String companyName;

    @Column(name = "companyadress")
    private String compamyAdress;

    @Column(name = "numberofemployers")
    private int numbersOfEmployers;

    public int getNumbersOfEmployers() {
        return numbersOfEmployers;
    }

    public void setNumbersOfEmployers(int numbersOfEmployers) {
        this.numbersOfEmployers = numbersOfEmployers;
    }

    public String getCompamyAdress() {
        return compamyAdress;
    }

    public void setCompamyAdress(String compamyAdress) {
        this.compamyAdress = compamyAdress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Office{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", compamyAdress='" + compamyAdress + '\'' +
                ", numbersOfEmployers=" + numbersOfEmployers +
                '}';
    }
}

