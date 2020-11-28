package delano;

/**
 * The Interface Subject. For changes of the group of musicians
 */
public interface Subject {
	
	/**
	 * Attach a new musician
	 *
	 * @param o the o
	 */
	public void attach(Observer o);
	
	/**
	 * Detach a musician
	 *
	 * @param o the o
	 */
	public void detach(Observer o);
	
	/**
	 * Notify update.
	 *
	 * @param m the m
	 */
	public void notifyUpdate(StateChange m);
}
