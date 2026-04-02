package com.amazon.aps.iva.m6;

import com.amazon.aps.iva.r7.b;
import com.amazon.aps.iva.s6.g;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t6.n;
import com.braze.models.cards.Card;
import com.braze.ui.contentcards.handlers.DefaultContentCardsUpdateHandler;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ j(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                long j = ((c) obj).c;
                long j2 = ((c) obj2).c;
                int i = g0.a;
                int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                if (i2 < 0) {
                    return -1;
                }
                if (i2 == 0) {
                    return 0;
                }
                return 1;
            case 1:
                return ((g.a) Collections.max((List) obj)).compareTo((g.a) Collections.max((List) obj2));
            case 2:
                return g.h.f((g.h) obj, (g.h) obj2);
            case 3:
                return Float.compare(((n.a) obj).c, ((n.a) obj2).c);
            case 4:
                return Integer.compare(((b.a) obj2).b, ((b.a) obj).b);
            default:
                return DefaultContentCardsUpdateHandler.a((Card) obj, (Card) obj2);
        }
    }
}
