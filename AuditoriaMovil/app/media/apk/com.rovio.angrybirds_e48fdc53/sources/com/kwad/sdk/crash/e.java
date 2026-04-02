package com.kwad.sdk.crash;

import android.content.Context;
import android.os.SystemClock;
import com.kwad.sdk.crash.c;
import com.kwad.sdk.crash.model.message.ExceptionMessage;
/* loaded from: classes.dex */
public final class e {
    private com.kwad.sdk.crash.b.b aAd;
    private c aAe;
    private long aAf;

    /* loaded from: classes.dex */
    static class a {
        private static final e aAg = new e((byte) 0);
    }

    private e() {
        this.aAd = new com.kwad.sdk.crash.b.b();
        this.aAe = new c.a().EA();
    }

    /* synthetic */ e(byte b) {
        this();
    }

    public static e EB() {
        return a.aAg;
    }

    public final String[] EC() {
        return this.aAd.EP();
    }

    public final String[] ED() {
        return this.aAd.ED();
    }

    public final String EE() {
        return this.aAe.azG.aAx;
    }

    public final int EF() {
        return this.aAe.azG.aAB;
    }

    public final c EG() {
        return this.aAe;
    }

    public final h EH() {
        return this.aAe.azI;
    }

    public final long EI() {
        return SystemClock.elapsedRealtime() - this.aAf;
    }

    public final void a(c cVar) {
        this.aAe = cVar;
        this.aAf = SystemClock.elapsedRealtime();
        this.aAd.a(cVar.azJ, cVar.azK);
    }

    public final void b(int i, ExceptionMessage exceptionMessage) {
        f Ey = this.aAe.Ey();
        if (Ey != null) {
            Ey.a(i, exceptionMessage);
        }
    }

    public final String getAppId() {
        return this.aAe.azH.aAu;
    }

    public final Context getContext() {
        return this.aAe.context;
    }

    public final String getSdkVersion() {
        return this.aAe.azG.mSdkVersion;
    }

    public final boolean isDebug() {
        return this.aAe.Ez();
    }
}
