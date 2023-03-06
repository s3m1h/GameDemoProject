package business.adapters;

import business.abstracts.GamerCheckService;
import entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{
	//https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?WSDL
	@Override
	public boolean checkIfRealGamer(Gamer gamer) throws Exception {
		KPSPublicSoapProxy mernis = new KPSPublicSoapProxy();
		return mernis.TCKimlikNoDogrula(
				Long.parseLong(gamer.getTcKimlikNo()),
				gamer.getIsim().toUpperCase(),
				gamer.getSoyisim().toUpperCase(),
				Integer.parseInt(gamer.getDogumYili())
				
				);
	}

}
