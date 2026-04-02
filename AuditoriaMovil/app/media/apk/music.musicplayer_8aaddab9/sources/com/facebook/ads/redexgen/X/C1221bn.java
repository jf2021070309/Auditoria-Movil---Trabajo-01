package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
/* renamed from: com.facebook.ads.redexgen.X.bn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1221bn extends C02852m {
    public static String[] A02 = {"kCJseLSqSIrXu4CFjUZgH7qP37OfZeHD", "xEAmwUG5TGVzyoKH1PTTnmgJSds6zi0t", "yfye5wiKddzXjwKpYSAHRZ10SdbOyGIS", "FmBYeFx3U0BhjOzbepjZtX", "pFd99JFbVQiCxR8NKRmLZvqZPwpJ8hMq", "9sA", "zOMSQIOQC2uzgyYA4i3GoXbtL5yC1N4Y", "6JUJmYz6"};
    public final C02852m A00 = new C1222bo(this);
    public final F6 A01;

    public C1221bn(F6 f6) {
        this.A01 = f6;
    }

    @Override // com.facebook.ads.redexgen.X.C02852m
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(F6.class.getName());
        if ((view instanceof F6) && !A0B()) {
            F6 f6 = (F6) view;
            if (f6.getLayoutManager() != null) {
                f6.getLayoutManager().A1x(accessibilityEvent);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C02852m
    public final void A08(View view, C3X c3x) {
        super.A08(view, c3x);
        c3x.A0O(F6.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1F(c3x);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C02852m
    public final boolean A09(View view, int i2, Bundle bundle) {
        if (super.A09(view, i2, bundle)) {
            String[] strArr = A02;
            if (strArr[2].charAt(11) != strArr[0].charAt(11)) {
                throw new RuntimeException();
            }
            A02[4] = "nByhcE3HAON4xHhAaRL71J2smf2uyoDS";
            return true;
        } else if (!A0B() && this.A01.getLayoutManager() != null) {
            C4T layoutManager = this.A01.getLayoutManager();
            if (A02[5].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "ZdbAAVtg";
            strArr2[3] = "rBKlzqXoYmUf6BYv0O8fT1";
            return layoutManager.A1Z(i2, bundle);
        } else {
            return false;
        }
    }

    public final C02852m A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1t();
    }
}
