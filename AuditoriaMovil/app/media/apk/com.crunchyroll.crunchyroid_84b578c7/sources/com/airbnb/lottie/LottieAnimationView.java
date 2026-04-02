package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.amazon.aps.iva.ma.d;
import com.amazon.aps.iva.ma.g;
import com.amazon.aps.iva.q.q;
import com.amazon.aps.iva.z9.d0;
import com.amazon.aps.iva.z9.e;
import com.amazon.aps.iva.z9.f;
import com.amazon.aps.iva.z9.f0;
import com.amazon.aps.iva.z9.g0;
import com.amazon.aps.iva.z9.h;
import com.amazon.aps.iva.z9.h0;
import com.amazon.aps.iva.z9.i;
import com.amazon.aps.iva.z9.j;
import com.amazon.aps.iva.z9.j0;
import com.amazon.aps.iva.z9.l0;
import com.amazon.aps.iva.z9.m0;
import com.amazon.aps.iva.z9.n;
import com.amazon.aps.iva.z9.n0;
import com.amazon.aps.iva.z9.o0;
import com.amazon.aps.iva.z9.p;
import com.amazon.aps.iva.z9.p0;
import com.crunchyroll.crunchyroid.R;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class LottieAnimationView extends q {
    public static final f p = new f();
    public final e b;
    public final a c;
    public f0<Throwable> d;
    public int e;
    public final d0 f;
    public String g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final HashSet l;
    public final HashSet m;
    public j0<h> n;
    public h o;

    /* loaded from: classes.dex */
    public class a implements f0<Throwable> {
        public a() {
        }

        @Override // com.amazon.aps.iva.z9.f0
        public final void a(Throwable th) {
            Throwable th2 = th;
            LottieAnimationView lottieAnimationView = LottieAnimationView.this;
            int i = lottieAnimationView.e;
            if (i != 0) {
                lottieAnimationView.setImageResource(i);
            }
            f0 f0Var = lottieAnimationView.d;
            if (f0Var == null) {
                f0Var = LottieAnimationView.p;
            }
            f0Var.a(th2);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public String b;
        public int c;
        public float d;
        public boolean e;
        public String f;
        public int g;
        public int h;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcel parcel) {
            super(parcel);
            this.b = parcel.readString();
            this.d = parcel.readFloat();
            this.e = parcel.readInt() == 1;
            this.f = parcel.readString();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.b);
            parcel.writeFloat(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeString(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [com.amazon.aps.iva.z9.e] */
    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String string;
        this.b = new f0() { // from class: com.amazon.aps.iva.z9.e
            @Override // com.amazon.aps.iva.z9.f0
            public final void a(Object obj) {
                LottieAnimationView.this.setComposition((h) obj);
            }
        };
        this.c = new a();
        this.e = 0;
        d0 d0Var = new d0();
        this.f = d0Var;
        this.i = false;
        this.j = false;
        this.k = true;
        HashSet hashSet = new HashSet();
        this.l = hashSet;
        this.m = new HashSet();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, m0.a, R.attr.lottieAnimationViewStyle, 0);
        this.k = obtainStyledAttributes.getBoolean(1, true);
        boolean hasValue = obtainStyledAttributes.hasValue(12);
        boolean hasValue2 = obtainStyledAttributes.hasValue(7);
        boolean hasValue3 = obtainStyledAttributes.hasValue(17);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(12, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(7);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(17)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(6, 0));
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.j = true;
        }
        if (obtainStyledAttributes.getBoolean(10, false)) {
            d0Var.c.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setRepeatMode(obtainStyledAttributes.getInt(15, 1));
        }
        if (obtainStyledAttributes.hasValue(14)) {
            setRepeatCount(obtainStyledAttributes.getInt(14, -1));
        }
        if (obtainStyledAttributes.hasValue(16)) {
            setSpeed(obtainStyledAttributes.getFloat(16, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(2)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(2, true));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(4));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(9));
        boolean hasValue4 = obtainStyledAttributes.hasValue(11);
        float f = obtainStyledAttributes.getFloat(11, 0.0f);
        if (hasValue4) {
            hashSet.add(c.SET_PROGRESS);
        }
        d0Var.x(f);
        boolean z = obtainStyledAttributes.getBoolean(5, false);
        if (d0Var.n != z) {
            d0Var.n = z;
            if (d0Var.b != null) {
                d0Var.c();
            }
        }
        if (obtainStyledAttributes.hasValue(3)) {
            d0Var.a(new com.amazon.aps.iva.fa.e("**"), h0.K, new com.amazon.aps.iva.na.c(new o0(com.amazon.aps.iva.d3.a.getColorStateList(getContext(), obtainStyledAttributes.getResourceId(3, -1)).getDefaultColor())));
        }
        if (obtainStyledAttributes.hasValue(13)) {
            n0 n0Var = n0.AUTOMATIC;
            int i = obtainStyledAttributes.getInt(13, n0Var.ordinal());
            setRenderMode(n0.values()[i >= n0.values().length ? n0Var.ordinal() : i]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(8, false));
        if (obtainStyledAttributes.hasValue(18)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(18, false));
        }
        obtainStyledAttributes.recycle();
        Context context2 = getContext();
        g.a aVar = g.a;
        d0Var.d = Boolean.valueOf(Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f).booleanValue();
    }

    private void setCompositionTask(j0<h> j0Var) {
        this.l.add(c.SET_ANIMATION);
        this.o = null;
        this.f.d();
        a();
        j0Var.b(this.b);
        j0Var.a(this.c);
        this.n = j0Var;
    }

    public final void a() {
        j0<h> j0Var = this.n;
        if (j0Var != null) {
            e eVar = this.b;
            synchronized (j0Var) {
                j0Var.a.remove(eVar);
            }
            j0<h> j0Var2 = this.n;
            a aVar = this.c;
            synchronized (j0Var2) {
                j0Var2.b.remove(aVar);
            }
        }
    }

    public boolean getClipToCompositionBounds() {
        return this.f.p;
    }

    public h getComposition() {
        return this.o;
    }

    public long getDuration() {
        h hVar = this.o;
        if (hVar != null) {
            return hVar.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f.c.i;
    }

    public String getImageAssetsFolder() {
        return this.f.j;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f.o;
    }

    public float getMaxFrame() {
        return this.f.c.c();
    }

    public float getMinFrame() {
        return this.f.c.d();
    }

    public l0 getPerformanceTracker() {
        h hVar = this.f.b;
        if (hVar != null) {
            return hVar.a;
        }
        return null;
    }

    public float getProgress() {
        d dVar = this.f.c;
        h hVar = dVar.m;
        if (hVar == null) {
            return 0.0f;
        }
        float f = dVar.i;
        float f2 = hVar.k;
        return (f - f2) / (hVar.l - f2);
    }

    public n0 getRenderMode() {
        if (this.f.w) {
            return n0.SOFTWARE;
        }
        return n0.HARDWARE;
    }

    public int getRepeatCount() {
        return this.f.c.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f.c.getRepeatMode();
    }

    public float getSpeed() {
        return this.f.c.e;
    }

    @Override // android.view.View
    public final void invalidate() {
        n0 n0Var;
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof d0) {
            if (((d0) drawable).w) {
                n0Var = n0.SOFTWARE;
            } else {
                n0Var = n0.HARDWARE;
            }
            if (n0Var == n0.SOFTWARE) {
                this.f.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        d0 d0Var = this.f;
        if (drawable2 == d0Var) {
            super.invalidateDrawable(d0Var);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.j) {
            this.f.j();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        this.g = bVar.b;
        HashSet hashSet = this.l;
        c cVar = c.SET_ANIMATION;
        if (!hashSet.contains(cVar) && !TextUtils.isEmpty(this.g)) {
            setAnimation(this.g);
        }
        this.h = bVar.c;
        if (!hashSet.contains(cVar) && (i = this.h) != 0) {
            setAnimation(i);
        }
        boolean contains = hashSet.contains(c.SET_PROGRESS);
        d0 d0Var = this.f;
        if (!contains) {
            d0Var.x(bVar.d);
        }
        c cVar2 = c.PLAY_OPTION;
        if (!hashSet.contains(cVar2) && bVar.e) {
            hashSet.add(cVar2);
            d0Var.j();
        }
        if (!hashSet.contains(c.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(bVar.f);
        }
        if (!hashSet.contains(c.SET_REPEAT_MODE)) {
            setRepeatMode(bVar.g);
        }
        if (!hashSet.contains(c.SET_REPEAT_COUNT)) {
            setRepeatCount(bVar.h);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        float f;
        boolean z;
        b bVar = new b(super.onSaveInstanceState());
        bVar.b = this.g;
        bVar.c = this.h;
        d0 d0Var = this.f;
        d dVar = d0Var.c;
        h hVar = dVar.m;
        if (hVar == null) {
            f = 0.0f;
        } else {
            float f2 = dVar.i;
            float f3 = hVar.k;
            f = (f2 - f3) / (hVar.l - f3);
        }
        bVar.d = f;
        boolean isVisible = d0Var.isVisible();
        d dVar2 = d0Var.c;
        if (isVisible) {
            z = dVar2.n;
        } else {
            d0.c cVar = d0Var.g;
            if (cVar != d0.c.PLAY && cVar != d0.c.RESUME) {
                z = false;
            } else {
                z = true;
            }
        }
        bVar.e = z;
        bVar.f = d0Var.j;
        bVar.g = dVar2.getRepeatMode();
        bVar.h = dVar2.getRepeatCount();
        return bVar;
    }

    public void setAnimation(final int i) {
        j0<h> e;
        j0<h> j0Var;
        this.h = i;
        this.g = null;
        if (isInEditMode()) {
            j0Var = new j0<>(new Callable() { // from class: com.amazon.aps.iva.z9.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    boolean z = lottieAnimationView.k;
                    int i2 = i;
                    if (z) {
                        Context context = lottieAnimationView.getContext();
                        return p.f(context, i2, p.j(i2, context));
                    }
                    return p.f(lottieAnimationView.getContext(), i2, null);
                }
            }, true);
        } else {
            if (this.k) {
                Context context = getContext();
                e = p.e(context, i, p.j(i, context));
            } else {
                e = p.e(getContext(), i, null);
            }
            j0Var = e;
        }
        setCompositionTask(j0Var);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setCompositionTask(p.a(null, new j(new ByteArrayInputStream(str.getBytes()), null)));
    }

    public void setAnimationFromUrl(String str) {
        j0<h> a2;
        if (this.k) {
            Context context = getContext();
            HashMap hashMap = p.a;
            String a3 = com.amazon.aps.iva.oa.a.a("url_", str);
            a2 = p.a(a3, new i(context, str, a3));
        } else {
            a2 = p.a(null, new i(getContext(), str, null));
        }
        setCompositionTask(a2);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f.u = z;
    }

    public void setCacheComposition(boolean z) {
        this.k = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        d0 d0Var = this.f;
        if (z != d0Var.p) {
            d0Var.p = z;
            com.amazon.aps.iva.ia.c cVar = d0Var.q;
            if (cVar != null) {
                cVar.H = z;
            }
            d0Var.invalidateSelf();
        }
    }

    public void setComposition(h hVar) {
        d0 d0Var = this.f;
        d0Var.setCallback(this);
        this.o = hVar;
        this.i = true;
        boolean m = d0Var.m(hVar);
        boolean z = false;
        this.i = false;
        if (getDrawable() == d0Var && !m) {
            return;
        }
        if (!m) {
            d dVar = d0Var.c;
            if (dVar != null) {
                z = dVar.n;
            }
            setImageDrawable(null);
            setImageDrawable(d0Var);
            if (z) {
                d0Var.l();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).a();
        }
    }

    public void setDefaultFontFileExtension(String str) {
        d0 d0Var = this.f;
        d0Var.m = str;
        com.amazon.aps.iva.ea.a h = d0Var.h();
        if (h != null) {
            h.e = str;
        }
    }

    public void setFailureListener(f0<Throwable> f0Var) {
        this.d = f0Var;
    }

    public void setFallbackResource(int i) {
        this.e = i;
    }

    public void setFontAssetDelegate(com.amazon.aps.iva.z9.a aVar) {
        com.amazon.aps.iva.ea.a aVar2 = this.f.k;
    }

    public void setFontMap(Map<String, Typeface> map) {
        d0 d0Var = this.f;
        if (map != d0Var.l) {
            d0Var.l = map;
            d0Var.invalidateSelf();
        }
    }

    public void setFrame(int i) {
        this.f.n(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f.e = z;
    }

    public void setImageAssetDelegate(com.amazon.aps.iva.z9.b bVar) {
        com.amazon.aps.iva.ea.b bVar2 = this.f.i;
    }

    public void setImageAssetsFolder(String str) {
        this.f.j = str;
    }

    @Override // com.amazon.aps.iva.q.q, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        a();
        super.setImageBitmap(bitmap);
    }

    @Override // com.amazon.aps.iva.q.q, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        a();
        super.setImageDrawable(drawable);
    }

    @Override // com.amazon.aps.iva.q.q, android.widget.ImageView
    public void setImageResource(int i) {
        a();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.f.o = z;
    }

    public void setMaxFrame(int i) {
        this.f.o(i);
    }

    public void setMaxProgress(float f) {
        this.f.q(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f.s(str);
    }

    public void setMinFrame(int i) {
        this.f.u(i);
    }

    public void setMinProgress(float f) {
        this.f.w(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        d0 d0Var = this.f;
        if (d0Var.t != z) {
            d0Var.t = z;
            com.amazon.aps.iva.ia.c cVar = d0Var.q;
            if (cVar != null) {
                cVar.s(z);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        d0 d0Var = this.f;
        d0Var.s = z;
        h hVar = d0Var.b;
        if (hVar != null) {
            hVar.a.a = z;
        }
    }

    public void setProgress(float f) {
        this.l.add(c.SET_PROGRESS);
        this.f.x(f);
    }

    public void setRenderMode(n0 n0Var) {
        d0 d0Var = this.f;
        d0Var.v = n0Var;
        d0Var.e();
    }

    public void setRepeatCount(int i) {
        this.l.add(c.SET_REPEAT_COUNT);
        this.f.c.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.l.add(c.SET_REPEAT_MODE);
        this.f.c.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.f.f = z;
    }

    public void setSpeed(float f) {
        this.f.c.e = f;
    }

    public void setTextDelegate(p0 p0Var) {
        this.f.getClass();
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.f.c.o = z;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        d0 d0Var;
        boolean z;
        boolean z2 = this.i;
        boolean z3 = false;
        if (!z2 && drawable == (d0Var = this.f)) {
            d dVar = d0Var.c;
            if (dVar == null) {
                z = false;
            } else {
                z = dVar.n;
            }
            if (z) {
                this.j = false;
                d0Var.i();
                super.unscheduleDrawable(drawable);
            }
        }
        if (!z2 && (drawable instanceof d0)) {
            d0 d0Var2 = (d0) drawable;
            d dVar2 = d0Var2.c;
            if (dVar2 != null) {
                z3 = dVar2.n;
            }
            if (z3) {
                d0Var2.i();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f.p(str);
    }

    public void setMinFrame(String str) {
        this.f.v(str);
    }

    public void setAnimation(final String str) {
        j0<h> a2;
        j0<h> j0Var;
        this.g = str;
        this.h = 0;
        if (isInEditMode()) {
            j0Var = new j0<>(new Callable() { // from class: com.amazon.aps.iva.z9.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    boolean z = lottieAnimationView.k;
                    String str2 = str;
                    if (z) {
                        Context context = lottieAnimationView.getContext();
                        HashMap hashMap = p.a;
                        return p.b(context, str2, "asset_" + str2);
                    }
                    return p.b(lottieAnimationView.getContext(), str2, null);
                }
            }, true);
        } else {
            if (this.k) {
                Context context = getContext();
                HashMap hashMap = p.a;
                String a3 = com.amazon.aps.iva.oa.a.a("asset_", str);
                a2 = p.a(a3, new n(context.getApplicationContext(), str, a3));
            } else {
                Context context2 = getContext();
                HashMap hashMap2 = p.a;
                a2 = p.a(null, new n(context2.getApplicationContext(), str, null));
            }
            j0Var = a2;
        }
        setCompositionTask(j0Var);
    }
}
