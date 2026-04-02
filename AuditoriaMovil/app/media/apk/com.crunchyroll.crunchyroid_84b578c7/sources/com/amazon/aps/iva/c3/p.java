package com.amazon.aps.iva.c3;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class p {
    public final Bundle a;
    public IconCompat b;
    public final d0[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final boolean g;
    @Deprecated
    public final int h;
    public final CharSequence i;
    public final PendingIntent j;
    public final boolean k;

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final IconCompat a;
        public final CharSequence b;
        public final PendingIntent c;
        public final boolean d;
        public final Bundle e;
        public final ArrayList<d0> f;
        public final int g;
        public final boolean h;
        public final boolean i;
        public final boolean j;

        public a(int i, String str, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.b(null, "", i) : null, str, pendingIntent, new Bundle());
        }

        public final p a() {
            d0[] d0VarArr;
            if (!this.i || this.c != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<d0> arrayList3 = this.f;
                if (arrayList3 != null) {
                    Iterator<d0> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        d0 next = it.next();
                        next.getClass();
                        arrayList2.add(next);
                    }
                }
                d0[] d0VarArr2 = null;
                if (arrayList.isEmpty()) {
                    d0VarArr = null;
                } else {
                    d0VarArr = (d0[]) arrayList.toArray(new d0[arrayList.size()]);
                }
                if (!arrayList2.isEmpty()) {
                    d0VarArr2 = (d0[]) arrayList2.toArray(new d0[arrayList2.size()]);
                }
                return new p(this.a, this.b, this.c, this.e, d0VarArr2, d0VarArr, this.d, this.g, this.h, this.i, this.j);
            }
            throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
            this.d = true;
            this.h = true;
            this.a = iconCompat;
            this.b = s.c(charSequence);
            this.c = pendingIntent;
            this.e = bundle;
            this.f = null;
            this.d = true;
            this.g = 0;
            this.h = true;
            this.i = false;
            this.j = false;
        }
    }

    public p(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, d0[] d0VarArr, d0[] d0VarArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null) {
            int i2 = iconCompat.a;
            if ((i2 == -1 ? IconCompat.a.c(iconCompat.b) : i2) == 2) {
                this.h = iconCompat.c();
            }
        }
        this.i = s.c(charSequence);
        this.j = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.c = d0VarArr;
        this.d = z;
        this.f = i;
        this.e = z2;
        this.g = z3;
        this.k = z4;
    }

    public final IconCompat a() {
        int i;
        if (this.b == null && (i = this.h) != 0) {
            this.b = IconCompat.b(null, "", i);
        }
        return this.b;
    }
}
