package j.i0.j;

import j.x;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public class d extends f {

    /* renamed from: c  reason: collision with root package name */
    public final Method f9502c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f9503d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f9504e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f9505f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f9506g;

    /* loaded from: classes2.dex */
    public static class a implements InvocationHandler {
        public final List<String> a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f9507b;

        /* renamed from: c  reason: collision with root package name */
        public String f9508c;

        public a(List<String> list) {
            this.a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = j.i0.c.f9269b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f9507b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.a;
            } else {
                if ((!name.equals("selectProtocol") && !name.equals("select")) || String.class != returnType || objArr.length != 1 || !(objArr[0] instanceof List)) {
                    if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
                        this.f9508c = (String) objArr[0];
                        return null;
                    }
                    return method.invoke(this, objArr);
                }
                List list = (List) objArr[0];
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.a.contains(list.get(i2))) {
                        String str = (String) list.get(i2);
                        this.f9508c = str;
                        return str;
                    }
                }
                String str2 = this.a.get(0);
                this.f9508c = str2;
                return str2;
            }
        }
    }

    public d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f9502c = method;
        this.f9503d = method2;
        this.f9504e = method3;
        this.f9505f = cls;
        this.f9506g = cls2;
    }

    @Override // j.i0.j.f
    public void a(SSLSocket sSLSocket) {
        try {
            this.f9504e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw j.i0.c.a("unable to remove alpn", e2);
        }
    }

    @Override // j.i0.j.f
    public void f(SSLSocket sSLSocket, String str, List<x> list) {
        try {
            this.f9502c.invoke(null, sSLSocket, Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{this.f9505f, this.f9506g}, new a(f.b(list))));
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw j.i0.c.a("unable to set alpn", e2);
        }
    }

    @Override // j.i0.j.f
    @Nullable
    public String i(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f9503d.invoke(null, sSLSocket));
            boolean z = aVar.f9507b;
            if (!z && aVar.f9508c == null) {
                f.a.l(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            } else if (z) {
                return null;
            } else {
                return aVar.f9508c;
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw j.i0.c.a("unable to get selected protocol", e2);
        }
    }
}
