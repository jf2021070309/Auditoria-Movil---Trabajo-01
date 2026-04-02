package com.vungle.publisher;

import com.vungle.publisher.mg;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class me<A extends mg<?>> extends pi {
    protected A a;

    public void onEvent(bg bgVar) {
        this.a.a(false, false);
    }

    public void onEvent(aq aqVar) {
        this.a.b(aqVar.a());
    }
}
