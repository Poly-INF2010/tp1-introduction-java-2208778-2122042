package Letter;

import Point.Point2d;
import Shape.*;
import org.w3c.dom.css.Rect;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        Rectangle leftBar = new Rectangle(stripeThickness, maxHeight);
        leftBar.rotate(leftBar.getCoords(), 0.3);
        leftBar.translate(leftBar.getCoords(), new Point2d(-halfMaxWidth + halfStripeThickness, 0.0));

        Rectangle rightBar = new Rectangle(stripeThickness, maxHeight);
        rightBar.rotate(rightBar.getCoords(),-0.3);
        rightBar.translate(rightBar.getCoords(), new Point2d(halfMaxWidth - halfStripeThickness, 0.0));

        Rectangle midBar = new Rectangle(halfMaxWidth, stripeThickness);
        midBar.translate(midBar.getCoords(), new Point2d(0.0,halfStripeThickness));

        BaseShape letterA = new BaseShape();
        letterA.add(leftBar);
        letterA.add(rightBar);
        letterA.add(midBar);
        return letterA;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        Rectangle leftBar = new Rectangle(stripeThickness, maxHeight);

        Circle topEllipse = new Circle(halfMaxHeight);
        topEllipse.translate(topEllipse.getCoords(), new Point2d(halfMaxWidth, (-halfMaxHeight+2*stripeThickness)));

        Circle bottomEllipse = new Circle(halfMaxHeight);
        bottomEllipse.translate(bottomEllipse.getCoords(), new Point2d(halfMaxWidth, halfMaxHeight - 2*stripeThickness));

        Circle topRemoveEllipse = new Circle(halfMaxHeight - stripeThickness);
        topRemoveEllipse.translate(topRemoveEllipse.getCoords(), new Point2d(halfMaxWidth, (-halfMaxHeight+2*stripeThickness)));

        Circle bottomRemoveEllipse = new Circle(halfMaxHeight - stripeThickness);
        bottomRemoveEllipse.translate(bottomRemoveEllipse.getCoords(), new Point2d(halfMaxWidth, halfMaxHeight-2*stripeThickness));

        BaseShape letterB = new BaseShape();
        letterB.add(leftBar);
        letterB.add(topEllipse);
        letterB.add(bottomEllipse);
        letterB.remove(topRemoveEllipse);
        letterB.remove(bottomRemoveEllipse);
        return letterB;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        Ellipse mainEllipse = new Ellipse(maxWidth, maxHeight);

        Ellipse removeEllipse = new Ellipse(maxWidth - stripeThickness, maxHeight- stripeThickness);

        Rectangle removeRectangle = new Rectangle(halfMaxWidth, halfMaxHeight);
        removeRectangle.translate(removeRectangle.getCoords(), new Point2d(halfMaxWidth, 0.0));

        BaseShape letterC = new BaseShape();
        letterC.add(mainEllipse);
        letterC.remove(removeEllipse);
        letterC.remove(removeRectangle);
        return letterC;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        Rectangle leftBar = new Rectangle(stripeThickness, maxHeight);
        leftBar.translate(leftBar.getCoords(), new Point2d(-halfMaxWidth, 0.0));

        Rectangle topBar = new Rectangle(maxWidth, stripeThickness);
        topBar.translate(topBar.getCoords(), new Point2d(0.0, -halfMaxHeight + halfStripeThickness));

        Rectangle midBar = new Rectangle(maxWidth, stripeThickness);

        Rectangle bottomBar = new Rectangle(maxWidth, stripeThickness);
        bottomBar.translate(bottomBar.getCoords(), new Point2d(0.0, halfMaxHeight - halfStripeThickness));

        BaseShape letterE = new BaseShape();
        letterE.add(topBar);
        letterE.add(leftBar);
        letterE.add(midBar);
        letterE.add(bottomBar);
        return letterE;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        Rectangle leftBar = new Rectangle(stripeThickness, maxHeight);
        leftBar.translate(leftBar.getCoords(), new Point2d(-halfMaxWidth, 0.0));

        Rectangle midBar = new Rectangle(maxWidth, stripeThickness);

        Rectangle rightBar = new Rectangle(stripeThickness, maxHeight);
        leftBar.translate(rightBar.getCoords(), new Point2d(halfMaxWidth, 0.0));

        BaseShape letterH = new BaseShape();
        letterH.add(leftBar);
        letterH.add(midBar);
        letterH.add(rightBar);
        return letterH;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        Rectangle leftBar = new Rectangle(stripeThickness, maxHeight);
        leftBar.translate(leftBar.getCoords(), new Point2d(-halfMaxWidth, 0.0));

        Rectangle midBar = new Rectangle(stripeThickness, maxHeight);
        leftBar.rotate(midBar.getCoords(), -0.3);

        Rectangle rightBar = new Rectangle(stripeThickness, maxHeight);
        leftBar.translate(rightBar.getCoords(), new Point2d(halfMaxWidth, 0.0));

        BaseShape letterN = new BaseShape();
        letterN.add(leftBar);
        letterN.add(midBar);
        letterN.add(rightBar);
        return letterN;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Ellipse mainEllipse = new Ellipse(maxWidth, maxHeight);

        Ellipse removeEllipse = new Ellipse(maxWidth - stripeThickness, maxHeight- stripeThickness);

        BaseShape letterO = new BaseShape();
        letterO.add(mainEllipse);
        letterO.remove(removeEllipse);
        return letterO;
    }
}
