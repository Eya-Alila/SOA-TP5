package service;
//les importations nécessaires
import java.util.*;
import metier.Compte;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(name = "BanqueService")
public class BanqueService {
    @WebMethod(operationName = "conversion")
    public double conversion(@WebParam (name="montant") double montant)
    {
        return montant*10.6;
    }
    @WebMethod (operationName ="getComptes")
    public List<Compte> getComptes()
    {
        return List.of (
                new Compte(1111,7200.00,new Date()),
                new Compte(2222,5200.00,new Date()),
                new Compte(3333,1800.00,new Date()),
                new Compte(4444,3600.00,new Date()));
    }
}




