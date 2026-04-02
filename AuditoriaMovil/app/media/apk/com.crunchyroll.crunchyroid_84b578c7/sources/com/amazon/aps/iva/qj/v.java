package com.amazon.aps.iva.qj;

import com.amazon.aps.iva.o0.t1;
/* compiled from: VideoUrlError.kt */
/* loaded from: classes.dex */
public abstract class v {

    /* compiled from: VideoUrlError.kt */
    /* loaded from: classes.dex */
    public static final class a extends v {
        public static final a a = new a();
    }

    /* compiled from: VideoUrlError.kt */
    /* loaded from: classes.dex */
    public static final class b extends v {
        public final Integer a;
        public final String b;

        public b() {
            this(3, (String) null);
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
            int hashCode;
            int i = 0;
            Integer num = this.a;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int i2 = hashCode * 31;
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return i2 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoUrlHttpError(code=");
            sb.append(this.a);
            sb.append(", message=");
            return t1.b(sb, this.b, ')');
        }

        public b(String str, Integer num) {
            this.a = num;
            this.b = str;
        }

        public /* synthetic */ b(int i, String str) {
            this((i & 2) != 0 ? null : str, (Integer) null);
        }
    }
}
