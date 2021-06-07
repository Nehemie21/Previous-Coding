
public interface BridgeInterface extends Comparable<BridgeInterface> {
  /**
   * An accessor for the name of the bridge
   * 
   * @return a String of the bridge's name
   */
  public String getName();

  /**
   * Gets the latitude of the bridge
   * 
   * @return a decimal representation of the bridge's latitude in degrees
   */
  public double getLat();

  /**
   * Gets the longitude of the bridge
   * 
   * @return a decimal representation of the bridge's longitude in degrees
   */
  public double getLon();

  /**
   * Gets the number of versions (such as rebuilds) of the bridge
   * 
   * @return an int representing how many versions of the bridge exist in the database
   */
  public int getNumVersions();

  /**
   * Gets the BCVersionInterface of a certain iteration of the bridge
   * 
   * @param index the version number of the bridge, starting at 0 for the earliest iteration of the
   *              bridge
   * @return the BCVersionInterface associated with the specified version of the bridge
   */
  public BCVersionInterface getVersion(int index);

}
