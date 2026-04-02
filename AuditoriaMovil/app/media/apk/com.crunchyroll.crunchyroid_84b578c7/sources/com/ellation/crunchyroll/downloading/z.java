package com.ellation.crunchyroll.downloading;
/* compiled from: ImageDownloader.kt */
/* loaded from: classes2.dex */
public interface z {

    /* compiled from: ImageDownloader.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            com.amazon.aps.iva.yb0.j.f(str, "containerId");
            com.amazon.aps.iva.yb0.j.f(str3, "downloadId");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, aVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, aVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, aVar.c)) {
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
            StringBuilder sb = new StringBuilder("ImageMetadata(containerId=");
            sb.append(this.a);
            sb.append(", seasonId=");
            sb.append(this.b);
            sb.append(", downloadId=");
            return defpackage.b.c(sb, this.c, ")");
        }
    }

    void a();

    void b();

    void c(com.amazon.aps.iva.xb0.l<? super a, Boolean> lVar);

    void d(com.amazon.aps.iva.sw.b bVar);

    void e(String str);
}
