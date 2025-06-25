import io.reactivex.rxjava3.core.Observable;

public class RxExample {
    public static void main(String[] args) {
        Observable<String> data = Observable.just("Hello", "Reactive", "World");
        data.subscribe(System.out::println);
    }
}