package com.amazon.aps.iva.x2;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import com.amazon.aps.iva.x2.o;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.cast.MediaError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: MotionScene.java */
/* loaded from: classes.dex */
public final class q {
    public final o a;
    public com.amazon.aps.iva.y2.f b;
    public b c;
    public final ArrayList<b> d;
    public b e;
    public final ArrayList<b> f;
    public final SparseArray<androidx.constraintlayout.widget.c> g;
    public final HashMap<String, Integer> h;
    public final SparseIntArray i;
    public int j;
    public int k;
    public MotionEvent l;
    public boolean m;
    public boolean n;
    public o.e o;
    public boolean p;
    public final x q;
    public float r;
    public float s;

    /* compiled from: MotionScene.java */
    /* loaded from: classes.dex */
    public class a implements Interpolator {
        public final /* synthetic */ com.amazon.aps.iva.t2.c a;

        public a(com.amazon.aps.iva.t2.c cVar) {
            this.a = cVar;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return (float) this.a.a(f);
        }
    }

    public q(Context context, o oVar, int i) {
        this.b = null;
        this.c = null;
        ArrayList<b> arrayList = new ArrayList<>();
        this.d = arrayList;
        this.e = null;
        this.f = new ArrayList<>();
        this.g = new SparseArray<>();
        this.h = new HashMap<>();
        this.i = new SparseIntArray();
        this.j = MediaError.DetailedErrorCode.MANIFEST_UNKNOWN;
        this.k = 0;
        this.m = false;
        this.n = false;
        this.a = oVar;
        this.q = new x(oVar);
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            b bVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    char c = 2;
                    if (eventType != 2) {
                        continue;
                    } else {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1239391468:
                                if (name.equals("KeyFrameSet")) {
                                    c = '\b';
                                    break;
                                }
                                c = 65535;
                                break;
                            case -687739768:
                                if (name.equals("Include")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 61998586:
                                if (name.equals("ViewTransition")) {
                                    c = '\t';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 269306229:
                                if (name.equals("Transition")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 312750793:
                                if (name.equals("OnClick")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 327855227:
                                if (name.equals("OnSwipe")) {
                                    break;
                                }
                                c = 65535;
                                break;
                            case 793277014:
                                if (name.equals("MotionScene")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1942574248:
                                if (name.equals("include")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                i(context, xml);
                                continue;
                            case 1:
                                bVar = new b(this, context, xml);
                                arrayList.add(bVar);
                                if (this.c == null && !bVar.b) {
                                    this.c = bVar;
                                    t tVar = bVar.l;
                                    if (tVar != null) {
                                        tVar.c(this.p);
                                    }
                                }
                                if (bVar.b) {
                                    if (bVar.c == -1) {
                                        this.e = bVar;
                                    } else {
                                        this.f.add(bVar);
                                    }
                                    arrayList.remove(bVar);
                                    continue;
                                } else {
                                    continue;
                                }
                            case 2:
                                if (bVar == null) {
                                    context.getResources().getResourceEntryName(i);
                                    xml.getLineNumber();
                                }
                                if (bVar != null) {
                                    bVar.l = new t(context, this.a, xml);
                                    continue;
                                } else {
                                    continue;
                                }
                            case 3:
                                if (bVar != null) {
                                    bVar.m.add(new b.a(context, bVar, xml));
                                    continue;
                                } else {
                                    continue;
                                }
                            case 4:
                                this.b = new com.amazon.aps.iva.y2.f(context, xml);
                                continue;
                            case 5:
                                f(context, xml);
                                continue;
                            case 6:
                            case 7:
                                h(context, xml);
                                continue;
                            case '\b':
                                g gVar = new g(context, xml);
                                if (bVar != null) {
                                    bVar.k.add(gVar);
                                    continue;
                                } else {
                                    continue;
                                }
                            case '\t':
                                w wVar = new w(context, xml);
                                x xVar = this.q;
                                xVar.b.add(wVar);
                                xVar.c = null;
                                int i2 = wVar.b;
                                if (i2 == 4) {
                                    x.a(wVar, true);
                                    continue;
                                } else if (i2 == 5) {
                                    x.a(wVar, false);
                                    continue;
                                } else {
                                    continue;
                                }
                            default:
                                continue;
                        }
                    }
                } else {
                    xml.getName();
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
        this.g.put(R.id.motion_base, new androidx.constraintlayout.widget.c());
        this.h.put("motion_base", Integer.valueOf((int) R.id.motion_base));
    }

    public final boolean a(int i, o oVar) {
        boolean z;
        boolean z2;
        if (this.o != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        Iterator<b> it = this.d.iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i2 = next.n;
            if (i2 != 0) {
                b bVar = this.c;
                if (bVar == next) {
                    if ((bVar.q & 2) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        continue;
                    }
                }
                if (i == next.d && (i2 == 4 || i2 == 2)) {
                    o.h hVar = o.h.FINISHED;
                    oVar.setState(hVar);
                    oVar.setTransition(next);
                    if (next.n == 4) {
                        oVar.mh();
                        oVar.setState(o.h.SETUP);
                        oVar.setState(o.h.MOVING);
                    } else {
                        oVar.setProgress(1.0f);
                        oVar.b1(true);
                        oVar.setState(o.h.SETUP);
                        oVar.setState(o.h.MOVING);
                        oVar.setState(hVar);
                        oVar.H6();
                    }
                    return true;
                } else if (i == next.c && (i2 == 3 || i2 == 1)) {
                    o.h hVar2 = o.h.FINISHED;
                    oVar.setState(hVar2);
                    oVar.setTransition(next);
                    if (next.n == 3) {
                        oVar.G(0.0f);
                        oVar.setState(o.h.SETUP);
                        oVar.setState(o.h.MOVING);
                    } else {
                        oVar.setProgress(0.0f);
                        oVar.b1(true);
                        oVar.setState(o.h.SETUP);
                        oVar.setState(o.h.MOVING);
                        oVar.setState(hVar2);
                        oVar.H6();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final androidx.constraintlayout.widget.c b(int i) {
        int a2;
        com.amazon.aps.iva.y2.f fVar = this.b;
        if (fVar != null && (a2 = fVar.a(i)) != -1) {
            i = a2;
        }
        SparseArray<androidx.constraintlayout.widget.c> sparseArray = this.g;
        if (sparseArray.get(i) == null) {
            com.amazon.aps.iva.x2.a.b(i, this.a.getContext());
            return sparseArray.get(sparseArray.keyAt(0));
        }
        return sparseArray.get(i);
    }

    public final int c(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            i = -1;
        }
        if (i == -1 && str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        return i;
    }

    public final Interpolator d() {
        b bVar = this.c;
        int i = bVar.e;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i != 6) {
                                        return null;
                                    }
                                    return new AnticipateInterpolator();
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new a(com.amazon.aps.iva.t2.c.c(bVar.f));
        }
        return AnimationUtils.loadInterpolator(this.a.getContext(), this.c.g);
    }

    public final float e() {
        t tVar;
        b bVar = this.c;
        if (bVar != null && (tVar = bVar.l) != null) {
            return tVar.r;
        }
        return 0.0f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int f(Context context, XmlResourceParser xmlResourceParser) {
        char c;
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.d = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlResourceParser.getAttributeName(i3);
            String attributeValue = xmlResourceParser.getAttributeValue(i3);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1496482599:
                    if (attributeName.equals("deriveConstraintsFrom")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1153153640:
                    if (attributeName.equals("constraintRotate")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    i2 = c(context, attributeValue);
                    break;
                case 1:
                    try {
                        Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        break;
                    }
                case 2:
                    i = c(context, attributeValue);
                    int indexOf = attributeValue.indexOf(47);
                    if (indexOf >= 0) {
                        attributeValue = attributeValue.substring(indexOf + 1);
                    }
                    this.h.put(attributeValue, Integer.valueOf(i));
                    cVar.a = com.amazon.aps.iva.x2.a.b(i, context);
                    break;
            }
        }
        if (i != -1) {
            int i4 = this.a.s;
            cVar.n(context, xmlResourceParser);
            if (i2 != -1) {
                this.i.put(i, i2);
            }
            this.g.put(i, cVar);
        }
        return i;
    }

    public final int g(int i, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return f(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public final void h(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), com.amazon.aps.iva.y2.d.x);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                g(obtainStyledAttributes.getResourceId(index, -1), context);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void i(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), com.amazon.aps.iva.y2.d.n);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.j);
                this.j = i2;
                if (i2 < 8) {
                    this.j = 8;
                }
            } else if (index == 1) {
                this.k = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void j(int i, o oVar) {
        SparseArray<androidx.constraintlayout.widget.c> sparseArray = this.g;
        androidx.constraintlayout.widget.c cVar = sparseArray.get(i);
        cVar.b = cVar.a;
        int i2 = this.i.get(i);
        HashMap<Integer, c.a> hashMap = cVar.e;
        if (i2 > 0) {
            j(i2, oVar);
            androidx.constraintlayout.widget.c cVar2 = sparseArray.get(i2);
            if (cVar2 == null) {
                com.amazon.aps.iva.x2.a.b(i2, this.a.getContext());
                return;
            }
            cVar.b += "/" + cVar2.b;
            HashMap<Integer, c.a> hashMap2 = cVar2.e;
            for (Integer num : hashMap2.keySet()) {
                int intValue = num.intValue();
                c.a aVar = hashMap2.get(num);
                if (!hashMap.containsKey(Integer.valueOf(intValue))) {
                    hashMap.put(Integer.valueOf(intValue), new c.a());
                }
                c.a aVar2 = hashMap.get(Integer.valueOf(intValue));
                if (aVar2 != null) {
                    c.b bVar = aVar2.e;
                    if (!bVar.b) {
                        bVar.a(aVar.e);
                    }
                    c.d dVar = aVar2.c;
                    if (!dVar.a) {
                        c.d dVar2 = aVar.c;
                        dVar.a = dVar2.a;
                        dVar.b = dVar2.b;
                        dVar.d = dVar2.d;
                        dVar.e = dVar2.e;
                        dVar.c = dVar2.c;
                    }
                    c.e eVar = aVar2.f;
                    if (!eVar.a) {
                        eVar.a(aVar.f);
                    }
                    c.C0025c c0025c = aVar2.d;
                    if (!c0025c.a) {
                        c0025c.a(aVar.d);
                    }
                    for (String str : aVar.g.keySet()) {
                        if (!aVar2.g.containsKey(str)) {
                            aVar2.g.put(str, aVar.g.get(str));
                        }
                    }
                }
            }
        } else {
            cVar.b = defpackage.b.c(new StringBuilder(), cVar.b, "  layout");
            int childCount = oVar.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = oVar.getChildAt(i3);
                ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                int id = childAt.getId();
                if (cVar.d && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new c.a());
                }
                c.a aVar3 = hashMap.get(Integer.valueOf(id));
                if (aVar3 != null) {
                    c.b bVar3 = aVar3.e;
                    if (!bVar3.b) {
                        aVar3.c(id, bVar2);
                        if (childAt instanceof androidx.constraintlayout.widget.b) {
                            bVar3.j0 = ((androidx.constraintlayout.widget.b) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                bVar3.o0 = barrier.getAllowsGoneWidget();
                                bVar3.g0 = barrier.getType();
                                bVar3.h0 = barrier.getMargin();
                            }
                        }
                        bVar3.b = true;
                    }
                    c.d dVar3 = aVar3.c;
                    if (!dVar3.a) {
                        dVar3.b = childAt.getVisibility();
                        dVar3.d = childAt.getAlpha();
                        dVar3.a = true;
                    }
                    c.e eVar2 = aVar3.f;
                    if (!eVar2.a) {
                        eVar2.a = true;
                        eVar2.b = childAt.getRotation();
                        eVar2.c = childAt.getRotationX();
                        eVar2.d = childAt.getRotationY();
                        eVar2.e = childAt.getScaleX();
                        eVar2.f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            eVar2.g = pivotX;
                            eVar2.h = pivotY;
                        }
                        eVar2.j = childAt.getTranslationX();
                        eVar2.k = childAt.getTranslationY();
                        eVar2.l = childAt.getTranslationZ();
                        if (eVar2.m) {
                            eVar2.n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (c.a aVar4 : hashMap.values()) {
            if (aVar4.h != null) {
                if (aVar4.b != null) {
                    for (Integer num2 : hashMap.keySet()) {
                        c.a l = cVar.l(num2.intValue());
                        String str2 = l.e.l0;
                        if (str2 != null && aVar4.b.matches(str2)) {
                            aVar4.h.e(l);
                            l.g.putAll((HashMap) aVar4.g.clone());
                        }
                    }
                } else {
                    aVar4.h.e(cVar.l(aVar4.a));
                }
            }
        }
    }

    public final void k(o oVar) {
        boolean z;
        int i = 0;
        while (true) {
            SparseArray<androidx.constraintlayout.widget.c> sparseArray = this.g;
            if (i < sparseArray.size()) {
                int keyAt = sparseArray.keyAt(i);
                SparseIntArray sparseIntArray = this.i;
                int i2 = sparseIntArray.get(keyAt);
                int size = sparseIntArray.size();
                while (i2 > 0) {
                    if (i2 != keyAt) {
                        int i3 = size - 1;
                        if (size >= 0) {
                            i2 = sparseIntArray.get(i2);
                            size = i3;
                        }
                    }
                    z = true;
                    break;
                }
                z = false;
                if (z) {
                    return;
                }
                j(keyAt, oVar);
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r2 != (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r9, int r10) {
        /*
            r8 = this;
            com.amazon.aps.iva.y2.f r0 = r8.b
            r1 = -1
            if (r0 == 0) goto L16
            int r0 = r0.a(r9)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r9
        Ld:
            com.amazon.aps.iva.y2.f r2 = r8.b
            int r2 = r2.a(r10)
            if (r2 == r1) goto L17
            goto L18
        L16:
            r0 = r9
        L17:
            r2 = r10
        L18:
            com.amazon.aps.iva.x2.q$b r3 = r8.c
            if (r3 == 0) goto L25
            int r4 = r3.c
            if (r4 != r10) goto L25
            int r3 = r3.d
            if (r3 != r9) goto L25
            return
        L25:
            java.util.ArrayList<com.amazon.aps.iva.x2.q$b> r3 = r8.d
            java.util.Iterator r4 = r3.iterator()
        L2b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L51
            java.lang.Object r5 = r4.next()
            com.amazon.aps.iva.x2.q$b r5 = (com.amazon.aps.iva.x2.q.b) r5
            int r6 = r5.c
            if (r6 != r2) goto L3f
            int r7 = r5.d
            if (r7 == r0) goto L45
        L3f:
            if (r6 != r10) goto L2b
            int r6 = r5.d
            if (r6 != r9) goto L2b
        L45:
            r8.c = r5
            com.amazon.aps.iva.x2.t r9 = r5.l
            if (r9 == 0) goto L50
            boolean r10 = r8.p
            r9.c(r10)
        L50:
            return
        L51:
            com.amazon.aps.iva.x2.q$b r9 = r8.e
            java.util.ArrayList<com.amazon.aps.iva.x2.q$b> r4 = r8.f
            java.util.Iterator r4 = r4.iterator()
        L59:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L6b
            java.lang.Object r5 = r4.next()
            com.amazon.aps.iva.x2.q$b r5 = (com.amazon.aps.iva.x2.q.b) r5
            int r6 = r5.c
            if (r6 != r10) goto L59
            r9 = r5
            goto L59
        L6b:
            com.amazon.aps.iva.x2.q$b r10 = new com.amazon.aps.iva.x2.q$b
            r10.<init>(r8, r9)
            r10.d = r0
            r10.c = r2
            if (r0 == r1) goto L79
            r3.add(r10)
        L79:
            r8.c = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.x2.q.l(int, int):void");
    }

    public final boolean m() {
        Iterator<b> it = this.d.iterator();
        while (it.hasNext()) {
            if (it.next().l != null) {
                return true;
            }
        }
        b bVar = this.c;
        if (bVar != null && bVar.l != null) {
            return true;
        }
        return false;
    }

    /* compiled from: MotionScene.java */
    /* loaded from: classes.dex */
    public static class b {
        public int a;
        public boolean b;
        public int c;
        public int d;
        public int e;
        public String f;
        public int g;
        public int h;
        public float i;
        public final q j;
        public final ArrayList<g> k;
        public t l;
        public final ArrayList<a> m;
        public int n;
        public boolean o;
        public int p;
        public int q;

        /* compiled from: MotionScene.java */
        /* loaded from: classes.dex */
        public static class a implements View.OnClickListener {
            public final b b;
            public final int c;
            public final int d;

            public a(Context context, b bVar, XmlResourceParser xmlResourceParser) {
                this.c = -1;
                this.d = 17;
                this.b = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), com.amazon.aps.iva.y2.d.o);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == 1) {
                        this.c = obtainStyledAttributes.getResourceId(index, this.c);
                    } else if (index == 0) {
                        this.d = obtainStyledAttributes.getInt(index, this.d);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View] */
            public final void a(o oVar, int i, b bVar) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                int i2 = this.c;
                o oVar2 = oVar;
                if (i2 != -1) {
                    oVar2 = oVar.findViewById(i2);
                }
                if (oVar2 == null) {
                    return;
                }
                int i3 = bVar.d;
                int i4 = bVar.c;
                if (i3 == -1) {
                    oVar2.setOnClickListener(this);
                    return;
                }
                int i5 = this.d;
                int i6 = i5 & 1;
                boolean z5 = true;
                if (i6 != 0 && i == i3) {
                    z = true;
                } else {
                    z = false;
                }
                if ((i5 & 256) != 0 && i == i3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z6 = z | z2;
                if (i6 != 0 && i == i3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z7 = z3 | z6;
                if ((i5 & 16) != 0 && i == i4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z8 = z7 | z4;
                if ((i5 & 4096) == 0 || i != i4) {
                    z5 = false;
                }
                if (z8 | z5) {
                    oVar2.setOnClickListener(this);
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z;
                boolean z2;
                boolean z3;
                int i;
                b bVar = this.b;
                q qVar = bVar.j;
                o oVar = qVar.a;
                if (!oVar.j) {
                    return;
                }
                if (bVar.d == -1) {
                    int currentState = oVar.getCurrentState();
                    if (currentState == -1) {
                        oVar.yh(bVar.c);
                        return;
                    }
                    b bVar2 = new b(bVar.j, bVar);
                    bVar2.d = currentState;
                    bVar2.c = bVar.c;
                    oVar.setTransition(bVar2);
                    oVar.mh();
                    return;
                }
                b bVar3 = qVar.c;
                int i2 = this.d;
                boolean z4 = false;
                boolean z5 = true;
                if ((i2 & 1) == 0 && (i2 & 256) == 0) {
                    z = false;
                } else {
                    z = true;
                }
                if ((i2 & 16) == 0 && (i2 & 4096) == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z && z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (bVar3 != bVar) {
                        oVar.setTransition(bVar);
                    }
                    if (oVar.getCurrentState() != oVar.getEndState() && oVar.getProgress() <= 0.5f) {
                        z2 = false;
                    } else {
                        z = false;
                    }
                }
                if (bVar != bVar3) {
                    int i3 = bVar.c;
                    int i4 = bVar.d;
                    if (i4 != -1 ? (i = oVar.f) == i4 || i == i3 : oVar.f != i3) {
                        z4 = true;
                    }
                    z5 = z4;
                }
                if (z5) {
                    if (z && (i2 & 1) != 0) {
                        oVar.setTransition(bVar);
                        oVar.mh();
                    } else if (z2 && (i2 & 16) != 0) {
                        oVar.setTransition(bVar);
                        oVar.G(0.0f);
                    } else if (z && (i2 & 256) != 0) {
                        oVar.setTransition(bVar);
                        oVar.setProgress(1.0f);
                    } else if (z2 && (i2 & 4096) != 0) {
                        oVar.setTransition(bVar);
                        oVar.setProgress(0.0f);
                    }
                }
            }
        }

        public b() {
            throw null;
        }

        public b(q qVar, b bVar) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = MediaError.DetailedErrorCode.MANIFEST_UNKNOWN;
            this.i = 0.0f;
            this.k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.o = false;
            this.p = 0;
            this.q = 0;
            this.j = qVar;
            this.h = qVar.j;
            if (bVar != null) {
                this.e = bVar.e;
                this.f = bVar.f;
                this.g = bVar.g;
                this.h = bVar.h;
                this.k = bVar.k;
                this.i = bVar.i;
                this.p = bVar.p;
            }
        }

        public b(q qVar, Context context, XmlResourceParser xmlResourceParser) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = MediaError.DetailedErrorCode.MANIFEST_UNKNOWN;
            this.i = 0.0f;
            this.k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.o = false;
            this.p = 0;
            this.q = 0;
            this.h = qVar.j;
            this.p = qVar.k;
            this.j = qVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), com.amazon.aps.iva.y2.d.u);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                SparseArray<androidx.constraintlayout.widget.c> sparseArray = qVar.g;
                if (index == 2) {
                    this.c = obtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        cVar.m(this.c, context);
                        sparseArray.append(this.c, cVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.c = qVar.g(this.c, context);
                    }
                } else if (index == 3) {
                    this.d = obtainStyledAttributes.getResourceId(index, this.d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.d);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
                        cVar2.m(this.d, context);
                        sparseArray.append(this.d, cVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.d = qVar.g(this.d, context);
                    }
                } else if (index == 6) {
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        this.g = resourceId;
                        if (resourceId != -1) {
                            this.e = -2;
                        }
                    } else if (i2 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.g = obtainStyledAttributes.getResourceId(index, -1);
                                this.e = -2;
                            } else {
                                this.e = -1;
                            }
                        }
                    } else {
                        this.e = obtainStyledAttributes.getInteger(index, this.e);
                    }
                } else if (index == 4) {
                    int i3 = obtainStyledAttributes.getInt(index, this.h);
                    this.h = i3;
                    if (i3 < 8) {
                        this.h = 8;
                    }
                } else if (index == 8) {
                    this.i = obtainStyledAttributes.getFloat(index, this.i);
                } else if (index == 1) {
                    this.n = obtainStyledAttributes.getInteger(index, this.n);
                } else if (index == 0) {
                    this.a = obtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == 9) {
                    this.o = obtainStyledAttributes.getBoolean(index, this.o);
                } else if (index == 7) {
                    obtainStyledAttributes.getInteger(index, -1);
                } else if (index == 5) {
                    this.p = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == 10) {
                    this.q = obtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.d == -1) {
                this.b = true;
            }
            obtainStyledAttributes.recycle();
        }
    }
}
