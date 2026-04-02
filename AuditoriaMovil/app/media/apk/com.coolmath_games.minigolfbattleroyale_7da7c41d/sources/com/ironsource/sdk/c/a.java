package com.ironsource.sdk.c;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class a extends FrameLayout implements e {
    public c a;
    public boolean b;
    private Activity c;

    public a(c cVar, Activity activity) {
        super(activity.getApplicationContext());
        this.b = false;
        setLayoutParams(new FrameLayout.LayoutParams(cVar.d.a, cVar.d.b));
        this.c = activity;
        this.a = cVar;
        addView(cVar.b);
    }

    static /* synthetic */ c a(a aVar, c cVar) {
        aVar.a = null;
        return null;
    }

    @Override // com.ironsource.sdk.c.e
    public final WebView a() {
        return this.a.b;
    }

    @Override // com.ironsource.sdk.c.e
    public final synchronized void a(final String str, final String str2) {
        if (this.a != null && this.a.c != null && this.a.b != null) {
            com.ironsource.sdk.b.b bVar = this.a.c;
            if (bVar.b != null && bVar.c != null) {
                bVar.a("containerWasRemoved", bVar.a());
            }
            this.c.runOnUiThread(new Runnable() { // from class: com.ironsource.sdk.c.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    aVar.removeView(aVar.a.b);
                    a.this.a.a(str, str2);
                    a.a(a.this, (c) null);
                }
            });
        }
    }

    @Override // com.ironsource.sdk.c.e
    public final void a(String str, String str2, String str3) {
        c cVar = this.a;
        if (cVar == null) {
            return;
        }
        cVar.a(str, str2, str3);
    }

    @Override // com.ironsource.sdk.c.e
    public final void a(JSONObject jSONObject, String str, String str2) {
        this.a.a(jSONObject, str, str2);
    }

    @Override // com.ironsource.sdk.c.e
    public final void b(JSONObject jSONObject, String str, String str2) {
        this.a.b(jSONObject, str, str2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Logger.i("IronSourceAdContainer", "onAttachedToWindow:");
        this.b = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        String str;
        super.onDetachedFromWindow();
        Logger.i("IronSourceAdContainer", "onDetachedFromWindow:");
        c cVar = this.a;
        if (cVar == null || cVar.c == null) {
            str = "in onDetachedFromWindow mAdPresenter or mAdPresenter.getLogic() are null";
        } else {
            this.b = false;
            try {
                this.a.c.a("destroyBanner", new JSONObject().put("adViewId", this.a.a).put("isBNAutoRemove", true).put("isBannerDisplay", this.b));
                return;
            } catch (Exception e) {
                str = e.toString();
            }
        }
        Logger.i("IronSourceAdContainer", str);
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        Logger.i("IronSourceAdContainer", "onVisibilityChanged: " + i);
        c cVar = this.a;
        if (cVar == null) {
            return;
        }
        try {
            cVar.c.a("isVisible", i, isShown());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        Logger.i("IronSourceAdContainer", "onWindowVisibilityChanged: " + i);
        c cVar = this.a;
        if (cVar == null) {
            return;
        }
        try {
            cVar.c.a("isWindowVisible", i, isShown());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
