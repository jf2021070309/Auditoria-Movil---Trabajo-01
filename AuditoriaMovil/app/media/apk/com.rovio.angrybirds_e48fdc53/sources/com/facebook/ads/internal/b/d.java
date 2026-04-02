package com.facebook.ads.internal.b;

import android.os.Bundle;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.facebook.ads.internal.q.a.o;
/* loaded from: classes2.dex */
public class d implements o<Bundle> {
    private c a;
    private final c b;
    private final b c;
    private boolean d;
    private boolean e;
    private boolean f;

    public d(b bVar) {
        this.d = false;
        this.e = false;
        this.f = false;
        this.c = bVar;
        this.b = new c(bVar.b);
        this.a = new c(bVar.b);
    }

    public d(b bVar, Bundle bundle) {
        this.d = false;
        this.e = false;
        this.f = false;
        this.c = bVar;
        this.b = (c) bundle.getSerializable("testStats");
        this.a = (c) bundle.getSerializable("viewableStats");
        this.d = bundle.getBoolean("ended");
        this.e = bundle.getBoolean("passed");
        this.f = bundle.getBoolean("complete");
    }

    private void a() {
        this.e = true;
        b();
    }

    private void b() {
        this.f = true;
        c();
    }

    private void c() {
        this.d = true;
        this.c.a(this.f, this.e, this.e ? this.a : this.b);
    }

    public void a(double d, double d2) {
        if (this.d) {
            return;
        }
        this.b.a(d, d2);
        this.a.a(d, d2);
        double f = this.a.b().f();
        if (this.c.e && d2 < this.c.b) {
            this.a = new c(this.c.b);
        }
        if (this.c.c >= PangleAdapterUtils.CPM_DEFLAUT_VALUE && this.b.b().e() > this.c.c && f == PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            b();
        } else if (f >= this.c.d) {
            a();
        }
    }

    @Override // com.facebook.ads.internal.q.a.o
    public Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("viewableStats", this.a);
        bundle.putSerializable("testStats", this.b);
        bundle.putBoolean("ended", this.d);
        bundle.putBoolean("passed", this.e);
        bundle.putBoolean("complete", this.f);
        return bundle;
    }
}
