package dp.structural.adapter;

/**
 * SquareToRoundPegAdapter
 *
 * @author Florian Popa <florian@webgenerals.com>
 */
public class SquareToRoundPegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquareToRoundPegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;

        result = (Math.sqrt(Math.pow(peg.getWidth() / 2, 2)) * 2);

        return result;
    }
}
