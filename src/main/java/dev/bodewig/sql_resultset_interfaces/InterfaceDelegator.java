package dev.bodewig.sql_resultset_interfaces;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class InterfaceDelegator<T> implements InvocationHandler {

	protected final T target;

	public InterfaceDelegator(T target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Method impl = target.getClass().getMethod(method.getName(), method.getParameterTypes());
		return impl.invoke(target, args);
	}

	@SuppressWarnings("unchecked")
	public static <V, T> V delegate(T target, Class<V> iface) {
		return (V) Proxy.newProxyInstance(InterfaceDelegator.class.getClassLoader(), new Class<?>[]{iface},
				new InterfaceDelegator<T>(target));
	}
}