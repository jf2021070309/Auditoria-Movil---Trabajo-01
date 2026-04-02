package com.amazon.aps.iva.um;

import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.Scopes;
/* compiled from: SwitchProfileScreen.kt */
/* loaded from: classes2.dex */
public abstract class f implements com.amazon.aps.iva.ri.c {

    /* compiled from: SwitchProfileScreen.kt */
    /* loaded from: classes2.dex */
    public static final class a extends f {
        public static final a a = new a();
    }

    /* compiled from: SwitchProfileScreen.kt */
    /* loaded from: classes2.dex */
    public static final class b extends f {
        public static final b a = new b();
    }

    /* compiled from: SwitchProfileScreen.kt */
    /* loaded from: classes2.dex */
    public static final class c extends f {
        public static final c a = new c();
    }

    /* compiled from: SwitchProfileScreen.kt */
    /* loaded from: classes2.dex */
    public static final class d extends f {
        public final com.amazon.aps.iva.ym.c a;

        public d(com.amazon.aps.iva.ym.c cVar) {
            j.f(cVar, Scopes.PROFILE);
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && j.a(this.a, ((d) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ProfileSelected(profile=" + this.a + ")";
        }
    }

    /* compiled from: SwitchProfileScreen.kt */
    /* loaded from: classes2.dex */
    public static final class e extends f {
        public static final e a = new e();
    }
}
