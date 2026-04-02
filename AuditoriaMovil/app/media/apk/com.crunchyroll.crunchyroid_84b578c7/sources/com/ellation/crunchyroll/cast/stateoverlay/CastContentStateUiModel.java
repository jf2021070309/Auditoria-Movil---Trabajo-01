package com.ellation.crunchyroll.cast.stateoverlay;

import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: CastContentStateUiModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/cast/stateoverlay/CastContentStateUiModel;", "", "iconImage", "", "(Ljava/lang/String;II)V", "getIconImage", "()I", "ComingSoon", "Premium", "Unavailable", "cast_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum CastContentStateUiModel {
    ComingSoon(R.drawable.ic_coming_soon),
    Premium(com.ellation.crunchyroll.cast.R.drawable.ic_premium),
    Unavailable(com.ellation.crunchyroll.cast.R.drawable.ic_unavailable);
    
    private final int iconImage;

    CastContentStateUiModel(int i) {
        this.iconImage = i;
    }

    public final int getIconImage() {
        return this.iconImage;
    }
}
