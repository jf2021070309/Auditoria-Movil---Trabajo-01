package c.b.d.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import c.b.i.q0;
import java.util.WeakHashMap;
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public final class a {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<Context, SparseArray<C0015a>> f873b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f874c = new Object();

    /* renamed from: c.b.d.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0015a {
        public final ColorStateList a;

        /* renamed from: b  reason: collision with root package name */
        public final Configuration f875b;

        public C0015a(ColorStateList colorStateList, Configuration configuration) {
            this.a = colorStateList;
            this.f875b = configuration;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList a(android.content.Context r13, int r14) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.d.a.a.a(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static Drawable b(Context context, int i2) {
        return q0.d().f(context, i2);
    }
}
