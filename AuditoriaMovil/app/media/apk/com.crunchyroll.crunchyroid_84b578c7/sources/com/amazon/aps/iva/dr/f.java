package com.amazon.aps.iva.dr;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.yb0.j;
import java.util.WeakHashMap;
/* compiled from: ViewLoadingTimer.kt */
/* loaded from: classes2.dex */
public final class f {
    public final WeakHashMap<Object, a> a = new WeakHashMap<>();

    /* compiled from: ViewLoadingTimer.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public Long a;
        public long b = 0;
        public boolean c = true;
        public boolean d = false;

        public a(Long l) {
            this.a = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (j.a(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode;
            Long l = this.a;
            if (l == null) {
                hashCode = 0;
            } else {
                hashCode = l.hashCode();
            }
            int a = i.a(this.b, hashCode * 31, 31);
            boolean z = this.c;
            int i = 1;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            int i3 = (a + i2) * 31;
            boolean z2 = this.d;
            if (!z2) {
                i = z2 ? 1 : 0;
            }
            return i3 + i;
        }

        public final String toString() {
            Long l = this.a;
            long j = this.b;
            boolean z = this.c;
            boolean z2 = this.d;
            return "ViewLoadingInfo(loadingStart=" + l + ", loadingTime=" + j + ", firstTimeLoading=" + z + ", finishedLoadingOnce=" + z2 + ")";
        }
    }

    public final Long a(Object obj) {
        j.f(obj, "view");
        a aVar = this.a.get(obj);
        if (aVar == null) {
            return null;
        }
        return Long.valueOf(aVar.b);
    }

    public final boolean b(Object obj) {
        j.f(obj, "view");
        a aVar = this.a.get(obj);
        if (aVar == null) {
            return false;
        }
        return aVar.c;
    }

    public final void c(Object obj) {
        j.f(obj, "view");
        this.a.put(obj, new a(Long.valueOf(System.nanoTime())));
    }

    public final void d(Object obj) {
        long j;
        j.f(obj, "view");
        a aVar = this.a.get(obj);
        if (aVar != null) {
            Long l = aVar.a;
            if (l != null) {
                j = System.nanoTime() - l.longValue();
            } else {
                j = 0;
            }
            aVar.b = j;
            if (aVar.d) {
                aVar.c = false;
            }
        }
    }

    public final void e(Object obj) {
        j.f(obj, "view");
        a aVar = this.a.get(obj);
        if (aVar != null) {
            aVar.b = 0L;
            aVar.a = null;
            aVar.c = false;
            aVar.d = true;
        }
    }

    public final void f(Object obj) {
        a aVar;
        j.f(obj, "view");
        WeakHashMap<Object, a> weakHashMap = this.a;
        if (weakHashMap.containsKey(obj)) {
            aVar = weakHashMap.get(obj);
        } else {
            a aVar2 = new a(Long.valueOf(System.nanoTime()));
            weakHashMap.put(obj, aVar2);
            aVar = aVar2;
        }
        if (aVar != null && aVar.a == null) {
            aVar.a = Long.valueOf(System.nanoTime());
        }
    }
}
