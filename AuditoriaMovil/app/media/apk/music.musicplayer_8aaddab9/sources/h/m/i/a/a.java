package h.m.i.a;

import e.j.d.w;
import h.k;
import h.m.i.a.f;
import h.o.c.j;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes2.dex */
public abstract class a implements h.m.d<Object>, d, Serializable {
    private final h.m.d<Object> completion;

    public a(h.m.d<Object> dVar) {
        this.completion = dVar;
    }

    public h.m.d<k> create(h.m.d<?> dVar) {
        j.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public h.m.d<k> create(Object obj, h.m.d<?> dVar) {
        j.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // h.m.i.a.d
    public d getCallerFrame() {
        h.m.d<Object> dVar = this.completion;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final h.m.d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i2;
        String str;
        j.e(this, "<this>");
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v = eVar.v();
        if (v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i2 = (num == null ? 0 : num.intValue()) - 1;
        } catch (Exception unused) {
            i2 = -1;
        }
        int i3 = i2 >= 0 ? eVar.l()[i2] : -1;
        j.e(this, "continuation");
        f.a aVar = f.f8932c;
        if (aVar == null) {
            try {
                f.a aVar2 = new f.a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                f.f8932c = aVar2;
                aVar = aVar2;
            } catch (Exception unused2) {
                aVar = f.f8931b;
                f.f8932c = aVar;
            }
        }
        if (aVar != f.f8931b) {
            Method method = aVar.a;
            Object invoke = method == null ? null : method.invoke(getClass(), new Object[0]);
            if (invoke != null) {
                Method method2 = aVar.f8933b;
                Object invoke2 = method2 == null ? null : method2.invoke(invoke, new Object[0]);
                if (invoke2 != null) {
                    Method method3 = aVar.f8934c;
                    Object invoke3 = method3 == null ? null : method3.invoke(invoke2, new Object[0]);
                    if (invoke3 instanceof String) {
                        str2 = invoke3;
                    }
                }
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = ((Object) str2) + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i3);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    @Override // h.m.d
    public final void resumeWith(Object obj) {
        a aVar = this;
        while (true) {
            j.e(aVar, "frame");
            a aVar2 = aVar;
            h.m.d<Object> completion = aVar2.getCompletion();
            j.c(completion);
            try {
                obj = aVar2.invokeSuspend(obj);
                if (obj == h.m.h.a.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = w.y(th);
            }
            aVar2.releaseIntercepted();
            if (!(completion instanceof a)) {
                completion.resumeWith(obj);
                return;
            }
            aVar = completion;
        }
    }

    public String toString() {
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        return j.i("Continuation at ", stackTraceElement);
    }
}
