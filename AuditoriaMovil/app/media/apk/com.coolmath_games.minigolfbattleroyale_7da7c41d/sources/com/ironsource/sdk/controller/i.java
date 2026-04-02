package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.appevents.codeless.internal.Constants;
import com.ironsource.sdk.controller.w;
/* loaded from: classes2.dex */
public final class i extends FrameLayout implements com.ironsource.sdk.j.g {
    Context a;
    w b;

    public i(Context context) {
        super(context);
        this.a = context;
        setClickable(true);
    }

    static /* synthetic */ ViewGroup a(i iVar) {
        Activity activity = (Activity) iVar.a;
        if (activity != null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        int identifier;
        try {
            if (this.a == null || (identifier = this.a.getResources().getIdentifier("status_bar_height", "dimen", Constants.PLATFORM)) <= 0) {
                return 0;
            }
            return this.a.getResources().getDimensionPixelSize(identifier);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        Activity activity = (Activity) this.a;
        try {
            if (Build.VERSION.SDK_INT > 9) {
                Rect rect = new Rect();
                activity.getWindow().getDecorView().getDrawingRect(rect);
                Rect rect2 = new Rect();
                activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
                if (com.ironsource.environment.h.p(activity) == 1) {
                    if (rect.bottom - rect2.bottom > 0) {
                        return rect.bottom - rect2.bottom;
                    }
                    return 0;
                } else if (rect.right - rect2.right > 0) {
                    return rect.right - rect2.right;
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.j();
        this.b.a(true, "main");
    }

    @Override // com.ironsource.sdk.j.g
    public final boolean onBackButtonPressed() {
        new com.ironsource.sdk.i.a();
        return com.ironsource.sdk.i.a.a((Activity) this.a);
    }

    @Override // com.ironsource.sdk.j.g
    public final void onCloseRequested() {
        ((Activity) this.a).runOnUiThread(new Runnable() { // from class: com.ironsource.sdk.controller.i.2
            @Override // java.lang.Runnable
            public final void run() {
                ViewGroup a = i.a(i.this);
                if (a != null) {
                    a.removeView(i.this);
                }
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.i();
        this.b.a(false, "main");
        w wVar = this.b;
        if (wVar != null) {
            wVar.j = w.g.Gone;
            this.b.n = null;
            this.b.x = null;
        }
        removeAllViews();
    }

    @Override // com.ironsource.sdk.j.g
    public final void onOrientationChanged(String str, int i) {
    }
}
