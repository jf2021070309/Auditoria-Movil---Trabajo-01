package com.amazon.aps.iva.pe0;

import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.lb0.c;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.List;
/* compiled from: ImmutableList.kt */
/* loaded from: classes4.dex */
public interface a<E> extends List<E>, Collection, com.amazon.aps.iva.zb0.a {

    /* compiled from: ImmutableList.kt */
    /* renamed from: com.amazon.aps.iva.pe0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0614a<E> extends c<E> implements a<E> {
        public final a<E> b;
        public final int c;
        public final int d;

        /* JADX WARN: Multi-variable type inference failed */
        public C0614a(a<? extends E> aVar, int i, int i2) {
            j.f(aVar, FirebaseAnalytics.Param.SOURCE);
            this.b = aVar;
            this.c = i;
            r.g(i, i2, aVar.size());
            this.d = i2 - i;
        }

        @Override // com.amazon.aps.iva.lb0.a
        public final int b() {
            return this.d;
        }

        @Override // java.util.List
        public final E get(int i) {
            r.e(i, this.d);
            return this.b.get(this.c + i);
        }

        @Override // com.amazon.aps.iva.lb0.c, java.util.List
        public final List subList(int i, int i2) {
            r.g(i, i2, this.d);
            int i3 = this.c;
            return new C0614a(this.b, i + i3, i3 + i2);
        }
    }
}
