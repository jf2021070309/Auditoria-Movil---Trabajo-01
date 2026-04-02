package com.facebook.ads.internal.api;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
/* loaded from: classes.dex */
public class AdCompanionView extends AdComponentFrameLayout {
    public AdCompanionViewApi a;

    public AdCompanionView(Context context) {
        super(context);
        initializeSelf(context);
    }

    public AdCompanionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initializeSelf(context);
    }

    public AdCompanionView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        initializeSelf(context);
    }

    public AdCompanionViewApi getAdCompanionViewApi() {
        return this.a;
    }

    public final void initializeSelf(Context context) {
        AdCompanionViewApi createAdCompanionViewApi = DynamicLoaderFactory.makeLoader(context).createAdCompanionViewApi();
        this.a = createAdCompanionViewApi;
        attachAdComponentViewApi(createAdCompanionViewApi);
        this.a.initialize(this);
    }
}
