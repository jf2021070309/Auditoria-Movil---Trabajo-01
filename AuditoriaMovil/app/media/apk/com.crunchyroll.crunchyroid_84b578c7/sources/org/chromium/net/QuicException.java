package org.chromium.net;
/* loaded from: classes4.dex */
public abstract class QuicException extends NetworkException {
    public QuicException(String str, Throwable th) {
        super(str, th);
    }

    public abstract int getQuicDetailedErrorCode();
}
