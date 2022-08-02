
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.testng.annotations.Test;

@Component
public class AsyncComponent {

    @Async
    public static void asyncMethodWithVoidReturnType() {
        System.out.println("Execute method asynchronously. " + Thread.currentThread().getName());
    }

    @Test
    public void testAsyncAnnotationForMethodsWithVoidReturnType() {
        System.out.println("Start - invoking an asynchronous method. " + Thread.currentThread().getName());
        asyncMethodWithVoidReturnType();
        System.out.println("End - invoking an asynchronous method. ");
    }

}
