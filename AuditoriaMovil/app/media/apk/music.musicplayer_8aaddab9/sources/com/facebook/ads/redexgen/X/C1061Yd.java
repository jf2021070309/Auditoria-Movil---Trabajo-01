package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Yd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1061Yd implements InterfaceC03956v {
    public final /* synthetic */ EnumC03916r A00;
    public final /* synthetic */ C1059Yb A01;
    public final /* synthetic */ List A02;

    public C1061Yd(C1059Yb c1059Yb, List list, EnumC03916r enumC03916r) {
        this.A01 = c1059Yb;
        this.A02 = list;
        this.A00 = enumC03916r;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        C7A A03;
        Context context;
        HashMap hashMap = new HashMap();
        for (C03946u c03946u : this.A02) {
            if (c03946u.A02()) {
                String str = (String) c03946u.A01();
                context = this.A01.A00;
                C1060Yc systemSettings = new C1060Yc(context, str, this.A00);
                hashMap.put(str, systemSettings);
            }
        }
        A03 = this.A01.A03(hashMap);
        return A03;
    }
}
