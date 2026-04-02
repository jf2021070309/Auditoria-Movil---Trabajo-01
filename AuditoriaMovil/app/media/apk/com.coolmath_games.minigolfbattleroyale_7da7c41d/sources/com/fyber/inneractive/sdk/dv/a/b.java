package com.fyber.inneractive.sdk.dv.a;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.d.g;
import com.fyber.inneractive.sdk.d.h;
import com.fyber.inneractive.sdk.dv.e;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l;
/* loaded from: classes.dex */
public final class b extends h<a, InneractiveAdViewEventsListener> implements e, com.fyber.inneractive.sdk.e.b {
    private ViewGroup h;

    @Override // com.fyber.inneractive.sdk.e.b
    public final void a(int i) {
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final void c() {
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final void d() {
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final void f() {
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final void a(ViewGroup viewGroup) {
        if (this.a == null) {
            IAlog.d("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
        } else if (viewGroup == null || this.b == 0 || ((a) this.b).e() == null) {
        } else {
            ((a) this.b).a(this);
            this.h = viewGroup;
            viewGroup.addView(((a) this.b).e());
        }
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final boolean a(g gVar) {
        return gVar instanceof com.fyber.inneractive.sdk.dv.a;
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final boolean a(View view) {
        ViewGroup viewGroup = this.h;
        return viewGroup != null && viewGroup.equals(view);
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final void e() {
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.h = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final int g() {
        if (this.b == 0 || ((a) this.b).e() == null || ((a) this.b).e().getAdSize() == null) {
            return 0;
        }
        return l.b(((a) this.b).e().getAdSize().getWidth());
    }

    @Override // com.fyber.inneractive.sdk.e.b
    public final int h() {
        if (this.b == 0 || ((a) this.b).e() == null || ((a) this.b).e().getAdSize() == null) {
            return 0;
        }
        return l.b(((a) this.b).e().getAdSize().getHeight());
    }

    @Override // com.fyber.inneractive.sdk.d.h, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        if (this.b != 0) {
            if (((a) this.b).e() != null) {
                ((a) this.b).e().destroy();
            }
            ((a) this.b).b();
        }
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.h = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.dv.e
    public final void a() {
        n();
        if (this.b == 0 || ((a) this.b).c() == null) {
            return;
        }
        b(((a) this.b).c());
    }

    @Override // com.fyber.inneractive.sdk.dv.e
    public final void b() {
        m();
        if (this.b == 0 || ((a) this.b).c() == null) {
            return;
        }
        a(((a) this.b).c());
    }
}
