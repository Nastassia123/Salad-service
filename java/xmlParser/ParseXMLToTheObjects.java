package xmlParser;



import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

 import Entities.Tomato;
 import Entities.Vegetable;
 import exceptions.AddVegetableWithInvalidCalories;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import Entities.Tomato;
import Entities.Vegetable;

    public class ParseXMLToTheObjects {

        Set<Vegetable> tomatoes;
        DocumentBuilder docBuilder;
        public ParseXMLToTheObjects()
        {
            this.tomatoes = new HashSet<Vegetable>();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            try {
                docBuilder = factory.newDocumentBuilder();
            }
            catch (ParserConfigurationException e) {
                System.err.println("Parser's configuration error " + e);
            }
        }

        public Set<Vegetable> getTomatoes() {
            return tomatoes;
        }

        public void buildSetVegetables(String fileName)
        {     Document doc = null;
            try {
                doc = docBuilder.parse(fileName);
                Element root = doc.getDocumentElement();
                NodeList vegetablesList = root.getElementsByTagName("vegetable");
                for (int i = 0; i < vegetablesList.getLength(); i++) {

                    Element vegetableElement = (Element) vegetablesList.item(i);
                    Tomato tomato = buildTomato(vegetableElement);
                    tomatoes.add(tomato);
                }
            }
            catch (IOException e) {
                System.err.println("File error or I/O error: " + e);
            }
            catch (SAXException e) {
                System.err.println("Parsing failure: " + e);
            }
            catch (AddVegetableWithInvalidCalories addVegetableWithInvalidCalories) {
                addVegetableWithInvalidCalories.printStackTrace();
            }
        }


        private Tomato buildTomato(Element vegetableElement) throws AddVegetableWithInvalidCalories {

            Tomato tomato = new Tomato();
            tomato.setName(getElementTextContent(vegetableElement, "name"));
            tomato.setCalories( Integer.parseInt(getElementTextContent(vegetableElement, "calories")));
            tomato.setWeight(Integer.parseInt(getElementTextContent(vegetableElement, "weight")));
            return tomato;
        }


        public static String getElementTextContent(Element element, String elementName) {
            NodeList nList = element.getElementsByTagName(elementName);
            Node node = nList.item(0);
            String text = node.getTextContent();
            return text;
        }
    }



