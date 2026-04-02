package com.amazon.aps.iva.qb0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.f;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: ContinuationImpl.kt */
/* loaded from: classes4.dex */
public abstract class a implements com.amazon.aps.iva.ob0.d<Object>, d, Serializable {
    private final com.amazon.aps.iva.ob0.d<Object> completion;

    public a(com.amazon.aps.iva.ob0.d<Object> dVar) {
        this.completion = dVar;
    }

    public com.amazon.aps.iva.ob0.d<q> create(com.amazon.aps.iva.ob0.d<?> dVar) {
        j.f(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // com.amazon.aps.iva.qb0.d
    public d getCallerFrame() {
        com.amazon.aps.iva.ob0.d<Object> dVar = this.completion;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final com.amazon.aps.iva.ob0.d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Integer num;
        int i2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v = eVar.v();
        if (v <= 1) {
            int i3 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj4 = declaredField.get(this);
                if (obj4 instanceof Integer) {
                    num = (Integer) obj4;
                } else {
                    num = null;
                }
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                i = i2 - 1;
            } catch (Exception unused) {
                i = -1;
            }
            if (i >= 0) {
                i3 = eVar.l()[i];
            }
            f.a aVar = f.b;
            f.a aVar2 = f.a;
            if (aVar == null) {
                try {
                    f.a aVar3 = new f.a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(AppMeasurementSdk.ConditionalUserProperty.NAME, new Class[0]));
                    f.b = aVar3;
                    aVar = aVar3;
                } catch (Exception unused2) {
                    f.b = aVar2;
                    aVar = aVar2;
                }
            }
            if (aVar != aVar2) {
                Method method = aVar.a;
                if (method != null) {
                    obj = method.invoke(getClass(), new Object[0]);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    Method method2 = aVar.b;
                    if (method2 != null) {
                        obj2 = method2.invoke(obj, new Object[0]);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        Method method3 = aVar.c;
                        if (method3 != null) {
                            obj3 = method3.invoke(obj2, new Object[0]);
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof String) {
                            str2 = obj3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            return new StackTraceElement(str, eVar.m(), eVar.f(), i3);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.ob0.d
    public final void resumeWith(Object obj) {
        com.amazon.aps.iva.ob0.d dVar = this;
        while (true) {
            a aVar = (a) dVar;
            com.amazon.aps.iva.ob0.d dVar2 = aVar.completion;
            j.c(dVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = x.H(th);
            }
            aVar.releaseIntercepted();
            if (dVar2 instanceof a) {
                dVar = dVar2;
            } else {
                dVar2.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        j.f(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
