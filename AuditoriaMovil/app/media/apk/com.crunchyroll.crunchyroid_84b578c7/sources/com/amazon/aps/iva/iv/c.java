package com.amazon.aps.iva.iv;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: CrunchylistSearchItemUiModel.kt */
/* loaded from: classes2.dex */
public final class c extends b {
    public final String b;
    public final Panel c;

    static {
        int i = Panel.$stable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, Panel panel) {
        super(str);
        j.f(str, "adapterId");
        j.f(panel, "panel");
        this.b = str;
        this.c = panel;
    }

    @Override // com.amazon.aps.iva.iv.b
    public final String a() {
        return this.b;
    }
}
