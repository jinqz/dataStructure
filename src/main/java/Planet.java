/**
 * Created by jinqiuzhi on 16/7/24.
 */
public enum Planet {
    MERCURY(3.1, 3.2);

    private final double mass;
    private final double radius;

    Planet(double mass, double radius){
        this.mass = mass;
        this.radius = radius;
    }

    public double mass(){ return mass; }
    public double radius(){ return radius; }
}
