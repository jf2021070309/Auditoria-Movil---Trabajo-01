package com.amazon.aps.iva.yb0;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
/* compiled from: CallableReference.java */
/* loaded from: classes4.dex */
public abstract class b implements com.amazon.aps.iva.fc0.c, Serializable {
    public static final Object NO_RECEIVER = a.b;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient com.amazon.aps.iva.fc0.c reflected;
    private final String signature;

    /* compiled from: CallableReference.java */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        public static final a b = new a();
    }

    public b() {
        this(NO_RECEIVER);
    }

    @Override // com.amazon.aps.iva.fc0.c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // com.amazon.aps.iva.fc0.c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public com.amazon.aps.iva.fc0.c compute() {
        com.amazon.aps.iva.fc0.c cVar = this.reflected;
        if (cVar == null) {
            com.amazon.aps.iva.fc0.c computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return cVar;
    }

    public abstract com.amazon.aps.iva.fc0.c computeReflected();

    @Override // com.amazon.aps.iva.fc0.b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // com.amazon.aps.iva.fc0.c
    public String getName() {
        return this.name;
    }

    public com.amazon.aps.iva.fc0.f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return e0.a.c(cls, "");
        }
        return e0.a(cls);
    }

    @Override // com.amazon.aps.iva.fc0.c
    public List<com.amazon.aps.iva.fc0.k> getParameters() {
        return getReflected().getParameters();
    }

    public com.amazon.aps.iva.fc0.c getReflected() {
        com.amazon.aps.iva.fc0.c compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new com.amazon.aps.iva.wb0.a();
    }

    @Override // com.amazon.aps.iva.fc0.c
    public com.amazon.aps.iva.fc0.p getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // com.amazon.aps.iva.fc0.c
    public List<com.amazon.aps.iva.fc0.q> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // com.amazon.aps.iva.fc0.c
    public com.amazon.aps.iva.fc0.t getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // com.amazon.aps.iva.fc0.c
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // com.amazon.aps.iva.fc0.c
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // com.amazon.aps.iva.fc0.c
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // com.amazon.aps.iva.fc0.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public b(Object obj) {
        this(obj, null, null, null, false);
    }

    public b(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}
