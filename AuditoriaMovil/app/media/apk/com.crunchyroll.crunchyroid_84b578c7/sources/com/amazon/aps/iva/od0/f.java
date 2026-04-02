package com.amazon.aps.iva.od0;

import com.amazon.aps.iva.od0.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;
/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes4.dex */
public final class f {
    public static final /* synthetic */ int b = 0;
    public final Map<a, h.f<?, ?>> a;

    /* compiled from: ExtensionRegistryLite.java */
    /* loaded from: classes4.dex */
    public static final class a {
        public final Object a;
        public final int b;

        public a(p pVar, int i) {
            this.a = pVar;
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
        new f(0);
    }

    public f() {
        this.a = new HashMap();
    }

    public final void a(h.f<?, ?> fVar) {
        this.a.put(new a(fVar.a, fVar.d.c), fVar);
    }

    public f(int i) {
        this.a = Collections.emptyMap();
    }
}
