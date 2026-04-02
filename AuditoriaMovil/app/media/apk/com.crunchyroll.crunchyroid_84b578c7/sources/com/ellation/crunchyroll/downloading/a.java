package com.ellation.crunchyroll.downloading;

import com.ellation.crunchyroll.api.cms.model.streams.Streams;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: BifDownloader.kt */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: BifDownloader.kt */
    /* renamed from: com.ellation.crunchyroll.downloading.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0962a {
        public final String a;
        public final String b;
        public final String c;

        public C0962a(String str, String str2, String str3) {
            com.amazon.aps.iva.yb0.j.f(str, "downloadId");
            com.amazon.aps.iva.yb0.j.f(str2, "containerId");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0962a)) {
                return false;
            }
            C0962a c0962a = (C0962a) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, c0962a.a) && com.amazon.aps.iva.yb0.j.a(this.b, c0962a.b) && com.amazon.aps.iva.yb0.j.a(this.c, c0962a.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int b = com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
            String str = this.c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return b + hashCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BifMetadata(downloadId=");
            sb.append(this.a);
            sb.append(", containerId=");
            sb.append(this.b);
            sb.append(", seasonId=");
            return defpackage.b.c(sb, this.c, ")");
        }
    }

    void a();

    void b();

    void c(String str);

    void d(com.amazon.aps.iva.xb0.l<? super C0962a, Boolean> lVar);

    void e(PlayableAsset playableAsset, Streams streams);
}
