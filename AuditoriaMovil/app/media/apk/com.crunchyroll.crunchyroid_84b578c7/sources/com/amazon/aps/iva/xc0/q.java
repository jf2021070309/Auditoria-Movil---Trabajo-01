package com.amazon.aps.iva.xc0;

import java.util.Arrays;
/* compiled from: JavaClassFinder.kt */
/* loaded from: classes4.dex */
public interface q {

    /* compiled from: JavaClassFinder.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public final com.amazon.aps.iva.nd0.b a;
        public final byte[] b;
        public final com.amazon.aps.iva.ed0.g c;

        public a(com.amazon.aps.iva.nd0.b bVar, com.amazon.aps.iva.ed0.g gVar, int i) {
            gVar = (i & 4) != 0 ? null : gVar;
            this.a = bVar;
            this.b = null;
            this.c = gVar;
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
            int i = 0;
            byte[] bArr = this.b;
            if (bArr == null) {
                hashCode = 0;
            } else {
                hashCode = Arrays.hashCode(bArr);
            }
            int i2 = (hashCode2 + hashCode) * 31;
            com.amazon.aps.iva.ed0.g gVar = this.c;
            if (gVar != null) {
                i = gVar.hashCode();
            }
            return i2 + i;
        }

        public final String toString() {
            return "Request(classId=" + this.a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.b) + ", outerClass=" + this.c + ')';
        }
    }

    void a(com.amazon.aps.iva.nd0.c cVar);

    com.amazon.aps.iva.uc0.b0 b(com.amazon.aps.iva.nd0.c cVar);

    com.amazon.aps.iva.uc0.r c(a aVar);
}
