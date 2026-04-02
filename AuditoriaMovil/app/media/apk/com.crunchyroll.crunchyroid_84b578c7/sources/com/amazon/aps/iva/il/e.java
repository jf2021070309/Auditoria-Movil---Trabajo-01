package com.amazon.aps.iva.il;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.b;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.o;
import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.d0.v1;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.m0.a4;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.qj.r;
import com.amazon.aps.iva.qj.s;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import java.util.Locale;
/* compiled from: SkipSegmentButton.kt */
/* loaded from: classes2.dex */
public final class e {

    /* compiled from: SkipSegmentButton.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ f h;
        public final /* synthetic */ r i;

        /* compiled from: SkipSegmentButton.kt */
        /* renamed from: com.amazon.aps.iva.il.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0380a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[s.values().length];
                try {
                    iArr[s.INTRO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[s.CREDITS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[s.RECAP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[s.PREVIEW.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, r rVar) {
            super(2);
            this.h = fVar;
            this.i = rVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            int i;
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                f.a aVar = f.a.c;
                com.amazon.aps.iva.a1.f a = o.a(androidx.compose.foundation.layout.d.f(androidx.compose.foundation.f.c(androidx.compose.foundation.c.b(aVar, com.amazon.aps.iva.ao.a.v, p0.a), new c(this.h)), 16, com.amazon.aps.iva.cq.b.N(R.dimen.skip_segment_vertical_padding, iVar2)), false, d.h);
                b.C0098b c0098b = a.C0097a.k;
                iVar2.s(693286680);
                d0 a2 = v1.a(com.amazon.aps.iva.d0.a.a, c0098b, iVar2);
                iVar2.s(-1323940314);
                int S = com.amazon.aps.iva.cq.b.S(iVar2);
                c2 l = iVar2.l();
                com.amazon.aps.iva.u1.e.o0.getClass();
                e.a aVar2 = e.a.b;
                com.amazon.aps.iva.v0.a a3 = u.a(a);
                if (iVar2.j() instanceof com.amazon.aps.iva.o0.d) {
                    iVar2.z();
                    if (iVar2.e()) {
                        iVar2.w(aVar2);
                    } else {
                        iVar2.m();
                    }
                    com.amazon.aps.iva.cq.b.k0(iVar2, a2, e.a.e);
                    com.amazon.aps.iva.cq.b.k0(iVar2, l, e.a.d);
                    e.a.C0752a c0752a = e.a.f;
                    if (iVar2.e() || !com.amazon.aps.iva.yb0.j.a(iVar2.t(), Integer.valueOf(S))) {
                        b2.c(S, iVar2, S, c0752a);
                    }
                    com.amazon.aps.iva.b8.i.c(0, a3, new x2(iVar2), iVar2, 2058660585);
                    com.amazon.aps.iva.a0.p0.a(com.amazon.aps.iva.z1.b.a(R.drawable.ic_skip_segment, iVar2), null, androidx.compose.foundation.layout.d.i(aVar, 0.0f, 0.0f, 9, 0.0f, 11), null, null, 0.0f, null, iVar2, 440, 120);
                    int i2 = C0380a.a[this.i.c.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    i = R.string.player_skip_preview_button_text;
                                } else {
                                    throw new com.amazon.aps.iva.kb0.h();
                                }
                            } else {
                                i = R.string.player_skip_recap_button_text;
                            }
                        } else {
                            i = R.string.player_skip_credits_button_text;
                        }
                    } else {
                        i = R.string.player_skip_intro_button_text;
                    }
                    String upperCase = defpackage.i.E(i, iVar2).toUpperCase(Locale.ROOT);
                    com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    a4.b(upperCase, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, a0.a(16777214, x.c, 0L, 0L, null, com.amazon.aps.iva.ao.b.q, null, null, null), iVar2, 0, 0, 65534);
                    iVar2.G();
                    iVar2.o();
                    iVar2.G();
                    iVar2.G();
                } else {
                    com.amazon.aps.iva.cq.b.W();
                    throw null;
                }
            }
            return q.a;
        }
    }

    /* compiled from: SkipSegmentButton.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ f h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar, int i) {
            super(2);
            this.h = fVar;
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            e.a(this.h, iVar, I);
            return q.a;
        }
    }

    public static final void a(f fVar, com.amazon.aps.iva.o0.i iVar, int i) {
        int i2;
        int i3;
        com.amazon.aps.iva.yb0.j.f(fVar, "viewModel");
        com.amazon.aps.iva.o0.j g = iVar.g(737955197);
        if ((i & 14) == 0) {
            if (g.H(fVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && g.h()) {
            g.A();
        } else {
            e0.b bVar = e0.a;
            r rVar = (r) com.amazon.aps.iva.cq.b.I(fVar.w0(), g).getValue();
            if (rVar != null) {
                com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(g, -496150783, new a(fVar, rVar)), g, 6);
            }
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new b(fVar, i);
        }
    }
}
