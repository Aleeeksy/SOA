package wes;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import wes.FirstWebServiceServiceStub;
import wes.FirstWebServiceServiceStub.GetCurrency;
import wes.FirstWebServiceServiceStub.GetCurrencyE;
import wes.FirstWebServiceServiceStub.SellCurrency;
import wes.FirstWebServiceServiceStub.SellCurrencyE;
import wes.FirstWebServiceServiceStub.SellCurrencyResponse;
import wes.FirstWebServiceServiceStub.SellCurrencyResponseE;
import wes.FirstWebServiceServiceStub.GetCurrencyResponse;
import wes.FirstWebServiceServiceStub.GetCurrencyResponseE;

public class Test {

	public static void main(String[] args) {
		
		try {
			FirstWebServiceServiceStub stub = new FirstWebServiceServiceStub();
			GetCurrency currency = new GetCurrency();
			GetCurrencyE currencyE = new GetCurrencyE();
			currency.setArg0("USD");
			currencyE.setGetCurrency(currency);
			GetCurrencyResponseE resCurrency = stub.getCurrency(currencyE);
			System.out.println(resCurrency.getGetCurrencyResponse().get_return());
			currency.setArg0("EUR");
			currencyE.setGetCurrency(currency);
			resCurrency = (GetCurrencyResponseE) stub.getCurrency(currencyE);
			System.out.println(resCurrency.getGetCurrencyResponse().get_return());
			
			SellCurrency sellCurrency = new SellCurrency();
			SellCurrencyE sellCurrencyE = new SellCurrencyE();
			sellCurrency.setArg0("EUR");
			sellCurrency.setArg1(1000);
			sellCurrencyE.setSellCurrency(sellCurrency);
			SellCurrencyResponseE resSell = stub.sellCurrency(sellCurrencyE);
			System.out.println(resSell.getSellCurrencyResponse().get_return());
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
