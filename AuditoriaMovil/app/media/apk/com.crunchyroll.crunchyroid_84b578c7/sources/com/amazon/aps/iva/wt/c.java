package com.amazon.aps.iva.wt;

import com.google.android.gms.cast.MediaError;
/* compiled from: CommentActionDeleteResponse.kt */
/* loaded from: classes2.dex */
public enum c {
    COMMENT_DELETED(MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN),
    COMMENT_HARD_DELETED(204);
    
    private final int code;

    c(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }
}
