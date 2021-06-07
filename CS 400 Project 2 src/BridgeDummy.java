// --== CS400 File Header Information ==--
// Name: Stefan Caldararu
// Email: scaldararu@wisc.edu
// Team: CC
// Role: Frontend developer
// TA: Xi Chen
// Lecturer: Gary Dahl
// Notes to Grader:

public class BridgeDummy implements BridgeInterface{
    private String name;
    private double lat;
    private double lon;
    private int numVersions;
    public BridgeDummy (String n, double la, double lo, int nv) {
	name = n;
	lat = la;
	lon = lo;
	numVersions = nv;
    }
    public String getName() {
	return name;
    }


    public double getLat() {
	return lat;
    }


    public double getLon() {
	return lon;
    }

    public int getNumVersions() {
	return numVersions;
    }

    public BCVersionInterface getVersion(int index){

	return null;
    }

    
    public int compareTo(BridgeInterface x)
    {
	if(this.name.equalsIgnoreCase( x.getName()))
	    return 0;
	else
	    return -1;
	
    }
}
