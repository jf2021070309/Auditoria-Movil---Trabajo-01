package com.applovin.impl.sdk;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.animation.Animation;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: classes.dex */
public class w {
    private final k a;
    private final r b;
    private final MaxAdView c;

    public w(MaxAdView maxAdView, k kVar) {
        this.a = kVar;
        this.b = kVar.z();
        this.c = maxAdView;
    }

    public long a(com.applovin.impl.mediation.a.b bVar) {
        long j;
        this.b.b("ViewabilityTracker", "Checking visibility...");
        if (this.c.isShown()) {
            j = 0;
        } else {
            this.b.e("ViewabilityTracker", "View is hidden");
            j = 2;
        }
        if (this.c.getAlpha() < bVar.w()) {
            this.b.e("ViewabilityTracker", "View is transparent");
            j |= 4;
        }
        Animation animation = this.c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            this.b.e("ViewabilityTracker", "View is animating");
            j |= 8;
        }
        if (this.c.getParent() == null) {
            this.b.e("ViewabilityTracker", "No parent view found");
            j |= 16;
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.c.getContext(), this.c.getWidth());
        if (pxToDp < bVar.u()) {
            r rVar = this.b;
            rVar.e("ViewabilityTracker", "View has width (" + pxToDp + ") below threshold");
            j |= 32;
        }
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.c.getContext(), this.c.getHeight());
        if (pxToDp2 < bVar.v()) {
            r rVar2 = this.b;
            rVar2.e("ViewabilityTracker", "View has height (" + pxToDp2 + ") below threshold");
            j |= 64;
        }
        Point a = com.applovin.impl.sdk.utils.f.a(this.c.getContext());
        Rect rect = new Rect(0, 0, a.x, a.y);
        int[] iArr = {-1, -1};
        this.c.getLocationOnScreen(iArr);
        Rect rect2 = new Rect(iArr[0], iArr[1], iArr[0] + this.c.getWidth(), iArr[1] + this.c.getHeight());
        if (!Rect.intersects(rect, rect2)) {
            r rVar3 = this.b;
            rVar3.e("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            j |= 128;
        }
        Activity a2 = this.a.ad().a();
        if (a2 != null && !Utils.isViewInTopActivity(this.c, a2)) {
            this.b.e("ViewabilityTracker", "View is not in top activity's view hierarchy");
            j |= 256;
        }
        r rVar4 = this.b;
        rVar4.b("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j));
        return j;
    }
}
