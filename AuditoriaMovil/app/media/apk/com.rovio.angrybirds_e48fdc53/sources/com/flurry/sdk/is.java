package com.flurry.sdk;
/* loaded from: classes2.dex */
public enum is {
    COMPLETE(1),
    TIMEOUT(2),
    INVALID_RESPONSE(3),
    PENDING_COMPLETION(4);
    
    int e;

    is(int i) {
        this.e = i;
    }

    public static is a(int i) {
        switch (i) {
            case 1:
                return COMPLETE;
            case 2:
                return TIMEOUT;
            case 3:
                return INVALID_RESPONSE;
            case 4:
                return PENDING_COMPLETION;
            default:
                return null;
        }
    }
}
