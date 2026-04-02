package com.amazon.aps.iva.z7;

import com.amazon.aps.iva.q5.h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: TsPayloadReader.java */
/* loaded from: classes.dex */
public interface e0 {

    /* compiled from: TsPayloadReader.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final String a;
        public final byte[] b;

        public a(String str, byte[] bArr) {
            this.a = str;
            this.b = bArr;
        }
    }

    /* compiled from: TsPayloadReader.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final String a;
        public final List<a> b;
        public final byte[] c;

        public b(int i, String str, ArrayList arrayList, byte[] bArr) {
            List<a> unmodifiableList;
            this.a = str;
            if (arrayList == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(arrayList);
            }
            this.b = unmodifiableList;
            this.c = bArr;
        }
    }

    /* compiled from: TsPayloadReader.java */
    /* loaded from: classes.dex */
    public interface c {
        e0 a(int i, b bVar);
    }

    /* compiled from: TsPayloadReader.java */
    /* loaded from: classes.dex */
    public static final class d {
        public final String a;
        public final int b;
        public final int c;
        public int d;
        public String e;

        public d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public final void a() {
            int i;
            int i2 = this.d;
            if (i2 == Integer.MIN_VALUE) {
                i = this.b;
            } else {
                i = i2 + this.c;
            }
            this.d = i;
            this.e = this.a + this.d;
        }

        public final void b() {
            if (this.d != Integer.MIN_VALUE) {
                return;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.a = str;
            this.b = i2;
            this.c = i3;
            this.d = Integer.MIN_VALUE;
            this.e = "";
        }
    }

    void a(int i, com.amazon.aps.iva.t5.v vVar) throws h0;

    void b();

    void c(com.amazon.aps.iva.t5.b0 b0Var, com.amazon.aps.iva.x6.p pVar, d dVar);
}
