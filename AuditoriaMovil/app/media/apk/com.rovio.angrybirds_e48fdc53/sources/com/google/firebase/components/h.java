package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {
    private final Map.Entry a;
    private final Event b;

    private h(Map.Entry entry, Event event) {
        this.a = entry;
        this.b = event;
    }

    public static Runnable a(Map.Entry entry, Event event) {
        return new h(entry, event);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((EventHandler) this.a.getKey()).handle(this.b);
    }
}
