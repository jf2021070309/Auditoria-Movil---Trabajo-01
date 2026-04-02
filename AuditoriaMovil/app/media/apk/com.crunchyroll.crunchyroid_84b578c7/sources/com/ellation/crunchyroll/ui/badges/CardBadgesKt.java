package com.ellation.crunchyroll.ui.badges;

import androidx.compose.foundation.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.e;
import androidx.compose.ui.node.e;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.b;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.o;
import com.amazon.aps.iva.ao.a;
import com.amazon.aps.iva.ao.b;
import com.amazon.aps.iva.d0.v1;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.lb0.m;
import com.amazon.aps.iva.m0.a4;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.qe0.h;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.u;
import com.amazon.aps.iva.u1.e;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ui.labels.LabelContentType;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.labels.MaturityRatingType;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: CardBadges.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u001aY\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a_\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u0013\u001a_\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00182\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u0019\u001a_\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0019\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001f\u0010\u001e\u001a\u0019\u0010 \u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b \u0010\u001e\u001a\u0019\u0010!\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b!\u0010\u001e\u001a\u0019\u0010\"\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\"\u0010\u001e\u001a\u0019\u0010#\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b#\u0010\u001e\u001a\u000f\u0010$\u001a\u00020\fH\u0003¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010&\u001a\u00020\fH\u0003¢\u0006\u0004\b&\u0010%\u001a\u000f\u0010'\u001a\u00020\fH\u0003¢\u0006\u0004\b'\u0010%\u001a\u000f\u0010(\u001a\u00020\fH\u0003¢\u0006\u0004\b(\u0010%\u001a\u000f\u0010)\u001a\u00020\fH\u0003¢\u0006\u0004\b)\u0010%\u001a\u000f\u0010*\u001a\u00020\fH\u0003¢\u0006\u0004\b*\u0010%\u001a\u000f\u0010+\u001a\u00020\fH\u0003¢\u0006\u0004\b+\u0010%\u001a\u000f\u0010,\u001a\u00020\fH\u0003¢\u0006\u0004\b,\u0010%\u001a\u000f\u0010-\u001a\u00020\fH\u0003¢\u0006\u0004\b-\u0010%¨\u0006."}, d2 = {"Lcom/ellation/crunchyroll/ui/labels/LabelUiModel;", "uiModel", "Lcom/amazon/aps/iva/a1/f;", "modifier", "Lcom/amazon/aps/iva/pe0/a;", "", "statuses", "", "shouldAddMaturityRating", "shouldAddNewBadge", "shouldAddMovieBadge", "shouldAddNowPlayingBadge", "Lcom/amazon/aps/iva/kb0/q;", "CardBadges", "(Lcom/ellation/crunchyroll/ui/labels/LabelUiModel;Lcom/amazon/aps/iva/a1/f;Lcom/amazon/aps/iva/pe0/a;ZZZZLcom/amazon/aps/iva/o0/i;II)V", "Lcom/ellation/crunchyroll/model/Panel;", "panel", "Lkotlin/Function0;", "isUserPremium", "(Lcom/ellation/crunchyroll/model/Panel;Lcom/ellation/crunchyroll/ui/labels/LabelUiModel;Lcom/amazon/aps/iva/xb0/a;Lcom/amazon/aps/iva/a1/f;ZZZZLcom/amazon/aps/iva/o0/i;II)V", "Lcom/ellation/crunchyroll/ui/labels/MaturityRatingType;", "maturityRating", "Lcom/ellation/crunchyroll/ui/labels/LabelContentType;", "labelContentType", "Lcom/amazon/aps/iva/pe0/b;", "(Lcom/ellation/crunchyroll/ui/labels/MaturityRatingType;Lcom/ellation/crunchyroll/ui/labels/LabelContentType;Lcom/amazon/aps/iva/pe0/b;Lcom/amazon/aps/iva/a1/f;ZZZZLcom/amazon/aps/iva/o0/i;II)V", "maturityRatingType", "CardBadgesLayer", "(Lcom/ellation/crunchyroll/ui/labels/MaturityRatingType;Lcom/ellation/crunchyroll/ui/labels/LabelContentType;Lcom/amazon/aps/iva/pe0/a;Lcom/amazon/aps/iva/a1/f;ZZZZLcom/amazon/aps/iva/o0/i;II)V", "CardComingSoonBadge", "(Lcom/amazon/aps/iva/a1/f;Lcom/amazon/aps/iva/o0/i;II)V", "CardPremiumBadge", "CardMatureBadge", "CardMovieBadge", "CardNewBadge", "NowPlayingBadge", "CardBadgesPreview", "(Lcom/amazon/aps/iva/o0/i;I)V", "CardBadgesMaturityRatingPreview", "CardBadgesNowPlayingBadge", "NowPlayingBadgePreview", "CardComingSoonBadgePreview", "CardPremiumBadgePreview", "CardMatureBadgePreview", "CardNewBadgePreview", "CardMovieBadgePreview", "widgets_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CardBadgesKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CardBadges(com.ellation.crunchyroll.ui.labels.LabelUiModel r21, com.amazon.aps.iva.a1.f r22, com.amazon.aps.iva.pe0.a<java.lang.String> r23, boolean r24, boolean r25, boolean r26, boolean r27, com.amazon.aps.iva.o0.i r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.ui.badges.CardBadgesKt.CardBadges(com.ellation.crunchyroll.ui.labels.LabelUiModel, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.pe0.a, boolean, boolean, boolean, boolean, com.amazon.aps.iva.o0.i, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CardBadgesLayer(com.ellation.crunchyroll.ui.labels.MaturityRatingType r21, com.ellation.crunchyroll.ui.labels.LabelContentType r22, com.amazon.aps.iva.pe0.a<java.lang.String> r23, com.amazon.aps.iva.a1.f r24, boolean r25, boolean r26, boolean r27, boolean r28, com.amazon.aps.iva.o0.i r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.ui.badges.CardBadgesKt.CardBadgesLayer(com.ellation.crunchyroll.ui.labels.MaturityRatingType, com.ellation.crunchyroll.ui.labels.LabelContentType, com.amazon.aps.iva.pe0.a, com.amazon.aps.iva.a1.f, boolean, boolean, boolean, boolean, com.amazon.aps.iva.o0.i, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CardBadgesMaturityRatingPreview(i iVar, int i) {
        j g = iVar.g(717019554);
        if (i == 0 && g.h()) {
            g.A();
        } else {
            e0.b bVar = e0.a;
            CardBadges(new LabelUiModel(null, false, false, false, MaturityRatingType.BRAZIL_RATING_18, null, null, null, 239, null), null, h.c.d(m.B(new String[]{"comingSoon", "premium", "matureBlocked"})), false, true, true, false, g, 221568, 74);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new CardBadgesKt$CardBadgesMaturityRatingPreview$1(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CardBadgesNowPlayingBadge(i iVar, int i) {
        j g = iVar.g(1356540371);
        if (i == 0 && g.h()) {
            g.A();
        } else {
            e0.b bVar = e0.a;
            CardBadges(new LabelUiModel(null, false, false, false, MaturityRatingType.BRAZIL_RATING_18, null, null, null, 239, null), null, null, true, false, false, true, g, 1575936, 54);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new CardBadgesKt$CardBadgesNowPlayingBadge$1(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CardBadgesPreview(i iVar, int i) {
        j g = iVar.g(-662625904);
        if (i == 0 && g.h()) {
            g.A();
        } else {
            e0.b bVar = e0.a;
            CardBadges(new LabelUiModel(LabelContentType.MOVIE, false, false, false, MaturityRatingType.UNDEFINED, null, null, null, 238, null), null, h.c.d(m.B(new String[]{"comingSoon", "premium", "matureBlocked"})), false, true, true, false, g, 221568, 74);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new CardBadgesKt$CardBadgesPreview$1(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CardComingSoonBadge(f fVar, i iVar, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        f.a aVar;
        f b;
        j g = iVar.g(-843316440);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            obj = fVar;
        } else if ((i & 14) == 0) {
            obj = fVar;
            if (g.H(obj)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            obj = fVar;
            i3 = i;
        }
        if ((i3 & 11) == 2 && g.h()) {
            g.A();
        } else {
            if (i5 != 0) {
                aVar = f.a.c;
            } else {
                aVar = obj;
            }
            e0.b bVar = e0.a;
            b = c.b(aVar, a.v, p0.a);
            f a = o.a(d.g(e.o(e.b(b, 0.0f, 18, 1), null, 3), 4, 0.0f, 2), false, CardBadgesKt$CardComingSoonBadge$1.INSTANCE);
            String upperCase = i.E(R.string.coming_soon, g).toUpperCase(Locale.ROOT);
            com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            a4.b(upperCase, a, a.r, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b.n, g, 0, 0, 65528);
            obj = aVar;
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new CardBadgesKt$CardComingSoonBadge$2(obj, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CardComingSoonBadgePreview(i iVar, int i) {
        j g = iVar.g(261271541);
        if (i == 0 && g.h()) {
            g.A();
        } else {
            e0.b bVar = e0.a;
            CardComingSoonBadge(null, g, 0, 1);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new CardBadgesKt$CardComingSoonBadgePreview$1(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CardMatureBadge(f fVar, i iVar, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        f.a aVar;
        f b;
        j g = iVar.g(-1701060);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            obj = fVar;
        } else if ((i & 14) == 0) {
            obj = fVar;
            if (g.H(obj)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            obj = fVar;
            i3 = i;
        }
        if ((i3 & 11) == 2 && g.h()) {
            g.A();
        } else {
            if (i5 != 0) {
                aVar = f.a.c;
            } else {
                aVar = obj;
            }
            e0.b bVar = e0.a;
            b = c.b(aVar, a.e, p0.a);
            f a = o.a(d.g(e.o(e.b(b, 0.0f, 18, 1), null, 3), 4, 0.0f, 2), false, CardBadgesKt$CardMatureBadge$1.INSTANCE);
            String upperCase = i.E(R.string.mature_label, g).toUpperCase(Locale.ROOT);
            com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            a4.b(upperCase, a, a.u, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b.n, g, 0, 0, 65528);
            obj = aVar;
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new CardBadgesKt$CardMatureBadge$2(obj, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CardMatureBadgePreview(i iVar, int i) {
        j g = iVar.g(1119704417);
        if (i == 0 && g.h()) {
            g.A();
        } else {
            e0.b bVar = e0.a;
            CardMatureBadge(null, g, 0, 1);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new CardBadgesKt$CardMatureBadgePreview$1(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CardMovieBadge(f fVar, i iVar, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        f.a aVar;
        f b;
        j g = iVar.g(-832992240);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            obj = fVar;
        } else if ((i & 14) == 0) {
            obj = fVar;
            if (g.H(obj)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            obj = fVar;
            i3 = i;
        }
        if ((i3 & 11) == 2 && g.h()) {
            g.A();
        } else {
            if (i5 != 0) {
                aVar = f.a.c;
            } else {
                aVar = obj;
            }
            e0.b bVar = e0.a;
            b = c.b(aVar, a.h, p0.a);
            f a = o.a(d.g(e.o(e.b(b, 0.0f, 18, 1), null, 3), 4, 0.0f, 2), false, CardBadgesKt$CardMovieBadge$1.INSTANCE);
            String upperCase = i.E(R.string.movie_label, g).toUpperCase(Locale.ROOT);
            com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            a4.b(upperCase, a, a.v, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b.n, g, 0, 0, 65528);
            obj = aVar;
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new CardBadgesKt$CardMovieBadge$2(obj, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CardMovieBadgePreview(i iVar, int i) {
        j g = iVar.g(1647077901);
        if (i == 0 && g.h()) {
            g.A();
        } else {
            e0.b bVar = e0.a;
            CardMovieBadge(null, g, 0, 1);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new CardBadgesKt$CardMovieBadgePreview$1(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CardNewBadge(f fVar, i iVar, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        f.a aVar;
        f b;
        j g = iVar.g(1083004704);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            obj = fVar;
        } else if ((i & 14) == 0) {
            obj = fVar;
            if (g.H(obj)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            obj = fVar;
            i3 = i;
        }
        if ((i3 & 11) == 2 && g.h()) {
            g.A();
        } else {
            if (i5 != 0) {
                aVar = f.a.c;
            } else {
                aVar = obj;
            }
            e0.b bVar = e0.a;
            b = c.b(aVar, a.a, p0.a);
            f a = o.a(d.g(e.o(e.b(b, 0.0f, 18, 1), null, 3), 4, 0.0f, 2), false, CardBadgesKt$CardNewBadge$1.INSTANCE);
            String upperCase = i.E(R.string.new_label, g).toUpperCase(Locale.ROOT);
            com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            a4.b(upperCase, a, a.v, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b.n, g, 0, 0, 65528);
            obj = aVar;
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new CardBadgesKt$CardNewBadge$2(obj, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CardNewBadgePreview(i iVar, int i) {
        j g = iVar.g(600505597);
        if (i == 0 && g.h()) {
            g.A();
        } else {
            e0.b bVar = e0.a;
            CardNewBadge(null, g, 0, 1);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new CardBadgesKt$CardNewBadgePreview$1(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CardPremiumBadge(f fVar, i iVar, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        f.a aVar;
        f b;
        j g = iVar.g(774204617);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            obj = fVar;
        } else if ((i & 14) == 0) {
            obj = fVar;
            if (g.H(obj)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            obj = fVar;
            i3 = i;
        }
        if ((i3 & 11) == 2 && g.h()) {
            g.A();
        } else {
            f.a aVar2 = f.a.c;
            if (i5 != 0) {
                aVar = aVar2;
            } else {
                aVar = obj;
            }
            e0.b bVar = e0.a;
            b = c.b(e.o(aVar, null, 3), a.v, p0.a);
            f a = o.a(e.b(b, 0.0f, 18, 1), false, CardBadgesKt$CardPremiumBadge$1.INSTANCE);
            b.C0098b c0098b = a.C0097a.k;
            g.s(693286680);
            d0 a2 = v1.a(com.amazon.aps.iva.d0.a.a, c0098b, g);
            g.s(-1323940314);
            int S = com.amazon.aps.iva.cq.b.S(g);
            c2 P = g.P();
            com.amazon.aps.iva.u1.e.o0.getClass();
            e.a aVar3 = e.a.b;
            com.amazon.aps.iva.v0.a a3 = u.a(a);
            if (g.a instanceof com.amazon.aps.iva.o0.d) {
                g.z();
                if (g.M) {
                    g.w(aVar3);
                } else {
                    g.m();
                }
                com.amazon.aps.iva.cq.b.k0(g, a2, e.a.e);
                com.amazon.aps.iva.cq.b.k0(g, P, e.a.d);
                e.a.C0752a c0752a = e.a.f;
                if (g.M || !com.amazon.aps.iva.yb0.j.a(g.e0(), Integer.valueOf(S))) {
                    a.c(S, g, S, c0752a);
                }
                b.d(0, a3, new x2(g), g, 2058660585);
                float f = 4;
                com.amazon.aps.iva.a0.p0.a(com.amazon.aps.iva.z1.b.a(R.drawable.ic_crown_small, g), null, o.a(d.g(aVar2, f, 0.0f, 2), false, CardBadgesKt$CardPremiumBadge$2$1.INSTANCE), null, null, 0.0f, null, g, 56, 120);
                f i6 = d.i(aVar2, 0.0f, 0.0f, f, 0.0f, 11);
                String upperCase = i.E(R.string.premium, g).toUpperCase(Locale.ROOT);
                com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                a4.b(upperCase, i6, com.amazon.aps.iva.ao.a.d, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, com.amazon.aps.iva.ao.b.n, g, 48, 0, 65528);
                c.c(g, false, true, false, false);
                obj = aVar;
            } else {
                com.amazon.aps.iva.cq.b.W();
                throw null;
            }
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new CardBadgesKt$CardPremiumBadge$3(obj, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CardPremiumBadgePreview(i iVar, int i) {
        j g = iVar.g(729091636);
        if (i == 0 && g.h()) {
            g.A();
        } else {
            e0.b bVar = e0.a;
            CardPremiumBadge(null, g, 0, 1);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new CardBadgesKt$CardPremiumBadgePreview$1(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NowPlayingBadge(f fVar, i iVar, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        f.a aVar;
        f b;
        j g = iVar.g(-561737220);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            obj = fVar;
        } else if ((i & 14) == 0) {
            obj = fVar;
            if (g.H(obj)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            obj = fVar;
            i3 = i;
        }
        if ((i3 & 11) == 2 && g.h()) {
            g.A();
        } else {
            if (i5 != 0) {
                aVar = f.a.c;
            } else {
                aVar = obj;
            }
            e0.b bVar = e0.a;
            b = c.b(aVar, com.amazon.aps.iva.ao.a.v, p0.a);
            f a = o.a(d.g(androidx.compose.foundation.layout.e.o(androidx.compose.foundation.layout.e.b(b, 0.0f, 18, 1), null, 3), 4, 0.0f, 2), false, CardBadgesKt$NowPlayingBadge$1.INSTANCE);
            String upperCase = i.E(R.string.now_playing, g).toUpperCase(Locale.ROOT);
            com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            a4.b(upperCase, a, com.amazon.aps.iva.ao.a.a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, com.amazon.aps.iva.ao.b.n, g, 0, 0, 65528);
            obj = aVar;
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new CardBadgesKt$NowPlayingBadge$2(obj, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NowPlayingBadgePreview(i iVar, int i) {
        j g = iVar.g(-422381919);
        if (i == 0 && g.h()) {
            g.A();
        } else {
            e0.b bVar = e0.a;
            NowPlayingBadge(null, g, 0, 1);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new CardBadgesKt$NowPlayingBadgePreview$1(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CardBadges(com.ellation.crunchyroll.model.Panel r23, com.ellation.crunchyroll.ui.labels.LabelUiModel r24, com.amazon.aps.iva.xb0.a<java.lang.Boolean> r25, com.amazon.aps.iva.a1.f r26, boolean r27, boolean r28, boolean r29, boolean r30, com.amazon.aps.iva.o0.i r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.ui.badges.CardBadgesKt.CardBadges(com.ellation.crunchyroll.model.Panel, com.ellation.crunchyroll.ui.labels.LabelUiModel, com.amazon.aps.iva.xb0.a, com.amazon.aps.iva.a1.f, boolean, boolean, boolean, boolean, com.amazon.aps.iva.o0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CardBadges(com.ellation.crunchyroll.ui.labels.MaturityRatingType r24, com.ellation.crunchyroll.ui.labels.LabelContentType r25, com.amazon.aps.iva.pe0.b<java.lang.String> r26, com.amazon.aps.iva.a1.f r27, boolean r28, boolean r29, boolean r30, boolean r31, com.amazon.aps.iva.o0.i r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.ui.badges.CardBadgesKt.CardBadges(com.ellation.crunchyroll.ui.labels.MaturityRatingType, com.ellation.crunchyroll.ui.labels.LabelContentType, com.amazon.aps.iva.pe0.b, com.amazon.aps.iva.a1.f, boolean, boolean, boolean, boolean, com.amazon.aps.iva.o0.i, int, int):void");
    }
}
