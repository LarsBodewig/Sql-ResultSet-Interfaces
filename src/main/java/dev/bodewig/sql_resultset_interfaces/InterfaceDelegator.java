package dev.bodewig.sql_resultset_interfaces;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Dynamic proxy delegating calls of a subset of {@code T}'s methods to an
 * instance of {@code T}
 * 
 * @param <T>
 *            the delegated type
 */
class InterfaceDelegator<T> implements InvocationHandler {

	@SuppressWarnings("unchecked")
	public static <V, T> V delegate(T target, Class<V> iface) {
		return (V) Proxy.newProxyInstance(InterfaceDelegator.class.getClassLoader(), new Class<?>[]{iface},
				new InterfaceDelegator<T>(target));
	}

	protected final T target;

	public InterfaceDelegator(T target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Method impl = target.getClass().getMethod(method.getName(), method.getParameterTypes());
		try {
			return impl.invoke(target, args);
		} catch (InvocationTargetException e) {
			throw e.getTargetException();
		}
	}
}
