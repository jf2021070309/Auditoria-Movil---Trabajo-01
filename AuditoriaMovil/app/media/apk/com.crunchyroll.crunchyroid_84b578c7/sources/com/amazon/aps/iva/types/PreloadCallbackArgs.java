package com.amazon.aps.iva.types;

import lombok.NonNull;
/* loaded from: classes.dex */
public class PreloadCallbackArgs {
    @NonNull
    private String adId;
    @NonNull
    private String didPreload;

    public PreloadCallbackArgs(@NonNull String str, @NonNull String str2) {
        if (str != null) {
            if (str2 != null) {
                this.didPreload = str;
                this.adId = str2;
                return;
            }
            throw new NullPointerException("adId is marked non-null but is null");
        }
        throw new NullPointerException("didPreload is marked non-null but is null");
    }

    @NonNull
    public String getAdId() {
        return this.adId;
    }

    @NonNull
    public String getDidPreload() {
        return this.didPreload;
    }
}
