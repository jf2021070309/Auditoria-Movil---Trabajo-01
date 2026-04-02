package com.kwad.components.core.page.recycle;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.kwad.sdk.mvp.Presenter;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class d extends RecyclerView.Adapter<c> {
    private List<Presenter> Om = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: a */
    public void onViewRecycled(c cVar) {
        super.onViewRecycled(cVar);
        cVar.mPresenter.lM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: c */
    public c onCreateViewHolder(ViewGroup viewGroup, int i) {
        c b = b(viewGroup, i);
        this.Om.add(b.mPresenter);
        return b;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: a */
    public void onBindViewHolder(c cVar, int i) {
        cVar.mPresenter.k(cVar.MF);
    }

    protected abstract c b(ViewGroup viewGroup, int i);

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        pn();
    }

    public final void pn() {
        for (Presenter presenter : this.Om) {
            presenter.destroy();
        }
    }
}
