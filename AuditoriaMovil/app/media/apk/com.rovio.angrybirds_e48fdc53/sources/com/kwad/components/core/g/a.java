package com.kwad.components.core.g;

import android.os.Handler;
/* loaded from: classes.dex */
public final class a implements Runnable {
    private long Ku = 1000;
    private boolean Kv = true;
    private long Kw = 0;
    private InterfaceC0198a Kx;
    private volatile Handler mHandler;

    /* renamed from: com.kwad.components.core.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0198a {
        void u(long j);
    }

    public a(Handler handler) {
        this.mHandler = handler;
    }

    public final void a(InterfaceC0198a interfaceC0198a) {
        this.Kx = interfaceC0198a;
    }

    public final void destroy() {
        stop();
        this.mHandler = null;
    }

    public final void pause() {
        this.Kv = true;
    }

    public final void resume() {
        this.Kv = false;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        InterfaceC0198a interfaceC0198a;
        if (this.mHandler != null) {
            if (!this.Kv && (interfaceC0198a = this.Kx) != null) {
                interfaceC0198a.u(this.Kw);
                this.Kw += this.Ku;
            }
            if (this.mHandler != null) {
                this.mHandler.postDelayed(this, this.Ku);
            }
        }
    }

    public final void start() {
        this.Kv = false;
        if (this.mHandler != null) {
            this.mHandler.post(this);
        }
    }

    public final void stop() {
        if (this.mHandler != null) {
            this.mHandler.removeCallbacks(this);
        }
    }
}
