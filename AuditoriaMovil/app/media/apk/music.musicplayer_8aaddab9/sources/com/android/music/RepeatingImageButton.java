package com.android.music;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.ImageButton;
import e.h.g.d1.j;
/* loaded from: classes.dex */
public class RepeatingImageButton extends ImageButton {
    public final j.f a;

    public RepeatingImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842866);
        this.a = new j.f();
        setFocusable(true);
        setLongClickable(true);
    }

    public void a(j.e eVar, long j2) {
        j.f fVar = this.a;
        fVar.f8285c = eVar;
        fVar.a = j2;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 23 || i2 == 66) {
            super.onKeyDown(i2, keyEvent);
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 == 23 || i2 == 66) {
            this.a.c();
        }
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.a.c();
        } else if (motionEvent.getAction() == 3) {
            this.a.c();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performLongClick() {
        this.a.b();
        return true;
    }
}
