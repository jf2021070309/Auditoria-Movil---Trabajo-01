package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.w;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;
/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes.dex */
public final class o {
    public static volatile o b;
    public static final o c = new o(0);
    public final Map<a, w.e<?, ?>> a;

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

    public o() {
        this.a = new HashMap();
    }

    public static o a() {
        o oVar = b;
        if (oVar == null) {
            synchronized (o.class) {
                oVar = b;
                if (oVar == null) {
                    Class<?> cls = n.a;
                    o oVar2 = null;
                    if (cls != null) {
                        try {
                            oVar2 = (o) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (oVar2 == null) {
                        oVar2 = c;
                    }
                    b = oVar2;
                    oVar = oVar2;
                }
            }
        }
        return oVar;
    }

    public o(int i) {
        this.a = Collections.emptyMap();
    }
}
