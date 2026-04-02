package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collection;
/* renamed from: com.facebook.ads.redexgen.X.Tg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0938Tg implements M1 {
    public final Collection<String> A00;

    public C0938Tg() {
        this.A00 = new ArrayList();
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public final void ADH(String str) {
        this.A00.add(str);
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public final void flush() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String line : this.A00) {
            sb.append(line);
            sb.append('\n');
        }
        return sb.toString();
    }
}
