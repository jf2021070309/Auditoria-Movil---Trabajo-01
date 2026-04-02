package com.kwad.components.core.page.recycle;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.kwad.sdk.mvp.Presenter;
/* loaded from: classes.dex */
public final class c extends RecyclerView.ViewHolder {
    public final e MF;
    public final Presenter mPresenter;

    public c(View view, Presenter presenter, e eVar) {
        super(view);
        this.MF = eVar;
        this.mPresenter = presenter;
        presenter.F(view);
    }
}
