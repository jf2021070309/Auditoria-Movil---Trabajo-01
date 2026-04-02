package com.amazon.aps.iva.od;

import androidx.compose.ui.platform.ComposeView;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.braze.enums.CardType;
import com.braze.models.cards.Card;
import com.braze.ui.contentcards.view.ContentCardViewHolder;
/* compiled from: PersistentMessageCardViewHolder.kt */
/* loaded from: classes.dex */
public final class c extends ContentCardViewHolder {
    public final ComposeView b;
    public final l<Card, q> c;

    /* compiled from: PersistentMessageCardViewHolder.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CardType.values().length];
            try {
                iArr[CardType.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardType.CAPTIONED_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardType.SHORT_NEWS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardType.TEXT_ANNOUNCEMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(ComposeView composeView, l<? super Card, q> lVar) {
        super(composeView, false);
        j.f(lVar, "contentCardClickHandler");
        this.b = composeView;
        this.c = lVar;
    }
}
