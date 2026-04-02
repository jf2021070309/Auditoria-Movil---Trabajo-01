package com.fyber.inneractive.sdk.a.a;

import java.util.Comparator;
/* loaded from: classes.dex */
public final class e implements Comparator<b> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(b bVar, b bVar2) {
        b bVar3 = bVar;
        b bVar4 = bVar2;
        if (bVar3 == null || bVar4 == null) {
            return 0;
        }
        return bVar3.d < bVar4.d ? -1 : 1;
    }
}
