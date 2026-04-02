package c.p;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class e0 extends j0 {
    public static final Class<?>[] a = {Application.class, d0.class};

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f2447b = {d0.class};

    /* renamed from: c  reason: collision with root package name */
    public final Application f2448c;

    /* renamed from: d  reason: collision with root package name */
    public final i0 f2449d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f2450e;

    /* renamed from: f  reason: collision with root package name */
    public final j f2451f;

    /* renamed from: g  reason: collision with root package name */
    public final c.w.a f2452g;

    @SuppressLint({"LambdaLast"})
    public e0(Application application, c.w.c cVar, Bundle bundle) {
        i0 i0Var;
        this.f2452g = cVar.getSavedStateRegistry();
        this.f2451f = cVar.getLifecycle();
        this.f2450e = bundle;
        this.f2448c = application;
        if (application != null) {
            if (h0.f2461b == null) {
                h0.f2461b = new h0(application);
            }
            i0Var = h0.f2461b;
        } else {
            if (k0.a == null) {
                k0.a = new k0();
            }
            i0Var = k0.a;
        }
        this.f2449d = i0Var;
    }

    public static <T> Constructor<T> d(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            if (Arrays.equals(clsArr, constructor2.getParameterTypes())) {
                return constructor2;
            }
        }
        return null;
    }

    @Override // c.p.j0, c.p.i0
    public <T extends g0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // c.p.l0
    public void b(g0 g0Var) {
        SavedStateHandleController.g(g0Var, this.f2452g, this.f2451f);
    }

    @Override // c.p.j0
    public <T extends g0> T c(String str, Class<T> cls) {
        d0 d0Var;
        T t;
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor d2 = (!isAssignableFrom || this.f2448c == null) ? d(cls, f2447b) : d(cls, a);
        if (d2 == null) {
            return (T) this.f2449d.a(cls);
        }
        c.w.a aVar = this.f2452g;
        j jVar = this.f2451f;
        Bundle bundle = this.f2450e;
        Bundle a2 = aVar.a(str);
        Class[] clsArr = d0.a;
        if (a2 == null && bundle == null) {
            d0Var = new d0();
        } else {
            HashMap hashMap = new HashMap();
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    hashMap.put(str2, bundle.get(str2));
                }
            }
            if (a2 == null) {
                d0Var = new d0(hashMap);
            } else {
                ArrayList parcelableArrayList = a2.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = a2.getParcelableArrayList("values");
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    throw new IllegalStateException("Invalid bundle passed as restored state");
                }
                for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                    hashMap.put((String) parcelableArrayList.get(i2), parcelableArrayList2.get(i2));
                }
                d0Var = new d0(hashMap);
            }
        }
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, d0Var);
        savedStateHandleController.i(aVar, jVar);
        SavedStateHandleController.j(aVar, jVar);
        if (isAssignableFrom) {
            try {
                Application application = this.f2448c;
                if (application != null) {
                    t = (T) d2.newInstance(application, d0Var);
                    t.b("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
                    return t;
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Failed to access " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e4.getCause());
            }
        }
        t = (T) d2.newInstance(d0Var);
        t.b("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
        return t;
    }
}
