package com.amazon.aps.iva.i2;

import androidx.compose.ui.platform.AndroidComposeView;
import com.amazon.aps.iva.o0.w1;
/* compiled from: PlatformTextInputAdapter.kt */
/* loaded from: classes.dex */
public final class x implements w {
    public final com.amazon.aps.iva.xb0.p<v<?>, t, u> a;
    public final com.amazon.aps.iva.y0.w<v<?>, b<?>> b = new com.amazon.aps.iva.y0.w<>();
    public v<?> c;

    /* compiled from: PlatformTextInputAdapter.kt */
    /* loaded from: classes.dex */
    public final class a implements t {
        public final v<?> a;
        public final /* synthetic */ x b;

        public a(x xVar) {
            com.amazon.aps.iva.i2.a aVar = com.amazon.aps.iva.i2.a.a;
            this.b = xVar;
            this.a = aVar;
        }

        @Override // com.amazon.aps.iva.i2.t
        public final void m0() {
            this.b.c = this.a;
        }

        @Override // com.amazon.aps.iva.i2.t
        public final void n0() {
            x xVar = this.b;
            if (com.amazon.aps.iva.yb0.j.a(xVar.c, this.a)) {
                xVar.c = null;
            }
        }
    }

    /* compiled from: PlatformTextInputAdapter.kt */
    /* loaded from: classes.dex */
    public final class b<T extends u> {
        public final T a;
        public final w1 b = com.amazon.aps.iva.e.w.J(0);

        public b(T t) {
            this.a = t;
        }
    }

    public x(AndroidComposeView.g gVar) {
        this.a = gVar;
    }
}
