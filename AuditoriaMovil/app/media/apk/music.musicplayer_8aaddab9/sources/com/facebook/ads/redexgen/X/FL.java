package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public final class FL extends AbstractC1281cr {
    public static byte[] A00;
    public static String[] A01 = {"d7tLiGkqyLa7cKOkED7RtvmpIXZH8d0b", "LmA4T64r6T9e", "1EBtOKlPck0twYp3ElEJQmg3d", "uhXcdOUibAChEZNBNQuPqKRIQ2", "Z", "LV0o53GlcsqgEYK9Pr4EwymnJShooL9b", "NLZosIPt4DzrQXhRsvqwWEHVFOTX5bDJ", "MQasnwh7q"};

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{77, 72, 12, 69, 95, 12, 66, 67, 88, 12, 94, 73, 77, 72, 85, 12, 67, 94, 12, 77, 64, 94, 73, 77, 72, 85, 12, 72, 69, 95, 92, 64, 77, 85, 73, 72, 56, 57, 48, 61, 37};
    }

    static {
        A03();
    }

    public FL(C1046Xo c1046Xo, C02641q c02641q) {
        super(c1046Xo, c02641q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j2) {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(36, 5, 104), String.valueOf(System.currentTimeMillis() - j2));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(List<String> list, Map<String, String> map) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[0] = "jDIZMq7wlAdnEmkEGDRuOyHBIh8qxobs";
            if (hasNext) {
                new RF(this.A0B, map).execute(it.next());
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1281cr
    public final void A0J() {
        C1315dP c1315dP = (C1315dP) this.A01;
        if (c1315dP.A0T()) {
            this.A06.A0B(c1315dP);
            return;
        }
        throw new IllegalStateException(A00(0, 36, 24));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1281cr
    public final void A0L(InterfaceC02350n interfaceC02350n, C9H c9h, C9F c9f, C02651r c02651r) {
        C1315dP c1315dP = (C1315dP) interfaceC02350n;
        long currentTimeMillis = System.currentTimeMillis();
        C1278co c1278co = new C1278co(this, c02651r, c1315dP, currentTimeMillis, c9f);
        A0C().postDelayed(c1278co, c9h.A05().A05());
        c1315dP.A0L(this.A0B, new C1277cn(this, c1278co, currentTimeMillis, c9f), this.A08, c02651r, U1.A0K());
    }
}
