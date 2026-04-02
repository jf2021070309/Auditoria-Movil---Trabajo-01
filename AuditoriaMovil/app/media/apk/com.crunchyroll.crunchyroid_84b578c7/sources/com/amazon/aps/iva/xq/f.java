package com.amazon.aps.iva.xq;

import com.amazon.aps.iva.fr.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: RumRawEvent.kt */
/* loaded from: classes2.dex */
public abstract class f {

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class a extends f {
        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            if (com.amazon.aps.iva.yb0.j.a(null, null) && com.amazon.aps.iva.yb0.j.a(null, null)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ActionDropped(viewId=null, eventTime=null)";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class a0 extends f {
        public final String a;
        public final com.amazon.aps.iva.vq.d b;

        public a0(String str) {
            com.amazon.aps.iva.vq.d dVar = new com.amazon.aps.iva.vq.d(0);
            com.amazon.aps.iva.yb0.j.f(str, "key");
            this.a = str;
            this.b = dVar;
        }

        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, a0Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, a0Var.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "WaitForResourceTiming(key=" + this.a + ", eventTime=" + this.b + ")";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class b extends f {
        public final String a;
        public final com.amazon.aps.iva.vq.d b;

        public b(String str) {
            com.amazon.aps.iva.vq.d dVar = new com.amazon.aps.iva.vq.d(0);
            com.amazon.aps.iva.yb0.j.f(str, "viewId");
            this.a = str;
            this.b = dVar;
        }

        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, bVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, bVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ActionSent(viewId=" + this.a + ", eventTime=" + this.b + ")";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class c extends f {
        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            if (com.amazon.aps.iva.yb0.j.a(null, null) && com.amazon.aps.iva.yb0.j.a(null, null)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "AddCustomTiming(name=null, eventTime=null)";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class d extends f {
        public final String a;
        public final com.amazon.aps.iva.sq.e b;
        public final Throwable c;
        public final String d;
        public final boolean e;
        public final Map<String, Object> f;
        public final com.amazon.aps.iva.vq.d g;
        public final String h;
        public final com.amazon.aps.iva.tq.a i;

        public d() {
            throw null;
        }

        public d(String str, com.amazon.aps.iva.sq.e eVar, Throwable th, boolean z, Map map, com.amazon.aps.iva.vq.d dVar, String str2, int i) {
            dVar = (i & 64) != 0 ? new com.amazon.aps.iva.vq.d(0) : dVar;
            str2 = (i & 128) != 0 ? null : str2;
            com.amazon.aps.iva.tq.a aVar = (i & 256) != 0 ? com.amazon.aps.iva.tq.a.ANDROID : null;
            com.amazon.aps.iva.yb0.j.f(str, "message");
            com.amazon.aps.iva.yb0.j.f(eVar, FirebaseAnalytics.Param.SOURCE);
            com.amazon.aps.iva.yb0.j.f(dVar, "eventTime");
            com.amazon.aps.iva.yb0.j.f(aVar, "sourceType");
            this.a = str;
            this.b = eVar;
            this.c = th;
            this.d = null;
            this.e = z;
            this.f = map;
            this.g = dVar;
            this.h = str2;
            this.i = aVar;
        }

        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, dVar.a) && this.b == dVar.b && com.amazon.aps.iva.yb0.j.a(this.c, dVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, dVar.d) && this.e == dVar.e && com.amazon.aps.iva.yb0.j.a(this.f, dVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, dVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, dVar.h) && this.i == dVar.i) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            int i = 0;
            Throwable th = this.c;
            if (th == null) {
                hashCode = 0;
            } else {
                hashCode = th.hashCode();
            }
            int i2 = (hashCode3 + hashCode) * 31;
            String str = this.d;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            boolean z = this.e;
            int i4 = z;
            if (z != 0) {
                i4 = 1;
            }
            int hashCode4 = (this.g.hashCode() + ((this.f.hashCode() + ((i3 + i4) * 31)) * 31)) * 31;
            String str2 = this.h;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return this.i.hashCode() + ((hashCode4 + i) * 31);
        }

        public final String toString() {
            return "AddError(message=" + this.a + ", source=" + this.b + ", throwable=" + this.c + ", stacktrace=" + this.d + ", isFatal=" + this.e + ", attributes=" + this.f + ", eventTime=" + this.g + ", type=" + this.h + ", sourceType=" + this.i + ")";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class e extends f {
        public final long a;
        public final String b;
        public final com.amazon.aps.iva.vq.d c;

        public e(long j, String str) {
            com.amazon.aps.iva.vq.d dVar = new com.amazon.aps.iva.vq.d(0);
            com.amazon.aps.iva.yb0.j.f(str, "target");
            this.a = j;
            this.b = str;
            this.c = dVar;
        }

        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.a == eVar.a && com.amazon.aps.iva.yb0.j.a(this.b, eVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, eVar.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.c.hashCode() + com.amazon.aps.iva.c80.a.b(this.b, Long.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            return "AddLongTask(durationNs=" + this.a + ", target=" + this.b + ", eventTime=" + this.c + ")";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* renamed from: com.amazon.aps.iva.xq.f$f  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0866f extends f {
        public final String a;
        public final com.amazon.aps.iva.wq.a b;
        public final com.amazon.aps.iva.vq.d c;

        public C0866f(String str, com.amazon.aps.iva.wq.a aVar) {
            com.amazon.aps.iva.vq.d dVar = new com.amazon.aps.iva.vq.d(0);
            com.amazon.aps.iva.yb0.j.f(str, "key");
            this.a = str;
            this.b = aVar;
            this.c = dVar;
        }

        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0866f)) {
                return false;
            }
            C0866f c0866f = (C0866f) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, c0866f.a) && com.amazon.aps.iva.yb0.j.a(this.b, c0866f.b) && com.amazon.aps.iva.yb0.j.a(this.c, c0866f.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode();
            return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "AddResourceTiming(key=" + this.a + ", timing=" + this.b + ", eventTime=" + this.c + ")";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class g extends f {
        public final com.amazon.aps.iva.vq.d a;
        public final long b;

        public g(com.amazon.aps.iva.vq.d dVar, long j) {
            com.amazon.aps.iva.yb0.j.f(dVar, "eventTime");
            this.a = dVar;
            this.b = j;
        }

        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, gVar.a) && this.b == gVar.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ApplicationStarted(eventTime=" + this.a + ", applicationStartupNanos=" + this.b + ")";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class h extends f {
        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            ((h) obj).getClass();
            if (com.amazon.aps.iva.yb0.j.a(null, null) && com.amazon.aps.iva.yb0.j.a(null, null)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ErrorDropped(viewId=null, eventTime=null)";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class i extends f {
        public final String a;
        public final com.amazon.aps.iva.vq.d b;

        public i(String str) {
            com.amazon.aps.iva.vq.d dVar = new com.amazon.aps.iva.vq.d(0);
            com.amazon.aps.iva.yb0.j.f(str, "viewId");
            this.a = str;
            this.b = dVar;
        }

        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, iVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, iVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ErrorSent(viewId=" + this.a + ", eventTime=" + this.b + ")";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class j extends f {
        public final com.amazon.aps.iva.vq.d a;

        public j() {
            this(0);
        }

        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            if (com.amazon.aps.iva.yb0.j.a(this.a, ((j) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "KeepAlive(eventTime=" + this.a + ")";
        }

        public j(int i) {
            this.a = new com.amazon.aps.iva.vq.d(0);
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class k extends f {
        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            ((k) obj).getClass();
            if (com.amazon.aps.iva.yb0.j.a(null, null) && com.amazon.aps.iva.yb0.j.a(null, null)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "LongTaskDropped(viewId=null, isFrozenFrame=false, eventTime=null)";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class l extends f {
        public final String a;
        public final boolean b;
        public final com.amazon.aps.iva.vq.d c;

        public l(String str, boolean z) {
            com.amazon.aps.iva.vq.d dVar = new com.amazon.aps.iva.vq.d(0);
            com.amazon.aps.iva.yb0.j.f(str, "viewId");
            this.a = str;
            this.b = z;
            this.c = dVar;
        }

        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, lVar.a) && this.b == lVar.b && com.amazon.aps.iva.yb0.j.a(this.c, lVar.c)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            boolean z = this.b;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return this.c.hashCode() + ((hashCode + i) * 31);
        }

        public final String toString() {
            return "LongTaskSent(viewId=" + this.a + ", isFrozenFrame=" + this.b + ", eventTime=" + this.c + ")";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class m extends f {
        public final com.amazon.aps.iva.vq.d a = new com.amazon.aps.iva.vq.d(0);

        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            if (com.amazon.aps.iva.yb0.j.a(this.a, ((m) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ResetSession(eventTime=" + this.a + ")";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class n extends f {
        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            ((n) obj).getClass();
            if (com.amazon.aps.iva.yb0.j.a(null, null) && com.amazon.aps.iva.yb0.j.a(null, null)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ResourceDropped(viewId=null, eventTime=null)";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class o extends f {
        public final String a;
        public final com.amazon.aps.iva.vq.d b;

        public o(String str) {
            com.amazon.aps.iva.vq.d dVar = new com.amazon.aps.iva.vq.d(0);
            com.amazon.aps.iva.yb0.j.f(str, "viewId");
            this.a = str;
            this.b = dVar;
        }

        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, oVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, oVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ResourceSent(viewId=" + this.a + ", eventTime=" + this.b + ")";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class p extends f {
        public final com.amazon.aps.iva.vq.d a;

        public p() {
            this(0);
        }

        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            if (com.amazon.aps.iva.yb0.j.a(this.a, ((p) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SendCustomActionNow(eventTime=" + this.a + ")";
        }

        public p(int i) {
            this.a = new com.amazon.aps.iva.vq.d(0);
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class q extends f {
        public final com.amazon.aps.iva.hr.b a;
        public final String b;
        public final String c;
        public final String d;
        public final com.amazon.aps.iva.vq.d e;

        public q(com.amazon.aps.iva.hr.b bVar, String str, String str2, String str3) {
            com.amazon.aps.iva.vq.d dVar = new com.amazon.aps.iva.vq.d(0);
            com.amazon.aps.iva.yb0.j.f(bVar, "type");
            com.amazon.aps.iva.yb0.j.f(str, "message");
            this.a = bVar;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = dVar;
        }

        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            if (this.a == qVar.a && com.amazon.aps.iva.yb0.j.a(this.b, qVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, qVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, qVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, qVar.e)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int b = com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
            int i = 0;
            String str = this.c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (b + hashCode) * 31;
            String str2 = this.d;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return this.e.hashCode() + ((i2 + i) * 31);
        }

        public final String toString() {
            return "SendTelemetry(type=" + this.a + ", message=" + this.b + ", stack=" + this.c + ", kind=" + this.d + ", eventTime=" + this.e + ")";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class r extends f {
        public final com.amazon.aps.iva.sq.d a;
        public final String b;
        public final boolean c;
        public final Map<String, Object> d;
        public final com.amazon.aps.iva.vq.d e;

        public r(com.amazon.aps.iva.sq.d dVar, String str, boolean z, Map<String, ? extends Object> map, com.amazon.aps.iva.vq.d dVar2) {
            com.amazon.aps.iva.yb0.j.f(dVar, "type");
            com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            this.a = dVar;
            this.b = str;
            this.c = z;
            this.d = map;
            this.e = dVar2;
        }

        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            if (this.a == rVar.a && com.amazon.aps.iva.yb0.j.a(this.b, rVar.b) && this.c == rVar.c && com.amazon.aps.iva.yb0.j.a(this.d, rVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, rVar.e)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int b = com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
            boolean z = this.c;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int hashCode = this.d.hashCode();
            return this.e.hashCode() + ((hashCode + ((b + i) * 31)) * 31);
        }

        public final String toString() {
            return "StartAction(type=" + this.a + ", name=" + this.b + ", waitForStop=" + this.c + ", attributes=" + this.d + ", eventTime=" + this.e + ")";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class s extends f {
        public final String a;
        public final String b;
        public final String c;
        public final Map<String, Object> d;
        public final com.amazon.aps.iva.vq.d e;

        public s(String str, String str2, String str3, Map<String, ? extends Object> map, com.amazon.aps.iva.vq.d dVar) {
            com.amazon.aps.iva.yb0.j.f(str, "key");
            com.amazon.aps.iva.yb0.j.f(map, "attributes");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = map;
            this.e = dVar;
        }

        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, sVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, sVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, sVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, sVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, sVar.e)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int b = com.amazon.aps.iva.c80.a.b(this.c, com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31), 31);
            return this.e.hashCode() + ((this.d.hashCode() + b) * 31);
        }

        public final String toString() {
            return "StartResource(key=" + this.a + ", url=" + this.b + ", method=" + this.c + ", attributes=" + this.d + ", eventTime=" + this.e + ")";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class t extends f {
        public final Object a;
        public final String b;
        public final Map<String, Object> c;
        public final com.amazon.aps.iva.vq.d d;

        public t(Object obj, String str, Map<String, ? extends Object> map, com.amazon.aps.iva.vq.d dVar) {
            com.amazon.aps.iva.yb0.j.f(obj, "key");
            com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            com.amazon.aps.iva.yb0.j.f(map, "attributes");
            this.a = obj;
            this.b = str;
            this.c = map;
            this.d = dVar;
        }

        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, tVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, tVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, tVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, tVar.d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int b = com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
            return this.d.hashCode() + ((this.c.hashCode() + b) * 31);
        }

        public final String toString() {
            return "StartView(key=" + this.a + ", name=" + this.b + ", attributes=" + this.c + ", eventTime=" + this.d + ")";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class u extends f {
        public final com.amazon.aps.iva.sq.d a;
        public final String b;
        public final Map<String, Object> c;
        public final com.amazon.aps.iva.vq.d d;

        public u(com.amazon.aps.iva.sq.d dVar, String str, LinkedHashMap linkedHashMap, com.amazon.aps.iva.vq.d dVar2) {
            this.a = dVar;
            this.b = str;
            this.c = linkedHashMap;
            this.d = dVar2;
        }

        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            if (this.a == uVar.a && com.amazon.aps.iva.yb0.j.a(this.b, uVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, uVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, uVar.d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int i = 0;
            com.amazon.aps.iva.sq.d dVar = this.a;
            if (dVar == null) {
                hashCode = 0;
            } else {
                hashCode = dVar.hashCode();
            }
            int i2 = hashCode * 31;
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return this.d.hashCode() + ((this.c.hashCode() + ((i2 + i) * 31)) * 31);
        }

        public final String toString() {
            return "StopAction(type=" + this.a + ", name=" + this.b + ", attributes=" + this.c + ", eventTime=" + this.d + ")";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class v extends f {
        public final String a;
        public final Long b;
        public final Long c;
        public final com.amazon.aps.iva.sq.h d;
        public final Map<String, Object> e;
        public final com.amazon.aps.iva.vq.d f;

        public v(String str, Long l, Long l2, com.amazon.aps.iva.sq.h hVar, LinkedHashMap linkedHashMap, com.amazon.aps.iva.vq.d dVar) {
            com.amazon.aps.iva.yb0.j.f(str, "key");
            com.amazon.aps.iva.yb0.j.f(hVar, "kind");
            this.a = str;
            this.b = l;
            this.c = l2;
            this.d = hVar;
            this.e = linkedHashMap;
            this.f = dVar;
        }

        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, vVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, vVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, vVar.c) && this.d == vVar.d && com.amazon.aps.iva.yb0.j.a(this.e, vVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, vVar.f)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = this.a.hashCode() * 31;
            int i = 0;
            Long l = this.b;
            if (l == null) {
                hashCode = 0;
            } else {
                hashCode = l.hashCode();
            }
            int i2 = (hashCode2 + hashCode) * 31;
            Long l2 = this.c;
            if (l2 != null) {
                i = l2.hashCode();
            }
            int hashCode3 = this.d.hashCode();
            return this.f.hashCode() + ((this.e.hashCode() + ((hashCode3 + ((i2 + i) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "StopResource(key=" + this.a + ", statusCode=" + this.b + ", size=" + this.c + ", kind=" + this.d + ", attributes=" + this.e + ", eventTime=" + this.f + ")";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class w extends f {
        public final String a;
        public final Long b;
        public final String c;
        public final com.amazon.aps.iva.sq.e d;
        public final Throwable e;
        public final Map<String, Object> f;
        public final com.amazon.aps.iva.vq.d g;

        public w() {
            throw null;
        }

        public w(String str, Long l, String str2, com.amazon.aps.iva.sq.e eVar, Throwable th, Map map) {
            com.amazon.aps.iva.vq.d dVar = new com.amazon.aps.iva.vq.d(0);
            com.amazon.aps.iva.yb0.j.f(str, "key");
            com.amazon.aps.iva.yb0.j.f(eVar, FirebaseAnalytics.Param.SOURCE);
            com.amazon.aps.iva.yb0.j.f(map, "attributes");
            this.a = str;
            this.b = l;
            this.c = str2;
            this.d = eVar;
            this.e = th;
            this.f = map;
            this.g = dVar;
        }

        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, wVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, wVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, wVar.c) && this.d == wVar.d && com.amazon.aps.iva.yb0.j.a(this.e, wVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, wVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, wVar.g)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = this.a.hashCode() * 31;
            Long l = this.b;
            if (l == null) {
                hashCode = 0;
            } else {
                hashCode = l.hashCode();
            }
            int b = com.amazon.aps.iva.c80.a.b(this.c, (hashCode2 + hashCode) * 31, 31);
            int hashCode3 = this.e.hashCode();
            int hashCode4 = this.f.hashCode();
            return this.g.hashCode() + ((hashCode4 + ((hashCode3 + ((this.d.hashCode() + b) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "StopResourceWithError(key=" + this.a + ", statusCode=" + this.b + ", message=" + this.c + ", source=" + this.d + ", throwable=" + this.e + ", attributes=" + this.f + ", eventTime=" + this.g + ")";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class x extends f {
        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            ((x) obj).getClass();
            if (com.amazon.aps.iva.yb0.j.a(null, null) && com.amazon.aps.iva.yb0.j.a(null, null) && com.amazon.aps.iva.yb0.j.a(null, null) && com.amazon.aps.iva.yb0.j.a(null, null) && com.amazon.aps.iva.yb0.j.a(null, null) && com.amazon.aps.iva.yb0.j.a(null, null) && com.amazon.aps.iva.yb0.j.a(null, null)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "StopResourceWithStackTrace(key=null, statusCode=null, message=null, source=null, stackTrace=null, errorType=null, attributes=null, eventTime=null)";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class y extends f {
        public final Object a;
        public final Map<String, Object> b;
        public final com.amazon.aps.iva.vq.d c;

        public y(Object obj, Map<String, ? extends Object> map, com.amazon.aps.iva.vq.d dVar) {
            com.amazon.aps.iva.yb0.j.f(obj, "key");
            com.amazon.aps.iva.yb0.j.f(map, "attributes");
            this.a = obj;
            this.b = map;
            this.c = dVar;
        }

        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, yVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, yVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, yVar.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode();
            return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "StopView(key=" + this.a + ", attributes=" + this.b + ", eventTime=" + this.c + ")";
        }
    }

    /* compiled from: RumRawEvent.kt */
    /* loaded from: classes2.dex */
    public static final class z extends f {
        public final Object a;
        public final long b;
        public final e.r c;
        public final com.amazon.aps.iva.vq.d d;

        public z(Object obj, long j, e.r rVar) {
            com.amazon.aps.iva.vq.d dVar = new com.amazon.aps.iva.vq.d(0);
            com.amazon.aps.iva.yb0.j.f(obj, "key");
            com.amazon.aps.iva.yb0.j.f(rVar, "loadingType");
            this.a = obj;
            this.b = j;
            this.c = rVar;
            this.d = dVar;
        }

        @Override // com.amazon.aps.iva.xq.f
        public final com.amazon.aps.iva.vq.d a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, zVar.a) && this.b == zVar.b && this.c == zVar.c && com.amazon.aps.iva.yb0.j.a(this.d, zVar.d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int a = com.amazon.aps.iva.b8.i.a(this.b, this.a.hashCode() * 31, 31);
            return this.d.hashCode() + ((this.c.hashCode() + a) * 31);
        }

        public final String toString() {
            return "UpdateViewLoadingTime(key=" + this.a + ", loadingTime=" + this.b + ", loadingType=" + this.c + ", eventTime=" + this.d + ")";
        }
    }

    public abstract com.amazon.aps.iva.vq.d a();
}
