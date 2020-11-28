package delano;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class MusicConductor. The leader of the group of musicians
 */
public class MusicConductor implements Subject{

	/** The observers. */
	private List<Observer> observers = new ArrayList<>();
	
	/**
	 * Attach. Grabs an observer from one of the instrument groups and adds them to the group of observers
	 *
	 * @param o the musician
	 */
	public void attach(Observer o) {
		observers.add(o);
	}
	
	/**
	 * Detach. Grabs an observer from one of the instrument groups and removes them from the group of observers
	 *
	 * @param o the musician
	 */
	public void detach(Observer o) {
		observers.remove(o);
	}
	
	/**
	 * Notify update. Update the full group of muscians under the conductor
	 *
	 * @param sc the change in condition of the observers
	 */
	public void notifyUpdate(StateChange sc) {
		for(Observer o: observers) {
			o.update(sc);
		}
	}
}
