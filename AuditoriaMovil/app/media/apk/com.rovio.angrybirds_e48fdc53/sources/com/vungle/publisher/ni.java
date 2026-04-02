package com.vungle.publisher;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.vungle.publisher.dq;
import com.vungle.publisher.log.Logger;
import com.vungle.publisher.my;
import com.vungle.publisher.yn;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
/* loaded from: classes4.dex */
public abstract class ni<MA extends dq> extends mg<MA> {
    WeakReference<Activity> l;
    WeakReference<View> m;
    @Inject
    yn.a n;
    @Inject
    my.a o;
    @Inject
    com.vungle.publisher.env.o p;
    private my q;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vungle.publisher.mg
    public /* bridge */ /* synthetic */ void a(VungleAdActivity vungleAdActivity, cn cnVar, String str, p pVar, Bundle bundle) {
        a(vungleAdActivity, (VungleAdActivity) ((dq) cnVar), str, pVar, bundle);
    }

    public void a(VungleAdActivity vungleAdActivity, MA ma, String str, p pVar, Bundle bundle) {
        Logger.d(Logger.AD_TAG, "create mraid ad");
        this.l = new WeakReference<>(vungleAdActivity);
        this.m = new WeakReference<>(this.l.get().getWindow().getDecorView());
        a(pVar);
        super.a(vungleAdActivity, (VungleAdActivity) ma, str, pVar, bundle);
        s b = this.p.b(str);
        this.q = this.o.a(vungleAdActivity, (String) ma.c_(), ma.s(), pVar, b != null && b.c, x.a(ma.s));
        vungleAdActivity.setRequestedOrientation(4);
        vungleAdActivity.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        d();
    }

    void d() {
        if (this.q == null) {
            a(true, false);
        } else {
            a(this.q);
        }
    }

    @Override // com.vungle.publisher.mg
    public void a(VungleAdActivity vungleAdActivity) {
        if (!this.q.c()) {
            vungleAdActivity.finish();
        }
        super.a(vungleAdActivity);
    }

    @Override // com.vungle.publisher.mg
    protected yj<?> b() {
        return this.n.a((dq) this.a);
    }

    void a(p pVar) {
        View view = this.m.get();
        if (view != null && Build.VERSION.SDK_INT >= 19 && pVar.isImmersiveMode()) {
            view.setSystemUiVisibility(5894);
            view.setOnSystemUiVisibilityChangeListener(nj.a(this, pVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a(p pVar, int i) {
        if ((i & 4) == 0) {
            a(pVar);
        }
    }
}
