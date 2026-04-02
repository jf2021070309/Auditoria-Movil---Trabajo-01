package com.amazon.aps.iva.w60;

import com.amazon.aps.iva.wy.j;
import com.ellation.toolbar.ToolbarDivider;
/* compiled from: ToolbarDividerPresenter.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.wy.b<d> implements b {
    public boolean b;

    public c(ToolbarDivider toolbarDivider) {
        super(toolbarDivider, new j[0]);
    }

    @Override // com.amazon.aps.iva.w60.b
    public final void M4(int i) {
        if (i == 0) {
            if (this.b) {
                getView().U();
                this.b = false;
            }
        } else if (!this.b) {
            getView().T();
            this.b = true;
        }
    }
}
