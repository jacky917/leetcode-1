package proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class proxyFactory {

    public static Object takesTimeProxy(Object obj) {
        takesTimeHandler takesTimeHandler = new takesTimeHandler(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), takesTimeHandler);
    }
}

class takesTimeHandler implements InvocationHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(proxyFactory.class);

    // 被代理類
    private final Object obj;

    public takesTimeHandler(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        Object invoke = method.invoke(obj, args);
        LOGGER.info("{} takes {} ms",method.getName(), System.currentTimeMillis() - start);
        return invoke;
    }
}