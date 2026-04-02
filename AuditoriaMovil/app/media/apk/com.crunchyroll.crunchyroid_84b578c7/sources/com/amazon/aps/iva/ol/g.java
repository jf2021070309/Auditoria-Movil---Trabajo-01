package com.amazon.aps.iva.ol;

import com.amazon.aps.iva.yb0.l;
import java.util.Iterator;
import java.util.List;
/* compiled from: PlayerAudioSettingsViewModel.kt */
/* loaded from: classes2.dex */
public final class g extends l implements com.amazon.aps.iva.xb0.l<List<com.amazon.aps.iva.nl.a>, com.amazon.aps.iva.nl.a> {
    public static final g h = new g();

    public g() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.nl.a invoke(List<com.amazon.aps.iva.nl.a> list) {
        Object obj;
        List<com.amazon.aps.iva.nl.a> list2 = list;
        com.amazon.aps.iva.yb0.j.e(list2, "it");
        Iterator<T> it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((com.amazon.aps.iva.nl.a) obj).d) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (com.amazon.aps.iva.nl.a) obj;
    }
}
