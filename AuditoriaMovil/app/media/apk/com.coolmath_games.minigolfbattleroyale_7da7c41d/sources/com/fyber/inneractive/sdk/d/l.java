package com.fyber.inneractive.sdk.d;

import android.app.Activity;
import android.os.CountDownTimer;
import com.fyber.inneractive.sdk.d.g;
import com.fyber.inneractive.sdk.e.c;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;
import com.fyber.inneractive.sdk.h.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.ao;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
/* loaded from: classes.dex */
public abstract class l<AdContent extends g, EventsListener extends InneractiveUnitController.EventsListener> extends h<AdContent, EventsListener> implements com.fyber.inneractive.sdk.e.c {
    protected c.a h;
    protected long j;
    public CountDownTimer k;
    private Runnable l;
    private Runnable m;
    private ao n;
    protected boolean i = false;
    private boolean o = false;

    public abstract long a(long j);

    public abstract boolean a(AdContent adcontent);

    public abstract boolean b(AdContent adcontent);

    public abstract boolean c(AdContent adcontent);

    public abstract boolean e();

    public abstract long f();

    public abstract boolean g();

    public abstract boolean h();

    static /* synthetic */ Runnable a(l lVar) {
        lVar.l = null;
        return null;
    }

    @Override // com.fyber.inneractive.sdk.d.h, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        super.initialize(inneractiveAdSpot);
    }

    @Override // com.fyber.inneractive.sdk.e.c
    public void a(c.a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        if (this.a == null) {
            IAlog.d("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("No spot ad to render");
        } else if (aVar == null) {
            IAlog.d("%srenderAd called with a null activity!", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("Activity is null");
        } else {
            this.h = aVar;
        }
    }

    @Override // com.fyber.inneractive.sdk.d.h, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        if (this.l != null) {
            com.fyber.inneractive.sdk.util.m.a().removeCallbacks(this.l);
            this.l = null;
        }
        if (this.m != null) {
            com.fyber.inneractive.sdk.util.m.a().removeCallbacks(this.m);
            this.m = null;
        }
        c.a aVar = this.h;
        if (aVar != null) {
            aVar.destroy();
        }
        this.h = null;
        CountDownTimer countDownTimer = this.k;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.k = null;
        }
        ao aoVar = this.n;
        if (aoVar != null) {
            aoVar.b = null;
            this.n = null;
        }
        super.destroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(boolean z) {
        n.a aVar;
        this.i = true;
        if (z) {
            if (this.b == null) {
                aVar = new n.a(com.fyber.inneractive.sdk.h.m.FAIL_SAFE_ACTIVATED, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.j.e) null, (JSONArray) null);
            } else {
                aVar = new n.a(com.fyber.inneractive.sdk.h.m.FAIL_SAFE_ACTIVATED, this.b.g(), this.b.f(), this.b.i().b());
            }
            aVar.a(new n.b().a("is_endcard", Boolean.valueOf(e())));
            aVar.b(null);
        }
        c.a aVar2 = this.h;
        if (aVar2 != null) {
            aVar2.showCloseButton(z, h());
        }
    }

    protected final void t() {
        this.i = true;
        c.a aVar = this.h;
        if (aVar != null) {
            aVar.showAdditionalCloseButton();
        }
    }

    protected final void a(int i) {
        c.a aVar = this.h;
        if (aVar != null) {
            aVar.updateCloseCountdown(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u() {
        boolean z;
        final boolean z2;
        final boolean z3;
        if (this.l == null) {
            this.j = f();
            if (this.b != null) {
                z = c((l<AdContent, EventsListener>) this.b);
                z2 = a((l<AdContent, EventsListener>) this.b);
                z3 = b((l<AdContent, EventsListener>) this.b);
            } else {
                z = false;
                z2 = false;
                z3 = false;
            }
            final long j = this.j;
            this.l = new Runnable() { // from class: com.fyber.inneractive.sdk.d.l.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (l.this.g()) {
                        l.this.m = new Runnable() { // from class: com.fyber.inneractive.sdk.d.l.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                IAlog.b("%sshowing fallback x transparent state is %s", IAlog.a(l.this), Boolean.valueOf(z2));
                                l.this.a(!z2);
                                if (z3) {
                                    l.this.t();
                                }
                                l.this.m = null;
                            }
                        };
                        long a = l.this.a(j);
                        l.a(l.this, a);
                        IAlog.b("%sad contains custom close. Will show transparent x in %d", IAlog.a(l.this), Long.valueOf(a));
                        l.a(l.this);
                        return;
                    }
                    IAlog.b("%sad does not contain custom close. Showing close button", IAlog.a(l.this));
                    l.this.a(false);
                }
            };
            IAlog.b("%senabling close with delay %d", IAlog.a(this), Long.valueOf(this.j));
            if (!z || g()) {
                v();
            } else if (z) {
                c.a aVar = this.h;
                if (aVar != null) {
                    aVar.showCloseCountdown();
                }
                CountDownTimer countDownTimer = new CountDownTimer(this.j + 100) { // from class: com.fyber.inneractive.sdk.d.l.2
                    @Override // android.os.CountDownTimer
                    public final void onTick(long j2) {
                        l.this.a(((int) j2) / 1000);
                    }

                    @Override // android.os.CountDownTimer
                    public final void onFinish() {
                        if (l.this.k != null) {
                            l.this.k.cancel();
                        }
                        l.this.a(false);
                    }
                };
                this.k = countDownTimer;
                countDownTimer.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v() {
        if (this.o) {
            return;
        }
        this.o = true;
        ao aoVar = new ao(TimeUnit.MILLISECONDS, this.j);
        this.n = aoVar;
        aoVar.b = new ao.b() { // from class: com.fyber.inneractive.sdk.d.l.3
            @Override // com.fyber.inneractive.sdk.util.ao.b
            public final void a() {
                com.fyber.inneractive.sdk.util.m.a().post(l.this.l);
                l.c(l.this);
            }
        };
        this.n.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.d.h
    public final void n() {
        super.n();
    }

    @Override // com.fyber.inneractive.sdk.e.c
    public void w() {
        ao aoVar = this.n;
        if (aoVar != null) {
            aoVar.b();
        }
    }

    @Override // com.fyber.inneractive.sdk.e.c
    public void x() {
        ao aoVar = this.n;
        if (aoVar != null) {
            aoVar.c();
        }
    }

    @Override // com.fyber.inneractive.sdk.d.h
    public final int s() {
        c.a aVar = this.h;
        if (aVar == null || aVar.getLayout() == null) {
            return 1;
        }
        return this.h.getLayout().getHeight();
    }

    @Override // com.fyber.inneractive.sdk.d.h
    public final int r() {
        c.a aVar = this.h;
        if (aVar == null || aVar.getLayout() == null) {
            return 1;
        }
        return this.h.getLayout().getWidth();
    }

    static /* synthetic */ void a(l lVar, long j) {
        ao aoVar = new ao(TimeUnit.MILLISECONDS, j);
        lVar.n = aoVar;
        aoVar.b = new ao.b() { // from class: com.fyber.inneractive.sdk.d.l.4
            @Override // com.fyber.inneractive.sdk.util.ao.b
            public final void a() {
                if (l.this.m != null) {
                    com.fyber.inneractive.sdk.util.m.a().post(l.this.m);
                }
                l.c(l.this);
            }
        };
        lVar.n.a();
    }

    static /* synthetic */ void c(l lVar) {
        ao aoVar = lVar.n;
        if (aoVar != null) {
            aoVar.b = null;
            lVar.n = null;
        }
    }
}
