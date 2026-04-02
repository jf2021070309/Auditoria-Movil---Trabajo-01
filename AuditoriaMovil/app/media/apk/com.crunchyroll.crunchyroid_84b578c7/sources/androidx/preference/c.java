package androidx.preference;

import android.content.res.ColorStateList;
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
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.l8.g;
import com.amazon.aps.iva.l8.h;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
/* compiled from: PreferenceGroupAdapter.java */
/* loaded from: classes.dex */
public final class c extends RecyclerView.h<g> implements Preference.c {
    public final PreferenceGroup a;
    public ArrayList b;
    public ArrayList c;
    public final ArrayList d;
    public final a f = new a();
    public final Handler e = new Handler(Looper.getMainLooper());

    /* compiled from: PreferenceGroupAdapter.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.h();
        }
    }

    /* compiled from: PreferenceGroupAdapter.java */
    /* loaded from: classes.dex */
    public static class b {
        public final int a;
        public final int b;
        public final String c;

        public b(Preference preference) {
            this.c = preference.getClass().getName();
            this.a = preference.F;
            this.b = preference.G;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a != bVar.a || this.b != bVar.b || !TextUtils.equals(this.c, bVar.c)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.c.hashCode() + ((((527 + this.a) * 31) + this.b) * 31);
        }
    }

    public c(PreferenceScreen preferenceScreen) {
        this.a = preferenceScreen;
        preferenceScreen.H = this;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        setHasStableIds(preferenceScreen.U);
        h();
    }

    public static boolean g(PreferenceGroup preferenceGroup) {
        if (preferenceGroup.T != Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public final ArrayList d(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int D = preferenceGroup.D();
        int i = 0;
        for (int i2 = 0; i2 < D; i2++) {
            Preference C = preferenceGroup.C(i2);
            if (C.x) {
                if (g(preferenceGroup) && i >= preferenceGroup.T) {
                    arrayList2.add(C);
                } else {
                    arrayList.add(C);
                }
                if (!(C instanceof PreferenceGroup)) {
                    i++;
                } else {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) C;
                    if (!(!(preferenceGroup2 instanceof PreferenceScreen))) {
                        continue;
                    } else if (g(preferenceGroup) && g(preferenceGroup2)) {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    } else {
                        Iterator it = d(preferenceGroup2).iterator();
                        while (it.hasNext()) {
                            Preference preference = (Preference) it.next();
                            if (g(preferenceGroup) && i >= preferenceGroup.T) {
                                arrayList2.add(preference);
                            } else {
                                arrayList.add(preference);
                            }
                            i++;
                        }
                    }
                }
            }
        }
        if (g(preferenceGroup) && i > preferenceGroup.T) {
            com.amazon.aps.iva.l8.b bVar = new com.amazon.aps.iva.l8.b(preferenceGroup.b, arrayList2, preferenceGroup.d);
            bVar.f = new d(this, preferenceGroup);
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public final void e(PreferenceGroup preferenceGroup, ArrayList arrayList) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.P);
        }
        int D = preferenceGroup.D();
        for (int i = 0; i < D; i++) {
            Preference C = preferenceGroup.C(i);
            arrayList.add(C);
            b bVar = new b(C);
            if (!this.d.contains(bVar)) {
                this.d.add(bVar);
            }
            if (C instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) C;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    e(preferenceGroup2, arrayList);
                }
            }
            C.H = this;
        }
    }

    public final Preference f(int i) {
        if (i >= 0 && i < getItemCount()) {
            return (Preference) this.c.get(i);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final long getItemId(int i) {
        if (!hasStableIds()) {
            return -1L;
        }
        return f(i).c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        b bVar = new b(f(i));
        ArrayList arrayList = this.d;
        int indexOf = arrayList.indexOf(bVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = arrayList.size();
        arrayList.add(bVar);
        return size;
    }

    public final void h() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).H = null;
        }
        ArrayList arrayList = new ArrayList(this.b.size());
        this.b = arrayList;
        PreferenceGroup preferenceGroup = this.a;
        e(preferenceGroup, arrayList);
        this.c = d(preferenceGroup);
        notifyDataSetChanged();
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).getClass();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(g gVar, int i) {
        ColorStateList colorStateList;
        g gVar2 = gVar;
        Preference f = f(i);
        Drawable background = gVar2.itemView.getBackground();
        Drawable drawable = gVar2.b;
        if (background != drawable) {
            View view = gVar2.itemView;
            WeakHashMap<View, r0> weakHashMap = g0.a;
            g0.d.q(view, drawable);
        }
        TextView textView = (TextView) gVar2.b1(16908310);
        if (textView != null && (colorStateList = gVar2.c) != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        f.n(gVar2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final g onCreateViewHolder(ViewGroup viewGroup, int i) {
        b bVar = (b) this.d.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, h.a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = com.amazon.aps.iva.l.a.a(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(bVar.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            g0.d.q(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = bVar.b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new g(inflate);
    }
}
