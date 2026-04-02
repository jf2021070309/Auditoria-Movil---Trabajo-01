package com.amazon.aps.iva.e4;

import java.io.IOException;
/* compiled from: InvalidProtocolBufferException.java */
/* loaded from: classes.dex */
public class a0 extends IOException {
    public static final /* synthetic */ int b = 0;

    /* compiled from: InvalidProtocolBufferException.java */
    /* loaded from: classes.dex */
    public static class a extends a0 {
        public a() {
            super("Protocol message tag had invalid wire type.");
        }
    }

    public static a0 a() {
        return new a0("Protocol message had invalid UTF-8.");
    }

    public static a b() {
        return new a();
    }

    public static a0 c() {
        return new a0("CodedInputStream encountered a malformed varint.");
    }

    public static a0 d() {
        return new a0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static a0 e() {
        return new a0("Failed to parse the message.");
    }

    public static a0 f() {
        return new a0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
