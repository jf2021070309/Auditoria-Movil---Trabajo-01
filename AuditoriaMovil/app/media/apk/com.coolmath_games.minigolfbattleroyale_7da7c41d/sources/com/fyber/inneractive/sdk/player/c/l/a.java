package com.fyber.inneractive.sdk.player.c.l;

import com.fyber.inneractive.sdk.player.c.k.i;
import com.fyber.inneractive.sdk.player.c.k.k;
import com.fyber.inneractive.sdk.player.c.l;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class a {
    public final List<byte[]> a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public static a a(k kVar) throws l {
        float f;
        int i;
        int i2;
        try {
            kVar.d(4);
            int d = (kVar.d() & 3) + 1;
            if (d == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int d2 = kVar.d() & 31;
            for (int i3 = 0; i3 < d2; i3++) {
                arrayList.add(b(kVar));
            }
            int d3 = kVar.d();
            for (int i4 = 0; i4 < d3; i4++) {
                arrayList.add(b(kVar));
            }
            if (d2 > 0) {
                i.b a = i.a((byte[]) arrayList.get(0), d, ((byte[]) arrayList.get(0)).length);
                int i5 = a.b;
                int i6 = a.c;
                f = a.d;
                i = i5;
                i2 = i6;
            } else {
                f = 1.0f;
                i = -1;
                i2 = -1;
            }
            return new a(arrayList, d, i, i2, f);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new l("Error parsing AVC config", e);
        }
    }

    private a(List<byte[]> list, int i, int i2, int i3, float f) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    private static byte[] b(k kVar) {
        int e = kVar.e();
        int i = kVar.b;
        kVar.d(e);
        return com.fyber.inneractive.sdk.player.c.k.c.a(kVar.a, i, e);
    }
}
