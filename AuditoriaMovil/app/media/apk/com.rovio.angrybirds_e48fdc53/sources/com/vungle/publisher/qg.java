package com.vungle.publisher;

import de.greenrobot.event.EventBus;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class qg {
    private final EventBus a = new EventBus();

    public void a(Object obj) {
        this.a.post(obj);
    }

    public void b(Object obj) {
        this.a.register(obj);
    }

    public void c(Object obj) {
        this.a.registerSticky(obj);
    }

    public void d(Object obj) {
        this.a.unregister(obj);
    }
}
