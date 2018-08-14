package dp.structural.adapter;

/**
 * AdapterDemo
 *
 * @author Florian Popa <florian@webgenerals.com>
 */
public class AdapterDemo {

    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquareToRoundPegAdapter smallSqPegAdapter = new SquareToRoundPegAdapter(smallSqPeg);
        SquareToRoundPegAdapter largeSqPegAdapter = new SquareToRoundPegAdapter(largeSqPeg);

        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fist round hole r5.");
        }

        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }

}
