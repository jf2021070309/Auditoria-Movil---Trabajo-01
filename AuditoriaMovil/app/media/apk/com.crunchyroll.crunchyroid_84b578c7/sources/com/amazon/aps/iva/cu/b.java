package com.amazon.aps.iva.cu;

import java.io.IOException;
/* compiled from: PageLoadingException.kt */
/* loaded from: classes2.dex */
public final class b extends IOException {
    public b(IOException iOException) {
        super("Page loading failed", iOException);
    }

    public b() {
        super("There are no items to show");
    }
}
