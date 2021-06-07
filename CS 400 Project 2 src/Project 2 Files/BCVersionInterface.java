
public interface BCVersionInterface {
  /**
   * This method allows users to determine if this object is a bridge, and therefore has
   * BridgeVersionInterface methods available
   * 
   * @return true if the object is a bridge
   */
  public boolean isBridge();

  /**
   * This method allows users to determine if this object is a culvert, and therefore has
   * CulvertVersionInterface methods available
   * 
   * @return true if the object is a culvert
   */
  public boolean isCulvert();

  /**
   * An accessor method for the specific type of the bridge/culvert, in most cases the type
   * specified in valuation maps and grade profiles
   * 
   * @return a String representation of the bridge/culvert's construction type, or null if unknown
   */
  public String getSpecificType();
  /**
   * An accessor for the length of the bridge/culvert
   * @return a double representation of the length in feet, or -1 if unknown
   */
  public double getLength();
  /**
   * An accessor for the height of the bridge/culvert
   * @return a double representation of the height in feet, or -1 if unknown
   */
  public Integer getHeight();
  /**
   * An accessor method for the date when this bridge/culvert iteration was constructed
   * 
   * @return a String representation of the date, which may vary in specificity depending on the
   *         dataset
   */
  public String getStartDate();

  /**
   * An accessor method for the date when this bridge/culvert met its fate
   * 
   * @return a String representation of the date, which may vary in specificity depending on the
   *         dataset
   */
  public String getEndDate();

  /**
   * An accessor method for the fate of this bridge/culvert, such as being abandoned or rebuilt
   * @return a String representation of this bridge/culvert's fate
   */
  public String getFate();

}
