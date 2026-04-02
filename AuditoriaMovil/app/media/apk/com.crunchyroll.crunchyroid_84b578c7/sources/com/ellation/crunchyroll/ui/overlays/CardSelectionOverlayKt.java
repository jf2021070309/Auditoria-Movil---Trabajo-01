package com.ellation.crunchyroll.ui.overlays;

import androidx.compose.foundation.c;
import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.o;
import com.amazon.aps.iva.ao.a;
import com.amazon.aps.iva.cq.b;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.d;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.MediaError;
import kotlin.Metadata;
/* compiled from: CardSelectionOverlay.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"", "isSelected", "", "contentDescription", "Lcom/amazon/aps/iva/a1/f;", "modifier", "Lcom/amazon/aps/iva/kb0/q;", "CardSelectionOverlay", "(ZLjava/lang/String;Lcom/amazon/aps/iva/a1/f;Lcom/amazon/aps/iva/o0/i;II)V", "DeselectedPreview", "(Lcom/amazon/aps/iva/o0/i;I)V", "SelectedPreview", "widgets_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CardSelectionOverlayKt {
    public static final void CardSelectionOverlay(boolean z, String str, f fVar, i iVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        f b;
        j.f(str, "contentDescription");
        com.amazon.aps.iva.o0.j g = iVar.g(-1726950769);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (g.a(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (g.H(str)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (g.H(fVar)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 731) == 146 && g.h()) {
            g.A();
        } else {
            f.a aVar = f.a.c;
            if (i7 != 0) {
                fVar = aVar;
            }
            e0.b bVar = e0.a;
            if (!z) {
                j = a.z;
            } else {
                j = a.c;
            }
            b = c.b(fVar, j, p0.a);
            f a = o.a(b, false, CardSelectionOverlayKt$CardSelectionOverlay$1.INSTANCE);
            g.s(733328855);
            d0 c = com.amazon.aps.iva.d0.f.c(a.C0097a.a, false, g);
            g.s(-1323940314);
            int S = b.S(g);
            c2 P = g.P();
            e.o0.getClass();
            e.a aVar2 = e.a.b;
            com.amazon.aps.iva.v0.a a2 = u.a(a);
            if (g.a instanceof d) {
                g.z();
                if (g.M) {
                    g.w(aVar2);
                } else {
                    g.m();
                }
                b.k0(g, c, e.a.e);
                b.k0(g, P, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (g.M || !j.a(g.e0(), Integer.valueOf(S))) {
                    a.c(S, g, S, c0752a);
                }
                b.d(0, a2, new x2(g), g, 2058660585);
                int i8 = i3 << 3;
                com.amazon.aps.iva.zn.e.a(z, str, o.a(androidx.compose.foundation.layout.d.e(aVar, 4), false, CardSelectionOverlayKt$CardSelectionOverlay$2$1.INSTANCE), g, (i8 & 112) | (i8 & 896), 0);
                c.c(g, false, true, false, false);
            } else {
                b.W();
                throw null;
            }
        }
        f fVar2 = fVar;
        j2 X = g.X();
        if (X != null) {
            X.d = new CardSelectionOverlayKt$CardSelectionOverlay$3(z, str, fVar2, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DeselectedPreview(i iVar, int i) {
        com.amazon.aps.iva.o0.j g = iVar.g(420735949);
        if (i == 0 && g.h()) {
            g.A();
        } else {
            e0.b bVar = e0.a;
            CardSelectionOverlay(false, "", androidx.compose.foundation.layout.e.f(androidx.compose.foundation.layout.e.l(f.a.c, 184), (float) MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED), g, 438, 0);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new CardSelectionOverlayKt$DeselectedPreview$1(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectedPreview(i iVar, int i) {
        com.amazon.aps.iva.o0.j g = iVar.g(-1090644626);
        if (i == 0 && g.h()) {
            g.A();
        } else {
            e0.b bVar = e0.a;
            CardSelectionOverlay(true, "", androidx.compose.foundation.layout.e.f(androidx.compose.foundation.layout.e.l(f.a.c, 184), (float) MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED), g, 438, 0);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new CardSelectionOverlayKt$SelectedPreview$1(i);
        }
    }
}
