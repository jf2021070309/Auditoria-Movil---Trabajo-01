package com.amazon.aps.iva.od0;

import java.io.IOException;
/* compiled from: InvalidProtocolBufferException.java */
/* loaded from: classes4.dex */
public final class j extends IOException {
    public p b;

    public j(String str) {
        super(str);
        this.b = null;
    }

    public static j b() {
        return new j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void a(p pVar) {
        this.b = pVar;
    }
}
