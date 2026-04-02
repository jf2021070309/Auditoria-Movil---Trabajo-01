package com.amazon.aps.iva.ku;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.Window;
import com.amazon.aps.iva.ku.e;
/* compiled from: PostCommentDialog.kt */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.o.h {
    public final /* synthetic */ e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, Window.Callback callback) {
        super(callback);
        this.c = eVar;
    }

    @Override // com.amazon.aps.iva.o.h, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent != null && motionEvent.getAction() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            e.a aVar = e.i;
            e eVar = this.c;
            v presenter = eVar.di().getPresenter();
            int[] iArr = new int[2];
            eVar.ci().a.getLocationOnScreen(iArr);
            int i = iArr[0];
            presenter.t6(!new Rect(i, iArr[1], eVar.ci().a.getWidth() + i, eVar.ci().a.getHeight() + iArr[1]).contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()), eVar.di().a().isShowing());
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
