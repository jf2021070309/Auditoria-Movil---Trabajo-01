package com.amazon.aps.iva.hr;

import com.amazon.aps.iva.cq.c;
import com.amazon.aps.iva.sq.i;
import com.amazon.aps.iva.wq.d;
import com.amazon.aps.iva.yb0.j;
import java.util.LinkedHashSet;
/* compiled from: TelemetryEventHandler.kt */
/* loaded from: classes2.dex */
public final class a implements i {
    public final String a;
    public final d b;
    public final c c;
    public final com.amazon.aps.iva.zp.b d;
    public final LinkedHashSet e;

    /* compiled from: TelemetryEventHandler.kt */
    /* renamed from: com.amazon.aps.iva.hr.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0344a {
        public final String a;
        public final String b;

        public C0344a(String str, String str2) {
            j.f(str, "message");
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0344a)) {
                return false;
            }
            C0344a c0344a = (C0344a) obj;
            if (j.a(this.a, c0344a.a) && j.a(this.b, c0344a.b)) {
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
            return hashCode2 + hashCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EventIdentity(message=");
            sb.append(this.a);
            sb.append(", kind=");
            return defpackage.b.c(sb, this.b, ")");
        }
    }

    /* compiled from: TelemetryEventHandler.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.hr.b.values().length];
            iArr[com.amazon.aps.iva.hr.b.DEBUG.ordinal()] = 1;
            iArr[com.amazon.aps.iva.hr.b.ERROR.ordinal()] = 2;
            a = iArr;
        }
    }

    public a(String str, d dVar, c cVar, com.amazon.aps.iva.zp.a aVar) {
        j.f(str, "sdkVersion");
        j.f(cVar, "timeProvider");
        this.a = str;
        this.b = dVar;
        this.c = cVar;
        this.d = aVar;
        this.e = new LinkedHashSet();
    }

    @Override // com.amazon.aps.iva.sq.i
    public final void a(String str, boolean z) {
        j.f(str, "sessionId");
        this.e.clear();
    }
}
