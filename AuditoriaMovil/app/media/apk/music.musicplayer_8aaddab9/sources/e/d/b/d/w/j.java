package e.d.b.d.w;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import java.util.Objects;
/* loaded from: classes2.dex */
public class j {
    public d a;

    /* renamed from: b  reason: collision with root package name */
    public d f6616b;

    /* renamed from: c  reason: collision with root package name */
    public d f6617c;

    /* renamed from: d  reason: collision with root package name */
    public d f6618d;

    /* renamed from: e  reason: collision with root package name */
    public c f6619e;

    /* renamed from: f  reason: collision with root package name */
    public c f6620f;

    /* renamed from: g  reason: collision with root package name */
    public c f6621g;

    /* renamed from: h  reason: collision with root package name */
    public c f6622h;

    /* renamed from: i  reason: collision with root package name */
    public f f6623i;

    /* renamed from: j  reason: collision with root package name */
    public f f6624j;

    /* renamed from: k  reason: collision with root package name */
    public f f6625k;

    /* renamed from: l  reason: collision with root package name */
    public f f6626l;

    /* loaded from: classes2.dex */
    public static final class b {
        public d a;

        /* renamed from: b  reason: collision with root package name */
        public d f6627b;

        /* renamed from: c  reason: collision with root package name */
        public d f6628c;

        /* renamed from: d  reason: collision with root package name */
        public d f6629d;

        /* renamed from: e  reason: collision with root package name */
        public c f6630e;

        /* renamed from: f  reason: collision with root package name */
        public c f6631f;

        /* renamed from: g  reason: collision with root package name */
        public c f6632g;

        /* renamed from: h  reason: collision with root package name */
        public c f6633h;

        /* renamed from: i  reason: collision with root package name */
        public f f6634i;

        /* renamed from: j  reason: collision with root package name */
        public f f6635j;

        /* renamed from: k  reason: collision with root package name */
        public f f6636k;

        /* renamed from: l  reason: collision with root package name */
        public f f6637l;

        public b() {
            this.a = new i();
            this.f6627b = new i();
            this.f6628c = new i();
            this.f6629d = new i();
            this.f6630e = new e.d.b.d.w.a(0.0f);
            this.f6631f = new e.d.b.d.w.a(0.0f);
            this.f6632g = new e.d.b.d.w.a(0.0f);
            this.f6633h = new e.d.b.d.w.a(0.0f);
            this.f6634i = new f();
            this.f6635j = new f();
            this.f6636k = new f();
            this.f6637l = new f();
        }

        public b(j jVar) {
            this.a = new i();
            this.f6627b = new i();
            this.f6628c = new i();
            this.f6629d = new i();
            this.f6630e = new e.d.b.d.w.a(0.0f);
            this.f6631f = new e.d.b.d.w.a(0.0f);
            this.f6632g = new e.d.b.d.w.a(0.0f);
            this.f6633h = new e.d.b.d.w.a(0.0f);
            this.f6634i = new f();
            this.f6635j = new f();
            this.f6636k = new f();
            this.f6637l = new f();
            this.a = jVar.a;
            this.f6627b = jVar.f6616b;
            this.f6628c = jVar.f6617c;
            this.f6629d = jVar.f6618d;
            this.f6630e = jVar.f6619e;
            this.f6631f = jVar.f6620f;
            this.f6632g = jVar.f6621g;
            this.f6633h = jVar.f6622h;
            this.f6634i = jVar.f6623i;
            this.f6635j = jVar.f6624j;
            this.f6636k = jVar.f6625k;
            this.f6637l = jVar.f6626l;
        }

        public static float b(d dVar) {
            if (dVar instanceof i) {
                Objects.requireNonNull((i) dVar);
                return -1.0f;
            }
            if (dVar instanceof e) {
                Objects.requireNonNull((e) dVar);
            }
            return -1.0f;
        }

        public j a() {
            return new j(this, null);
        }

        public b c(float f2) {
            this.f6630e = new e.d.b.d.w.a(f2);
            this.f6631f = new e.d.b.d.w.a(f2);
            this.f6632g = new e.d.b.d.w.a(f2);
            this.f6633h = new e.d.b.d.w.a(f2);
            return this;
        }

        public b d(float f2) {
            this.f6633h = new e.d.b.d.w.a(f2);
            return this;
        }

        public b e(float f2) {
            this.f6632g = new e.d.b.d.w.a(f2);
            return this;
        }

        public b f(float f2) {
            this.f6630e = new e.d.b.d.w.a(f2);
            return this;
        }

        public b g(float f2) {
            this.f6631f = new e.d.b.d.w.a(f2);
            return this;
        }
    }

    public j() {
        this.a = new i();
        this.f6616b = new i();
        this.f6617c = new i();
        this.f6618d = new i();
        this.f6619e = new e.d.b.d.w.a(0.0f);
        this.f6620f = new e.d.b.d.w.a(0.0f);
        this.f6621g = new e.d.b.d.w.a(0.0f);
        this.f6622h = new e.d.b.d.w.a(0.0f);
        this.f6623i = new f();
        this.f6624j = new f();
        this.f6625k = new f();
        this.f6626l = new f();
    }

    public j(b bVar, a aVar) {
        this.a = bVar.a;
        this.f6616b = bVar.f6627b;
        this.f6617c = bVar.f6628c;
        this.f6618d = bVar.f6629d;
        this.f6619e = bVar.f6630e;
        this.f6620f = bVar.f6631f;
        this.f6621g = bVar.f6632g;
        this.f6622h = bVar.f6633h;
        this.f6623i = bVar.f6634i;
        this.f6624j = bVar.f6635j;
        this.f6625k = bVar.f6636k;
        this.f6626l = bVar.f6637l;
    }

    public static b a(Context context, int i2, int i3, c cVar) {
        if (i3 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
            i2 = i3;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, e.d.b.d.b.x);
        try {
            int i4 = obtainStyledAttributes.getInt(0, 0);
            int i5 = obtainStyledAttributes.getInt(3, i4);
            int i6 = obtainStyledAttributes.getInt(4, i4);
            int i7 = obtainStyledAttributes.getInt(2, i4);
            int i8 = obtainStyledAttributes.getInt(1, i4);
            c c2 = c(obtainStyledAttributes, 5, cVar);
            c c3 = c(obtainStyledAttributes, 8, c2);
            c c4 = c(obtainStyledAttributes, 9, c2);
            c c5 = c(obtainStyledAttributes, 7, c2);
            c c6 = c(obtainStyledAttributes, 6, c2);
            b bVar = new b();
            d v = e.d.b.d.a.v(i5);
            bVar.a = v;
            b.b(v);
            bVar.f6630e = c3;
            d v2 = e.d.b.d.a.v(i6);
            bVar.f6627b = v2;
            b.b(v2);
            bVar.f6631f = c4;
            d v3 = e.d.b.d.a.v(i7);
            bVar.f6628c = v3;
            b.b(v3);
            bVar.f6632g = c5;
            d v4 = e.d.b.d.a.v(i8);
            bVar.f6629d = v4;
            b.b(v4);
            bVar.f6633h = c6;
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b b(Context context, AttributeSet attributeSet, int i2, int i3) {
        e.d.b.d.w.a aVar = new e.d.b.d.w.a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.d.b.d.b.r, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i2, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue == null) {
            return cVar;
        }
        int i3 = peekValue.type;
        return i3 == 5 ? new e.d.b.d.w.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i3 == 6 ? new h(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public boolean d(RectF rectF) {
        boolean z = this.f6626l.getClass().equals(f.class) && this.f6624j.getClass().equals(f.class) && this.f6623i.getClass().equals(f.class) && this.f6625k.getClass().equals(f.class);
        float a2 = this.f6619e.a(rectF);
        return z && ((this.f6620f.a(rectF) > a2 ? 1 : (this.f6620f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f6622h.a(rectF) > a2 ? 1 : (this.f6622h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f6621g.a(rectF) > a2 ? 1 : (this.f6621g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f6616b instanceof i) && (this.a instanceof i) && (this.f6617c instanceof i) && (this.f6618d instanceof i));
    }

    public j e(float f2) {
        b bVar = new b(this);
        bVar.c(f2);
        return bVar.a();
    }
}
