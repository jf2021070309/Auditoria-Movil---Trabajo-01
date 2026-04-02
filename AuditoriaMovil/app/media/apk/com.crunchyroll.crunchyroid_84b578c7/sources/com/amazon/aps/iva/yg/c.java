package com.amazon.aps.iva.yg;

import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.xb0.l;
/* compiled from: AccountPendingStateFeature.kt */
/* loaded from: classes.dex */
public interface c {

    /* compiled from: AccountPendingStateFeature.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static com.amazon.aps.iva.zg.e a;
        public static d b;
    }

    /* compiled from: AccountPendingStateFeature.kt */
    /* loaded from: classes.dex */
    public static final class b implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ l a;

        public b(com.amazon.aps.iva.yg.b bVar) {
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    boolean c();

    com.amazon.aps.iva.bj.j f(Fragment fragment);
}
