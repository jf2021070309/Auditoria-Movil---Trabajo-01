package com.kwad.sdk.widget;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
/* loaded from: classes3.dex */
public final class f implements GestureDetector.OnGestureListener, View.OnTouchListener {
    private GestureDetector Gu;
    private MotionEvent aMr;
    private c fb;
    private View mView;

    public f(Context context, View view, c cVar) {
        this.mView = view;
        view.setOnTouchListener(this);
        this.Gu = new GestureDetector(context, this);
        this.fb = cVar;
    }

    public f(View view, c cVar) {
        if (view == null) {
            return;
        }
        this.mView = view;
        view.setOnTouchListener(this);
        this.Gu = new GestureDetector(view.getContext(), this);
        this.fb = cVar;
    }

    private static boolean a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return ((Math.abs(motionEvent.getX() - motionEvent2.getX()) > 20.0f ? 1 : (Math.abs(motionEvent.getX() - motionEvent2.getX()) == 20.0f ? 0 : -1)) > 0) || ((Math.abs(motionEvent.getY() - motionEvent2.getY()) > 20.0f ? 1 : (Math.abs(motionEvent.getY() - motionEvent2.getY()) == 20.0f ? 0 : -1)) > 0);
    }

    private boolean a(View view, MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        int action = motionEvent.getAction();
        boolean z = false;
        if (action != 0) {
            if (action == 1) {
                MotionEvent motionEvent3 = this.aMr;
                if (motionEvent3 != null && a(motionEvent3, motionEvent)) {
                    c cVar = this.fb;
                    if (cVar != null) {
                        cVar.b(view);
                    }
                    z = true;
                }
                motionEvent2 = null;
            }
            return z;
        }
        motionEvent2 = MotionEvent.obtain(motionEvent);
        this.aMr = motionEvent2;
        return z;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        c cVar = this.fb;
        if (cVar != null) {
            cVar.a(this.mView);
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean onTouchEvent = this.Gu.onTouchEvent(motionEvent);
        StringBuilder sb = new StringBuilder("onTouch, ");
        sb.append(motionEvent.getAction());
        sb.append("， handled： ");
        sb.append(onTouchEvent);
        if (onTouchEvent) {
            return true;
        }
        return a(view, motionEvent);
    }
}
