package com.application;

import java.util.Date;
import java.util.List;

import com.application.model.Combattant;
import com.application.model.Gender;
import com.application.model.Match;
import com.application.model.Stade;
import com.application.service.ServiceCombattant;
import com.application.service.ServiceMatch;
import com.application.service.ServiceStade;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		ServiceStade serviceStade = new ServiceStade();
		Stade stade = new Stade();
		stade.setStadeID("002");
		stade.setDescription("Stade 2");
		stade.setNbPlace(100);
		// serviceStade.save(stade);
		System.out.println("Creation reussie");

		List<Stade> stades = serviceStade.findAllStades();
		if (stades != null && !stades.isEmpty()) {
			for (Stade s : stades) {
				System.out.println(s.getStadeID() + " - " + s.getDescription());
			}
		}

		ServiceCombattant serviceCombattant = new ServiceCombattant();
		ServiceMatch serviceMatch = new ServiceMatch();

		Match match = new Match();
		match.setMatchID("001");
		match.setDataMAtch(new Date());

		Combattant combattant = new Combattant();
		combattant.setGendre(Gender.M);
		combattant.setLastName("Issam drmas");
		combattant.setPersonID("P001");
		// serviceCombattant.save(combattant);

		Combattant combattant2 = new Combattant();
		combattant2.setGendre(Gender.M);
		combattant2.setLastName("Issam drmas");
		combattant2.setPersonID("P002");
		// serviceCombattant.save(combattant2);
		// System.out.println("Commbattant Crée avecc succès");

		Combattant combattantID = serviceCombattant.findCombattant(combattant.getPersonID());
		Combattant combattantID2 = serviceCombattant.findCombattant(combattant2.getPersonID());

		match.setCombattant1(combattantID);
		match.setCombattant2(combattantID2);
		// serviceMatch.save(match);
		// System.out.println("Match crée avec succès");

		Match match2 = new Match();
		List<Match> list = serviceMatch.findMatchs();
		if (list != null && !list.isEmpty()) {
			for (Match m : list) {
				System.out.println("ID MATCH : " + m.getMatchID() + " " + m.getDataMAtch() + " Combattant 1 :  "
						+ m.getCombattant1().getLastName() + " Combattant 2 : " + m.getCombattant2().getLastName());
			}
		}

	}

}
