package Shape;

import Point.Point2d;

import java.awt.*;
import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        int nbPointsX = (int) (widthDiameter * 2.0);
        int nbPointsY = (int) (heightDiameter * 2.0);

        for (int i = 0; i < nbPointsX; i++) {
            for (int j = 0; j < nbPointsY; j++) {
                double x = -(widthDiameter / 2.0) + i * 0.5;
                double y = (heightDiameter / 2.0) - j * 0.5;
                if ((x*x) / (widthDiameter*widthDiameter/4) + (y * y) / (heightDiameter*heightDiameter/4) <= 1) {
                    this.add(new Point2d(x, y));
                }
            }
        }
    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        for(Point2d point2d: coords){
            this.add(point2d);
        }
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(this.cloneCoords());
    }
}
