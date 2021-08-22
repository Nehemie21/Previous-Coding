import java.util.List;

public interface BuildingInterface {
    /**
     * Returns the name of the building
     * 
     * @return the name of the BuildingInterface Object
     */
    public String getName();
    
    /**
     * Returns the multiple specifier codes of the building
     * 
     * @returns the specifier types that apply to this specific BuildingInterface Object
     */
    public String getTypes();
    
    /**
     * Returns the latitude of the building or path
     * 
     * @return the latitude of this BuildingInterface Object
     */
    public double getLat();
    
    /**
     * Returns the longitude of the building or path
     * 
     * @return the longitude of this BuildingInterface Object
     */
    public double getLon();
    
    /**
     * Returns a list of BuildingInterface's that are connected to this node
     * 
     * @return a List of BuildingInterfaces that are connected to this BuildingInterface
     */
    public List<BuildingInterface> getConnectedNodes();
    
    /**
     * Checks whether two BuildingInterface Objects represent the same building
     * 
     * @param o the BuildingInterface to check
     * @return true if the name, latitude, and longitude of the nodes are equal; false otherwise
     */
    @Override
    public boolean equals(Object o);
}