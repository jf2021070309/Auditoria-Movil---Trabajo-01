package c.i.c;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
/* loaded from: classes.dex */
public class j {
    public final Bundle a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f1959b;

    /* renamed from: c  reason: collision with root package name */
    public final s[] f1960c;

    /* renamed from: d  reason: collision with root package name */
    public final s[] f1961d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1962e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1963f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1964g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1965h;
    @Deprecated

    /* renamed from: i  reason: collision with root package name */
    public int f1966i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1967j;

    /* renamed from: k  reason: collision with root package name */
    public PendingIntent f1968k;

    public j(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat b2 = i2 == 0 ? null : IconCompat.b(null, "", i2);
        Bundle bundle = new Bundle();
        this.f1963f = true;
        this.f1959b = b2;
        if (b2 != null && b2.f() == 2) {
            this.f1966i = b2.c();
        }
        this.f1967j = m.e(charSequence);
        this.f1968k = pendingIntent;
        this.a = bundle;
        this.f1960c = null;
        this.f1961d = null;
        this.f1962e = true;
        this.f1964g = 0;
        this.f1963f = true;
        this.f1965h = false;
    }

    public IconCompat a() {
        int i2;
        if (this.f1959b == null && (i2 = this.f1966i) != 0) {
            this.f1959b = IconCompat.b(null, "", i2);
        }
        return this.f1959b;
    }
}
