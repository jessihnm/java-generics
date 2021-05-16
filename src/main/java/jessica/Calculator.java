package jessica;

public class Calculator<T> {

    public <T extends Integer> Integer sum(T x, T y) {
        return x.intValue()+y.intValue();
    }
    public <T extends Double> Double sum(T x, T y) {
        return x.doubleValue()+y.doubleValue();
    }
    public <T extends Float> Float sum(T x, T y) {
        return x.floatValue()+y.floatValue();
    }
}
