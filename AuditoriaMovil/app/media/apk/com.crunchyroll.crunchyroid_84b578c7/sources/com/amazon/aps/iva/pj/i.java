package com.amazon.aps.iva.pj;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.qj.n;
import com.amazon.aps.iva.qj.o;
import com.amazon.aps.iva.qj.p;
/* compiled from: Events.kt */
/* loaded from: classes.dex */
public abstract class i implements com.amazon.aps.iva.pj.a {

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class a extends i {
        public final o a;
        public final n b;
        public final long c;
        public final Throwable d;
        public final String e;

        public a(o oVar, n nVar, long j, Throwable th, String str) {
            this.a = oVar;
            this.b = nVar;
            this.c = j;
            this.d = th;
            this.e = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, aVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, aVar.b) && this.c == aVar.c && com.amazon.aps.iva.yb0.j.a(this.d, aVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, aVar.e)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int a = com.amazon.aps.iva.b8.i.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
            int i = 0;
            Throwable th = this.d;
            if (th == null) {
                hashCode = 0;
            } else {
                hashCode = th.hashCode();
            }
            int i2 = (a + hashCode) * 31;
            String str = this.e;
            if (str != null) {
                i = str.hashCode();
            }
            return i2 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnalyticsError(videoMetadataContent=");
            sb.append(this.a);
            sb.append(", videoError=");
            sb.append(this.b);
            sb.append(", playHeadTime=");
            sb.append(this.c);
            sb.append(", throwable=");
            sb.append(this.d);
            sb.append(", errorSegmentUrl=");
            return t1.b(sb, this.e, ')');
        }
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class c extends i {
        public final o a;
        public final int b;
        public final int c;
        public final double d;
        public final double e;

        public c(o oVar, int i, int i2, double d, double d2) {
            this.a = oVar;
            this.b = i;
            this.c = i2;
            this.d = d;
            this.e = d2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && com.amazon.aps.iva.yb0.j.a(Double.valueOf(this.d), Double.valueOf(cVar.d)) && com.amazon.aps.iva.yb0.j.a(Double.valueOf(this.e), Double.valueOf(cVar.e))) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int a = r.a(this.c, r.a(this.b, this.a.hashCode() * 31, 31), 31);
            return Double.hashCode(this.e) + ((Double.hashCode(this.d) + a) * 31);
        }

        public final String toString() {
            return "VideoAdImpression(videoMetadataContent=" + this.a + ", breakPosition=" + this.b + ", slotPosition=" + this.c + ", playheadTime=" + this.d + ", duration=" + this.e + ')';
        }
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class d extends i {
        public final o a;
        public final long b;
        public final long c;
        public final long d;
        public final com.amazon.aps.iva.qj.d e;

        public d(o oVar, long j, long j2, long j3, com.amazon.aps.iva.qj.d dVar) {
            com.amazon.aps.iva.yb0.j.f(oVar, "videoMetadataContent");
            com.amazon.aps.iva.yb0.j.f(dVar, "playbackSource");
            this.a = oVar;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode() + com.amazon.aps.iva.b8.i.a(this.d, com.amazon.aps.iva.b8.i.a(this.c, com.amazon.aps.iva.b8.i.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            return "VideoHeartbeat(videoMetadataContent=" + this.a + ", millisecondsViewed=" + this.b + ", elapsedDeltaMs=" + this.c + ", playHeadTimeMs=" + this.d + ", playbackSource=" + this.e + ')';
        }
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class e extends i {
        public final o a;
        public final com.amazon.aps.iva.qj.d b;
        public final o c;
        public final boolean d;
        public final Long e;

        public e(o oVar, com.amazon.aps.iva.qj.d dVar, o oVar2, boolean z, Long l) {
            com.amazon.aps.iva.yb0.j.f(oVar, "videoMetadataContent");
            com.amazon.aps.iva.yb0.j.f(dVar, "playbackSource");
            this.a = oVar;
            this.b = dVar;
            this.c = oVar2;
            this.d = z;
            this.e = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, eVar.a) && this.b == eVar.b && com.amazon.aps.iva.yb0.j.a(this.c, eVar.c) && this.d == eVar.d && com.amazon.aps.iva.yb0.j.a(this.e, eVar.e)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode;
            int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            int i = 0;
            o oVar = this.c;
            if (oVar == null) {
                hashCode = 0;
            } else {
                hashCode = oVar.hashCode();
            }
            int i2 = (hashCode2 + hashCode) * 31;
            boolean z = this.d;
            int i3 = z;
            if (z != 0) {
                i3 = 1;
            }
            int i4 = (i2 + i3) * 31;
            Long l = this.e;
            if (l != null) {
                i = l.hashCode();
            }
            return i4 + i;
        }

        public final String toString() {
            return "VideoPlayRequested(videoMetadataContent=" + this.a + ", playbackSource=" + this.b + ", previousMedia=" + this.c + ", videoPlayedFromBeginning=" + this.d + ", playbackPosition=" + this.e + ')';
        }
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class b extends i {
        public final o a;
        public final p b;

        public b(o oVar, p pVar) {
            com.amazon.aps.iva.yb0.j.f(oVar, "videoMetadataContent");
            com.amazon.aps.iva.yb0.j.f(pVar, "eventAttributes");
            this.a = oVar;
            this.b = pVar;
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
            return "SessionCompleteEvent(videoMetadataContent=" + this.a + ", eventAttributes=" + this.b + ')';
        }

        public b() {
            this(new o(null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, -1, 15), new p(0));
        }
    }
}
