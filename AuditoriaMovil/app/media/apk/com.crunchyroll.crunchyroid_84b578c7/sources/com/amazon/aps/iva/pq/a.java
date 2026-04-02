package com.amazon.aps.iva.pq;

import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Map;
import java.util.NoSuchElementException;
/* compiled from: LogEvent.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final String[] k = {"status", "service", "message", "date", "logger", "usr", "network", "error", "ddtags"};
    public final f a;
    public final String b;
    public final String c;
    public final String d;
    public final c e;
    public final g f;
    public final d g;
    public final b h;
    public final String i;
    public final Map<String, Object> j;

    /* compiled from: LogEvent.kt */
    /* renamed from: com.amazon.aps.iva.pq.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0625a {
        public final e a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public C0625a(e eVar, String str, String str2, String str3, String str4) {
            j.f(str4, "connectivity");
            this.a = eVar;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0625a)) {
                return false;
            }
            C0625a c0625a = (C0625a) obj;
            if (j.a(this.a, c0625a.a) && j.a(this.b, c0625a.b) && j.a(this.c, c0625a.c) && j.a(this.d, c0625a.d) && j.a(this.e, c0625a.e)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int i = 0;
            e eVar = this.a;
            if (eVar == null) {
                hashCode = 0;
            } else {
                hashCode = eVar.hashCode();
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

    /* compiled from: LogEvent.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        public final String a;
        public final String b;
        public final String c;

        public b() {
            this(null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (j.a(this.a, bVar.a) && j.a(this.b, bVar.b) && j.a(this.c, bVar.c)) {
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
            return i3 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Error(kind=");
            sb.append(this.a);
            sb.append(", message=");
            sb.append(this.b);
            sb.append(", stack=");
            return defpackage.b.c(sb, this.c, ")");
        }

        public b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    /* compiled from: LogEvent.kt */
    /* loaded from: classes2.dex */
    public static final class c {
        public final String a;
        public final String b;
        public final String c;

        public c(String str, String str2, String str3) {
            j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            j.f(str3, "version");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (j.a(this.a, cVar.a) && j.a(this.b, cVar.b) && j.a(this.c, cVar.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = this.a.hashCode() * 31;
            String str = this.b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return this.c.hashCode() + ((hashCode2 + hashCode) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Logger(name=");
            sb.append(this.a);
            sb.append(", threadName=");
            sb.append(this.b);
            sb.append(", version=");
            return defpackage.b.c(sb, this.c, ")");
        }
    }

    /* compiled from: LogEvent.kt */
    /* loaded from: classes2.dex */
    public static final class d {
        public final C0625a a;

        public d(C0625a c0625a) {
            this.a = c0625a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && j.a(this.a, ((d) obj).a)) {
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

    /* compiled from: LogEvent.kt */
    /* loaded from: classes2.dex */
    public static final class e {
        public final String a;
        public final String b;

        public e() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (j.a(this.a, eVar.a) && j.a(this.b, eVar.b)) {
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

        public e(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* compiled from: LogEvent.kt */
    /* loaded from: classes2.dex */
    public enum f {
        CRITICAL("critical"),
        ERROR("error"),
        WARN("warn"),
        INFO("info"),
        DEBUG("debug"),
        TRACE("trace"),
        EMERGENCY(MediaTrack.ROLE_EMERGENCY);
        
        public static final C0626a Companion = new C0626a();
        private final String jsonValue;

        /* compiled from: LogEvent.kt */
        /* renamed from: com.amazon.aps.iva.pq.a$f$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0626a {
        }

        f(String str) {
            this.jsonValue = str;
        }

        public static final f fromJson(String str) {
            Companion.getClass();
            j.f(str, "serializedObject");
            f[] values = values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                f fVar = values[i];
                i++;
                if (j.a(fVar.jsonValue, str)) {
                    return fVar;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    public a(f fVar, String str, String str2, String str3, c cVar, g gVar, d dVar, b bVar, String str4, Map<String, ? extends Object> map) {
        j.f(fVar, "status");
        j.f(str, "service");
        j.f(str2, "message");
        this.a = fVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = cVar;
        this.f = gVar;
        this.g = dVar;
        this.h = bVar;
        this.i = str4;
        this.j = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && j.a(this.b, aVar.b) && j.a(this.c, aVar.c) && j.a(this.d, aVar.d) && j.a(this.e, aVar.e) && j.a(this.f, aVar.f) && j.a(this.g, aVar.g) && j.a(this.h, aVar.h) && j.a(this.i, aVar.i) && j.a(this.j, aVar.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.e.hashCode() + com.amazon.aps.iva.c80.a.b(this.d, com.amazon.aps.iva.c80.a.b(this.c, com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31), 31), 31)) * 31;
        int i = 0;
        g gVar = this.f;
        if (gVar == null) {
            hashCode = 0;
        } else {
            hashCode = gVar.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        d dVar = this.g;
        if (dVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = dVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        b bVar = this.h;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return this.j.hashCode() + com.amazon.aps.iva.c80.a.b(this.i, (i3 + i) * 31, 31);
    }

    public final String toString() {
        return "LogEvent(status=" + this.a + ", service=" + this.b + ", message=" + this.c + ", date=" + this.d + ", logger=" + this.e + ", usr=" + this.f + ", network=" + this.g + ", error=" + this.h + ", ddtags=" + this.i + ", additionalProperties=" + this.j + ")";
    }

    /* compiled from: LogEvent.kt */
    /* loaded from: classes2.dex */
    public static final class g {
        public static final String[] e = {"id", AppMeasurementSdk.ConditionalUserProperty.NAME, Scopes.EMAIL};
        public final String a;
        public final String b;
        public final String c;
        public final Map<String, Object> d;

        public g(String str, String str2, String str3, Map<String, ? extends Object> map) {
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
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (j.a(this.a, gVar.a) && j.a(this.b, gVar.b) && j.a(this.c, gVar.c) && j.a(this.d, gVar.d)) {
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

        public g() {
            this(null, null, null, a0.b);
        }
    }
}
