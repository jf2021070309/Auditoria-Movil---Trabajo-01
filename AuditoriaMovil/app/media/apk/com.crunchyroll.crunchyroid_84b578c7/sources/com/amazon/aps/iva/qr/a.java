package com.amazon.aps.iva.qr;

import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
/* compiled from: SpanEvent.kt */
/* loaded from: classes2.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;
    public final long i;
    public final d j;
    public final c k;

    /* compiled from: SpanEvent.kt */
    /* renamed from: com.amazon.aps.iva.qr.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0654a {
        public final f a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public C0654a(f fVar, String str, String str2, String str3, String str4) {
            j.f(str4, "connectivity");
            this.a = fVar;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0654a)) {
                return false;
            }
            C0654a c0654a = (C0654a) obj;
            if (j.a(this.a, c0654a.a) && j.a(this.b, c0654a.b) && j.a(this.c, c0654a.c) && j.a(this.d, c0654a.d) && j.a(this.e, c0654a.e)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int i = 0;
            f fVar = this.a;
            if (fVar == null) {
                hashCode = 0;
            } else {
                hashCode = fVar.hashCode();
            }
            int i2 = hashCode * 31;
            String str = this.b;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            String str2 = this.c;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            String str3 = this.d;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return this.e.hashCode() + ((i4 + i) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Client(simCarrier=");
            sb.append(this.a);
            sb.append(", signalStrength=");
            sb.append(this.b);
            sb.append(", downlinkKbps=");
            sb.append(this.c);
            sb.append(", uplinkKbps=");
            sb.append(this.d);
            sb.append(", connectivity=");
            return defpackage.b.c(sb, this.e, ")");
        }
    }

    /* compiled from: SpanEvent.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        public final String a;

        public b() {
            this(CredentialsData.CREDENTIALS_TYPE_ANDROID);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && j.a(this.a, ((b) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return defpackage.b.c(new StringBuilder("Dd(source="), this.a, ")");
        }

        public b(String str) {
            this.a = str;
        }
    }

    /* compiled from: SpanEvent.kt */
    /* loaded from: classes2.dex */
    public static final class c {
        public static final String[] h = {"version", "_dd", "span", "tracer", "usr", "network"};
        public final String a;
        public final b b;
        public final g c;
        public final h d;
        public final i e;
        public final e f;
        public final Map<String, String> g;

        public c(String str, b bVar, g gVar, h hVar, i iVar, e eVar, Map<String, String> map) {
            j.f(str, "version");
            this.a = str;
            this.b = bVar;
            this.c = gVar;
            this.d = hVar;
            this.e = iVar;
            this.f = eVar;
            this.g = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (j.a(this.a, cVar.a) && j.a(this.b, cVar.b) && j.a(this.c, cVar.c) && j.a(this.d, cVar.d) && j.a(this.e, cVar.e) && j.a(this.f, cVar.f) && j.a(this.g, cVar.g)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = this.c.hashCode();
            int hashCode3 = this.d.hashCode();
            int hashCode4 = this.e.hashCode();
            int hashCode5 = this.f.hashCode();
            return this.g.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Meta(version=" + this.a + ", dd=" + this.b + ", span=" + this.c + ", tracer=" + this.d + ", usr=" + this.e + ", network=" + this.f + ", additionalProperties=" + this.g + ")";
        }
    }

    /* compiled from: SpanEvent.kt */
    /* loaded from: classes2.dex */
    public static final class e {
        public final C0654a a;

        public e(C0654a c0654a) {
            this.a = c0654a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof e) && j.a(this.a, ((e) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Network(client=" + this.a + ")";
        }
    }

    /* compiled from: SpanEvent.kt */
    /* loaded from: classes2.dex */
    public static final class f {
        public final String a;
        public final String b;

        public f() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (j.a(this.a, fVar.a) && j.a(this.b, fVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int i = 0;
            String str = this.a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = hashCode * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return i2 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SimCarrier(id=");
            sb.append(this.a);
            sb.append(", name=");
            return defpackage.b.c(sb, this.b, ")");
        }

        public f(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* compiled from: SpanEvent.kt */
    /* loaded from: classes2.dex */
    public static final class g {
    }

    /* compiled from: SpanEvent.kt */
    /* loaded from: classes2.dex */
    public static final class h {
        public final String a;

        public h(String str) {
            j.f(str, "version");
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof h) && j.a(this.a, ((h) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return defpackage.b.c(new StringBuilder("Tracer(version="), this.a, ")");
        }
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, long j3, d dVar, c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = dVar;
        this.k = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b) && j.a(this.c, aVar.c) && j.a(this.d, aVar.d) && j.a(this.e, aVar.e) && j.a(this.f, aVar.f) && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && j.a(this.j, aVar.j) && j.a(this.k, aVar.k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int a = com.amazon.aps.iva.b8.i.a(this.i, com.amazon.aps.iva.b8.i.a(this.h, com.amazon.aps.iva.b8.i.a(this.g, com.amazon.aps.iva.c80.a.b(this.f, com.amazon.aps.iva.c80.a.b(this.e, com.amazon.aps.iva.c80.a.b(this.d, com.amazon.aps.iva.c80.a.b(this.c, com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        return this.k.hashCode() + ((this.j.hashCode() + a) * 31);
    }

    public final String toString() {
        return "SpanEvent(traceId=" + this.a + ", spanId=" + this.b + ", parentId=" + this.c + ", resource=" + this.d + ", name=" + this.e + ", service=" + this.f + ", duration=" + this.g + ", start=" + this.h + ", error=" + this.i + ", metrics=" + this.j + ", meta=" + this.k + ")";
    }

    /* compiled from: SpanEvent.kt */
    /* loaded from: classes2.dex */
    public static final class d {
        public static final String[] c = {"_top_level"};
        public final Long a;
        public final Map<String, Number> b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Long l, Map<String, ? extends Number> map) {
            j.f(map, "additionalProperties");
            this.a = l;
            this.b = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (j.a(this.a, dVar.a) && j.a(this.b, dVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            Long l = this.a;
            if (l == null) {
                hashCode = 0;
            } else {
                hashCode = l.hashCode();
            }
            return this.b.hashCode() + (hashCode * 31);
        }

        public final String toString() {
            return "Metrics(topLevel=" + this.a + ", additionalProperties=" + this.b + ")";
        }

        public d() {
            this(null, a0.b);
        }
    }

    /* compiled from: SpanEvent.kt */
    /* loaded from: classes2.dex */
    public static final class i {
        public static final String[] e = {"id", AppMeasurementSdk.ConditionalUserProperty.NAME, Scopes.EMAIL};
        public final String a;
        public final String b;
        public final String c;
        public final Map<String, Object> d;

        public i(String str, String str2, String str3, Map<String, ? extends Object> map) {
            j.f(map, "additionalProperties");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (j.a(this.a, iVar.a) && j.a(this.b, iVar.b) && j.a(this.c, iVar.c) && j.a(this.d, iVar.d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int i = 0;
            String str = this.a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = hashCode * 31;
            String str2 = this.b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            String str3 = this.c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return this.d.hashCode() + ((i3 + i) * 31);
        }

        public final String toString() {
            return "Usr(id=" + this.a + ", name=" + this.b + ", email=" + this.c + ", additionalProperties=" + this.d + ")";
        }

        public i() {
            this(null, null, null, a0.b);
        }
    }
}
