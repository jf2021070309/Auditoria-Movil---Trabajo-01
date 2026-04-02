package com.fyber.inneractive.sdk.player.c.j.a;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.TreeSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h {
    public final int a;
    public final String b;
    final TreeSet<l> c;
    long d;

    public h(DataInputStream dataInputStream) throws IOException {
        this(dataInputStream.readInt(), dataInputStream.readUTF(), dataInputStream.readLong());
    }

    public h(int i, String str, long j) {
        this.a = i;
        this.b = str;
        this.d = j;
        this.c = new TreeSet<>();
    }

    public final int a() {
        long j = this.d;
        return (((this.a * 31) + this.b.hashCode()) * 31) + ((int) (j ^ (j >>> 32)));
    }
}
