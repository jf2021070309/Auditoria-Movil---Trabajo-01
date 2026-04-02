package com.amazon.aps.iva.v90;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: ViewTransformer.kt */
/* loaded from: classes4.dex */
public interface i {

    /* compiled from: ViewTransformer.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static int a(Context context, AttributeSet attributeSet, int i) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{i});
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            return resourceId;
        }
    }

    View e(View view, AttributeSet attributeSet);
}
