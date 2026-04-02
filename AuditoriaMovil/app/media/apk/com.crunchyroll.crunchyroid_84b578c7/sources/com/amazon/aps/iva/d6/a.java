package com.amazon.aps.iva.d6;

import com.braze.models.cards.Card;
import com.braze.ui.BrazeFeedFragment;
import com.google.common.collect.Ordering;
import java.util.Comparator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ a(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$sortFeedCards$4;
        switch (this.b) {
            case 0:
                com.amazon.aps.iva.e6.b bVar = (com.amazon.aps.iva.e6.b) obj;
                com.amazon.aps.iva.e6.b bVar2 = (com.amazon.aps.iva.e6.b) obj2;
                int compare = Integer.compare(bVar.c, bVar2.c);
                if (compare == 0) {
                    return bVar.b.compareTo(bVar2.b);
                }
                return compare;
            case 1:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                Ordering<Integer> ordering = com.amazon.aps.iva.s6.g.k;
                if (num.intValue() == -1) {
                    if (num2.intValue() != -1) {
                        return -1;
                    }
                    return 0;
                } else if (num2.intValue() == -1) {
                    return 1;
                } else {
                    return num.intValue() - num2.intValue();
                }
            default:
                lambda$sortFeedCards$4 = BrazeFeedFragment.lambda$sortFeedCards$4((Card) obj, (Card) obj2);
                return lambda$sortFeedCards$4;
        }
    }
}
