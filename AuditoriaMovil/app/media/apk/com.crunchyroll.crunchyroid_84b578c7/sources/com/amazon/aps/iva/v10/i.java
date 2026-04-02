package com.amazon.aps.iva.v10;

import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.presentation.main.BottomNavigationTabItemLayout;
import java.util.Map;
/* compiled from: BottomNavigationBarLayout.kt */
/* loaded from: classes2.dex */
public final class i extends l implements com.amazon.aps.iva.xb0.l<Map.Entry<? extends Integer, ? extends BottomNavigationTabItemLayout>, Boolean> {
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i) {
        super(1);
        this.h = i;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(Map.Entry<? extends Integer, ? extends BottomNavigationTabItemLayout> entry) {
        boolean z;
        Map.Entry<? extends Integer, ? extends BottomNavigationTabItemLayout> entry2 = entry;
        com.amazon.aps.iva.yb0.j.f(entry2, "it");
        if (entry2.getKey().intValue() == this.h) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
