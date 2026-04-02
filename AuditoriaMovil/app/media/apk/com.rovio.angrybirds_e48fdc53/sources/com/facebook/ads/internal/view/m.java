package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.q.a.q;
import com.facebook.ads.internal.view.a;
import com.facebook.ads.internal.view.g;
/* loaded from: classes2.dex */
public abstract class m extends RelativeLayout implements a {
    protected static final int a = (int) (56.0f * com.facebook.ads.internal.q.a.v.b);
    protected final com.facebook.ads.internal.m.c b;
    protected final g c;
    protected com.facebook.ads.internal.adapters.j d;
    protected com.facebook.ads.internal.adapters.j e;
    private a.InterfaceC0118a f;
    private final com.facebook.ads.internal.q.a.q g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Context context, com.facebook.ads.internal.m.c cVar) {
        super(context.getApplicationContext());
        this.b = cVar;
        this.c = new g(getContext());
        this.g = new com.facebook.ads.internal.q.a.q(this);
    }

    private void a() {
        removeAllViews();
        com.facebook.ads.internal.q.a.v.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, boolean z, int i) {
        int d;
        this.g.a(q.a.DEFAULT);
        a();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, z ? 0 : a, 0, 0);
        addView(view, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, a);
        layoutParams2.addRule(10);
        if (i == 1) {
            d = this.d.d(z);
            this.c.a(this.d, z);
        } else {
            d = this.e.d(z);
            this.c.a(this.e, z);
        }
        addView(this.c, layoutParams2);
        com.facebook.ads.internal.q.a.v.a(this, d);
        if (this.f != null) {
            this.f.a(this);
            if (!z || Build.VERSION.SDK_INT < 19) {
                return;
            }
            this.g.a(q.a.FULL_SCREEN);
        }
    }

    public void a(final AudienceNetworkActivity audienceNetworkActivity, com.facebook.ads.internal.adapters.v vVar) {
        this.g.a(audienceNetworkActivity.getWindow());
        this.d = vVar.h();
        this.e = vVar.i();
        this.c.a(vVar.b(), vVar.c(), vVar.g(), vVar.e(), vVar.a(), vVar.d().get(0).l());
        this.c.setToolbarListener(new g.a() { // from class: com.facebook.ads.internal.view.m.1
            @Override // com.facebook.ads.internal.view.g.a
            public void a() {
                audienceNetworkActivity.finish();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a.InterfaceC0118a getAudienceNetworkListener() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.c.d();
        super.onConfigurationChanged(configuration);
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.facebook.ads.internal.view.m.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                m.this.c.e();
                if (Build.VERSION.SDK_INT >= 14) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    public void onDestroy() {
        this.g.a();
        this.c.setToolbarListener(null);
        a();
    }

    @Override // com.facebook.ads.internal.view.a
    public void setListener(a.InterfaceC0118a interfaceC0118a) {
        this.f = interfaceC0118a;
    }
}
