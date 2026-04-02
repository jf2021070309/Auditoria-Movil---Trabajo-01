package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;
/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes.dex */
public final class p {
    public static volatile p b;
    public static final p c;
    public final Map<a, x.e<?, ?>> a;

    /* compiled from: ExtensionRegistryLite.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final Object a;
        public final int b;

        public a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a != aVar.a || this.b != aVar.b) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.b;
        }
    }

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        c = new p(0);
    }

    public p() {
        this.a = new HashMap();
    }

    public static p a() {
        p pVar = b;
        if (pVar == null) {
            synchronized (p.class) {
                pVar = b;
                if (pVar == null) {
                    Class<?> cls = o.a;
                    if (cls != null) {
                        try {
                            pVar = (p) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                        b = pVar;
                    }
                    pVar = c;
                    b = pVar;
                }
            }
        }
        return pVar;
    }

    public p(int i) {
        this.a = Collections.emptyMap();
    }
}
