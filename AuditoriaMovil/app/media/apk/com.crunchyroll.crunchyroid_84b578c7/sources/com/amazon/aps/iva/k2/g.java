package com.amazon.aps.iva.k2;

import androidx.emoji2.text.d;
import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.y1;
/* compiled from: EmojiCompatStatus.kt */
/* loaded from: classes.dex */
public final class g {
    public p3<Boolean> a;

    /* compiled from: EmojiCompatStatus.kt */
    /* loaded from: classes.dex */
    public static final class a extends d.f {
        public final /* synthetic */ q1<Boolean> b;
        public final /* synthetic */ g c;

        public a(y1 y1Var, g gVar) {
            this.b = y1Var;
            this.c = gVar;
        }

        @Override // androidx.emoji2.text.d.f
        public final void a() {
            this.c.a = t.c;
        }

        @Override // androidx.emoji2.text.d.f
        public final void b() {
            this.b.setValue(Boolean.TRUE);
            this.c.a = new i(true);
        }
    }

    public g() {
        p3<Boolean> p3Var;
        if (androidx.emoji2.text.d.c()) {
            p3Var = a();
        } else {
            p3Var = null;
        }
        this.a = p3Var;
    }

    public final p3<Boolean> a() {
        androidx.emoji2.text.d a2 = androidx.emoji2.text.d.a();
        com.amazon.aps.iva.yb0.j.e(a2, "get()");
        if (a2.b() == 1) {
            return new i(true);
        }
        y1 c0 = com.amazon.aps.iva.cq.b.c0(Boolean.FALSE);
        a2.i(new a(c0, this));
        return c0;
    }
}
