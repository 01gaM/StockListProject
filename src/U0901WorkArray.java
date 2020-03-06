public class U0901WorkArray<T extends Number> {
    private T[] arrNums;

    public U0901WorkArray(T[] numP) {
        arrNums = numP; //присваивается ссылка входного параметра
    }

    public double sum() {
        double doubleWork = 0;
        for (T element : arrNums) {
            doubleWork += element.doubleValue();
        }
        return doubleWork;
    }

}
