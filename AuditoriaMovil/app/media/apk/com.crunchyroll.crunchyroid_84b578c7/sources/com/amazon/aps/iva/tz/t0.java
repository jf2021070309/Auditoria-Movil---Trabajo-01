package com.amazon.aps.iva.tz;

import androidx.fragment.app.Fragment;
import java.util.List;
/* compiled from: BrowseFragmentProvider.kt */
/* loaded from: classes2.dex */
public final class t0 implements com.amazon.aps.iva.ry.b {
    public final com.amazon.aps.iva.kb0.m a;

    public t0(com.amazon.aps.iva.lx.a aVar, com.amazon.aps.iva.a00.b bVar, String str) {
        this.a = com.amazon.aps.iva.kb0.f.b(new com.ellation.crunchyroll.presentation.browse.b(aVar, bVar, str));
    }

    public final int a() {
        int i = 0;
        for (Fragment fragment : p()) {
            if (!(fragment instanceof com.amazon.aps.iva.bi.b)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    @Override // com.amazon.aps.iva.ry.b
    public final List<Fragment> p() {
        return (List) this.a.getValue();
    }
}
