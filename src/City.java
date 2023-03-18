import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class City {
    private String name;
    private Street street;

    public City() {}

    public City(String name, Street street) {
        this.name = name;
        this.street = street;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public Street getStreet() {
        return street;
    }

    @XmlElement
    public void setStreet(Street street) {
        this.street = street;
    }

    @XmlAttribute
    public void setSize(String size) {
        // do nothing, just to satisfy the requirement of having an attribute in City element
    }
}

class Street {
    private String name;
    private House[] houses;

    public Street() {}

    public Street(String name, House... houses) {
        this.name = name;
        this.houses = houses;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public House[] getHouses() {
        return houses;
    }

    @XmlElement(name = "house")
    public void setHouses(House[] houses) {
        this.houses = houses;
    }
}

class House {
    private String number;

    public House() {}

    public House(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @XmlElement
    public void setNumber(String number) {
        this.number = number;
    }
}
