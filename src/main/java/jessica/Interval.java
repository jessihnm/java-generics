package jessica;

import java.util.Date;

public class Interval<T> {
    private T lowerBound = null;
    private T upperBound = null;
    public Interval(T lowerBound, T upperBound) {
        this.lowerBound=lowerBound;
        this.upperBound=upperBound;
    }
    //checks if the interval is empty (e.g.
    // because the upper boundary is smaller than the lower one)

    public <T extends Comparable> Boolean isEmpty() {
        Comparable lb = (Comparable) lowerBound;
        Comparable ub = (Comparable) upperBound;

        return ub.compareTo(lb) < 0;
    }
    public <T extends Comparable> Boolean contains(T value) {
        Comparable lb = (Comparable) lowerBound;
        Comparable ub = (Comparable) upperBound;

        Boolean greaterThanLowerBound = lb.compareTo(value) < 0;
        Boolean lowerThanUpperBound = ub.compareTo(value) > 0;

        return greaterThanLowerBound && lowerThanUpperBound;
    }
//checks if value is contained in the interval,
// i.e. if value is greater than the lower limit of
// the interval and less than the upper limit.

}

