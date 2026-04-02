package com.amazon.aps.iva.m7;

import java.util.ArrayDeque;
/* compiled from: DefaultEbmlReader.java */
/* loaded from: classes.dex */
public final class a implements c {
    public final byte[] a = new byte[8];
    public final ArrayDeque<C0504a> b = new ArrayDeque<>();
    public final f c = new f();
    public b d;
    public int e;
    public int f;
    public long g;

    /* compiled from: DefaultEbmlReader.java */
    /* renamed from: com.amazon.aps.iva.m7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0504a {
        public final int a;
        public final long b;

        public C0504a(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }
}
