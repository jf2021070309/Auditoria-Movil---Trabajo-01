package com.amazon.aps.iva.yb0;
/* compiled from: ReflectionFactory.java */
/* loaded from: classes4.dex */
public class f0 {
    public com.amazon.aps.iva.fc0.d b(Class cls) {
        return new d(cls);
    }

    public com.amazon.aps.iva.fc0.f c(Class cls, String str) {
        return new r(cls, str);
    }

    public String i(g gVar) {
        String obj = gVar.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    public String j(l lVar) {
        return i(lVar);
    }

    public com.amazon.aps.iva.fc0.g a(h hVar) {
        return hVar;
    }

    public com.amazon.aps.iva.fc0.i d(m mVar) {
        return mVar;
    }

    public com.amazon.aps.iva.fc0.j e(o oVar) {
        return oVar;
    }

    public com.amazon.aps.iva.fc0.m f(s sVar) {
        return sVar;
    }

    public com.amazon.aps.iva.fc0.n g(u uVar) {
        return uVar;
    }

    public com.amazon.aps.iva.fc0.o h(w wVar) {
        return wVar;
    }
}
