package com.fyber.inneractive.sdk.d;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController.EventsListener;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public abstract class k<EventsListenerT extends InneractiveContentController.EventsListener> implements InneractiveContentController<EventsListenerT> {
    protected WeakReference<InneractiveAdSpot> mAdSpot;
    protected EventsListenerT mEventsListener;

    public abstract boolean canControl(InneractiveAdSpot inneractiveAdSpot);

    public EventsListenerT getEventsListener() {
        return this.mEventsListener;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveContentController
    public void setEventsListener(EventsListenerT eventslistenert) {
        this.mEventsListener = eventslistenert;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveContentController
    public void destroy() {
        this.mEventsListener = null;
        this.mAdSpot = null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveContentController
    public InneractiveAdSpot getAdSpot() {
        return (InneractiveAdSpot) com.fyber.inneractive.sdk.util.q.a(this.mAdSpot);
    }

    public void setAdSpot(InneractiveAdSpot inneractiveAdSpot) {
        this.mAdSpot = new WeakReference<>(inneractiveAdSpot);
    }
}
