package com.facebook.ads.redexgen.X;

import android.content.pm.ActivityInfo;
import java.util.ArrayList;
/* renamed from: com.facebook.ads.redexgen.X.Yo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1072Yo implements InterfaceC03956v {
    public final /* synthetic */ C1069Yl A00;

    public C1072Yo(C1069Yl c1069Yl) {
        this.A00 = c1069Yl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        ActivityInfo[] activityInfoArr;
        ActivityInfo[] activityInfoArr2;
        C6C c6c;
        ActivityInfo[] activityInfoArr3;
        activityInfoArr = this.A00.A04;
        if (activityInfoArr != null) {
            ArrayList arrayList = new ArrayList();
            activityInfoArr2 = this.A00.A04;
            int length = activityInfoArr2.length;
            c6c = this.A00.A03;
            int min = Math.min(length, c6c.A0U());
            for (int i2 = 0; i2 < min; i2++) {
                activityInfoArr3 = this.A00.A04;
                arrayList.add(activityInfoArr3[i2].name);
            }
            return this.A00.A0E(arrayList);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
