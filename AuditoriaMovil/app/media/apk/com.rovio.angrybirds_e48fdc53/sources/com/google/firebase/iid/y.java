package com.google.firebase.iid;

import android.content.Intent;
/* loaded from: classes2.dex */
final class y implements Runnable {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ Intent b;
    private final /* synthetic */ zzb c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(zzb zzbVar, Intent intent, Intent intent2) {
        this.c = zzbVar;
        this.a = intent;
        this.b = intent2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.zzd(this.a);
        this.c.a(this.b);
    }
}
