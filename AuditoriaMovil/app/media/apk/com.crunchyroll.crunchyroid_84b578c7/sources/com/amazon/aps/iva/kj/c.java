package com.amazon.aps.iva.kj;

import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.playback.model.SessionState;
import com.google.android.gms.ads.AdRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: UriPlayerStreamsData.kt */
/* loaded from: classes.dex */
public abstract class c {

    /* compiled from: UriPlayerStreamsData.kt */
    /* loaded from: classes.dex */
    public static final class a extends c {
        public final String a;
        public final String b;
        public final String c;
        public final v d;
        public final boolean e;
        public final IOException f;
        public final List<d> g;

        public a() {
            throw null;
        }

        public a(String str, String str2, v vVar, boolean z, ArrayList arrayList, int i) {
            String str3 = (i & 2) != 0 ? "" : null;
            str2 = (i & 4) != 0 ? null : str2;
            vVar = (i & 8) != 0 ? null : vVar;
            List list = (i & 64) != 0 ? z.b : arrayList;
            j.f(str, "assetId");
            j.f(str3, "captionUrl");
            j.f(list, "subtitles");
            this.a = str;
            this.b = str3;
            this.c = str2;
            this.d = vVar;
            this.e = z;
            this.f = null;
            this.g = list;
        }

        @Override // com.amazon.aps.iva.kj.c
        public final String a() {
            return this.a;
        }

        @Override // com.amazon.aps.iva.kj.c
        public final String b() {
            return this.c;
        }

        @Override // com.amazon.aps.iva.kj.c
        public final String c() {
            return this.b;
        }

        @Override // com.amazon.aps.iva.kj.c
        public final IOException d() {
            return this.f;
        }

        @Override // com.amazon.aps.iva.kj.c
        public final List<d> e() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b) && j.a(this.c, aVar.c) && j.a(this.d, aVar.d) && this.e == aVar.e && j.a(this.f, aVar.f) && j.a(this.g, aVar.g)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int b = com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
            int i = 0;
            String str = this.c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (b + hashCode) * 31;
            v vVar = this.d;
            if (vVar == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = vVar.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            boolean z = this.e;
            int i4 = z;
            if (z != 0) {
                i4 = 1;
            }
            int i5 = (i3 + i4) * 31;
            IOException iOException = this.f;
            if (iOException != null) {
                i = iOException.hashCode();
            }
            return this.g.hashCode() + ((i5 + i) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlayerLocalMediaSourceData(assetId=");
            sb.append(this.a);
            sb.append(", captionUrl=");
            sb.append(this.b);
            sb.append(", bifUrl=");
            sb.append(this.c);
            sb.append(", mediaSource=");
            sb.append(this.d);
            sb.append(", isDownloadComplete=");
            sb.append(this.e);
            sb.append(", error=");
            sb.append(this.f);
            sb.append(", subtitles=");
            return com.amazon.aps.iva.oa.a.b(sb, this.g, ")");
        }
    }

    /* compiled from: UriPlayerStreamsData.kt */
    /* loaded from: classes.dex */
    public static final class b extends c {
        public final String a;
        public final String b;
        public final String c;
        public final com.amazon.aps.iva.kj.b d;
        public final String e;
        public final List<d> f;
        public final String g;
        public final boolean h;
        public final IOException i;
        public final SessionState j;

        public b() {
            throw null;
        }

        public b(String str, String str2, com.amazon.aps.iva.kj.b bVar, String str3, ArrayList arrayList, String str4, IOException iOException, SessionState sessionState, int i) {
            String str5 = (i & 2) != 0 ? "" : null;
            str2 = (i & 4) != 0 ? null : str2;
            bVar = (i & 8) != 0 ? com.amazon.aps.iva.kj.b.DASH : bVar;
            str3 = (i & 16) != 0 ? null : str3;
            List list = (i & 32) != 0 ? z.b : arrayList;
            str4 = (i & 64) != 0 ? null : str4;
            boolean z = (i & 128) != 0;
            iOException = (i & 256) != 0 ? null : iOException;
            sessionState = (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : sessionState;
            j.f(str, "assetId");
            j.f(str5, "captionUrl");
            j.f(bVar, "streamProtocol");
            j.f(list, "subtitles");
            this.a = str;
            this.b = str5;
            this.c = str2;
            this.d = bVar;
            this.e = str3;
            this.f = list;
            this.g = str4;
            this.h = z;
            this.i = iOException;
            this.j = sessionState;
        }

        @Override // com.amazon.aps.iva.kj.c
        public final String a() {
            return this.a;
        }

        @Override // com.amazon.aps.iva.kj.c
        public final String b() {
            return this.c;
        }

        @Override // com.amazon.aps.iva.kj.c
        public final String c() {
            return this.b;
        }

        @Override // com.amazon.aps.iva.kj.c
        public final IOException d() {
            return this.i;
        }

        @Override // com.amazon.aps.iva.kj.c
        public final List<d> e() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (j.a(this.a, bVar.a) && j.a(this.b, bVar.b) && j.a(this.c, bVar.c) && this.d == bVar.d && j.a(this.e, bVar.e) && j.a(this.f, bVar.f) && j.a(this.g, bVar.g) && this.h == bVar.h && j.a(this.i, bVar.i) && j.a(this.j, bVar.j)) {
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
            int b = com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
            int i = 0;
            String str = this.c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode5 = (this.d.hashCode() + ((b + hashCode) * 31)) * 31;
            String str2 = this.e;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int a = defpackage.a.a(this.f, (hashCode5 + hashCode2) * 31, 31);
            String str3 = this.g;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i2 = (a + hashCode3) * 31;
            boolean z = this.h;
            int i3 = z;
            if (z != 0) {
                i3 = 1;
            }
            int i4 = (i2 + i3) * 31;
            IOException iOException = this.i;
            if (iOException == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = iOException.hashCode();
            }
            int i5 = (i4 + hashCode4) * 31;
            SessionState sessionState = this.j;
            if (sessionState != null) {
                i = sessionState.hashCode();
            }
            return i5 + i;
        }

        public final String toString() {
            return "UriPlayerStreamsData(assetId=" + this.a + ", captionUrl=" + this.b + ", bifUrl=" + this.c + ", streamProtocol=" + this.d + ", streamsUri=" + this.e + ", subtitles=" + this.f + ", videoToken=" + this.g + ", isContentAvailable=" + this.h + ", error=" + this.i + ", sessionState=" + this.j + ")";
        }
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract IOException d();

    public abstract List<d> e();
}
