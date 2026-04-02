package com.kwad.components.core.l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.kwad.sdk.m.l;
import com.kwad.sdk.mvp.Presenter;
import com.kwad.sdk.mvp.a;
import com.kwad.sdk.widget.KSFrameLayout;
/* loaded from: classes.dex */
public abstract class c<T extends com.kwad.sdk.mvp.a> extends KSFrameLayout {
    public T Lo;
    protected ViewGroup lN;
    protected Presenter mPresenter;

    public c(Context context) {
        this(context, null);
    }

    private c(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        if (kv()) {
            return;
        }
        oh();
    }

    private void initMVP() {
        this.Lo = ky();
        if (this.mPresenter == null) {
            Presenter onCreatePresenter = onCreatePresenter();
            this.mPresenter = onCreatePresenter;
            onCreatePresenter.F(this.lN);
        }
        this.mPresenter.k(this.Lo);
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public void aa() {
        super.aa();
        initMVP();
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public void ab() {
        super.ab();
        T t = this.Lo;
        if (t != null) {
            t.release();
        }
        Presenter presenter = this.mPresenter;
        if (presenter != null) {
            presenter.destroy();
        }
    }

    protected abstract int getLayoutId();

    protected abstract void initData();

    protected boolean kv() {
        return false;
    }

    protected abstract void kx();

    protected abstract T ky();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void oh() {
        initData();
        this.lN = (ViewGroup) l.inflate(getContext(), getLayoutId(), this);
        kx();
    }

    public abstract Presenter onCreatePresenter();
}
