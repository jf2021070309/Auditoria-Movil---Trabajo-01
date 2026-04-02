package com.vungle.publisher;

import android.content.Context;
import android.widget.ImageView;
/* loaded from: classes4.dex */
public class oa extends ImageView {
    public oa(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }
}
