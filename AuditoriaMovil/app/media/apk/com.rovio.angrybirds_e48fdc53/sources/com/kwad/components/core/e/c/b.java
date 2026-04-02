package com.kwad.components.core.e.c;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.kwad.components.core.e.c.a;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.m.l;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.core.o.d {
    private static b Jw;
    private com.kwad.components.core.e.c.a JA;
    private boolean JB;
    private final C0196b Jx;

    /* loaded from: classes.dex */
    public static class a {
        private DialogInterface.OnShowListener JD;
        private DialogInterface.OnDismissListener JE;
        private AdTemplate adTemplate;
        private String url;

        public final a R(AdTemplate adTemplate) {
            this.adTemplate = adTemplate;
            return this;
        }

        public final a a(DialogInterface.OnShowListener onShowListener) {
            this.JD = onShowListener;
            return this;
        }

        public final a am(String str) {
            this.url = str;
            return this;
        }

        public final a c(DialogInterface.OnDismissListener onDismissListener) {
            this.JE = onDismissListener;
            return this;
        }

        public final C0196b ng() {
            if (com.kwad.components.core.a.mp.booleanValue() && (this.adTemplate == null || TextUtils.isEmpty(this.url))) {
                throw new IllegalArgumentException("param is error, please check it");
            }
            return new C0196b(this, (byte) 0);
        }
    }

    /* renamed from: com.kwad.components.core.e.c.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0196b {
        protected DialogInterface.OnShowListener JD;
        protected DialogInterface.OnDismissListener JE;
        protected final AdTemplate adTemplate;
        protected String url;

        private C0196b(a aVar) {
            this.adTemplate = aVar.adTemplate;
            this.url = aVar.url;
            this.JD = aVar.JD;
            this.JE = aVar.JE;
        }

        /* synthetic */ C0196b(a aVar, byte b) {
            this(aVar);
        }
    }

    private b(Activity activity, C0196b c0196b) {
        super(activity);
        this.JB = false;
        this.Jx = c0196b;
        if (com.kwad.sdk.d.a.a.b(activity)) {
            getWindow().addFlags(1024);
        }
        setOnShowListener(c0196b.JD);
        setOnDismissListener(c0196b.JE);
    }

    public static boolean a(Context context, C0196b c0196b) {
        Activity dt;
        b bVar = Jw;
        if ((bVar == null || !bVar.isShowing()) && context != null && (dt = l.dt(context)) != null && !dt.isFinishing()) {
            com.kwad.sdk.a.a.c.xY().dismiss();
            try {
                b bVar2 = new b(dt, c0196b);
                Jw = bVar2;
                bVar2.show();
                com.kwad.sdk.core.report.a.b(c0196b.adTemplate, 86, (JSONObject) null);
                return true;
            } catch (Throwable th) {
                com.kwad.sdk.core.e.c.printStackTrace(th);
            }
        }
        return false;
    }

    public static boolean nd() {
        b bVar = Jw;
        if (bVar != null) {
            return bVar.isShowing();
        }
        return false;
    }

    public final void ak(boolean z) {
        this.JB = z;
        dismiss();
    }

    @Override // com.kwad.components.core.o.d
    public final ViewGroup cg() {
        com.kwad.components.core.e.c.a aVar = new com.kwad.components.core.e.c.a(this.mContext, this, this.Jx);
        this.JA = aVar;
        return aVar;
    }

    @Override // com.kwad.components.core.o.d, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        Jw = null;
    }

    @Override // com.kwad.components.core.o.d
    public final void g(View view) {
        this.JA.setChangeListener(new a.InterfaceC0195a() { // from class: com.kwad.components.core.e.c.b.1
            @Override // com.kwad.components.core.e.c.a.InterfaceC0195a
            public final void nc() {
                b.this.dismiss();
            }
        });
    }

    @Override // com.kwad.components.core.o.d
    public final int getLayoutId() {
        return 0;
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return super.isShowing();
    }

    @Override // com.kwad.components.core.o.d
    public final boolean ne() {
        return true;
    }

    public final boolean nf() {
        return this.JB;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        com.kwad.sdk.core.report.a.aH(this.Jx.adTemplate);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Jw = null;
    }

    @Override // com.kwad.components.core.o.d, android.app.Dialog
    public final void onStart() {
        super.onStart();
        b bVar = Jw;
        if (bVar != null) {
            bVar.setTitle((CharSequence) null);
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        try {
            super.show();
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
        }
    }
}
