package j.i0.j;

import j.x;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: c  reason: collision with root package name */
    public final Method f9500c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f9501d;

    public c(Method method, Method method2) {
        this.f9500c = method;
        this.f9501d = method2;
    }

    @Override // j.i0.j.f
    public void f(SSLSocket sSLSocket, String str, List<x> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = (ArrayList) f.b(list);
            this.f9500c.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw j.i0.c.a("unable to set ssl parameters", e2);
        }
    }

    @Override // j.i0.j.f
    @Nullable
    public String i(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f9501d.invoke(sSLSocket, new Object[0]);
            if (str != null) {
                if (str.equals("")) {
                    return null;
                }
                return str;
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw j.i0.c.a("unable to get selected protocols", e2);
        }
    }
}
