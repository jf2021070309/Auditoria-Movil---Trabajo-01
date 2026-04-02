package com.google.android.gms.internal.firebase_messaging;

import java.io.OutputStream;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzj extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        Objects.requireNonNull(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        Objects.requireNonNull(bArr);
    }
}
