package com.kwad.sdk.mvp;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.kwad.sdk.m.l;
import com.kwad.sdk.service.c;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes3.dex */
public class Presenter {
    private Object aDo;
    private View mRootView;
    private final List<Presenter> aDn = new CopyOnWriteArrayList();
    private PresenterState aDp = PresenterState.INIT;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public enum PresenterState {
        INIT(0) { // from class: com.kwad.sdk.mvp.Presenter.PresenterState.1
            @Override // com.kwad.sdk.mvp.Presenter.PresenterState
            public final void performCallState(Presenter presenter) {
            }
        },
        CREATE(1) { // from class: com.kwad.sdk.mvp.Presenter.PresenterState.2
            @Override // com.kwad.sdk.mvp.Presenter.PresenterState
            public final void performCallState(Presenter presenter) {
                for (Presenter presenter2 : presenter.aDn) {
                    try {
                        presenter2.F(presenter.mRootView);
                    } catch (Exception e) {
                        c.gatherException(e);
                        com.kwad.sdk.core.e.c.printStackTrace(e);
                    }
                }
            }
        },
        BIND(2) { // from class: com.kwad.sdk.mvp.Presenter.PresenterState.3
            @Override // com.kwad.sdk.mvp.Presenter.PresenterState
            final void performCallState(Presenter presenter) {
                for (Presenter presenter2 : presenter.aDn) {
                    try {
                        presenter2.k(presenter.aDo);
                    } catch (Throwable th) {
                        c.gatherException(th);
                        com.kwad.sdk.core.e.c.printStackTrace(th);
                    }
                }
            }
        },
        UNBIND(3) { // from class: com.kwad.sdk.mvp.Presenter.PresenterState.4
            @Override // com.kwad.sdk.mvp.Presenter.PresenterState
            final void performCallState(Presenter presenter) {
                for (Presenter presenter2 : presenter.aDn) {
                    try {
                        presenter2.lM();
                    } catch (Exception e) {
                        c.gatherException(e);
                        com.kwad.sdk.core.e.c.printStackTrace(e);
                    }
                }
            }
        },
        DESTROY(4) { // from class: com.kwad.sdk.mvp.Presenter.PresenterState.5
            @Override // com.kwad.sdk.mvp.Presenter.PresenterState
            final void performCallState(Presenter presenter) {
                for (Presenter presenter2 : presenter.aDn) {
                    try {
                        presenter2.destroy();
                    } catch (Exception e) {
                        c.gatherException(e);
                        com.kwad.sdk.core.e.c.printStackTrace(e);
                    }
                }
            }
        };
        
        private int mIndex;

        PresenterState(int i) {
            this.mIndex = i;
        }

        public int index() {
            return this.mIndex;
        }

        abstract void performCallState(Presenter presenter);
    }

    private boolean Gf() {
        return this.aDp.index() >= PresenterState.CREATE.index();
    }

    private void b(Presenter presenter) {
        Object obj;
        View view;
        if (this.aDp.index() >= PresenterState.UNBIND.index() || presenter.aDp.index() >= PresenterState.UNBIND.index()) {
            return;
        }
        if (Gf() && !presenter.Gf() && (view = this.mRootView) != null) {
            presenter.F(view);
        }
        if (!isBound() || !presenter.Gf() || presenter.isBound() || (obj = this.aDo) == null) {
            return;
        }
        presenter.k(obj);
    }

    private boolean isBound() {
        return this.aDp == PresenterState.BIND;
    }

    public final void F(View view) {
        this.aDp = PresenterState.CREATE;
        this.mRootView = view;
        onCreate();
        this.aDp.performCallState(this);
    }

    public final List<Presenter> Gg() {
        return this.aDn;
    }

    public final Object Gh() {
        return this.aDo;
    }

    public final void a(Presenter presenter) {
        this.aDn.add(presenter);
        if (!Gf() || presenter.Gf()) {
            return;
        }
        F(this.mRootView);
    }

    public final void a(Presenter presenter, boolean z) {
        this.aDn.add(presenter);
        try {
            b(presenter);
        } catch (Throwable th) {
            c.gatherException(th);
            com.kwad.sdk.core.e.c.printStackTrace(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ah() {
    }

    public final void destroy() {
        if (this.aDp == PresenterState.BIND) {
            lM();
        }
        this.aDp = PresenterState.DESTROY;
        onDestroy();
        this.aDp.performCallState(this);
    }

    public final <T extends View> T findViewById(int i) {
        return (T) this.mRootView.findViewById(i);
    }

    public final Activity getActivity() {
        return l.dt(getContext());
    }

    public final Context getContext() {
        View view = this.mRootView;
        if (view == null) {
            return null;
        }
        return view.getContext();
    }

    public final View getRootView() {
        return this.mRootView;
    }

    public final void k(Object obj) {
        if (this.aDp != PresenterState.INIT) {
            PresenterState presenterState = PresenterState.DESTROY;
        }
        if (this.aDp == PresenterState.BIND) {
            lM();
        }
        this.aDp = PresenterState.BIND;
        this.aDo = obj;
        ah();
        this.aDp.performCallState(this);
    }

    public final void lM() {
        this.aDp = PresenterState.UNBIND;
        onUnbind();
        this.aDp.performCallState(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onCreate() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onDestroy() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onUnbind() {
    }
}
