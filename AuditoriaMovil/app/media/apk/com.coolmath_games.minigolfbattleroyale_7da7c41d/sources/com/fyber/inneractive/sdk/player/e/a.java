package com.fyber.inneractive.sdk.player.e;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.aj;
import com.fyber.inneractive.sdk.util.ak;
import com.fyber.inneractive.sdk.util.l;
/* loaded from: classes.dex */
public abstract class a extends RelativeLayout implements e {
    protected final aj a;
    protected int b;
    protected u c;
    protected UnitDisplayType d;
    protected boolean e;
    protected boolean f;
    protected f g;
    public boolean h;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(ak akVar, int i, int i2);

    public a(Context context) {
        super(context, null, 0);
        this.a = new aj();
        this.b = 0;
        this.e = false;
        this.f = false;
        this.h = false;
        this.b = Math.min(l.x(), l.w());
    }

    public void setListener(f fVar) {
        this.g = fVar;
    }

    public void setUnitConfig(u uVar) {
        this.c = uVar;
        this.d = uVar.d() == null ? uVar.g().h() : UnitDisplayType.DEFAULT;
    }

    @Override // com.fyber.inneractive.sdk.player.e.e
    public void a() {
        if (this.g != null) {
            this.g = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.e.e
    public final boolean b() {
        return this.e;
    }

    @Override // com.fyber.inneractive.sdk.player.e.e
    public final void c() {
        boolean z = isShown() && hasWindowFocus() && this.f && !this.h;
        if (z) {
            z = getGlobalVisibleRect(new Rect());
        }
        if (z == this.e || this.g == null) {
            return;
        }
        IAlog.b("%supdateVisibility changing to %s", IAlog.a(this), Boolean.valueOf(z));
        this.e = z;
        this.g.e(z);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (equals(view)) {
            IAlog.b("%sgot onVisibilityChanged with %d", IAlog.a(this), Integer.valueOf(i));
            c();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        IAlog.b("%sgot onWindowFocusChanged with: %s", IAlog.a(this), Boolean.valueOf(z));
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        IAlog.b("%sGot onAttachedToWindow: mIsAttached = %s", IAlog.a(this), Boolean.valueOf(this.f));
        this.f = true;
        f fVar = this.g;
        if (fVar != null) {
            fVar.l();
        }
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IAlog.b("%sGot onDetachedFromWindow: mIsAttached = %s", IAlog.a(this), Boolean.valueOf(this.f));
        this.f = false;
        f fVar = this.g;
        if (fVar != null) {
            fVar.o();
        }
        c();
    }
}
