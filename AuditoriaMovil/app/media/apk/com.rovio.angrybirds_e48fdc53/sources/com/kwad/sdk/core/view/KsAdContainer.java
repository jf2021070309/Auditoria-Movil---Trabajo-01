package com.kwad.sdk.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.kwad.sdk.utils.ac;
/* loaded from: classes.dex */
public class KsAdContainer extends RelativeLayout {
    protected ac.a axl;

    public KsAdContainer(Context context) {
        super(context);
        this.axl = new ac.a();
    }

    public KsAdContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.axl = new ac.a();
    }

    public KsAdContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.axl = new ac.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            ac.a aVar = new ac.a(getWidth(), getHeight());
            this.axl = aVar;
            aVar.f(motionEvent.getX(), motionEvent.getY());
        } else if (action == 1) {
            this.axl.g(motionEvent.getX(), motionEvent.getY());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public ac.a getTouchCoords() {
        return this.axl;
    }
}
