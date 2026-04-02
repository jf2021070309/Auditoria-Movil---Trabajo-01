package com.fyber.inneractive.sdk.d.a;

import com.fyber.inneractive.sdk.g.a.g;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class b implements Comparator<com.fyber.inneractive.sdk.g.a.b> {
    private int a;
    private int b;

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(com.fyber.inneractive.sdk.g.a.b bVar, com.fyber.inneractive.sdk.g.a.b bVar2) {
        com.fyber.inneractive.sdk.g.a.b bVar3 = bVar;
        com.fyber.inneractive.sdk.g.a.b bVar4 = bVar2;
        int i = bVar3.c * bVar3.d;
        int i2 = bVar4.c * bVar4.d;
        int i3 = this.a * this.b;
        int abs = Math.abs(i - i3);
        int abs2 = Math.abs(i2 - i3);
        if (abs < abs2) {
            return -1;
        }
        if (abs > abs2) {
            return 1;
        }
        float floatValue = Float.valueOf(this.a).floatValue() / Float.valueOf(this.b).floatValue();
        float abs3 = Math.abs(floatValue - (Float.valueOf(bVar3.c).floatValue() / Float.valueOf(bVar3.d).floatValue()));
        float abs4 = Math.abs(floatValue - (Float.valueOf(bVar4.c).floatValue() / Float.valueOf(bVar4.d).floatValue()));
        if (abs3 < abs4) {
            return -1;
        }
        if (abs3 > abs4) {
            return 1;
        }
        int compareTo = a(bVar4).compareTo(a(bVar3));
        if (compareTo != 0) {
            return compareTo;
        }
        return 0;
    }

    public b(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private static Integer a(com.fyber.inneractive.sdk.g.a.b bVar) {
        g gVar = bVar.a;
        if (gVar == g.Html) {
            return 3;
        }
        if (gVar == g.Iframe) {
            return 2;
        }
        if (gVar == g.Static) {
            return 1;
        }
        return -1;
    }
}
