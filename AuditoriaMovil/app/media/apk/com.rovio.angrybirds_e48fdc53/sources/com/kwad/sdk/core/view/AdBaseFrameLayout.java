package com.kwad.sdk.core.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.utils.ac;
import com.kwad.sdk.widget.e;
import java.util.ArrayList;
import java.util.List;
@Deprecated
/* loaded from: classes.dex */
public class AdBaseFrameLayout extends FrameLayout implements e {
    private static final ac.a axl = new ac.a();
    private List<View.OnTouchListener> axk;

    public AdBaseFrameLayout(Context context) {
        super(context);
        this.axk = new ArrayList();
    }

    public AdBaseFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.axk = new ArrayList();
    }

    public AdBaseFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.axk = new ArrayList();
    }

    public final void a(View.OnTouchListener onTouchListener) {
        if (this.axk.contains(onTouchListener)) {
            return;
        }
        this.axk.add(onTouchListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        try {
            super.dispatchRestoreInstanceState(sparseArray);
        } catch (Throwable th) {
            c.printStackTrace(th);
            com.kwad.sdk.service.c.gatherException(th);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.axk.isEmpty()) {
            for (View.OnTouchListener onTouchListener : this.axk) {
                onTouchListener.onTouch(this, motionEvent);
            }
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            ac.a aVar = axl;
            aVar.x(getWidth(), getHeight());
            aVar.f(motionEvent.getX(), motionEvent.getY());
        } else if (action == 1) {
            axl.g(motionEvent.getX(), motionEvent.getY());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.kwad.sdk.widget.e
    public ac.a getTouchCoords() {
        return axl;
    }

    @Override // android.view.View
    public void saveHierarchyState(SparseArray<Parcelable> sparseArray) {
    }
}
