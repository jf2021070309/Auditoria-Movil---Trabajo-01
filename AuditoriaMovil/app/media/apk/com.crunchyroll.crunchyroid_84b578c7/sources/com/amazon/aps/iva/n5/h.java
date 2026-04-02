package com.amazon.aps.iva.n5;

import android.media.VolumeProvider;
import android.os.Build;
/* compiled from: VolumeProviderCompat.java */
/* loaded from: classes.dex */
public abstract class h {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public VolumeProvider e;

    /* compiled from: VolumeProviderCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(VolumeProvider volumeProvider, int i) {
            volumeProvider.setCurrentVolume(i);
        }
    }

    public h(int i, int i2, String str, int i3) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = str;
    }

    public final VolumeProvider a() {
        if (this.e == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.e = new f(this, this.a, this.b, this.d, this.c);
            } else {
                this.e = new g(this, this.a, this.b, this.d);
            }
        }
        return this.e;
    }

    public abstract void b(int i);

    public abstract void c(int i);

    public final void d(int i) {
        this.d = i;
        a.a(a(), i);
    }
}
