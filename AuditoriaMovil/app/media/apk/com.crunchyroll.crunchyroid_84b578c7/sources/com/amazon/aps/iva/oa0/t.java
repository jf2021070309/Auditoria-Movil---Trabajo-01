package com.amazon.aps.iva.oa0;

import com.amazon.aps.iva.oa0.s;
/* compiled from: ConfigManagerRepoNetwork.java */
/* loaded from: classes4.dex */
public final class t implements Runnable {
    public final /* synthetic */ s.a b;
    public final /* synthetic */ int c;
    public final /* synthetic */ u d;

    public t(u uVar, s.a aVar, int i) {
        this.d = uVar;
        this.b = aVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.d(this.b, this.c - 1);
    }
}
