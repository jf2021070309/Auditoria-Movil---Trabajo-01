package c.y;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import c.t.m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import music.musicplayer.R;
/* loaded from: classes.dex */
public final class a {
    public static volatile a a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f2846b = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final Context f2849e;

    /* renamed from: d  reason: collision with root package name */
    public final Set<Class<? extends b<?>>> f2848d = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, Object> f2847c = new HashMap();

    public a(Context context) {
        this.f2849e = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (a == null) {
            synchronized (f2846b) {
                if (a == null) {
                    a = new a(context);
                }
            }
        }
        return a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(Bundle bundle) {
        String string = this.f2849e.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.f2848d.add(cls);
                        }
                    }
                }
                for (Class<? extends b<?>> cls2 : this.f2848d) {
                    b(cls2, hashSet);
                }
            } catch (ClassNotFoundException e2) {
                throw new c(e2);
            }
        }
    }

    public final <T> T b(Class<? extends b<?>> cls, Set<Class<?>> set) {
        T t;
        if (m.t()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f2847c.containsKey(cls)) {
            t = (T) this.f2847c.get(cls);
        } else {
            set.add(cls);
            b<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            List<Class<? extends b<?>>> a2 = newInstance.a();
            if (!a2.isEmpty()) {
                for (Class<? extends b<?>> cls2 : a2) {
                    if (!this.f2847c.containsKey(cls2)) {
                        b(cls2, set);
                    }
                }
            }
            t = (T) newInstance.b(this.f2849e);
            set.remove(cls);
            this.f2847c.put(cls, t);
        }
        return t;
    }
}
