package adapters;

import java.rmi.RemoteException;

import business.abstracts.ICustomerCheckService;
import core.tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import entities.concretes.Customer;


public class MerniceServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean Check›fRealPerson(Customer customer) {
		
		boolean result=false;
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		try {
			result=kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	
	

}
