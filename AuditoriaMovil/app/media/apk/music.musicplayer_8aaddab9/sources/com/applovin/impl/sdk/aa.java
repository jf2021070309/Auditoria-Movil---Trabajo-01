package com.applovin.impl.sdk;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: classes.dex */
public class aa {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final v f3823b;

    /* renamed from: c  reason: collision with root package name */
    private final View f3824c;

    public aa(View view, m mVar) {
        this.a = mVar;
        this.f3823b = mVar.B();
        this.f3824c = view;
    }

    public long a(com.applovin.impl.mediation.a.e eVar) {
        long j2;
        this.f3823b.b("ViewabilityTracker", "Checking visibility...");
        if (this.f3824c.isShown()) {
            j2 = 0;
        } else {
            this.f3823b.e("ViewabilityTracker", "View is hidden");
            j2 = 2;
        }
        if (this.f3824c.getAlpha() < eVar.F()) {
            this.f3823b.e("ViewabilityTracker", "View is transparent");
            j2 |= 4;
        }
        Animation animation = this.f3824c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            this.f3823b.e("ViewabilityTracker", "View is animating");
            j2 |= 8;
        }
        if (this.f3824c.getParent() == null) {
            this.f3823b.e("ViewabilityTracker", "No parent view found");
            j2 |= 16;
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f3824c.getContext(), this.f3824c.getWidth());
        if (pxToDp < eVar.D()) {
            v vVar = this.f3823b;
            vVar.e("ViewabilityTracker", "View has width (" + pxToDp + ") below threshold");
            j2 |= 32;
        }
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f3824c.getContext(), this.f3824c.getHeight());
        if (pxToDp2 < eVar.E()) {
            v vVar2 = this.f3823b;
            vVar2.e("ViewabilityTracker", "View has height (" + pxToDp2 + ") below threshold");
            j2 |= 64;
        }
        Point a = com.applovin.impl.sdk.utils.g.a(this.f3824c.getContext());
        Rect rect = new Rect(0, 0, a.x, a.y);
        int[] iArr = {-1, -1};
        this.f3824c.getLocationOnScreen(iArr);
        Rect rect2 = new Rect(iArr[0], iArr[1], this.f3824c.getWidth() + iArr[0], this.f3824c.getHeight() + iArr[1]);
        if (!Rect.intersects(rect, rect2)) {
            v vVar3 = this.f3823b;
            vVar3.e("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            j2 |= 128;
        }
        Activity a2 = this.a.ae().a();
        if (a2 != null && !Utils.isViewInTopActivity(this.f3824c, a2)) {
            this.f3823b.e("ViewabilityTracker", "View is not in top activity's view hierarchy");
            j2 |= 256;
        }
        v vVar4 = this.f3823b;
        StringBuilder y = e.a.d.a.a.y("Returning flags: ");
        y.append(Long.toBinaryString(j2));
        vVar4.b("ViewabilityTracker", y.toString());
        return j2;
    }
}
