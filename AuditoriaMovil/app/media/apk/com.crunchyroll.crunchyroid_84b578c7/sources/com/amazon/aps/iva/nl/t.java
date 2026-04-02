package com.amazon.aps.iva.nl;

import java.util.Iterator;
import java.util.List;
/* compiled from: AudioSettingsViewModel.kt */
/* loaded from: classes2.dex */
public final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<a>, a> {
    public static final t h = new t();

    public t() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final a invoke(List<a> list) {
        Object obj;
        List<a> list2 = list;
        com.amazon.aps.iva.yb0.j.e(list2, "it");
        Iterator<T> it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((a) obj).d) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (a) obj;
    }
}
