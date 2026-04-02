package com.amazon.aps.iva.wa;

import com.amazon.aps.iva.types.AdMediaState;
import com.amazon.aps.iva.types.LoadStatus;
import com.amazon.aps.iva.types.PreloadCallbackArgs;
import java.util.ArrayList;
import lombok.NonNull;
/* compiled from: ApsIvaWebViewSimidContainerListener.java */
/* loaded from: classes.dex */
public final class p {
    public q<String> a;
    public q<String> b;
    public q<PreloadCallbackArgs> c;
    public r<String, AdMediaState> d;
    public final ArrayList e = new ArrayList();

    public final void a(@NonNull q<LoadStatus> qVar) {
        if (qVar != null) {
            this.e.add(qVar);
            return;
        }
        throw new NullPointerException("onContainerLoadStatusChangeHandler is marked non-null but is null");
    }
}
