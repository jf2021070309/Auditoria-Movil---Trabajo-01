package com.kwad.sdk.k.a;

import android.content.Context;
import java.util.List;
/* loaded from: classes3.dex */
public abstract class a implements c {
    protected List<c> aGs;
    protected boolean enabled;

    public a() {
        this.enabled = true;
    }

    public a(boolean z) {
        this.enabled = z;
    }

    private List<c> getChildren() {
        return this.aGs;
    }

    @Override // com.kwad.sdk.k.a.c
    public final boolean bC(Context context) {
        if (this.enabled) {
            List<c> children = getChildren();
            if (children == null || children.size() <= 0) {
                try {
                    return bD(context);
                } catch (Throwable th) {
                    return false;
                }
            }
            for (c cVar : children) {
                if (cVar.bC(context)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    protected boolean bD(Context context) {
        return false;
    }
}
