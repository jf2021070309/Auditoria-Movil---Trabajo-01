package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.bm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1220bm extends C4P {
    public static String[] A01 = {"ufm8s7LRmOM7", "sIBwdoM05ajejE", "0NxvrnR7UZDHrBy4xVhLU5lsqzWJ5R3x", "FsILnIqpIa8iE3wffvJrO4tNlZdDmpUd", "wKnqjXSh8f61FKWyknAGi8xlXXoDdiLA", "lpMPMGmveEx5YZPPZgDkriuB4nzdouJK", "fQPzW90JHWOApVaaQbndX59CGXgCnXlm", "Pp9SKBa6RS3IfLIGXA9e4oeVKGHa5CsE"};
    public boolean A00 = true;

    public abstract boolean A0R(AbstractC03344l abstractC03344l);

    public abstract boolean A0S(AbstractC03344l abstractC03344l);

    public abstract boolean A0T(AbstractC03344l abstractC03344l, int i2, int i3, int i4, int i5);

    public abstract boolean A0U(AbstractC03344l abstractC03344l, AbstractC03344l abstractC03344l2, int i2, int i3, int i4, int i5);

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0D(@NonNull AbstractC03344l abstractC03344l) {
        return !this.A00 || abstractC03344l.A0b();
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0E(@NonNull AbstractC03344l abstractC03344l, @Nullable C4O c4o, @NonNull C4O c4o2) {
        if (c4o != null && (c4o.A01 != c4o2.A01 || c4o.A03 != c4o2.A03)) {
            return A0T(abstractC03344l, c4o.A01, c4o.A03, c4o2.A01, c4o2.A03);
        }
        return A0R(abstractC03344l);
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0F(@NonNull AbstractC03344l abstractC03344l, @NonNull C4O c4o, @Nullable C4O c4o2) {
        int i2 = c4o.A01;
        int i3 = c4o.A03;
        View view = abstractC03344l.A0H;
        int left = c4o2 == null ? view.getLeft() : c4o2.A01;
        int newLeft = c4o2 == null ? view.getTop() : c4o2.A03;
        if (!abstractC03344l.A0c() && (i2 != left || i3 != newLeft)) {
            view.layout(left, newLeft, view.getWidth() + left, view.getHeight() + newLeft);
            return A0T(abstractC03344l, i2, i3, left, newLeft);
        }
        return A0S(abstractC03344l);
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0G(@NonNull AbstractC03344l abstractC03344l, @NonNull C4O c4o, @NonNull C4O c4o2) {
        if (c4o.A01 != c4o2.A01 || c4o.A03 != c4o2.A03) {
            return A0T(abstractC03344l, c4o.A01, c4o.A03, c4o2.A01, c4o2.A03);
        }
        A0O(abstractC03344l);
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0H(@NonNull AbstractC03344l abstractC03344l, @NonNull AbstractC03344l abstractC03344l2, @NonNull C4O c4o, @NonNull C4O c4o2) {
        int fromTop;
        int toLeft;
        int i2 = c4o.A01;
        int i3 = c4o.A03;
        if (abstractC03344l2.A0h()) {
            fromTop = c4o.A01;
            toLeft = c4o.A03;
        } else {
            fromTop = c4o2.A01;
            toLeft = c4o2.A03;
        }
        if (A01[1].length() != 14) {
            throw new RuntimeException();
        }
        A01[1] = "7F8ns227Orjao7";
        return A0U(abstractC03344l, abstractC03344l2, i2, i3, fromTop, toLeft);
    }

    public final void A0N(AbstractC03344l abstractC03344l) {
        A0C(abstractC03344l);
    }

    public final void A0O(AbstractC03344l abstractC03344l) {
        A0C(abstractC03344l);
    }

    public final void A0P(AbstractC03344l abstractC03344l) {
        A0C(abstractC03344l);
    }

    public final void A0Q(AbstractC03344l abstractC03344l, boolean z) {
        A0C(abstractC03344l);
    }
}
