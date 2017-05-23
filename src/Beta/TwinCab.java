package Beta;

/**
 * Created by ronald on 17/11/16.
 */
public class TwinCab<T, V> {
    T CabOne;
    V CabTwo;

    public TwinCab(T cabOne, V cabTwo) {
        CabOne = cabOne;
        CabTwo = cabTwo;
    }

    public void setCabOne(T cabOne) {
        CabOne = cabOne;
    }

    public void setCabTwo(V cabTwo) {
        CabTwo = cabTwo;
    }

    public static void main(String[] args) {
        TwinCab<Integer, String> NY = new TwinCab<>(2500, "New York Cab");
        NY.showCabs();
        System.out.println(NY.getCabOne());
        System.out.println((String)NY.getCabTwo()); // this is the advantage of generics = you don't need to cast!!
    }

    void showCabs() {
        setCabOne((T) "lll");
        //System.out.println(CabOne.getClass().getName());
        setCabTwo((V) "kkk");
        //System.out.println(CabTwo.getClass().getName());
    }

    T getCabOne() {
        return CabOne;
    }

    V getCabTwo() {
        return CabTwo;
    }
}
