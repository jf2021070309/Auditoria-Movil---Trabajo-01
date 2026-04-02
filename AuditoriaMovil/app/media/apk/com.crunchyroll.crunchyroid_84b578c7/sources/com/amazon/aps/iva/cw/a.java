package com.amazon.aps.iva.cw;

import com.amazon.aps.iva.yb0.j;
import java.io.IOException;
/* compiled from: MissingOfflineItemException.kt */
/* loaded from: classes2.dex */
public final class a extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str) {
        super("No items found for id ".concat(str));
        j.f(str, "id");
    }
}
