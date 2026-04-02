package com.amazon.aps.iva.pj;

import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.qj.k;
import com.amazon.aps.iva.qj.m;
import com.amazon.aps.iva.qj.o;
import com.amazon.aps.iva.qj.u;
import java.util.ArrayList;
import java.util.List;
/* compiled from: Events.kt */
/* loaded from: classes.dex */
public abstract class d implements com.amazon.aps.iva.pj.a {

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class a extends d {
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
            return "AudioLanguageOptionsReady(audio=null, videoVersion=null)";
        }
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class b extends d {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            if (com.amazon.aps.iva.yb0.j.a(null, null) && com.amazon.aps.iva.yb0.j.a(null, null) && com.amazon.aps.iva.yb0.j.a(null, null)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "CMSError(content=null, error=null, errorCode=null, logOnly=false)";
        }
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class c extends d {
        public static final c a = new c();
    }

    /* compiled from: Events.kt */
    /* renamed from: com.amazon.aps.iva.pj.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0620d extends d {
        public final long a;
        public final boolean b;

        public C0620d(long j, boolean z) {
            this.a = j;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0620d)) {
                return false;
            }
            C0620d c0620d = (C0620d) obj;
            if (this.a == c0620d.a && this.b == c0620d.b) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode = Long.hashCode(this.a) * 31;
            boolean z = this.b;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlayheadReady(playhead=");
            sb.append(this.a);
            sb.append(", complete=");
            return defpackage.a.b(sb, this.b, ')');
        }
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class e extends d {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            ((e) obj).getClass();
            if (com.amazon.aps.iva.yb0.j.a(null, null) && com.amazon.aps.iva.yb0.j.a(null, null)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "SubtitlesOptionsReady(subtitles=null, selectedSubtitle=null, isClosedCaptionAvailable=false)";
        }
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class f extends d {
        public final Object a;
        public final String b;
        public final String c;
        public final List<com.amazon.aps.iva.qj.h> d;
        public final com.amazon.aps.iva.qj.i e;
        public final com.amazon.aps.iva.qj.d f;
        public final String g;
        public final m h;
        public final String i;

        public f() {
            throw null;
        }

        public f(v vVar, String str, String str2, ArrayList arrayList, com.amazon.aps.iva.qj.i iVar, com.amazon.aps.iva.qj.d dVar, m mVar, String str3) {
            com.amazon.aps.iva.yb0.j.f(str, "captionUrl");
            com.amazon.aps.iva.yb0.j.f(iVar, "sourceType");
            com.amazon.aps.iva.yb0.j.f(dVar, "playbackSource");
            com.amazon.aps.iva.yb0.j.f(str3, "mediaId");
            this.a = vVar;
            this.b = str;
            this.c = str2;
            this.d = arrayList;
            this.e = iVar;
            this.f = dVar;
            this.g = null;
            this.h = mVar;
            this.i = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, fVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, fVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, fVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, fVar.d) && this.e == fVar.e && this.f == fVar.f && com.amazon.aps.iva.yb0.j.a(this.g, fVar.g) && this.h == fVar.h && com.amazon.aps.iva.yb0.j.a(this.i, fVar.i)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int i = 0;
            Object obj = this.a;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int b = com.amazon.aps.iva.c80.a.b(this.b, hashCode * 31, 31);
            String str = this.c;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int hashCode4 = (this.f.hashCode() + ((this.e.hashCode() + defpackage.a.a(this.d, (b + hashCode2) * 31, 31)) * 31)) * 31;
            String str2 = this.g;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i2 = (hashCode4 + hashCode3) * 31;
            m mVar = this.h;
            if (mVar != null) {
                i = mVar.hashCode();
            }
            return this.i.hashCode() + ((i2 + i) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoMediaSourceReady(mediaSource=");
            sb.append(this.a);
            sb.append(", captionUrl=");
            sb.append(this.b);
            sb.append(", bifUrl=");
            sb.append(this.c);
            sb.append(", subtitles=");
            sb.append(this.d);
            sb.append(", sourceType=");
            sb.append(this.e);
            sb.append(", playbackSource=");
            sb.append(this.f);
            sb.append(", videoToken=");
            sb.append(this.g);
            sb.append(", downloadState=");
            sb.append(this.h);
            sb.append(", mediaId=");
            return t1.b(sb, this.i, ')');
        }
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class g extends d {
        public final o a;
        public final com.amazon.aps.iva.qj.i b;
        public final o c;

        public g(o oVar, com.amazon.aps.iva.qj.i iVar, int i) {
            iVar = (i & 2) != 0 ? com.amazon.aps.iva.qj.i.CURRENT : iVar;
            com.amazon.aps.iva.yb0.j.f(iVar, "sourceType");
            this.a = oVar;
            this.b = iVar;
            this.c = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, gVar.a) && this.b == gVar.b && com.amazon.aps.iva.yb0.j.a(this.c, gVar.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            o oVar = this.c;
            if (oVar == null) {
                hashCode = 0;
            } else {
                hashCode = oVar.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public final String toString() {
            return "VideoMetadataReady(content=" + this.a + ", sourceType=" + this.b + ", previousWatchedContent=" + this.c + ')';
        }
    }

    /* compiled from: Events.kt */
    /* loaded from: classes.dex */
    public static final class h extends d {
        public final String a;
        public final String b;
        public final String c;
        public final Long d;
        public final com.amazon.aps.iva.qj.j e;
        public final k f;
        public final List<com.amazon.aps.iva.qj.h> g;
        public final String h;
        public final boolean i;
        public final com.amazon.aps.iva.qj.v j;
        public final com.amazon.aps.iva.qj.i k;
        public final boolean l;
        public final String m;
        public final u n;

        public h() {
            throw null;
        }

        public h(String str, String str2, String str3, com.amazon.aps.iva.qj.j jVar, k kVar, ArrayList arrayList, String str4, boolean z, com.amazon.aps.iva.qj.v vVar, com.amazon.aps.iva.qj.i iVar, boolean z2, String str5, u uVar) {
            com.amazon.aps.iva.yb0.j.f(str2, "captionUrl");
            com.amazon.aps.iva.yb0.j.f(jVar, "streamProtocol");
            com.amazon.aps.iva.yb0.j.f(iVar, "sourceType");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = null;
            this.e = jVar;
            this.f = kVar;
            this.g = arrayList;
            this.h = str4;
            this.i = z;
            this.j = vVar;
            this.k = iVar;
            this.l = z2;
            this.m = str5;
            this.n = uVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, hVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, hVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, hVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, hVar.d) && this.e == hVar.e && this.f == hVar.f && com.amazon.aps.iva.yb0.j.a(this.g, hVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, hVar.h) && this.i == hVar.i && com.amazon.aps.iva.yb0.j.a(this.j, hVar.j) && this.k == hVar.k && this.l == hVar.l && com.amazon.aps.iva.yb0.j.a(this.m, hVar.m) && com.amazon.aps.iva.yb0.j.a(this.n, hVar.n)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int hashCode7;
            int i = 0;
            String str = this.a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int b = com.amazon.aps.iva.c80.a.b(this.b, hashCode * 31, 31);
            String str2 = this.c;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i2 = (b + hashCode2) * 31;
            Long l = this.d;
            if (l == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = l.hashCode();
            }
            int hashCode8 = (this.e.hashCode() + ((i2 + hashCode3) * 31)) * 31;
            k kVar = this.f;
            if (kVar == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = kVar.hashCode();
            }
            int a = defpackage.a.a(this.g, (hashCode8 + hashCode4) * 31, 31);
            String str3 = this.h;
            if (str3 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str3.hashCode();
            }
            int i3 = (a + hashCode5) * 31;
            int i4 = 1;
            boolean z = this.i;
            int i5 = z;
            if (z != 0) {
                i5 = 1;
            }
            int i6 = (i3 + i5) * 31;
            com.amazon.aps.iva.qj.v vVar = this.j;
            if (vVar == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = vVar.hashCode();
            }
            int hashCode9 = (this.k.hashCode() + ((i6 + hashCode6) * 31)) * 31;
            boolean z2 = this.l;
            if (!z2) {
                i4 = z2 ? 1 : 0;
            }
            int i7 = (hashCode9 + i4) * 31;
            String str4 = this.m;
            if (str4 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str4.hashCode();
            }
            int i8 = (i7 + hashCode7) * 31;
            u uVar = this.n;
            if (uVar != null) {
                i = uVar.hashCode();
            }
            return i8 + i;
        }

        public final String toString() {
            return "VideoUrlReady(url=" + this.a + ", captionUrl=" + this.b + ", bifUrl=" + this.c + ", ppManifestRequestTime=" + this.d + ", streamProtocol=" + this.e + ", streamType=" + this.f + ", subtitles=" + this.g + ", videoToken=" + this.h + ", isContentAvailable=" + this.i + ", error=" + this.j + ", sourceType=" + this.k + ", enableAds=" + this.l + ", mediaId=" + this.m + ", session=" + this.n + ')';
        }
    }
}
