package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.HashMap;
/* renamed from: com.facebook.ads.redexgen.X.Oa  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0803Oa {
    public static OZ A00(C0806Od c0806Od, @Nullable Bundle bundle, boolean z) {
        OZ c0915Sj;
        C1B A0N = c0806Od.A04().A0N();
        double A00 = OY.A00(A0N);
        boolean isWatchAndBrowse = c0806Od.A04().A0N().A0N();
        boolean isVideo = OY.A05(c0806Od.A00(), c0806Od.A01(), A00);
        AbstractC02280f A002 = C02290g.A00(c0806Od.A05(), c0806Od.A06(), "", Uri.parse(c0806Od.A04().A0N().A0F().A05()), new HashMap());
        boolean z2 = !TextUtils.isEmpty(A0N.A0D().A08());
        if (JQ.A1F(c0806Od.A05())) {
            c0806Od.A05().A09().AFT(c0806Od.A02(), c0806Od.A04().A0T(), z2);
        }
        if (isWatchAndBrowse && (A002 instanceof C0592Fq)) {
            c0915Sj = new C0908Sc(c0806Od);
        } else if (z2) {
            c0915Sj = new A6(c0806Od);
        } else if (!z2 && JQ.A1k(c0806Od.A05())) {
            c0915Sj = new A7(c0806Od, isVideo);
        } else if (isVideo) {
            c0915Sj = new C0917Sl(c0806Od, c0806Od.A00() == 2);
        } else {
            c0915Sj = new C0915Sj(c0806Od, OY.A03(A00));
        }
        if (z) {
            c0915Sj.A0b(A0N, c0806Od.A04().A0T(), A00, bundle);
        }
        return c0915Sj;
    }
}
