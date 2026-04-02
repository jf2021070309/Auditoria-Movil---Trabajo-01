package com.amazon.aps.iva.i70;

import com.ellation.crunchyroll.ui.R;
/* compiled from: DrawableInputState.kt */
/* loaded from: classes2.dex */
public enum g {
    STATE_VALID(R.attr.state_valid),
    STATE_ERROR(R.attr.state_error),
    STATE_FOCUSED(16842908);
    
    private final int declaredAttribute;

    g(int i) {
        this.declaredAttribute = i;
    }

    public final int[] getAttributes() {
        return new int[]{this.declaredAttribute};
    }

    public final int getDeclaredAttribute() {
        return this.declaredAttribute;
    }
}
