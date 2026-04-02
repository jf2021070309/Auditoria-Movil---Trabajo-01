package com.amazon.aps.iva.s30;

import com.ellation.crunchyroll.model.Panel;
/* compiled from: SearchResultAdapterItem.kt */
/* loaded from: classes2.dex */
public abstract class k extends h {
    public final Panel b;

    static {
        int i = Panel.$stable;
    }

    public k(Panel panel) {
        super(panel.getId());
        this.b = panel;
    }

    public Panel a() {
        return this.b;
    }
}
