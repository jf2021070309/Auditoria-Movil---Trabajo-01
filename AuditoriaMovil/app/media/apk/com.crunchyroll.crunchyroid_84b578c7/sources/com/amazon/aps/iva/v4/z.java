package com.amazon.aps.iva.v4;

import java.io.IOException;
/* compiled from: InvalidProtocolBufferException.java */
/* loaded from: classes.dex */
public class z extends IOException {
    public static final /* synthetic */ int c = 0;
    public boolean b;

    /* compiled from: InvalidProtocolBufferException.java */
    /* loaded from: classes.dex */
    public static class a extends z {
        public a() {
            super("Protocol message tag had invalid wire type.");
        }
    }

    public z(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public static z a() {
        return new z("Protocol message had invalid UTF-8.");
    }

    public static a b() {
        return new a();
    }

    public static z c() {
        return new z("CodedInputStream encountered a malformed varint.");
    }

    public static z d() {
        return new z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static z e() {
        return new z("Failed to parse the message.");
    }

    public static z f() {
        return new z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
