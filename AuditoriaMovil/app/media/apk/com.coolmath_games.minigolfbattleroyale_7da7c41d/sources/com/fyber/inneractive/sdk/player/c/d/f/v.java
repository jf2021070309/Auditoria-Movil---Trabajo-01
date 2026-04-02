package com.fyber.inneractive.sdk.player.c.d.f;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public interface v {

    /* loaded from: classes.dex */
    public interface c {
        SparseArray<v> a();

        v a(int i, b bVar);
    }

    void a();

    void a(com.fyber.inneractive.sdk.player.c.k.k kVar, boolean z);

    void a(com.fyber.inneractive.sdk.player.c.k.r rVar, com.fyber.inneractive.sdk.player.c.d.h hVar, d dVar);

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final String b;
        public final List<a> c;
        public final byte[] d;

        public b(int i, String str, List<a> list, byte[] bArr) {
            List<a> unmodifiableList;
            this.a = i;
            this.b = str;
            if (list == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            this.c = unmodifiableList;
            this.d = bArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
        public final String a;
        public final int b;
        public final byte[] c;

        public a(String str, int i, byte[] bArr) {
            this.a = str;
            this.b = i;
            this.c = bArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        private final String a;
        private final int b;
        private final int c;
        private int d;
        private String e;

        public d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
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
        }

        public final void a() {
            int i = this.d;
            this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
            this.e = this.a + this.d;
        }

        public final int b() {
            d();
            return this.d;
        }

        public final String c() {
            d();
            return this.e;
        }

        private void d() {
            if (this.d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }
}
