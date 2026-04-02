package com.amazon.aps.iva.wa;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.amazon.aps.iva.ApsIvaListener;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.types.LoadStatus;
import com.amazon.aps.iva.util.LogUtils;
import lombok.NonNull;
/* compiled from: AdOverlayWebViewContainer.java */
/* loaded from: classes.dex */
public final class b implements s {
    public WebView a;
    public final ViewGroup b;
    public final o c;
    public final n d;
    public final l e;
    public final com.amazon.aps.iva.ta.a f;
    public com.amazon.aps.iva.za.b g;
    public final p h;
    public final com.amazon.aps.iva.xa.b i;
    public final Handler j;

    public b(@NonNull ViewGroup viewGroup, @NonNull Context context, @NonNull com.amazon.aps.iva.xa.b bVar, @NonNull ApsIvaListener apsIvaListener, @NonNull com.amazon.aps.iva.ta.a aVar, @NonNull p pVar) {
        LoadStatus loadStatus = LoadStatus.PENDING_LOAD;
        if (bVar != null) {
            if (aVar != null) {
                if (pVar != null) {
                    this.a = new WebView(context);
                    this.b = viewGroup;
                    this.d = new n(bVar);
                    this.c = new o(bVar);
                    this.e = new l(apsIvaListener, pVar, bVar);
                    this.f = aVar;
                    this.h = pVar;
                    this.i = bVar;
                    Handler handler = new Handler(context.getMainLooper());
                    this.j = handler;
                    viewGroup.addView(this.a, new RelativeLayout.LayoutParams(-1, -1));
                    viewGroup.setVisibility(8);
                    this.g = new com.amazon.aps.iva.za.b(context, this.a);
                    if (!aVar.b("enableCTA")) {
                        this.g = new d(context, this.a, this);
                    }
                    this.g.b();
                    handler.post(new com.amazon.aps.iva.m6.e(this, 2));
                    return;
                }
                throw new NullPointerException("apsIvaWebViewSimidContainerListener is marked non-null but is null");
            }
            throw new NullPointerException("apsIvaConfig is marked non-null but is null");
        }
        throw new NullPointerException("metricsLogger is marked non-null but is null");
    }

    public final void a(@NonNull String str, j jVar) {
        if (str != null) {
            if (!w.f(str)) {
                LogUtils.d("a", "Executing JS : %s", str);
                if (this.a != null) {
                    this.j.post(new com.amazon.aps.iva.i4.d(this, 4, str, jVar));
                    return;
                }
                LogUtils.e("a", "WebView undefined to run commands");
                throw new com.amazon.aps.iva.ua.b();
            }
            LogUtils.e("a", "Error validating JS command");
            throw new com.amazon.aps.iva.ua.a();
        }
        throw new NullPointerException("jsCmd is marked non-null but is null");
    }

    public final void b() {
        com.amazon.aps.iva.za.b bVar = this.g;
        if (bVar != null) {
            bVar.c();
            this.g = null;
        }
        this.b.removeView(this.a);
        this.j.post(new com.amazon.aps.iva.e.k(this, 7));
    }
}
