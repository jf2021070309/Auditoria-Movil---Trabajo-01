package com.fyber.inneractive.sdk.m;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* loaded from: classes.dex */
final class g implements View.OnTouchListener {
    private final a a;
    private float b;
    private float c;
    private float d;

    /* loaded from: classes.dex */
    interface a {
        void g();

        void h();

        void i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(a aVar, Context context) {
        this.a = aVar;
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        if (this.a != null) {
            if (motionEvent.getActionMasked() == 0) {
                this.a.h();
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                return false;
            } else if (motionEvent.getActionMasked() == 3) {
                this.a.i();
                this.c = -1.0f;
                this.b = -1.0f;
                return false;
            } else if (motionEvent.getActionMasked() == 1) {
                if (this.b < 0.0f || this.c < 0.0f) {
                    return false;
                }
                float round = Math.round(Math.abs(this.c - motionEvent.getY()));
                float f2 = this.d;
                if (Math.round(Math.abs(f - motionEvent.getX())) < f2 && round < f2) {
                    this.a.g();
                }
                this.b = -1.0f;
                this.c = -1.0f;
                return false;
            } else {
                return false;
            }
        }
        return false;
    }
}
