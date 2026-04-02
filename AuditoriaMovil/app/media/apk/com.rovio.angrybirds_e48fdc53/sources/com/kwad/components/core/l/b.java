package com.kwad.components.core.l;

import com.kwad.components.core.l.a;
import com.kwad.sdk.mvp.Presenter;
/* loaded from: classes.dex */
public abstract class b<T extends a> extends com.kwad.components.core.o.c {
    public T mCallerContext;
    protected Presenter mPresenter;

    private void notifyOnCreate() {
        T t = this.mCallerContext;
        if (t == null) {
            return;
        }
        for (com.kwad.components.core.l.a.a aVar : t.Lm) {
            aVar.gg();
        }
    }

    private void notifyOnDestroy() {
        T t = this.mCallerContext;
        if (t == null) {
            return;
        }
        for (com.kwad.components.core.l.a.a aVar : t.Lm) {
            aVar.gh();
        }
    }

    private void notifyOnPause() {
        T t = this.mCallerContext;
        if (t == null) {
            return;
        }
        for (com.kwad.components.core.l.a.a aVar : t.Lm) {
            aVar.d(this);
        }
    }

    private void notifyOnResume() {
        T t = this.mCallerContext;
        if (t == null) {
            return;
        }
        for (com.kwad.components.core.l.a.a aVar : t.Lm) {
            aVar.c(this);
        }
    }

    public void initMVP() {
        this.mCallerContext = onCreateCallerContext();
        if (this.mPresenter == null) {
            Presenter onCreatePresenter = onCreatePresenter();
            this.mPresenter = onCreatePresenter;
            onCreatePresenter.F(this.mRootView);
        }
        this.mPresenter.k(this.mCallerContext);
    }

    @Override // com.kwad.components.core.o.c
    public void onActivityCreate() {
        super.onActivityCreate();
        initMVP();
        notifyOnCreate();
    }

    protected abstract T onCreateCallerContext();

    protected abstract Presenter onCreatePresenter();

    @Override // com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onDestroy() {
        super.onDestroy();
        notifyOnDestroy();
        T t = this.mCallerContext;
        if (t != null) {
            t.release();
        }
        Presenter presenter = this.mPresenter;
        if (presenter != null) {
            presenter.destroy();
        }
    }

    @Override // com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onPause() {
        super.onPause();
        notifyOnPause();
    }

    @Override // com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onResume() {
        super.onResume();
        notifyOnResume();
    }
}
