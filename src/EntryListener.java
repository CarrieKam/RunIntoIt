
import java.util.ArrayList;
import java.util.EventListener;

public interface EntryListener extends EventListener{
	// public void choisirFichier(Niveaux niveauCree);
		/**
		 * Methode servant a retourner dans la fenetre d'introduction
		 * 
		 * @param modeAccueil l'apparence en mode Accueil
		 */
		public void modePreview(boolean modePreview);
		public void setEntry(ArrayList<String>entryList);
		
}
