package com.kwad.components.core.l;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class a extends com.kwad.sdk.mvp.a {
    public List<com.kwad.components.core.l.a.a> Lm = new ArrayList();
    private final b<?> Ln;
    public final Context mContext;
    public final View mRootView;

    public a(b<?> bVar) {
        this.Ln = bVar;
        this.mContext = bVar.mContext;
        this.mRootView = bVar.mRootView;
    }

    @Deprecated
    public final Activity getActivity() {
        return this.Ln.getActivity();
    }

    public final void hy() {
        this.Ln.finish();
    }

    @Override // com.kwad.sdk.mvp.a
    public void release() {
        this.Lm.clear();
    }
}
