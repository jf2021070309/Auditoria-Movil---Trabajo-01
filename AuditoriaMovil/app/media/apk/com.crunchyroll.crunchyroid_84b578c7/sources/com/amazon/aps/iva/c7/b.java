package com.amazon.aps.iva.c7;

import com.google.common.collect.ImmutableList;
import java.util.List;
/* compiled from: MotionPhotoDescription.java */
/* loaded from: classes.dex */
public final class b {
    public final long a;
    public final List<a> b;

    /* compiled from: MotionPhotoDescription.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final String a;
        public final long b;
        public final long c;

        public a(long j, long j2, String str) {
            this.a = str;
            this.b = j;
            this.c = j2;
        }
    }

    public b(ImmutableList immutableList, long j) {
        this.a = j;
        this.b = immutableList;
    }
}
