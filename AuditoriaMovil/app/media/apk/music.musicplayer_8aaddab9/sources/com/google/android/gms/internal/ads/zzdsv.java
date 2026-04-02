package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class zzdsv extends FrameLayout {
    private final com.google.android.gms.ads.internal.util.zzav zza;

    public zzdsv(Context context, View view, com.google.android.gms.ads.internal.util.zzav zzavVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.zza = zzavVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.zza.zza(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof zzcml)) {
                arrayList.add((zzcml) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((zzcml) arrayList.get(i3)).destroy();
        }
    }
}
