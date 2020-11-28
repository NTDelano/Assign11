package delano;

/**
 * The Interface Observer. For all musicians working under the conductor, this is the adapter for communication
 */
public interface Observer {
	
	/**
	 * Update.
	 *
	 * @param sc the change in observers
	 */
	public void update(StateChange sc);
}
