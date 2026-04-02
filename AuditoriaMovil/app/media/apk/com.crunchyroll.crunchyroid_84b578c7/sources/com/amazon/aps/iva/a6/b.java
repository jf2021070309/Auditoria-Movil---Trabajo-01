package com.amazon.aps.iva.a6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.amazon.aps.iva.a6.m0;
/* compiled from: AudioBecomingNoisyManager.java */
/* loaded from: classes.dex */
public final class b {
    public final Context a;
    public final a b;
    public boolean c;

    /* compiled from: AudioBecomingNoisyManager.java */
    /* loaded from: classes.dex */
    public final class a extends BroadcastReceiver implements Runnable {
        public final InterfaceC0104b b;
        public final Handler c;

        public a(Handler handler, m0.b bVar) {
            this.c = handler;
            this.b = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.c.post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (b.this.c) {
                m0.this.D1(-1, 3, false);
            }
        }
    }

    /* compiled from: AudioBecomingNoisyManager.java */
    /* renamed from: com.amazon.aps.iva.a6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0104b {
    }

    public b(Context context, Handler handler, m0.b bVar) {
        this.a = context.getApplicationContext();
        this.b = new a(handler, bVar);
    }

    public final void a(boolean z) {
        a aVar = this.b;
        Context context = this.a;
        if (z && !this.c) {
            context.registerReceiver(aVar, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.c = true;
        } else if (!z && this.c) {
            context.unregisterReceiver(aVar);
            this.c = false;
        }
    }
}
