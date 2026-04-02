package e.d.d.l;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class p<T> {
    public final T a;

    /* renamed from: b  reason: collision with root package name */
    public final c<T> f7117b;

    /* loaded from: classes2.dex */
    public static class b implements c<Context> {
        public final Class<? extends Service> a;

        public b(Class cls, a aVar) {
            this.a = cls;
        }
    }

    /* loaded from: classes2.dex */
    public interface c<T> {
    }

    public p(T t, c<T> cVar) {
        this.a = t;
        this.f7117b = cVar;
    }

    public static p<Context> b(Context context, Class<? extends Service> cls) {
        return new p<>(context, new b(cls, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    public List<e.d.d.t.b<r>> a() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        c<T> cVar = this.f7117b;
        T t = this.a;
        b bVar = (b) cVar;
        Objects.requireNonNull(bVar);
        Context context = (Context) t;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, bVar.a), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", bVar.a + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        for (final String str2 : arrayList) {
            arrayList2.add(new e.d.d.t.b() { // from class: e.d.d.l.c
                @Override // e.d.d.t.b
                public final Object get() {
                    String str3 = str2;
                    try {
                        Class<?> cls = Class.forName(str3);
                        if (r.class.isAssignableFrom(cls)) {
                            return (r) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        }
                        throw new a0(String.format("Class %s is not an instance of %s", str3, "com.google.firebase.components.ComponentRegistrar"));
                    } catch (ClassNotFoundException unused2) {
                        Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str3));
                        return null;
                    } catch (IllegalAccessException e2) {
                        throw new a0(String.format("Could not instantiate %s.", str3), e2);
                    } catch (InstantiationException e3) {
                        throw new a0(String.format("Could not instantiate %s.", str3), e3);
                    } catch (NoSuchMethodException e4) {
                        throw new a0(String.format("Could not instantiate %s", str3), e4);
                    } catch (InvocationTargetException e5) {
                        throw new a0(String.format("Could not instantiate %s", str3), e5);
                    }
                }
            });
        }
        return arrayList2;
    }
}
