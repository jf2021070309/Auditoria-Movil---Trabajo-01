package com.amazon.aps.iva.aa0;

import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.ka0.s;
import com.amazon.aps.iva.yb0.j;
import com.google.ads.AdSize;
import java.util.concurrent.TimeUnit;
/* compiled from: HttpClient.kt */
/* loaded from: classes4.dex */
public final class a {
    public static final long c;
    public static final long d;
    public static final long e;
    public static final /* synthetic */ int f = 0;
    public final b a;
    public final long b = e;

    /* compiled from: HttpClient.kt */
    /* renamed from: com.amazon.aps.iva.aa0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0110a {
        public final f a;
        public final Exception b;
        public final boolean c;
        public final int d;

        public C0110a() {
            this(null, null, false, 0, 15);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0110a)) {
                return false;
            }
            C0110a c0110a = (C0110a) obj;
            if (j.a(this.a, c0110a.a) && j.a(this.b, c0110a.b) && this.c == c0110a.c && this.d == c0110a.d) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int identityHashCode;
            int i = 0;
            f fVar = this.a;
            if (fVar == null) {
                identityHashCode = 0;
            } else {
                fVar.getClass();
                identityHashCode = System.identityHashCode(fVar);
            }
            int i2 = identityHashCode * 31;
            Exception exc = this.b;
            if (exc != null) {
                i = exc.hashCode();
            }
            int i3 = (i2 + i) * 31;
            boolean z = this.c;
            int i4 = z;
            if (z != 0) {
                i4 = 1;
            }
            return Integer.hashCode(this.d) + ((i3 + i4) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CallResult(response=");
            sb.append(this.a);
            sb.append(", exception=");
            sb.append(this.b);
            sb.append(", offlineForCall=");
            sb.append(this.c);
            sb.append(", retries=");
            return b2.b(sb, this.d, ')');
        }

        public C0110a(f fVar, Exception exc, boolean z, int i, int i2) {
            fVar = (i2 & 1) != 0 ? null : fVar;
            exc = (i2 & 2) != 0 ? null : exc;
            z = (i2 & 4) != 0 ? false : z;
            i = (i2 & 8) != 0 ? 0 : i;
            this.a = fVar;
            this.b = exc;
            this.c = z;
            this.d = i;
        }
    }

    /* compiled from: HttpClient.kt */
    /* loaded from: classes4.dex */
    public interface b {
        boolean K1();
    }

    /* compiled from: HttpClient.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.mux.android.http.HttpClient", f = "HttpClient.kt", l = {AdSize.PORTRAIT_AD_HEIGHT, 53, 56, 58, 64}, m = "callWithBackoff")
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.qb0.c {
        public a h;
        public e i;
        public int j;
        public /* synthetic */ Object k;
        public int m;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            int i = a.f;
            return a.this.a(null, 0, this);
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        c = timeUnit.convert(30L, timeUnit2);
        d = timeUnit.convert(20L, timeUnit2);
        e = timeUnit.convert(5L, timeUnit2);
    }

    public a(s sVar) {
        this.a = sVar;
    }

    public static final Object b(a aVar, e eVar, C0110a c0110a, c cVar) {
        boolean z;
        int i = c0110a.d;
        if (i < 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return aVar.a(eVar, i + 1, cVar);
        }
        return c0110a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f8 A[Catch: Exception -> 0x005c, TRY_LEAVE, TryCatch #1 {Exception -> 0x005c, blocks: (B:24:0x0057, B:51:0x00e5, B:58:0x00f8, B:65:0x011e), top: B:77:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011e A[Catch: Exception -> 0x005c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x005c, blocks: (B:24:0x0057, B:51:0x00e5, B:58:0x00f8, B:65:0x011e), top: B:77:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.amazon.aps.iva.aa0.e r20, int r21, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.aa0.a.C0110a> r22) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.aa0.a.a(com.amazon.aps.iva.aa0.e, int, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
