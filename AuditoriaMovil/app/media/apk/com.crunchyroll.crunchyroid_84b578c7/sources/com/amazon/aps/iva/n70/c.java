package com.amazon.aps.iva.n70;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.c0;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.h3.a;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.ui.R;
import com.ellation.widgets.overflow.OverflowButton;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: OverflowMenu.kt */
/* loaded from: classes2.dex */
public final class c {

    /* compiled from: OverflowMenu.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<i, Integer, q> {
        public final /* synthetic */ T h;
        public final /* synthetic */ com.amazon.aps.iva.n70.d<T> i;
        public final /* synthetic */ com.amazon.aps.iva.a1.f j;
        public final /* synthetic */ long k;
        public final /* synthetic */ int l;
        public final /* synthetic */ int m;
        public final /* synthetic */ int n;
        public final /* synthetic */ int o;
        public final /* synthetic */ int p;
        public final /* synthetic */ int q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(T t, com.amazon.aps.iva.n70.d<T> dVar, com.amazon.aps.iva.a1.f fVar, long j, int i, int i2, int i3, int i4, int i5, int i6) {
            super(2);
            this.h = t;
            this.i = dVar;
            this.j = fVar;
            this.k = j;
            this.l = i;
            this.m = i2;
            this.n = i3;
            this.o = i4;
            this.p = i5;
            this.q = i6;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            c.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, iVar, com.amazon.aps.iva.ff0.b.I(this.p | 1), this.q);
            return q.a;
        }
    }

    /* compiled from: OverflowMenu.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.c(c0Var2, this.h);
            return q.a;
        }
    }

    /* compiled from: OverflowMenu.kt */
    /* renamed from: com.amazon.aps.iva.n70.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0532c extends l implements com.amazon.aps.iva.xb0.l<c0, q> {
        public static final C0532c h = new C0532c();

        static {
        }

        public C0532c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(c0 c0Var) {
            c0 c0Var2 = c0Var;
            j.f(c0Var2, "$this$semantics");
            y.e(c0Var2, "overflow_menu");
            return q.a;
        }
    }

    /* compiled from: OverflowMenu.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.l<Context, OverflowButton> {
        public final /* synthetic */ long h;
        public final /* synthetic */ int i;
        public final /* synthetic */ int j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, int i2, int i3, int i4, long j) {
            super(1);
            this.h = j;
            this.i = i;
            this.j = i2;
            this.k = i3;
            this.l = i4;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final OverflowButton invoke(Context context) {
            Context context2 = context;
            j.f(context2, "context");
            OverflowButton overflowButton = new OverflowButton(context2, null, 6, 0);
            overflowButton.setRippleEffect(context2);
            Drawable drawable = com.amazon.aps.iva.d3.a.getDrawable(context2, R.drawable.ic_overflow_new_button);
            j.c(drawable);
            a.b.g(drawable, i.G(this.h));
            overflowButton.setImageDrawable(drawable);
            overflowButton.setPaddingRelative(com.amazon.aps.iva.xw.q.c(this.i, context2), com.amazon.aps.iva.xw.q.c(this.j, context2), com.amazon.aps.iva.xw.q.c(this.k, context2), com.amazon.aps.iva.xw.q.c(this.l, context2));
            return overflowButton;
        }
    }

    /* compiled from: OverflowMenu.kt */
    /* loaded from: classes2.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.l<OverflowButton, q> {
        public static final e h = new e();

        static {
        }

        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(OverflowButton overflowButton) {
            j.f(overflowButton, "it");
            return q.a;
        }
    }

    /* compiled from: OverflowMenu.kt */
    /* loaded from: classes2.dex */
    public static final class f extends l implements com.amazon.aps.iva.xb0.l<OverflowButton, q> {
        public final /* synthetic */ com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> aVar) {
            super(1);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(OverflowButton overflowButton) {
            OverflowButton overflowButton2 = overflowButton;
            j.f(overflowButton2, "overflowButton");
            overflowButton2.G(this.h, null, null, null, null);
            return q.a;
        }
    }

    /* compiled from: OverflowMenu.kt */
    /* loaded from: classes2.dex */
    public static final class g extends l implements p<i, Integer, q> {
        public final /* synthetic */ com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> h;
        public final /* synthetic */ com.amazon.aps.iva.a1.f i;
        public final /* synthetic */ long j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;
        public final /* synthetic */ int m;
        public final /* synthetic */ int n;
        public final /* synthetic */ int o;
        public final /* synthetic */ int p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> aVar, com.amazon.aps.iva.a1.f fVar, long j, int i, int i2, int i3, int i4, int i5, int i6) {
            super(2);
            this.h = aVar;
            this.i = fVar;
            this.j = j;
            this.k = i;
            this.l = i2;
            this.m = i3;
            this.n = i4;
            this.o = i5;
            this.p = i6;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            num.intValue();
            c.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, iVar, com.amazon.aps.iva.ff0.b.I(this.o | 1), this.p);
            return q.a;
        }
    }

    public static final <T> void a(T t, com.amazon.aps.iva.n70.d<T> dVar, com.amazon.aps.iva.a1.f fVar, long j, int i, int i2, int i3, int i4, i iVar, int i5, int i6) {
        f.a aVar;
        long j2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        j.f(dVar, "overflowMenuProvider");
        com.amazon.aps.iva.o0.j g2 = iVar.g(1288941608);
        if ((i6 & 4) != 0) {
            aVar = f.a.c;
        } else {
            aVar = fVar;
        }
        if ((i6 & 8) != 0) {
            j2 = com.amazon.aps.iva.ao.a.j;
            i7 = i5 & (-7169);
        } else {
            j2 = j;
            i7 = i5;
        }
        if ((i6 & 16) != 0) {
            i8 = 0;
        } else {
            i8 = i;
        }
        if ((i6 & 32) != 0) {
            i9 = 0;
        } else {
            i9 = i2;
        }
        if ((i6 & 64) != 0) {
            i10 = 0;
        } else {
            i10 = i3;
        }
        if ((i6 & 128) != 0) {
            i11 = 0;
        } else {
            i11 = i4;
        }
        e0.b bVar = e0.a;
        int i12 = i7 >> 3;
        b(x.m0(dVar.a(t)), aVar, j2, i8, i9, i10, i11, g2, 0 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016), 0);
        j2 X = g2.X();
        if (X != null) {
            X.d = new a(t, dVar, aVar, j2, i8, i9, i10, i11, i5, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0140 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017f A[LOOP:0: B:110:0x017c->B:112:0x017f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.n70.b> r17, com.amazon.aps.iva.a1.f r18, long r19, int r21, int r22, int r23, int r24, com.amazon.aps.iva.o0.i r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.n70.c.b(com.amazon.aps.iva.pe0.a, com.amazon.aps.iva.a1.f, long, int, int, int, int, com.amazon.aps.iva.o0.i, int, int):void");
    }
}
