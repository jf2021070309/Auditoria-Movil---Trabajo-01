package com.amazon.aps.iva.r6;

import android.os.Bundle;
import android.os.Parcel;
import com.amazon.aps.iva.q7.e;
import com.amazon.aps.iva.q7.g;
import com.amazon.aps.iva.q7.h;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ExoplayerCuesDecoder.java */
/* loaded from: classes.dex */
public final class a implements e {
    public final com.amazon.aps.iva.q7.a a = new com.amazon.aps.iva.q7.a();
    public final g b = new g();
    public final ArrayDeque c = new ArrayDeque();
    public int d;
    public boolean e;

    /* compiled from: ExoplayerCuesDecoder.java */
    /* renamed from: com.amazon.aps.iva.r6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0667a extends h {
        public C0667a() {
        }

        @Override // com.amazon.aps.iva.z5.g
        public final void k() {
            boolean z;
            ArrayDeque arrayDeque = a.this.c;
            if (arrayDeque.size() < 2) {
                z = true;
            } else {
                z = false;
            }
            com.amazon.aps.iva.cq.b.C(z);
            com.amazon.aps.iva.cq.b.t(!arrayDeque.contains(this));
            this.b = 0;
            this.d = null;
            arrayDeque.addFirst(this);
        }
    }

    /* compiled from: ExoplayerCuesDecoder.java */
    /* loaded from: classes.dex */
    public static final class b implements com.amazon.aps.iva.q7.d {
        public final long b;
        public final ImmutableList<com.amazon.aps.iva.s5.a> c;

        public b(long j, ImmutableList<com.amazon.aps.iva.s5.a> immutableList) {
            this.b = j;
            this.c = immutableList;
        }

        @Override // com.amazon.aps.iva.q7.d
        public final int a(long j) {
            if (this.b > j) {
                return 0;
            }
            return -1;
        }

        @Override // com.amazon.aps.iva.q7.d
        public final List<com.amazon.aps.iva.s5.a> b(long j) {
            if (j >= this.b) {
                return this.c;
            }
            return ImmutableList.of();
        }

        @Override // com.amazon.aps.iva.q7.d
        public final long c(int i) {
            boolean z;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            com.amazon.aps.iva.cq.b.t(z);
            return this.b;
        }

        @Override // com.amazon.aps.iva.q7.d
        public final int f() {
            return 1;
        }
    }

    public a() {
        for (int i = 0; i < 2; i++) {
            this.c.addFirst(new C0667a());
        }
        this.d = 0;
    }

    @Override // com.amazon.aps.iva.z5.d
    public final void a(g gVar) throws com.amazon.aps.iva.z5.e {
        boolean z;
        boolean z2 = true;
        com.amazon.aps.iva.cq.b.C(!this.e);
        if (this.d == 1) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        if (this.b != gVar) {
            z2 = false;
        }
        com.amazon.aps.iva.cq.b.t(z2);
        this.d = 2;
    }

    @Override // com.amazon.aps.iva.z5.d
    public final h c() throws com.amazon.aps.iva.z5.e {
        com.amazon.aps.iva.cq.b.C(!this.e);
        if (this.d == 2) {
            ArrayDeque arrayDeque = this.c;
            if (!arrayDeque.isEmpty()) {
                h hVar = (h) arrayDeque.removeFirst();
                g gVar = this.b;
                if (gVar.i(4)) {
                    hVar.h(4);
                } else {
                    long j = gVar.f;
                    ByteBuffer byteBuffer = gVar.d;
                    byteBuffer.getClass();
                    byte[] array = byteBuffer.array();
                    this.a.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(array, 0, array.length);
                    obtain.setDataPosition(0);
                    Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                    obtain.recycle();
                    ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                    parcelableArrayList.getClass();
                    hVar.l(gVar.f, new b(j, com.amazon.aps.iva.t5.c.a(com.amazon.aps.iva.s5.a.K, parcelableArrayList)), 0L);
                }
                gVar.k();
                this.d = 0;
                return hVar;
            }
        }
        return null;
    }

    @Override // com.amazon.aps.iva.z5.d
    public final g d() throws com.amazon.aps.iva.z5.e {
        com.amazon.aps.iva.cq.b.C(!this.e);
        if (this.d != 0) {
            return null;
        }
        this.d = 1;
        return this.b;
    }

    @Override // com.amazon.aps.iva.z5.d
    public final void flush() {
        com.amazon.aps.iva.cq.b.C(!this.e);
        this.b.k();
        this.d = 0;
    }

    @Override // com.amazon.aps.iva.z5.d
    public final void release() {
        this.e = true;
    }

    @Override // com.amazon.aps.iva.q7.e
    public final void b(long j) {
    }
}
