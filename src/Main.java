import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(City.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        Street street = new Street("Main Street", new House("1"), new House("2"));
        City city = new City("Kyiv", street);

        marshaller.marshal(city, new File("city.xml"));
    }
}