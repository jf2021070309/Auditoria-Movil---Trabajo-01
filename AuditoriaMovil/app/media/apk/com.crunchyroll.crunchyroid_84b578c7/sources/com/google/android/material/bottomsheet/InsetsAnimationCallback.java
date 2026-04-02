package com.google.android.material.bottomsheet;

import android.view.View;
import com.amazon.aps.iva.p3.v0;
import com.amazon.aps.iva.p3.w0;
import com.google.android.material.animation.AnimationUtils;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes3.dex */
class InsetsAnimationCallback extends v0.b {
    private int startTranslationY;
    private int startY;
    private final int[] tmpLocation;
    private final View view;

    public InsetsAnimationCallback(View view) {
        super(0);
        this.tmpLocation = new int[2];
        this.view = view;
    }

    @Override // com.amazon.aps.iva.p3.v0.b
    public void onEnd(v0 v0Var) {
        this.view.setTranslationY(0.0f);
    }

    @Override // com.amazon.aps.iva.p3.v0.b
    public void onPrepare(v0 v0Var) {
        this.view.getLocationOnScreen(this.tmpLocation);
        this.startY = this.tmpLocation[1];
    }

    @Override // com.amazon.aps.iva.p3.v0.b
    public w0 onProgress(w0 w0Var, List<v0> list) {
        Iterator<v0> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            v0 next = it.next();
            if ((next.a.c() & 8) != 0) {
                this.view.setTranslationY(AnimationUtils.lerp(this.startTranslationY, 0, next.a.b()));
                break;
            }
        }
        return w0Var;
    }

    @Override // com.amazon.aps.iva.p3.v0.b
    public v0.a onStart(v0 v0Var, v0.a aVar) {
        this.view.getLocationOnScreen(this.tmpLocation);
        int i = this.startY - this.tmpLocation[1];
        this.startTranslationY = i;
        this.view.setTranslationY(i);
        return aVar;
    }
}
