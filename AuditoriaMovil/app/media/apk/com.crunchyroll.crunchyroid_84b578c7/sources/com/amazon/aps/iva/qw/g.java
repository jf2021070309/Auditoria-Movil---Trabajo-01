package com.amazon.aps.iva.qw;

import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.api.cms.model.streams.Streams;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: SubtitlesDownloader.kt */
/* loaded from: classes2.dex */
public interface g {

    /* compiled from: SubtitlesDownloader.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public a(String str, String str2, String str3, String str4, String str5, String str6) {
            com.amazon.aps.iva.yb0.j.f(str, "containerId");
            com.amazon.aps.iva.yb0.j.f(str5, "downloadId");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, aVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, aVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, aVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, aVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, aVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, aVar.f)) {
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
            return this.f.hashCode() + com.amazon.aps.iva.c80.a.b(this.e, com.amazon.aps.iva.c80.a.b(this.d, com.amazon.aps.iva.c80.a.b(this.c, (hashCode2 + hashCode) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SubtitleMetadata(containerId=");
            sb.append(this.a);
            sb.append(", seasonId=");
            sb.append(this.b);
            sb.append(", fileName=");
            sb.append(this.c);
            sb.append(", filePath=");
            sb.append(this.d);
            sb.append(", downloadId=");
            sb.append(this.e);
            sb.append(", subtitleFormat=");
            return defpackage.b.c(sb, this.f, ")");
        }
    }

    void a();

    void b();

    void c(String str);

    void d(com.amazon.aps.iva.xb0.l<? super a, Boolean> lVar);

    void e(PlayableAsset playableAsset, Streams streams, com.amazon.aps.iva.xb0.a<q> aVar, com.amazon.aps.iva.xb0.l<? super Throwable, q> lVar);
}
