public class Bridge implements BridgeInterface  {
  
  public String name;
  public Double lat;
  public Double lon;
  public Integer versionsNum;
  public BCVersion version;
  public String specificType;
  public Double length;
  public Integer height;
  public String startDate;
  public String endDate;
  public String fate;
  public Integer spans;
  public Character approachLoc;
  public String LAType;
  public Integer LASpans;
  public Double LALength;
  public Integer LAHeight;
  public String HAType;
  public Integer HASpans;
  public Double HALength;
  public Integer HAHeight;
  public Double width;
  public Character type;
  
  
  public Bridge() {
    
  }

    public Bridge(String x)
    {
	this.name = x;
	
    }

    public int compareTo(Bridge x )
    {
	if(this.name.equalsIgnoreCase( x.getName()))
	    return 0;
	else
	    return -1;
	
    }
    
  public void setName(String nameOf) {
    if (nameOf.isBlank()) {
      this.name = null;
    }
    this.name = nameOf;
  }
  
  public void setLat(String latitude) {
    if (latitude.isBlank()) {
      this.lat = null;
    }
    this.lat = Double.parseDouble(latitude);
  }
  
  public void setLon(String longitude) {
    if (longitude.isBlank()) {
      this.lon = null;
    }
    this.lon = Double.parseDouble(longitude);
  }
  
  public void setNumVersions(String number) {
    if (number.equals("Removed")) {
      this.versionsNum = 0;
    }
    else if (number.equals("Rebuilt")) {
      this.versionsNum = 1;
    }
  }
  
  public BCVersion setVersion(String version) {
    if (version.equals("Rebuilt")) {
      BCVersion newVersion = new BCVersion();
      return newVersion;
    }
    else {
      return null;
  }
  }
  
  public void setSpecificType(String type) {
    if (type.isBlank()) {
      this.specificType = null;
      return;
    }
    this.specificType = type;
  }
  
  public void setLength(String l) {
    if (l.isBlank()) {
      this.length = null;
      return;
    }
    this.length = Double.parseDouble(l);
  }
  
  public void setHeight(String h) {
    if (h.isBlank()) {
      this.height = null;
      return;
    }
    this.height = Integer.parseInt(h);
  }
  
  public void setStartDate(String sDate) {
    if (sDate.isBlank()) {
      this.startDate = null;
      return;
    }
    this.startDate = sDate;
  }
  
  public void setEndDate(String eDate) {
    if (eDate.isBlank()) {
      this.endDate = null;
      return;
    }
    this.endDate = eDate;
  }
  
  public void setFate(String f) {
    if (f.isBlank()) {
      this.fate = null;
      return;
    }
    this.fate = f;
  }
  
  public void setSpans(String s) {
    if (s.isBlank()) {
      this.spans = null;
      return;
    }
    this.spans = Integer.parseInt(s);
  }
  
  public void setApproach(Character a) {
    if (a == null) {
      this.approachLoc = null;
      return;
    }
    this.approachLoc = a;
  }
  
  public void setLAType(String LAT) {
    if (LAT.isBlank()) {
      this.LAType = null;
      return;
    }
    this.LAType = LAT;
  }
  
  public void setLASpans(String LAS) {
    if (LAS.isBlank()) {
      this.LASpans = null;
      return;
    }
    this.LASpans = Integer.parseInt(LAS);
  }
  
  public void setLALength(String LAL) {
    if (LAL.isBlank()) {
      this.LALength = null;
      return;
    }
    this.LALength = Double.parseDouble(LAL);
  }
  
  public void setLAHeight(String LAH) {
    if (LAH.isBlank()) {
      this.LAHeight = null;
      return;
    }
    this.LAHeight = Integer.parseInt(LAH);
  }
  
  public void setHAType(String t) {
    if (t.isBlank()) {
      this.HAType = null;
      return;
    }
    this.HAType = t;
  }
  
  public void setHASpans(String HAS) {
    if (HAS.isBlank()) {
      this.HASpans = null;
      return;
    }
    this.HASpans = Integer.parseInt(HAS);
  }
  
  public void setHAHeight(String HAH) {
    if (HAH.isBlank()) {
      this.HAHeight = null;
      return;
    }
    this.HAHeight = Integer.parseInt(HAH);
  }
  
  public void setHALength(String HAL) {
    if (HAL.isBlank()) {
      this.HALength = null;
      return;
    }
    this.HALength = Double.parseDouble(HAL);
  }
  
  public void setType(Character type) {
    if (type == null) {
      this.fate = null;
      return;
    }
    this.type = type;
  }
  
  @Override
  public int compareTo(BridgeInterface o) {
    if (this.name == o.getName()) {
      return 0;
    }
    else {
    return 1;
    }
  }

 
  public boolean isBridge() {
    if (this.type == 'B') {
      return true;
    }
    else {
      return false;
    }
  }
  
 
  public boolean isCulvert() {
    if (this.type == 'C') {
      return true;
    }
    else {
    return false;
    }
  }

  public Character getType() {
    return type;
  }
  @Override
  public String getName() {
    return name;
  }

  @Override
  public double getLat() {
    return lat;
  }

  @Override
  public double getLon() {
    return lon;
  }

  @Override
  public int getNumVersions() {
    return versionsNum;
  }

  @Override
  public BCVersionInterface getVersion(int index) {
    return version;
  }

  
  public String getSpecificType() {
    return specificType;
  }

 
  public double getLength() {
    return length;
  }

  
  public Integer getHeight() {
    return height;
  }

  
  public String getStartDate() {
    return startDate;
  }

  
  public String getEndDate() {
    return endDate;
  }

 
  public String getFate() {
    return fate;
  }


  public int getSpans() {
    return spans;
  }

 
  public char getApproachLoc() {
    return approachLoc;
  }

  
  public String getLAType() {
    return LAType;
  }

 
  public int getLASpans() {
    return LASpans;
  }

  
  public double getLALength() {
    return LALength;
  }

 
  public double getLAHeight() {
    return LAHeight;
  }

 
  public String getHAType() {
    return HAType;
  }

  
  public int getHASpans() {
    return HASpans;
  }

 
  public double getHALength() {
    return HALength;
  }

 
  public double getHAHeight() {
    return HAHeight;
  }

  
  public double getWidth() {
    return width;
  }

}
