package com.amazon.aps.iva.nk;

import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.qj.u;
/* compiled from: SessionHeartbeatState.kt */
/* loaded from: classes.dex */
public abstract class g {

    /* compiled from: SessionHeartbeatState.kt */
    /* loaded from: classes.dex */
    public static final class c extends g {
        public static final c a = new c();
    }

    /* compiled from: SessionHeartbeatState.kt */
    /* loaded from: classes.dex */
    public static final class d extends g {
        public static final d a = new d();
    }

    /* compiled from: SessionHeartbeatState.kt */
    /* loaded from: classes.dex */
    public static final class a extends g {
        public final u a;

        public a(u uVar) {
            this.a = uVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && com.amazon.aps.iva.yb0.j.a(this.a, ((a) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            u uVar = this.a;
            if (uVar == null) {
                return 0;
            }
            return uVar.hashCode();
        }

        public final String toString() {
            return "Active(session=" + this.a + ')';
        }

        public a() {
            this(null);
        }
    }

    /* compiled from: SessionHeartbeatState.kt */
    /* loaded from: classes.dex */
    public static final class b extends g {
        public final Integer a;
        public final String b;

        public b(String str, Integer num) {
            this.a = num;
            this.b = str;
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
            StringBuilder sb = new StringBuilder("Error(errorCode=");
            sb.append(this.a);
            sb.append(", errorMessage=");
            return t1.b(sb, this.b, ')');
        }

        public b() {
            this(null, null);
        }
    }
}
