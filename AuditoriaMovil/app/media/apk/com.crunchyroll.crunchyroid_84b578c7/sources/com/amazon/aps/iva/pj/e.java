package com.amazon.aps.iva.pj;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.o0.t1;
/* compiled from: Events.kt */
/* loaded from: classes.dex */
public abstract class e implements com.amazon.aps.iva.pj.a {

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static abstract class a extends e {

        /* compiled from: Events.kt */
        /* renamed from: com.amazon.aps.iva.pj.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0621a extends a {
            public final String a;

            public C0621a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0621a) && com.amazon.aps.iva.yb0.j.a(this.a, ((C0621a) obj).a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return t1.b(new StringBuilder("ExternalSubtitlesGenericError(message="), this.a, ')');
            }
        }

        /* compiled from: Events.kt */
        /* loaded from: classes.dex */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* compiled from: Events.kt */
        /* loaded from: classes.dex */
        public static final class c extends a {
            public final long a;

            public c(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof c) && this.a == ((c) obj).a) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return "ExternalSubtitlesPositionUpdated(newPositionMs=" + this.a + ')';
            }
        }

        /* compiled from: Events.kt */
        /* loaded from: classes.dex */
        public static final class d extends a {
            public static final d a = new d();
        }

        /* compiled from: Events.kt */
        /* renamed from: com.amazon.aps.iva.pj.e$a$e  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0622e extends a {
            public static final C0622e a = new C0622e();
        }

        /* compiled from: Events.kt */
        /* loaded from: classes.dex */
        public static final class f extends a {
            public final String a;

            public f(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "uri");
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof f) && com.amazon.aps.iva.yb0.j.a(this.a, ((f) obj).a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return t1.b(new StringBuilder("NewSubtitlesOptionSelected(uri="), this.a, ')');
            }
        }
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class b extends e {
        public final long a;
        public final long b;
        public final long c;
        public final int d;

        public b(long j, long j2, long j3, int i) {
            this.a = j;
            this.b = j2;
            this.c = j3;
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + com.amazon.aps.iva.b8.i.a(this.c, com.amazon.aps.iva.b8.i.a(this.b, Long.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FirstFrameRendered(renderTimeMs=");
            sb.append(this.a);
            sb.append(", initialBufferTime=");
            sb.append(this.b);
            sb.append(", playbackStallDuration=");
            sb.append(this.c);
            sb.append(", playbackStallCount=");
            return b2.b(sb, this.d, ')');
        }
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class c extends e {
        public final long a;
        public final long b;
        public final long c;

        public c(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.a == cVar.a && this.b == cVar.b && this.c == cVar.c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + com.amazon.aps.iva.b8.i.a(this.b, Long.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            return "Heartbeat(millisecondsViewed=" + this.a + ", elapsedDelta=" + this.b + ", playHeadTime=" + this.c + ')';
        }
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class d extends e {
        public final String a;
        public final long b;
        public final int c;

        public d(int i, long j, String str) {
            this.a = str;
            this.b = j;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + com.amazon.aps.iva.b8.i.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadCompleted(url=");
            sb.append(this.a);
            sb.append(", bytesLoaded=");
            sb.append(this.b);
            sb.append(", bitrate=");
            return b2.b(sb, this.c, ')');
        }
    }

    /* compiled from: Events.kt */
    /* renamed from: com.amazon.aps.iva.pj.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0623e extends e {
        public static final C0623e a = new C0623e();
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class f extends e {
        public static final f a = new f();
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class g extends e {
        public static final g a = new g();
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class h extends e {
        public final String a;
        public final int b;
        public final String c;
        public final Throwable d;
        public final long e;
        public final String f;

        public h(String str, int i, String str2, Throwable th, long j, String str3) {
            com.amazon.aps.iva.yb0.j.f(str2, "errorCodeWithGroup");
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = th;
            this.e = j;
            this.f = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, hVar.a) && this.b == hVar.b && com.amazon.aps.iva.yb0.j.a(this.c, hVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, hVar.d) && this.e == hVar.e && com.amazon.aps.iva.yb0.j.a(this.f, hVar.f)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int b = com.amazon.aps.iva.c80.a.b(this.c, r.a(this.b, this.a.hashCode() * 31, 31), 31);
            int i = 0;
            Throwable th = this.d;
            if (th == null) {
                hashCode = 0;
            } else {
                hashCode = th.hashCode();
            }
            int a = com.amazon.aps.iva.b8.i.a(this.e, (b + hashCode) * 31, 31);
            String str = this.f;
            if (str != null) {
                i = str.hashCode();
            }
            return a + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlayErrorEvent(errorMessage=");
            sb.append(this.a);
            sb.append(", errorCode=");
            sb.append(this.b);
            sb.append(", errorCodeWithGroup=");
            sb.append(this.c);
            sb.append(", throwable=");
            sb.append(this.d);
            sb.append(", playHeadTime=");
            sb.append(this.e);
            sb.append(", errorSegmentUrl=");
            return t1.b(sb, this.f, ')');
        }
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static abstract class i extends e {

        /* compiled from: Events.kt */
        /* loaded from: classes.dex */
        public static final class a extends i {
            public static final a a = new a();

            public a() {
                super(0);
            }
        }

        /* compiled from: Events.kt */
        /* loaded from: classes.dex */
        public static final class b extends i {
            public static final b a = new b();

            public b() {
                super(0);
            }
        }

        public i(int i) {
        }
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class j extends e {
        public final long a;

        public j(long j) {
            this.a = j;
        }
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class k extends e {
        public static final k a = new k();
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class l extends e {
        public static final l a = new l();
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class m extends e {
        public static final m a = new m();
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class n extends e {
        public final long a;

        public n(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof n) && this.a == ((n) obj).a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return "SeekTo(seek=" + this.a + ')';
        }
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class o extends e {
        public static final o a = new o();
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class p extends e {
        public final com.amazon.aps.iva.qj.o a;
        public final com.amazon.aps.iva.qj.i b;

        public p(com.amazon.aps.iva.qj.o oVar, com.amazon.aps.iva.qj.i iVar) {
            com.amazon.aps.iva.yb0.j.f(iVar, "sourceType");
            this.a = oVar;
            this.b = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, pVar.a) && this.b == pVar.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SwitchedToItemFromPlaylist(newItem=" + this.a + ", sourceType=" + this.b + ')';
        }
    }
}
