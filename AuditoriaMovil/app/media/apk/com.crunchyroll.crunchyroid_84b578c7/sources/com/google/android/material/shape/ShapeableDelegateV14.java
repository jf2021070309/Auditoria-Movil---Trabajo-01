package com.google.android.material.shape;

import android.view.View;
/* loaded from: classes3.dex */
class ShapeableDelegateV14 extends ShapeableDelegate {
    @Override // com.google.android.material.shape.ShapeableDelegate
    public void invalidateClippingMethod(View view) {
        if (this.shapeAppearanceModel != null && !this.maskBounds.isEmpty() && shouldUseCompatClipping()) {
            view.invalidate();
        }
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public boolean shouldUseCompatClipping() {
        return true;
    }
}
