package com.kwad.sdk.utils;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
/* loaded from: classes3.dex */
public final class bl {
    private View aKB;
    public Point aKA = new Point();
    public Rect aKy = new Rect();
    public Rect aKz = new Rect();

    public bl(View view) {
        this.aKB = view;
    }

    public final boolean Kc() {
        boolean globalVisibleRect = this.aKB.getGlobalVisibleRect(this.aKy, this.aKA);
        if (this.aKA.x == 0 && this.aKA.y == 0 && this.aKy.height() == this.aKB.getHeight() && this.aKz.height() != 0 && Math.abs(this.aKy.top - this.aKz.top) > this.aKB.getHeight() / 2) {
            this.aKy.set(this.aKz);
        }
        this.aKz.set(this.aKy);
        return globalVisibleRect;
    }
}
