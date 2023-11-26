
package service;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversion", targetNamespace = "http://service/", className = "service.Conversion")
    @ResponseWrapper(localName = "conversionResponse", targetNamespace = "http://service/", className = "service.ConversionResponse")
    @Action(input = "http://service/BanqueService/conversionRequest", output = "http://service/BanqueService/conversionResponse")
    public double conversion(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @return
     *     returns java.util.List<service.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getComptes", targetNamespace = "http://service/", className = "service.GetComptes")
    @ResponseWrapper(localName = "getComptesResponse", targetNamespace = "http://service/", className = "service.GetComptesResponse")
    @Action(input = "http://service/BanqueService/getComptesRequest", output = "http://service/BanqueService/getComptesResponse")
    public List<Compte> getComptes();

}