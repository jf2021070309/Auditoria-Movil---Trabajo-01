package com.fyber.inneractive.sdk.d;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class p<EL extends InneractiveUnitController.EventsListener> implements InneractiveUnitController<EL> {
    protected WeakReference<j> mAdSpot;
    protected Set<InneractiveContentController> mContentControllers = new HashSet();
    protected EL mEventsListener;
    protected InneractiveContentController mSelectedContentController;

    public abstract boolean supports(InneractiveAdSpot inneractiveAdSpot);

    public abstract boolean supportsRefresh();

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void setEventsListener(EL el) {
        this.mEventsListener = el;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public EL getEventsListener() {
        return this.mEventsListener;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public InneractiveAdSpot getAdSpot() {
        return (j) com.fyber.inneractive.sdk.util.q.a(this.mAdSpot);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void addContentController(InneractiveContentController inneractiveContentController) {
        this.mContentControllers.add(inneractiveContentController);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public InneractiveContentController getSelectedContentController() {
        return this.mSelectedContentController;
    }

    public void setAdSpot(j jVar) {
        this.mAdSpot = new WeakReference<>(jVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void selectContentController() {
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) com.fyber.inneractive.sdk.util.q.a(this.mAdSpot);
        if (inneractiveAdSpot == null) {
            IAlog.d("selectContentController called, but ad spot is null", new Object[0]);
            return;
        }
        for (InneractiveContentController inneractiveContentController : this.mContentControllers) {
            k kVar = (k) inneractiveContentController;
            if (kVar.canControl(inneractiveAdSpot)) {
                this.mSelectedContentController = inneractiveContentController;
                kVar.setAdSpot(inneractiveAdSpot);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        for (InneractiveContentController inneractiveContentController : this.mContentControllers) {
            inneractiveContentController.destroy();
        }
        this.mContentControllers.clear();
        this.mSelectedContentController = null;
        this.mAdSpot = null;
    }

    public boolean canRefreshAd() {
        return supportsRefresh();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String logPrefix() {
        return IAlog.a(this);
    }
}
