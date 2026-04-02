package com.vungle.publisher;

import com.vungle.publisher.log.Logger;
import javax.inject.Inject;
/* loaded from: classes4.dex */
public class pi implements qi {
    private boolean a;
    @Inject
    public qg eventBus;

    @Override // com.vungle.publisher.qi
    public void register() {
        if (this.a) {
            Logger.w(Logger.EVENT_TAG, getClass().getName() + " already listening");
            return;
        }
        Logger.d(Logger.EVENT_TAG, getClass().getName() + " listening");
        this.eventBus.b(this);
        this.a = true;
    }

    @Override // com.vungle.publisher.qi
    public void registerSticky() {
        if (this.a) {
            Logger.w(Logger.EVENT_TAG, getClass().getName() + " already listening sticky");
            return;
        }
        Logger.d(Logger.EVENT_TAG, getClass().getName() + " listening sticky");
        this.eventBus.c(this);
        this.a = true;
    }

    @Override // com.vungle.publisher.qi
    public void unregister() {
        Logger.d(Logger.EVENT_TAG, getClass().getName() + " unregistered");
        this.eventBus.d(this);
        this.a = false;
    }
}
