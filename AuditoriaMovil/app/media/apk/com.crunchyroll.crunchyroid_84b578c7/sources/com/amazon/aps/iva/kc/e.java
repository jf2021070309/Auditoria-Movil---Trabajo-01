package com.amazon.aps.iva.kc;

import java.io.IOException;
/* compiled from: HttpException.java */
/* loaded from: classes.dex */
public final class e extends IOException {
    public e(int i, String str, IOException iOException) {
        super(str + ", status code: " + i, iOException);
    }
}
