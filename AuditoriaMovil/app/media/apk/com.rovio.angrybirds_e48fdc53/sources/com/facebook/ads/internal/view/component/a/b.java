package com.facebook.ads.internal.view.component.a;

import android.content.Context;
import android.widget.RelativeLayout;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.facebook.ads.internal.adapters.j;
import com.facebook.ads.internal.q.a.v;
import com.facebook.ads.internal.view.a;
import com.facebook.ads.internal.view.component.i;
import java.util.HashMap;
/* loaded from: classes2.dex */
public abstract class b extends RelativeLayout {
    static final int a = (int) (16.0f * v.b);
    static final int b = (int) (28.0f * v.b);
    private final i c;
    private final com.facebook.ads.internal.view.component.a d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, com.facebook.ads.internal.m.c cVar, a.InterfaceC0118a interfaceC0118a, j jVar, boolean z) {
        super(context);
        this.d = new com.facebook.ads.internal.view.component.a(context, true, c(), "com.facebook.ads.interstitial.clicked", jVar, cVar, interfaceC0118a);
        v.a(this.d);
        this.c = new i(getContext(), jVar, z, true, b());
        v.a(this.c);
    }

    public void a(String str, String str2, String str3, String str4, String str5, double d) {
        this.c.a(str, str2, false, !a() && d > PangleAdapterUtils.CPM_DEFLAUT_VALUE && d < 1.0d);
        this.d.a(str3, str4, str5, new HashMap());
    }

    public abstract boolean a();

    protected boolean b() {
        return true;
    }

    protected boolean c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.facebook.ads.internal.view.component.a getCtaButton() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i getTextContainer() {
        return this.c;
    }
}
