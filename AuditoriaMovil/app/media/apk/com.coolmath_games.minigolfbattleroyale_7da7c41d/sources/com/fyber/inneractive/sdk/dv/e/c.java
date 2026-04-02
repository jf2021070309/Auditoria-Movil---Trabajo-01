package com.fyber.inneractive.sdk.dv.e;

import android.app.Activity;
import com.fyber.inneractive.sdk.d.l;
import com.fyber.inneractive.sdk.e.c;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.util.IAlog;
/* loaded from: classes.dex */
public final class c extends l<com.fyber.inneractive.sdk.a, InneractiveFullscreenAdEventsListener> implements com.fyber.inneractive.sdk.dv.d.a, com.fyber.inneractive.sdk.e.c {
    private c.b l;
    private boolean m = false;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final long a(long j) {
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final /* bridge */ /* synthetic */ boolean a(com.fyber.inneractive.sdk.a aVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final /* bridge */ /* synthetic */ boolean b(com.fyber.inneractive.sdk.a aVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final /* bridge */ /* synthetic */ boolean c(com.fyber.inneractive.sdk.a aVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final boolean e() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final long f() {
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final boolean g() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.l
    public final boolean h() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.e.c
    public final boolean i() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.e.c
    public final void j() {
    }

    @Override // com.fyber.inneractive.sdk.e.c
    public final void k() {
    }

    @Override // com.fyber.inneractive.sdk.d.l, com.fyber.inneractive.sdk.e.c
    public final void a(c.a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        super.a(aVar, activity);
        if (activity == null) {
            IAlog.d("%sYou must pass activity in order to show rewarded", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("No activity context");
        } else if (this.b == 0 || ((com.fyber.inneractive.sdk.a) this.b).e() == 0) {
            IAlog.d("%sad content is null aborting", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("Ad content is null");
        } else {
            ((com.fyber.inneractive.sdk.a) this.b).a(this, activity);
        }
    }

    @Override // com.fyber.inneractive.sdk.e.c
    public final void a(c.b bVar) {
        this.l = bVar;
    }

    @Override // com.fyber.inneractive.sdk.dv.d.a
    public final void a() {
        n();
    }

    @Override // com.fyber.inneractive.sdk.dv.d.a
    public final void b() {
        if (this.b != 0) {
            a(((com.fyber.inneractive.sdk.a) this.b).c());
        }
        m();
    }

    @Override // com.fyber.inneractive.sdk.dv.d.a
    public final void c() {
        c.b bVar = this.l;
        if (bVar != null) {
            bVar.a();
            g_();
        }
    }

    @Override // com.fyber.inneractive.sdk.dv.d.a
    public final void d() {
        if (this.m || this.c == 0) {
            return;
        }
        this.m = true;
        ((InneractiveFullscreenAdEventsListener) this.c).onAdDismissed(this.a);
    }
}
