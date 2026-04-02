package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.amazon.aps.iva.c8.x;
import com.amazon.aps.iva.q5.s0;
import com.amazon.aps.iva.q5.t0;
import com.amazon.aps.iva.q5.v0;
import com.crunchyroll.crunchyroid.R;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {
    public final int b;
    public final LayoutInflater c;
    public final CheckedTextView d;
    public final CheckedTextView e;
    public final a f;
    public final ArrayList g;
    public final HashMap h;
    public boolean i;
    public boolean j;
    public x k;
    public CheckedTextView[][] l;
    public boolean m;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z;
            boolean z2;
            TrackSelectionView trackSelectionView = TrackSelectionView.this;
            CheckedTextView checkedTextView = trackSelectionView.d;
            HashMap hashMap = trackSelectionView.h;
            boolean z3 = true;
            if (view == checkedTextView) {
                trackSelectionView.m = true;
                hashMap.clear();
            } else if (view == trackSelectionView.e) {
                trackSelectionView.m = false;
                hashMap.clear();
            } else {
                trackSelectionView.m = false;
                Object tag = view.getTag();
                tag.getClass();
                b bVar = (b) tag;
                s0 s0Var = bVar.a.c;
                t0 t0Var = (t0) hashMap.get(s0Var);
                int i = bVar.b;
                if (t0Var == null) {
                    if (!trackSelectionView.j && hashMap.size() > 0) {
                        hashMap.clear();
                    }
                    hashMap.put(s0Var, new t0(s0Var, ImmutableList.of(Integer.valueOf(i))));
                } else {
                    ArrayList arrayList = new ArrayList(t0Var.c);
                    boolean isChecked = ((CheckedTextView) view).isChecked();
                    if (trackSelectionView.i && bVar.a.d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        if (trackSelectionView.j && trackSelectionView.g.size() > 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            z3 = false;
                        }
                    }
                    if (isChecked && z3) {
                        arrayList.remove(Integer.valueOf(i));
                        if (arrayList.isEmpty()) {
                            hashMap.remove(s0Var);
                        } else {
                            hashMap.put(s0Var, new t0(s0Var, arrayList));
                        }
                    } else if (!isChecked) {
                        if (z) {
                            arrayList.add(Integer.valueOf(i));
                            hashMap.put(s0Var, new t0(s0Var, arrayList));
                        } else {
                            hashMap.put(s0Var, new t0(s0Var, ImmutableList.of(Integer.valueOf(i))));
                        }
                    }
                }
            }
            trackSelectionView.a();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final v0.a a;
        public final int b;

        public b(v0.a aVar, int i) {
            this.a = aVar;
            this.b = i;
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.b = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.c = from;
        a aVar = new a();
        this.f = aVar;
        this.k = new com.amazon.aps.iva.c8.d(getResources());
        this.g = new ArrayList();
        this.h = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.d = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(aVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.e = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(aVar);
        addView(checkedTextView2);
    }

    public final void a() {
        boolean z;
        this.d.setChecked(this.m);
        boolean z2 = this.m;
        HashMap hashMap = this.h;
        if (!z2 && hashMap.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.e.setChecked(z);
        for (int i = 0; i < this.l.length; i++) {
            t0 t0Var = (t0) hashMap.get(((v0.a) this.g.get(i)).c);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.l[i];
                if (i2 < checkedTextViewArr.length) {
                    if (t0Var != null) {
                        Object tag = checkedTextViewArr[i2].getTag();
                        tag.getClass();
                        this.l[i][i2].setChecked(t0Var.c.contains(Integer.valueOf(((b) tag).b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    public final void b() {
        boolean z;
        boolean z2;
        int i;
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.g;
        boolean isEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.e;
        CheckedTextView checkedTextView2 = this.d;
        if (isEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.l = new CheckedTextView[arrayList.size()];
        if (this.j && arrayList.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            v0.a aVar = (v0.a) arrayList.get(i2);
            if (this.i && aVar.d) {
                z2 = true;
            } else {
                z2 = false;
            }
            CheckedTextView[][] checkedTextViewArr = this.l;
            int i3 = aVar.b;
            checkedTextViewArr[i2] = new CheckedTextView[i3];
            b[] bVarArr = new b[i3];
            for (int i4 = 0; i4 < aVar.b; i4++) {
                bVarArr[i4] = new b(aVar, i4);
            }
            for (int i5 = 0; i5 < i3; i5++) {
                LayoutInflater layoutInflater = this.c;
                if (i5 == 0) {
                    addView(layoutInflater.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                if (!z2 && !z) {
                    i = 17367055;
                } else {
                    i = 17367056;
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate(i, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.b);
                x xVar = this.k;
                b bVar = bVarArr[i5];
                checkedTextView3.setText(xVar.a(bVar.a.c(bVar.b)));
                checkedTextView3.setTag(bVarArr[i5]);
                if (aVar.i(i5)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.l[i2][i5] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.m;
    }

    public Map<s0, t0> getOverrides() {
        return this.h;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.i != z) {
            this.i = z;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (!z) {
                HashMap hashMap = this.h;
                if (hashMap.size() > 1) {
                    ArrayList arrayList = this.g;
                    HashMap hashMap2 = new HashMap();
                    for (int i = 0; i < arrayList.size(); i++) {
                        t0 t0Var = (t0) hashMap.get(((v0.a) arrayList.get(i)).c);
                        if (t0Var != null && hashMap2.isEmpty()) {
                            hashMap2.put(t0Var.b, t0Var);
                        }
                    }
                    hashMap.clear();
                    hashMap.putAll(hashMap2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.d.setVisibility(i);
    }

    public void setTrackNameProvider(x xVar) {
        xVar.getClass();
        this.k = xVar;
        b();
    }
}
