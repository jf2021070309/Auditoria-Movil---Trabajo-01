package c.t;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.RecyclerView;
import c.i.k.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class g extends RecyclerView.e<l> implements Preference.b {

    /* renamed from: d  reason: collision with root package name */
    public final PreferenceGroup f2538d;

    /* renamed from: e  reason: collision with root package name */
    public List<Preference> f2539e;

    /* renamed from: f  reason: collision with root package name */
    public List<Preference> f2540f;

    /* renamed from: g  reason: collision with root package name */
    public final List<b> f2541g;

    /* renamed from: i  reason: collision with root package name */
    public final Runnable f2543i = new a();

    /* renamed from: h  reason: collision with root package name */
    public final Handler f2542h = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.n();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f2544b;

        /* renamed from: c  reason: collision with root package name */
        public String f2545c;

        public b(Preference preference) {
            this.f2545c = preference.getClass().getName();
            this.a = preference.F;
            this.f2544b = preference.G;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.a == bVar.a && this.f2544b == bVar.f2544b && TextUtils.equals(this.f2545c, bVar.f2545c);
            }
            return false;
        }

        public int hashCode() {
            return this.f2545c.hashCode() + ((((527 + this.a) * 31) + this.f2544b) * 31);
        }
    }

    public g(PreferenceGroup preferenceGroup) {
        this.f2538d = preferenceGroup;
        preferenceGroup.H = this;
        this.f2539e = new ArrayList();
        this.f2540f = new ArrayList();
        this.f2541g = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            i(((PreferenceScreen) preferenceGroup).a0);
        } else {
            i(true);
        }
        n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int b() {
        return this.f2540f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long c(int i2) {
        if (this.f540b) {
            return l(i2).d();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int d(int i2) {
        b bVar = new b(l(i2));
        int indexOf = this.f2541g.indexOf(bVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.f2541g.size();
        this.f2541g.add(bVar);
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void f(l lVar, int i2) {
        l lVar2 = lVar;
        Preference l2 = l(i2);
        Drawable background = lVar2.f527b.getBackground();
        Drawable drawable = lVar2.u;
        if (background != drawable) {
            View view = lVar2.f527b;
            AtomicInteger atomicInteger = d0.a;
            d0.c.q(view, drawable);
        }
        TextView textView = (TextView) lVar2.y(16908310);
        if (textView != null && lVar2.v != null && !textView.getTextColors().equals(lVar2.v)) {
            textView.setTextColor(lVar2.v);
        }
        l2.r(lVar2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public l h(ViewGroup viewGroup, int i2) {
        b bVar = this.f2541g.get(i2);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, n.a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = c.b.d.a.a.b(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(bVar.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            AtomicInteger atomicInteger = d0.a;
            d0.c.q(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i3 = bVar.f2544b;
            if (i3 != 0) {
                from.inflate(i3, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new l(inflate);
    }

    public final List<Preference> j(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int R = preferenceGroup.R();
        int i2 = 0;
        for (int i3 = 0; i3 < R; i3++) {
            Preference Q = preferenceGroup.Q(i3);
            if (Q.x) {
                if (!m(preferenceGroup) || i2 < preferenceGroup.Y) {
                    arrayList.add(Q);
                } else {
                    arrayList2.add(Q);
                }
                if (Q instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) Q;
                    if (!(!(preferenceGroup2 instanceof PreferenceScreen))) {
                        continue;
                    } else if (m(preferenceGroup) && m(preferenceGroup2)) {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    } else {
                        Iterator it = ((ArrayList) j(preferenceGroup2)).iterator();
                        while (it.hasNext()) {
                            Preference preference = (Preference) it.next();
                            if (!m(preferenceGroup) || i2 < preferenceGroup.Y) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i2++;
                        }
                    }
                } else {
                    i2++;
                }
            }
        }
        if (m(preferenceGroup) && i2 > preferenceGroup.Y) {
            c.t.b bVar = new c.t.b(preferenceGroup.a, arrayList2, preferenceGroup.f475c);
            bVar.f478f = new h(this, preferenceGroup);
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public final void k(List<Preference> list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.U);
        }
        int R = preferenceGroup.R();
        for (int i2 = 0; i2 < R; i2++) {
            Preference Q = preferenceGroup.Q(i2);
            list.add(Q);
            b bVar = new b(Q);
            if (!this.f2541g.contains(bVar)) {
                this.f2541g.add(bVar);
            }
            if (Q instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) Q;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    k(list, preferenceGroup2);
                }
            }
            Q.H = this;
        }
    }

    public Preference l(int i2) {
        if (i2 < 0 || i2 >= b()) {
            return null;
        }
        return this.f2540f.get(i2);
    }

    public final boolean m(PreferenceGroup preferenceGroup) {
        return preferenceGroup.Y != Integer.MAX_VALUE;
    }

    public void n() {
        for (Preference preference : this.f2539e) {
            preference.H = null;
        }
        ArrayList arrayList = new ArrayList(this.f2539e.size());
        this.f2539e = arrayList;
        k(arrayList, this.f2538d);
        this.f2540f = j(this.f2538d);
        j jVar = this.f2538d.f474b;
        this.a.b();
        for (Preference preference2 : this.f2539e) {
            Objects.requireNonNull(preference2);
        }
    }
}
