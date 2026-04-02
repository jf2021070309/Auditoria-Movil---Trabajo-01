package com.amazon.aps.iva.p1;

import android.view.MotionEvent;
/* compiled from: PointerInteropFilter.android.kt */
/* loaded from: classes.dex */
public final class h0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<MotionEvent, Boolean> {
    public final /* synthetic */ com.amazon.aps.iva.p2.a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.amazon.aps.iva.p2.g gVar) {
        super(1);
        this.h = gVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(MotionEvent motionEvent) {
        boolean dispatchTouchEvent;
        MotionEvent motionEvent2 = motionEvent;
        com.amazon.aps.iva.yb0.j.f(motionEvent2, "motionEvent");
        int actionMasked = motionEvent2.getActionMasked();
        com.amazon.aps.iva.p2.a aVar = this.h;
        switch (actionMasked) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                dispatchTouchEvent = aVar.dispatchTouchEvent(motionEvent2);
                break;
            default:
                dispatchTouchEvent = aVar.dispatchGenericMotionEvent(motionEvent2);
                break;
        }
        return Boolean.valueOf(dispatchTouchEvent);
    }
}
