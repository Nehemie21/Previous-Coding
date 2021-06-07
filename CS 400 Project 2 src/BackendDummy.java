// --== CS400 File Header Information ==--
// Name: Stefan Caldararu
// Email: scaldararu@wisc.edu
// Team: CC
// Role: Frontend developer
// TA: Xi Chen
// Lecturer: Gary Dahl
// Notes to Grader:This is a very basic backend dummy, that has the bridge objects written in it.

import java.util.NoSuchElementException;
import java.lang.Math;

public class BackendDummy implements BackendInterface{
	

	
	
	public BridgeInterface bridge1 = new BridgeDummy("bridge1", 0.0, 0.0, 1);
	public BridgeInterface bridge2 = new BridgeDummy("bridge2", 1, 1, 2);
	public BridgeInterface bridge3 = new BridgeDummy("bridge3", 2, 2, 3);
	public BridgeInterface bridge4 = new BridgeDummy("bridge4", 3, 3, 4);
	public BridgeInterface bridge5 = new BridgeDummy("bridge5", 4, 4, 5);
	public String getRailroad() {
		return null;
	}

	
	  public String getRegion() {
		  return null;
	  }

	 
	  public int getNumBridges() {
		  return 5;
	  }

	 
	  public String getFormatHelp() {
		  return null;
	  }
	 
	  public BridgeInterface getNext(BridgeInterface current) {
		  if(current.getName().equals("bridge1")) {
			  return bridge2;
		  }
		  else if(current.getName().equals("bridge2")) {
			  return bridge3;
		  }
		  else if(current.getName().equals("bridge3")) {
			  return bridge4;
		  }
		  else if(current.getName().equals("bridge4")) {
			  return bridge5;
		  }
		  else {
			  return bridge5;
		  }
	  }
	  public BridgeInterface getPrevious(BridgeInterface current) {
		  if(current.getName().equals("bridge1")) {
			  return bridge1;
		  }
		  else if(current.getName().equals("bridge2")){
			  return bridge1;
		  }
		  else if(current.getName().equals("bridge3")) {
			  return bridge2;
		  }
		  else if(current.getName().equals("bridge4")) {
			  return bridge3;
		  }
		  else {
			  return bridge4;
		  }
	  }
	  public BridgeInterface getRoot() {
		  return bridge1;
	  }
		  
	  
	  
	  public BridgeInterface getBridge(String input)
	      throws IllegalArgumentException, NoSuchElementException{
		  if(input.equals("bridge1")) {
			  return bridge1;
		  }
		  if(input.equals("bridge2")) {
			  return bridge2;
		  }
		  if(input.equals("bridge3")) {
			  return bridge3;
		  }
		  if(input.equals("bridge4")) {
			  return bridge4;
		  }
		  if(input.equals("bridge5")) {
			  return bridge5;
		  }
		  else {
			  throw new IllegalArgumentException("");
			  
		  }
	  }
	  private double distance(double lat1, double lon1, double lat2, double lon2) {
		  
		  return Math.sqrt((lat2-lat1)*(lat2-lat1)+(lon2-lon1)*(lon2-lon1));
	  }
	  
	  public BridgeInterface getNearestBridge(double latitude, double longitude)
	      throws IllegalArgumentException{
			  BridgeInterface bestBridge = bridge1;
			  double bestDistance = distance(latitude, longitude, bridge1.getLat(), bridge1.getLon());
			  if(bestDistance>distance(latitude, longitude, bridge2.getLat(), bridge2.getLon())) {
					  bestDistance = distance(latitude, longitude, bridge2.getLat(), bridge2.getLon());
					  bestBridge = bridge2;
			  }
			  if(bestDistance>distance(latitude, longitude, bridge3.getLat(), bridge3.getLon())) {
				  bestDistance = distance(latitude, longitude, bridge3.getLat(), bridge3.getLon());
				  bestBridge = bridge3;
			  }
			  if(bestDistance>distance(latitude, longitude, bridge4.getLat(), bridge4.getLon())) {
				  bestDistance = distance(latitude, longitude, bridge4.getLat(), bridge4.getLon());
				  bestBridge = bridge4;
			  }
			  if(bestDistance>distance(latitude, longitude, bridge5.getLat(), bridge5.getLon())) {
				  bestDistance = distance(latitude, longitude, bridge5.getLat(), bridge5.getLon());
				  bestBridge = bridge5;
			  }
			  return bestBridge;
	  }
	  

	 
	  public double getDistance(double latitude, double longitude, BridgeInterface bridge) {
		  return distance(latitude, longitude, bridge.getLat(), bridge.getLon());
	  }
}
