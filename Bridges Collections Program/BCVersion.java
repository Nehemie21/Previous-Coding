
public class BCVersion extends Bridge implements BCVersionInterface {

  public String specificType;
  public Double length;
  public Integer height;
  public String startDate;
  public String endDate;
  public String fate;
  
  public BCVersion() {
    this.specificType = super.specificType;
    this.length = super.length;
    this.height = super.height;
    this.startDate = super.startDate;
    this.endDate = super.endDate;
    this.fate = super.fate;
  }
  @Override
  public boolean isBridge() {
    if (super.type == 'B') {
      return true;
    }
    else {
      return false;
    }
  }

  @Override
  public boolean isCulvert() {
    if (super.type == 'C') {
      return true;
    }
    else {
      return false;
    }
  }

  @Override
  public String getSpecificType() {
    return specificType;
  }

  @Override
  public double getLength() {
    return length;
  }

  @Override
  public Integer getHeight() {
    return height;
  }

  @Override
  public String getStartDate() {
    return startDate;
  }

  @Override
  public String getEndDate() {
    return endDate;
  }

  @Override
  public String getFate() {
    return fate;
  }

}
