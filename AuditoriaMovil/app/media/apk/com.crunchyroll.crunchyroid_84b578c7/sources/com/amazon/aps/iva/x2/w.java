package com.amazon.aps.iva.x2;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.c;
import com.amazon.aps.iva.t2.e;
import com.amazon.aps.iva.w2.b;
import com.amazon.aps.iva.w2.c;
import com.amazon.aps.iva.w2.d;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ViewTransition.java */
/* loaded from: classes.dex */
public final class w {
    public int a;
    public int e;
    public final g f;
    public final c.a g;
    public int j;
    public String k;
    public final Context o;
    public int b = -1;
    public boolean c = false;
    public int d = 0;
    public int h = -1;
    public int i = -1;
    public int l = 0;
    public String m = null;
    public int n = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;

    /* compiled from: ViewTransition.java */
    /* loaded from: classes.dex */
    public static class a {
        public final int a;
        public final int b;
        public final m c;
        public final int d;
        public final x f;
        public final Interpolator g;
        public float i;
        public float j;
        public final boolean m;
        public final com.amazon.aps.iva.p0.e e = new com.amazon.aps.iva.p0.e(2);
        public boolean h = false;
        public final Rect l = new Rect();
        public long k = System.nanoTime();

        public a(x xVar, m mVar, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            float f;
            this.m = false;
            this.f = xVar;
            this.c = mVar;
            this.d = i2;
            if (xVar.d == null) {
                xVar.d = new ArrayList<>();
            }
            xVar.d.add(this);
            this.g = interpolator;
            this.a = i4;
            this.b = i5;
            if (i3 == 3) {
                this.m = true;
            }
            if (i == 0) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f / i;
            }
            this.j = f;
            a();
        }

        public final void a() {
            float interpolation;
            boolean z = this.h;
            int i = this.b;
            int i2 = this.a;
            x xVar = this.f;
            Interpolator interpolator = this.g;
            m mVar = this.c;
            if (z) {
                long nanoTime = System.nanoTime();
                this.k = nanoTime;
                float f = this.i - (((float) ((nanoTime - this.k) * 1.0E-6d)) * this.j);
                this.i = f;
                if (f < 0.0f) {
                    this.i = 0.0f;
                }
                float f2 = this.i;
                if (interpolator != null) {
                    f2 = interpolator.getInterpolation(f2);
                }
                boolean b = mVar.b(f2, nanoTime, mVar.a, this.e);
                if (this.i <= 0.0f) {
                    if (i2 != -1) {
                        mVar.a.setTag(i2, Long.valueOf(System.nanoTime()));
                    }
                    if (i != -1) {
                        mVar.a.setTag(i, null);
                    }
                    xVar.e.add(this);
                }
                if (this.i > 0.0f || b) {
                    xVar.a.invalidate();
                    return;
                }
                return;
            }
            long nanoTime2 = System.nanoTime();
            this.k = nanoTime2;
            float f3 = (((float) ((nanoTime2 - this.k) * 1.0E-6d)) * this.j) + this.i;
            this.i = f3;
            if (f3 >= 1.0f) {
                this.i = 1.0f;
            }
            if (interpolator == null) {
                interpolation = this.i;
            } else {
                interpolation = interpolator.getInterpolation(this.i);
            }
            boolean b2 = mVar.b(interpolation, nanoTime2, mVar.a, this.e);
            if (this.i >= 1.0f) {
                if (i2 != -1) {
                    mVar.a.setTag(i2, Long.valueOf(System.nanoTime()));
                }
                if (i != -1) {
                    mVar.a.setTag(i, null);
                }
                if (!this.m) {
                    xVar.e.add(this);
                }
            }
            if (this.i < 1.0f || b2) {
                xVar.a.invalidate();
            }
        }

        public final void b() {
            float f;
            this.h = true;
            int i = this.d;
            if (i != -1) {
                if (i == 0) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f / i;
                }
                this.j = f;
            }
            this.f.a.invalidate();
            this.k = System.nanoTime();
        }
    }

    public w(Context context, XmlResourceParser xmlResourceParser) {
        boolean z;
        this.o = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType != 3) {
                        continue;
                    } else if ("ViewTransition".equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals("ConstraintOverride")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                z = false;
                                break;
                            }
                            z = true;
                            break;
                        case 366511058:
                            if (name.equals("CustomMethod")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        default:
                            z = true;
                            break;
                    }
                    if (z) {
                        if (!z) {
                            if (!z) {
                                if (!z && !z) {
                                    com.amazon.aps.iva.x2.a.a();
                                    xmlResourceParser.getLineNumber();
                                } else {
                                    androidx.constraintlayout.widget.a.d(context, xmlResourceParser, this.g.g);
                                }
                            } else {
                                this.g = androidx.constraintlayout.widget.c.d(context, xmlResourceParser);
                            }
                        } else {
                            this.f = new g(context, xmlResourceParser);
                        }
                    } else {
                        d(context, xmlResourceParser);
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(x xVar, o oVar, int i, androidx.constraintlayout.widget.c cVar, View... viewArr) {
        int[] constraintSetIds;
        Object obj;
        Object obj2;
        String str;
        p pVar;
        l lVar;
        l lVar2;
        p pVar2;
        ArrayList<p> arrayList;
        HashSet<String> hashSet;
        String str2;
        String str3;
        long j;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        HashSet<String> hashSet2;
        ArrayList arrayList2;
        HashSet<String> hashSet3;
        ArrayList<p> arrayList3;
        HashSet<String> hashSet4;
        String str4;
        String str5;
        Object obj11;
        Object obj12;
        Object obj13;
        ArrayList<d> arrayList4;
        m mVar;
        String str6;
        String str7;
        Object obj14;
        Object obj15;
        String str8;
        m mVar2;
        Interpolator loadInterpolator;
        Iterator<d> it;
        m mVar3;
        HashMap<String, com.amazon.aps.iva.w2.b> hashMap;
        String str9;
        Iterator<String> it2;
        f fVar;
        String str10;
        Object obj16;
        String str11;
        String str12;
        Object obj17;
        Object obj18;
        Object obj19;
        Object obj20;
        String str13;
        String str14;
        com.amazon.aps.iva.w2.b bVar;
        String str15;
        Object obj21;
        Object obj22;
        Object obj23;
        char c;
        char c2;
        char c3;
        float f;
        float f2;
        HashMap<String, com.amazon.aps.iva.w2.b> hashMap2;
        Iterator<String> it3;
        Object obj24;
        String str16;
        String str17;
        String str18;
        Object obj25;
        Object obj26;
        Object obj27;
        Object obj28;
        Object obj29;
        Object obj30;
        String str19;
        char c4;
        char c5;
        char c6;
        char c7;
        com.amazon.aps.iva.w2.b gVar;
        b.C0814b c0814b;
        String str20;
        p pVar3;
        Object obj31;
        double d;
        int i2;
        float f3;
        p pVar4;
        String str21;
        String str22;
        double[][] dArr;
        float[] fArr;
        double[] dArr2;
        int i3;
        int[] iArr;
        float[] fArr2;
        androidx.constraintlayout.widget.a aVar;
        HashSet<String> hashSet5;
        ArrayList<d> arrayList5;
        j jVar;
        m mVar4;
        String str23;
        HashMap<String, com.amazon.aps.iva.w2.d> hashMap3;
        Iterator<String> it4;
        Object obj32;
        j jVar2;
        Object obj33;
        Object obj34;
        char c8;
        Iterator<String> it5;
        String str24;
        String str25;
        HashMap<String, Integer> hashMap4;
        Object obj35;
        Object obj36;
        Object obj37;
        Object obj38;
        String str26;
        char c9;
        char c10;
        char c11;
        char c12;
        com.amazon.aps.iva.w2.d gVar2;
        d.b bVar2;
        long j2;
        androidx.constraintlayout.widget.a aVar2;
        Integer num;
        HashSet<String> hashSet6;
        Iterator<String> it6;
        HashSet<String> hashSet7;
        ArrayList<p> arrayList6;
        String str27;
        String str28;
        Object obj39;
        Object obj40;
        Object obj41;
        Object obj42;
        String str29;
        char c13;
        Object obj43;
        Object obj44;
        Object obj45;
        char c14;
        char c15;
        char c16;
        com.amazon.aps.iva.w2.c iVar;
        c.b bVar3;
        androidx.constraintlayout.widget.a aVar3;
        Object obj46;
        String str30;
        p pVar5;
        l lVar3;
        p pVar6;
        int i4;
        String str31;
        String str32;
        long j3;
        Object obj47;
        Object obj48;
        Object obj49;
        Object obj50;
        Object obj51;
        Object obj52;
        Object obj53;
        Object obj54;
        HashSet<String> hashSet8;
        HashSet<String> hashSet9;
        Object obj55;
        int i5;
        l lVar4;
        ArrayList<p> arrayList7;
        p pVar7;
        if (this.c) {
            return;
        }
        int i6 = this.e;
        if (i6 == 2) {
            View view = viewArr[0];
            m mVar5 = new m(view);
            p pVar8 = mVar5.d;
            pVar8.c = 0.0f;
            pVar8.d = 0.0f;
            mVar5.B = true;
            float x = view.getX();
            float y = view.getY();
            pVar8.e = x;
            pVar8.f = y;
            pVar8.g = view.getWidth();
            pVar8.h = view.getHeight();
            float x2 = view.getX();
            float y2 = view.getY();
            p pVar9 = mVar5.e;
            pVar9.e = x2;
            pVar9.f = y2;
            pVar9.g = view.getWidth();
            pVar9.h = view.getHeight();
            l lVar5 = mVar5.f;
            lVar5.c(view);
            l lVar6 = mVar5.g;
            lVar6.c(view);
            ArrayList<d> arrayList8 = this.f.a.get(-1);
            ArrayList<d> arrayList9 = mVar5.r;
            if (arrayList8 != null) {
                arrayList9.addAll(arrayList8);
            }
            int width = oVar.getWidth();
            int height = oVar.getHeight();
            long nanoTime = System.nanoTime();
            new HashSet();
            HashSet<String> hashSet10 = new HashSet<>();
            HashSet<String> hashSet11 = new HashSet<>();
            HashSet<String> hashSet12 = new HashSet<>();
            HashMap<String, Integer> hashMap5 = new HashMap<>();
            HashSet<String> hashSet13 = hashSet12;
            int i7 = mVar5.w;
            long j4 = nanoTime;
            if (i7 != -1) {
                pVar8.j = i7;
            }
            String str33 = "alpha";
            if (l.b(lVar5.b, lVar6.b)) {
                hashSet11.add("alpha");
            }
            if (l.b(lVar5.d, lVar6.d)) {
                hashSet11.add("elevation");
            }
            int i8 = lVar5.c;
            Object obj56 = "elevation";
            int i9 = lVar6.c;
            if (i8 != i9 && (i8 == 0 || i9 == 0)) {
                hashSet11.add("alpha");
            }
            if (l.b(lVar5.e, lVar6.e)) {
                hashSet11.add("rotation");
            }
            String str34 = "transitionPathRotate";
            if (!Float.isNaN(lVar5.o) || !Float.isNaN(lVar6.o)) {
                hashSet11.add("transitionPathRotate");
            }
            String str35 = "progress";
            if (!Float.isNaN(lVar5.p) || !Float.isNaN(lVar6.p)) {
                hashSet11.add("progress");
            }
            Object obj57 = "rotation";
            if (l.b(lVar5.f, lVar6.f)) {
                hashSet11.add("rotationX");
            }
            Object obj58 = "rotationX";
            if (l.b(lVar5.g, lVar6.g)) {
                hashSet11.add("rotationY");
            }
            Object obj59 = "rotationY";
            if (l.b(lVar5.j, lVar6.j)) {
                hashSet11.add("transformPivotX");
            }
            Object obj60 = "transformPivotX";
            if (l.b(lVar5.k, lVar6.k)) {
                hashSet11.add("transformPivotY");
            }
            Object obj61 = "transformPivotY";
            if (l.b(lVar5.h, lVar6.h)) {
                hashSet11.add("scaleX");
            }
            Object obj62 = "scaleX";
            if (l.b(lVar5.i, lVar6.i)) {
                hashSet11.add("scaleY");
            }
            Object obj63 = "scaleY";
            if (l.b(lVar5.l, lVar6.l)) {
                hashSet11.add("translationX");
            }
            Object obj64 = "translationX";
            if (l.b(lVar5.m, lVar6.m)) {
                hashSet11.add("translationY");
            }
            Object obj65 = "translationY";
            String str36 = "translationZ";
            if (l.b(lVar5.n, lVar6.n)) {
                hashSet11.add("translationZ");
            }
            ArrayList<p> arrayList10 = mVar5.q;
            if (arrayList9 != null) {
                Iterator<d> it7 = arrayList9.iterator();
                arrayList2 = null;
                while (it7.hasNext()) {
                    ArrayList<p> arrayList11 = arrayList10;
                    d next = it7.next();
                    HashSet<String> hashSet14 = hashSet11;
                    if (next instanceof h) {
                        h hVar = (h) next;
                        pVar6 = pVar9;
                        pVar5 = pVar8;
                        lVar3 = lVar6;
                        hashSet9 = hashSet13;
                        lVar4 = lVar5;
                        arrayList7 = arrayList11;
                        str30 = str35;
                        hashSet8 = hashSet14;
                        int i10 = width;
                        obj46 = obj57;
                        str31 = str36;
                        j3 = j4;
                        obj47 = obj58;
                        obj48 = obj59;
                        obj49 = obj60;
                        obj50 = obj61;
                        obj51 = obj62;
                        obj52 = obj63;
                        obj53 = obj64;
                        obj54 = obj65;
                        int i11 = width;
                        obj55 = obj56;
                        i5 = i11;
                        int i12 = height;
                        i4 = height;
                        str32 = str33;
                        arrayList7.add((-Collections.binarySearch(arrayList7, pVar7)) - 1, new p(i10, i12, hVar, mVar5.d, mVar5.e));
                        int i13 = hVar.d;
                        if (i13 != -1) {
                            mVar5.c = i13;
                        }
                    } else {
                        obj46 = obj57;
                        str30 = str35;
                        pVar5 = pVar8;
                        lVar3 = lVar6;
                        pVar6 = pVar9;
                        i4 = height;
                        str31 = str36;
                        str32 = str33;
                        j3 = j4;
                        obj47 = obj58;
                        obj48 = obj59;
                        obj49 = obj60;
                        obj50 = obj61;
                        obj51 = obj62;
                        obj52 = obj63;
                        obj53 = obj64;
                        obj54 = obj65;
                        hashSet8 = hashSet14;
                        hashSet9 = hashSet13;
                        int i14 = width;
                        obj55 = obj56;
                        i5 = i14;
                        lVar4 = lVar5;
                        arrayList7 = arrayList11;
                        if (next instanceof f) {
                            next.d(hashSet9);
                        } else if (next instanceof j) {
                            next.d(hashSet10);
                        } else if (next instanceof k) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            ArrayList arrayList12 = arrayList2;
                            arrayList12.add((k) next);
                            arrayList2 = arrayList12;
                        } else {
                            next.f(hashMap5);
                            next.d(hashSet8);
                        }
                    }
                    hashSet11 = hashSet8;
                    arrayList10 = arrayList7;
                    hashSet13 = hashSet9;
                    str33 = str32;
                    lVar5 = lVar4;
                    pVar9 = pVar6;
                    pVar8 = pVar5;
                    lVar6 = lVar3;
                    str35 = str30;
                    j4 = j3;
                    obj58 = obj47;
                    obj59 = obj48;
                    obj60 = obj49;
                    obj61 = obj50;
                    obj62 = obj51;
                    obj63 = obj52;
                    obj64 = obj53;
                    obj65 = obj54;
                    str36 = str31;
                    height = i4;
                    obj57 = obj46;
                    Object obj66 = obj55;
                    width = i5;
                    obj56 = obj66;
                }
                obj = obj56;
                obj2 = obj57;
                str = str35;
                pVar = pVar8;
                lVar = lVar5;
                lVar2 = lVar6;
                pVar2 = pVar9;
                arrayList = arrayList10;
                hashSet = hashSet11;
                str2 = str36;
                str3 = str33;
                j = j4;
                obj3 = obj58;
                obj4 = obj59;
                obj5 = obj60;
                obj6 = obj61;
                obj7 = obj62;
                obj8 = obj63;
                obj9 = obj64;
                obj10 = obj65;
                hashSet2 = hashSet13;
            } else {
                obj = obj56;
                obj2 = obj57;
                str = "progress";
                pVar = pVar8;
                lVar = lVar5;
                lVar2 = lVar6;
                pVar2 = pVar9;
                arrayList = arrayList10;
                hashSet = hashSet11;
                str2 = "translationZ";
                str3 = "alpha";
                j = j4;
                obj3 = obj58;
                obj4 = obj59;
                obj5 = obj60;
                obj6 = obj61;
                obj7 = obj62;
                obj8 = obj63;
                obj9 = obj64;
                obj10 = obj65;
                hashSet2 = hashSet13;
                arrayList2 = null;
            }
            ArrayList arrayList13 = arrayList2;
            if (arrayList13 != null) {
                mVar5.v = (k[]) arrayList13.toArray(new k[0]);
            }
            String str37 = ",";
            String str38 = "waveOffset";
            String str39 = "CUSTOM,";
            if (hashSet.isEmpty()) {
                hashSet3 = hashSet;
                arrayList3 = arrayList;
                hashSet4 = hashSet2;
                str4 = "waveOffset";
                str5 = str;
                obj11 = obj2;
                obj12 = obj7;
                obj13 = obj8;
            } else {
                mVar5.t = new HashMap<>();
                Iterator<String> it8 = hashSet.iterator();
                while (it8.hasNext()) {
                    String next2 = it8.next();
                    if (next2.startsWith("CUSTOM,")) {
                        SparseArray sparseArray = new SparseArray();
                        it6 = it8;
                        String str40 = next2.split(",")[1];
                        Iterator<d> it9 = arrayList9.iterator();
                        while (it9.hasNext()) {
                            HashSet<String> hashSet15 = hashSet2;
                            d next3 = it9.next();
                            HashSet<String> hashSet16 = hashSet;
                            HashMap<String, androidx.constraintlayout.widget.a> hashMap6 = next3.c;
                            if (hashMap6 != null && (aVar3 = hashMap6.get(str40)) != null) {
                                sparseArray.append(next3.a, aVar3);
                            }
                            hashSet2 = hashSet15;
                            hashSet = hashSet16;
                        }
                        hashSet6 = hashSet;
                        hashSet7 = hashSet2;
                        c.b bVar4 = new c.b(next2, sparseArray);
                        arrayList6 = arrayList;
                        str27 = str38;
                        str28 = str;
                        obj41 = obj7;
                        obj42 = obj8;
                        str29 = str2;
                        bVar3 = bVar4;
                        obj39 = obj2;
                    } else {
                        hashSet6 = hashSet;
                        it6 = it8;
                        hashSet7 = hashSet2;
                        switch (next2.hashCode()) {
                            case -1249320806:
                                arrayList6 = arrayList;
                                str27 = str38;
                                str28 = str;
                                obj39 = obj2;
                                obj40 = obj3;
                                obj41 = obj7;
                                obj42 = obj8;
                                str29 = str2;
                                if (next2.equals(obj40)) {
                                    c13 = 0;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case -1249320805:
                                arrayList6 = arrayList;
                                str27 = str38;
                                str28 = str;
                                obj39 = obj2;
                                obj43 = obj4;
                                obj41 = obj7;
                                obj42 = obj8;
                                str29 = str2;
                                if (next2.equals(obj43)) {
                                    c13 = 1;
                                    obj4 = obj43;
                                    obj40 = obj3;
                                    break;
                                }
                                obj4 = obj43;
                                obj40 = obj3;
                                c13 = 65535;
                                break;
                            case -1225497657:
                                arrayList6 = arrayList;
                                str27 = str38;
                                str28 = str;
                                obj39 = obj2;
                                obj41 = obj7;
                                obj42 = obj8;
                                Object obj67 = obj9;
                                str29 = str2;
                                if (next2.equals(obj67)) {
                                    c13 = 2;
                                    obj9 = obj67;
                                    obj40 = obj3;
                                    break;
                                } else {
                                    obj9 = obj67;
                                    obj40 = obj3;
                                    c13 = 65535;
                                    break;
                                }
                            case -1225497656:
                                arrayList6 = arrayList;
                                str27 = str38;
                                str28 = str;
                                obj39 = obj2;
                                obj41 = obj7;
                                obj42 = obj8;
                                str29 = str2;
                                if (next2.equals(obj10)) {
                                    c13 = 3;
                                    obj40 = obj3;
                                    break;
                                }
                                obj40 = obj3;
                                c13 = 65535;
                                break;
                            case -1225497655:
                                str27 = str38;
                                str28 = str;
                                obj39 = obj2;
                                obj41 = obj7;
                                obj42 = obj8;
                                str29 = str2;
                                if (next2.equals(str29)) {
                                    c13 = 4;
                                    arrayList6 = arrayList;
                                    obj40 = obj3;
                                    break;
                                } else {
                                    arrayList6 = arrayList;
                                    obj40 = obj3;
                                    c13 = 65535;
                                    break;
                                }
                            case -1001078227:
                                str28 = str;
                                obj39 = obj2;
                                obj41 = obj7;
                                obj42 = obj8;
                                if (next2.equals(str28)) {
                                    c13 = 5;
                                    arrayList6 = arrayList;
                                    str27 = str38;
                                    obj40 = obj3;
                                    str29 = str2;
                                    break;
                                } else {
                                    arrayList6 = arrayList;
                                    str27 = str38;
                                    obj40 = obj3;
                                    str29 = str2;
                                    c13 = 65535;
                                    break;
                                }
                            case -908189618:
                                obj39 = obj2;
                                obj44 = obj5;
                                obj41 = obj7;
                                obj42 = obj8;
                                if (next2.equals(obj41)) {
                                    c13 = 6;
                                    arrayList6 = arrayList;
                                    obj5 = obj44;
                                    str27 = str38;
                                    str28 = str;
                                    obj40 = obj3;
                                    str29 = str2;
                                    break;
                                }
                                arrayList6 = arrayList;
                                obj5 = obj44;
                                str27 = str38;
                                str28 = str;
                                obj43 = obj4;
                                str29 = str2;
                                obj4 = obj43;
                                obj40 = obj3;
                                c13 = 65535;
                                break;
                            case -908189617:
                                obj39 = obj2;
                                obj44 = obj5;
                                Object obj68 = obj6;
                                obj42 = obj8;
                                if (next2.equals(obj42)) {
                                    c13 = 7;
                                    obj6 = obj68;
                                    arrayList6 = arrayList;
                                    obj5 = obj44;
                                    str27 = str38;
                                    str28 = str;
                                    obj40 = obj3;
                                    obj41 = obj7;
                                    str29 = str2;
                                    break;
                                } else {
                                    obj6 = obj68;
                                    obj41 = obj7;
                                    arrayList6 = arrayList;
                                    obj5 = obj44;
                                    str27 = str38;
                                    str28 = str;
                                    obj43 = obj4;
                                    str29 = str2;
                                    obj4 = obj43;
                                    obj40 = obj3;
                                    c13 = 65535;
                                    break;
                                }
                            case -797520672:
                                obj39 = obj2;
                                obj44 = obj5;
                                obj45 = obj6;
                                if (next2.equals("waveVariesBy")) {
                                    c14 = '\b';
                                    obj6 = obj45;
                                    arrayList6 = arrayList;
                                    obj5 = obj44;
                                    c13 = c14;
                                    str27 = str38;
                                    str28 = str;
                                    obj40 = obj3;
                                    obj41 = obj7;
                                    obj42 = obj8;
                                    str29 = str2;
                                    break;
                                }
                                obj6 = obj45;
                                obj41 = obj7;
                                obj42 = obj8;
                                arrayList6 = arrayList;
                                obj5 = obj44;
                                str27 = str38;
                                str28 = str;
                                obj43 = obj4;
                                str29 = str2;
                                obj4 = obj43;
                                obj40 = obj3;
                                c13 = 65535;
                                break;
                            case -760884510:
                                obj39 = obj2;
                                obj44 = obj5;
                                obj45 = obj6;
                                if (next2.equals(obj44)) {
                                    c14 = '\t';
                                    obj6 = obj45;
                                    arrayList6 = arrayList;
                                    obj5 = obj44;
                                    c13 = c14;
                                    str27 = str38;
                                    str28 = str;
                                    obj40 = obj3;
                                    obj41 = obj7;
                                    obj42 = obj8;
                                    str29 = str2;
                                    break;
                                }
                                obj6 = obj45;
                                obj41 = obj7;
                                obj42 = obj8;
                                arrayList6 = arrayList;
                                obj5 = obj44;
                                str27 = str38;
                                str28 = str;
                                obj43 = obj4;
                                str29 = str2;
                                obj4 = obj43;
                                obj40 = obj3;
                                c13 = 65535;
                                break;
                            case -760884509:
                                obj39 = obj2;
                                obj45 = obj6;
                                if (next2.equals(obj45)) {
                                    c15 = '\n';
                                    c14 = c15;
                                    obj44 = obj5;
                                    obj6 = obj45;
                                    arrayList6 = arrayList;
                                    obj5 = obj44;
                                    c13 = c14;
                                    str27 = str38;
                                    str28 = str;
                                    obj40 = obj3;
                                    obj41 = obj7;
                                    obj42 = obj8;
                                    str29 = str2;
                                    break;
                                } else {
                                    obj44 = obj5;
                                    obj6 = obj45;
                                    obj41 = obj7;
                                    obj42 = obj8;
                                    arrayList6 = arrayList;
                                    obj5 = obj44;
                                    str27 = str38;
                                    str28 = str;
                                    obj43 = obj4;
                                    str29 = str2;
                                    obj4 = obj43;
                                    obj40 = obj3;
                                    c13 = 65535;
                                    break;
                                }
                            case -40300674:
                                obj39 = obj2;
                                if (next2.equals(obj39)) {
                                    c15 = 11;
                                    obj45 = obj6;
                                    c14 = c15;
                                    obj44 = obj5;
                                    obj6 = obj45;
                                    arrayList6 = arrayList;
                                    obj5 = obj44;
                                    c13 = c14;
                                    str27 = str38;
                                    str28 = str;
                                    obj40 = obj3;
                                    obj41 = obj7;
                                    obj42 = obj8;
                                    str29 = str2;
                                    break;
                                } else {
                                    arrayList6 = arrayList;
                                    str27 = str38;
                                    str28 = str;
                                    obj40 = obj3;
                                    obj41 = obj7;
                                    obj42 = obj8;
                                    str29 = str2;
                                    c13 = 65535;
                                    break;
                                }
                            case -4379043:
                                if (next2.equals(obj)) {
                                    c16 = '\f';
                                    c15 = c16;
                                    obj39 = obj2;
                                    obj45 = obj6;
                                    c14 = c15;
                                    obj44 = obj5;
                                    obj6 = obj45;
                                    arrayList6 = arrayList;
                                    obj5 = obj44;
                                    c13 = c14;
                                    str27 = str38;
                                    str28 = str;
                                    obj40 = obj3;
                                    obj41 = obj7;
                                    obj42 = obj8;
                                    str29 = str2;
                                    break;
                                }
                                arrayList6 = arrayList;
                                str27 = str38;
                                str28 = str;
                                obj39 = obj2;
                                obj40 = obj3;
                                obj41 = obj7;
                                obj42 = obj8;
                                str29 = str2;
                                c13 = 65535;
                                break;
                            case 37232917:
                                if (next2.equals("transitionPathRotate")) {
                                    c16 = '\r';
                                    c15 = c16;
                                    obj39 = obj2;
                                    obj45 = obj6;
                                    c14 = c15;
                                    obj44 = obj5;
                                    obj6 = obj45;
                                    arrayList6 = arrayList;
                                    obj5 = obj44;
                                    c13 = c14;
                                    str27 = str38;
                                    str28 = str;
                                    obj40 = obj3;
                                    obj41 = obj7;
                                    obj42 = obj8;
                                    str29 = str2;
                                    break;
                                }
                                arrayList6 = arrayList;
                                str27 = str38;
                                str28 = str;
                                obj39 = obj2;
                                obj40 = obj3;
                                obj41 = obj7;
                                obj42 = obj8;
                                str29 = str2;
                                c13 = 65535;
                                break;
                            case 92909918:
                                if (next2.equals(str3)) {
                                    c16 = 14;
                                    c15 = c16;
                                    obj39 = obj2;
                                    obj45 = obj6;
                                    c14 = c15;
                                    obj44 = obj5;
                                    obj6 = obj45;
                                    arrayList6 = arrayList;
                                    obj5 = obj44;
                                    c13 = c14;
                                    str27 = str38;
                                    str28 = str;
                                    obj40 = obj3;
                                    obj41 = obj7;
                                    obj42 = obj8;
                                    str29 = str2;
                                    break;
                                }
                                arrayList6 = arrayList;
                                str27 = str38;
                                str28 = str;
                                obj39 = obj2;
                                obj40 = obj3;
                                obj41 = obj7;
                                obj42 = obj8;
                                str29 = str2;
                                c13 = 65535;
                                break;
                            case 156108012:
                                if (next2.equals(str38)) {
                                    c16 = 15;
                                    c15 = c16;
                                    obj39 = obj2;
                                    obj45 = obj6;
                                    c14 = c15;
                                    obj44 = obj5;
                                    obj6 = obj45;
                                    arrayList6 = arrayList;
                                    obj5 = obj44;
                                    c13 = c14;
                                    str27 = str38;
                                    str28 = str;
                                    obj40 = obj3;
                                    obj41 = obj7;
                                    obj42 = obj8;
                                    str29 = str2;
                                    break;
                                }
                                arrayList6 = arrayList;
                                str27 = str38;
                                str28 = str;
                                obj39 = obj2;
                                obj40 = obj3;
                                obj41 = obj7;
                                obj42 = obj8;
                                str29 = str2;
                                c13 = 65535;
                                break;
                            default:
                                arrayList6 = arrayList;
                                str27 = str38;
                                str28 = str;
                                obj39 = obj2;
                                obj40 = obj3;
                                obj41 = obj7;
                                obj42 = obj8;
                                str29 = str2;
                                c13 = 65535;
                                break;
                        }
                        switch (c13) {
                            case 0:
                                iVar = new c.i();
                                break;
                            case 1:
                                iVar = new c.j();
                                break;
                            case 2:
                                iVar = new c.m();
                                break;
                            case 3:
                                iVar = new c.n();
                                break;
                            case 4:
                                iVar = new c.o();
                                break;
                            case 5:
                                iVar = new c.g();
                                break;
                            case 6:
                                iVar = new c.k();
                                break;
                            case 7:
                                iVar = new c.l();
                                break;
                            case '\b':
                                iVar = new c.a();
                                break;
                            case '\t':
                                iVar = new c.e();
                                break;
                            case '\n':
                                iVar = new c.f();
                                break;
                            case 11:
                                iVar = new c.h();
                                break;
                            case '\f':
                                iVar = new c.C0815c();
                                break;
                            case '\r':
                                iVar = new c.d();
                                break;
                            case 14:
                                iVar = new c.a();
                                break;
                            case 15:
                                iVar = new c.a();
                                break;
                            default:
                                iVar = null;
                                break;
                        }
                        obj3 = obj40;
                        bVar3 = iVar;
                    }
                    if (bVar3 == null) {
                        str2 = str29;
                    } else {
                        bVar3.e = next2;
                        str2 = str29;
                        mVar5.t.put(next2, bVar3);
                    }
                    obj2 = obj39;
                    obj7 = obj41;
                    str = str28;
                    obj8 = obj42;
                    str38 = str27;
                    hashSet2 = hashSet7;
                    arrayList = arrayList6;
                    hashSet = hashSet6;
                    it8 = it6;
                }
                hashSet3 = hashSet;
                arrayList3 = arrayList;
                hashSet4 = hashSet2;
                str4 = str38;
                str5 = str;
                obj11 = obj2;
                obj12 = obj7;
                obj13 = obj8;
                if (arrayList9 != null) {
                    Iterator<d> it10 = arrayList9.iterator();
                    while (it10.hasNext()) {
                        d next4 = it10.next();
                        if (next4 instanceof e) {
                            next4.a(mVar5.t);
                        }
                    }
                }
                lVar.a(mVar5.t, 0);
                lVar2.a(mVar5.t, 100);
                Iterator<String> it11 = mVar5.t.keySet().iterator();
                while (it11.hasNext()) {
                    String next5 = it11.next();
                    int intValue = (!hashMap5.containsKey(next5) || (num = hashMap5.get(next5)) == null) ? 0 : num.intValue();
                    Iterator<String> it12 = it11;
                    com.amazon.aps.iva.w2.c cVar2 = mVar5.t.get(next5);
                    if (cVar2 != null) {
                        cVar2.c(intValue);
                    }
                    it11 = it12;
                }
            }
            String str41 = "CUSTOM";
            if (hashSet10.isEmpty()) {
                arrayList4 = arrayList9;
                mVar = mVar5;
                str6 = "CUSTOM";
                str7 = "CUSTOM,";
                obj14 = obj9;
                obj15 = obj10;
                str8 = str2;
            } else {
                if (mVar5.s == null) {
                    mVar5.s = new HashMap<>();
                }
                Iterator<String> it13 = hashSet10.iterator();
                while (it13.hasNext()) {
                    String next6 = it13.next();
                    if (!mVar5.s.containsKey(next6)) {
                        if (next6.startsWith(str39)) {
                            SparseArray sparseArray2 = new SparseArray();
                            it5 = it13;
                            String str42 = next6.split(str37)[1];
                            Iterator<d> it14 = arrayList9.iterator();
                            while (it14.hasNext()) {
                                String str43 = str37;
                                d next7 = it14.next();
                                String str44 = str39;
                                HashMap<String, androidx.constraintlayout.widget.a> hashMap7 = next7.c;
                                if (hashMap7 != null && (aVar2 = hashMap7.get(str42)) != null) {
                                    sparseArray2.append(next7.a, aVar2);
                                }
                                str39 = str44;
                                str37 = str43;
                            }
                            str24 = str37;
                            str25 = str39;
                            hashMap4 = hashMap5;
                            bVar2 = new d.b(next6, sparseArray2);
                            j2 = j;
                            obj38 = obj10;
                            str26 = str2;
                        } else {
                            it5 = it13;
                            str24 = str37;
                            str25 = str39;
                            switch (next6.hashCode()) {
                                case -1249320806:
                                    hashMap4 = hashMap5;
                                    obj35 = obj3;
                                    obj36 = obj4;
                                    obj37 = obj9;
                                    obj38 = obj10;
                                    str26 = str2;
                                    if (next6.equals(obj35)) {
                                        c9 = 0;
                                        break;
                                    }
                                    c9 = 65535;
                                    break;
                                case -1249320805:
                                    obj36 = obj4;
                                    obj37 = obj9;
                                    obj38 = obj10;
                                    str26 = str2;
                                    if (next6.equals(obj36)) {
                                        c9 = 1;
                                        hashMap4 = hashMap5;
                                        obj35 = obj3;
                                        break;
                                    }
                                    hashMap4 = hashMap5;
                                    obj35 = obj3;
                                    c9 = 65535;
                                    break;
                                case -1225497657:
                                    obj37 = obj9;
                                    obj38 = obj10;
                                    str26 = str2;
                                    if (next6.equals(obj37)) {
                                        hashMap4 = hashMap5;
                                        c9 = 2;
                                        obj35 = obj3;
                                        obj36 = obj4;
                                        break;
                                    } else {
                                        obj36 = obj4;
                                        hashMap4 = hashMap5;
                                        obj35 = obj3;
                                        c9 = 65535;
                                        break;
                                    }
                                case -1225497656:
                                    obj38 = obj10;
                                    str26 = str2;
                                    if (next6.equals(obj38)) {
                                        c10 = 3;
                                        hashMap4 = hashMap5;
                                        c9 = c10;
                                        obj35 = obj3;
                                        obj36 = obj4;
                                        obj37 = obj9;
                                        break;
                                    } else {
                                        hashMap4 = hashMap5;
                                        obj35 = obj3;
                                        obj36 = obj4;
                                        obj37 = obj9;
                                        c9 = 65535;
                                        break;
                                    }
                                case -1225497655:
                                    str26 = str2;
                                    if (next6.equals(str26)) {
                                        hashMap4 = hashMap5;
                                        c9 = 4;
                                        obj35 = obj3;
                                        obj36 = obj4;
                                        obj37 = obj9;
                                        obj38 = obj10;
                                        break;
                                    } else {
                                        hashMap4 = hashMap5;
                                        obj35 = obj3;
                                        obj36 = obj4;
                                        obj37 = obj9;
                                        obj38 = obj10;
                                        c9 = 65535;
                                        break;
                                    }
                                case -1001078227:
                                    if (next6.equals(str5)) {
                                        c11 = 5;
                                        c10 = c11;
                                        obj38 = obj10;
                                        str26 = str2;
                                        hashMap4 = hashMap5;
                                        c9 = c10;
                                        obj35 = obj3;
                                        obj36 = obj4;
                                        obj37 = obj9;
                                        break;
                                    }
                                    hashMap4 = hashMap5;
                                    obj35 = obj3;
                                    obj36 = obj4;
                                    obj37 = obj9;
                                    obj38 = obj10;
                                    str26 = str2;
                                    c9 = 65535;
                                    break;
                                case -908189618:
                                    if (next6.equals(obj12)) {
                                        c12 = 6;
                                        hashMap4 = hashMap5;
                                        c9 = c12;
                                        obj35 = obj3;
                                        obj36 = obj4;
                                        obj37 = obj9;
                                        obj38 = obj10;
                                        str26 = str2;
                                        break;
                                    }
                                    hashMap4 = hashMap5;
                                    obj35 = obj3;
                                    obj36 = obj4;
                                    obj37 = obj9;
                                    obj38 = obj10;
                                    str26 = str2;
                                    c9 = 65535;
                                    break;
                                case -908189617:
                                    if (next6.equals(obj13)) {
                                        c12 = 7;
                                        hashMap4 = hashMap5;
                                        c9 = c12;
                                        obj35 = obj3;
                                        obj36 = obj4;
                                        obj37 = obj9;
                                        obj38 = obj10;
                                        str26 = str2;
                                        break;
                                    }
                                    hashMap4 = hashMap5;
                                    obj35 = obj3;
                                    obj36 = obj4;
                                    obj37 = obj9;
                                    obj38 = obj10;
                                    str26 = str2;
                                    c9 = 65535;
                                    break;
                                case -40300674:
                                    if (next6.equals(obj11)) {
                                        c11 = '\b';
                                        c10 = c11;
                                        obj38 = obj10;
                                        str26 = str2;
                                        hashMap4 = hashMap5;
                                        c9 = c10;
                                        obj35 = obj3;
                                        obj36 = obj4;
                                        obj37 = obj9;
                                        break;
                                    }
                                    hashMap4 = hashMap5;
                                    obj35 = obj3;
                                    obj36 = obj4;
                                    obj37 = obj9;
                                    obj38 = obj10;
                                    str26 = str2;
                                    c9 = 65535;
                                    break;
                                case -4379043:
                                    if (next6.equals(obj)) {
                                        c11 = '\t';
                                        c10 = c11;
                                        obj38 = obj10;
                                        str26 = str2;
                                        hashMap4 = hashMap5;
                                        c9 = c10;
                                        obj35 = obj3;
                                        obj36 = obj4;
                                        obj37 = obj9;
                                        break;
                                    }
                                    hashMap4 = hashMap5;
                                    obj35 = obj3;
                                    obj36 = obj4;
                                    obj37 = obj9;
                                    obj38 = obj10;
                                    str26 = str2;
                                    c9 = 65535;
                                    break;
                                case 37232917:
                                    if (next6.equals("transitionPathRotate")) {
                                        c11 = '\n';
                                        c10 = c11;
                                        obj38 = obj10;
                                        str26 = str2;
                                        hashMap4 = hashMap5;
                                        c9 = c10;
                                        obj35 = obj3;
                                        obj36 = obj4;
                                        obj37 = obj9;
                                        break;
                                    }
                                    hashMap4 = hashMap5;
                                    obj35 = obj3;
                                    obj36 = obj4;
                                    obj37 = obj9;
                                    obj38 = obj10;
                                    str26 = str2;
                                    c9 = 65535;
                                    break;
                                case 92909918:
                                    if (next6.equals(str3)) {
                                        c11 = 11;
                                        c10 = c11;
                                        obj38 = obj10;
                                        str26 = str2;
                                        hashMap4 = hashMap5;
                                        c9 = c10;
                                        obj35 = obj3;
                                        obj36 = obj4;
                                        obj37 = obj9;
                                        break;
                                    }
                                    hashMap4 = hashMap5;
                                    obj35 = obj3;
                                    obj36 = obj4;
                                    obj37 = obj9;
                                    obj38 = obj10;
                                    str26 = str2;
                                    c9 = 65535;
                                    break;
                                default:
                                    hashMap4 = hashMap5;
                                    obj35 = obj3;
                                    obj36 = obj4;
                                    obj37 = obj9;
                                    obj38 = obj10;
                                    str26 = str2;
                                    c9 = 65535;
                                    break;
                            }
                            switch (c9) {
                                case 0:
                                    gVar2 = new d.g();
                                    obj3 = obj35;
                                    obj9 = obj37;
                                    obj4 = obj36;
                                    bVar2 = gVar2;
                                    j2 = j;
                                    bVar2.i = j2;
                                    break;
                                case 1:
                                    gVar2 = new d.h();
                                    obj3 = obj35;
                                    obj9 = obj37;
                                    obj4 = obj36;
                                    bVar2 = gVar2;
                                    j2 = j;
                                    bVar2.i = j2;
                                    break;
                                case 2:
                                    gVar2 = new d.k();
                                    obj3 = obj35;
                                    obj9 = obj37;
                                    obj4 = obj36;
                                    bVar2 = gVar2;
                                    j2 = j;
                                    bVar2.i = j2;
                                    break;
                                case 3:
                                    gVar2 = new d.l();
                                    obj3 = obj35;
                                    obj9 = obj37;
                                    obj4 = obj36;
                                    bVar2 = gVar2;
                                    j2 = j;
                                    bVar2.i = j2;
                                    break;
                                case 4:
                                    gVar2 = new d.m();
                                    obj3 = obj35;
                                    obj9 = obj37;
                                    obj4 = obj36;
                                    bVar2 = gVar2;
                                    j2 = j;
                                    bVar2.i = j2;
                                    break;
                                case 5:
                                    gVar2 = new d.e();
                                    obj3 = obj35;
                                    obj9 = obj37;
                                    obj4 = obj36;
                                    bVar2 = gVar2;
                                    j2 = j;
                                    bVar2.i = j2;
                                    break;
                                case 6:
                                    gVar2 = new d.i();
                                    obj3 = obj35;
                                    obj9 = obj37;
                                    obj4 = obj36;
                                    bVar2 = gVar2;
                                    j2 = j;
                                    bVar2.i = j2;
                                    break;
                                case 7:
                                    gVar2 = new d.j();
                                    obj3 = obj35;
                                    obj9 = obj37;
                                    obj4 = obj36;
                                    bVar2 = gVar2;
                                    j2 = j;
                                    bVar2.i = j2;
                                    break;
                                case '\b':
                                    gVar2 = new d.f();
                                    obj3 = obj35;
                                    obj9 = obj37;
                                    obj4 = obj36;
                                    bVar2 = gVar2;
                                    j2 = j;
                                    bVar2.i = j2;
                                    break;
                                case '\t':
                                    gVar2 = new d.c();
                                    obj3 = obj35;
                                    obj9 = obj37;
                                    obj4 = obj36;
                                    bVar2 = gVar2;
                                    j2 = j;
                                    bVar2.i = j2;
                                    break;
                                case '\n':
                                    gVar2 = new d.C0816d();
                                    obj3 = obj35;
                                    obj9 = obj37;
                                    obj4 = obj36;
                                    bVar2 = gVar2;
                                    j2 = j;
                                    bVar2.i = j2;
                                    break;
                                case 11:
                                    gVar2 = new d.a();
                                    obj3 = obj35;
                                    obj9 = obj37;
                                    obj4 = obj36;
                                    bVar2 = gVar2;
                                    j2 = j;
                                    bVar2.i = j2;
                                    break;
                                default:
                                    obj3 = obj35;
                                    obj9 = obj37;
                                    obj4 = obj36;
                                    j2 = j;
                                    bVar2 = null;
                                    break;
                            }
                        }
                        if (bVar2 == null) {
                            j = j2;
                        } else {
                            bVar2.f = next6;
                            j = j2;
                            mVar5.s.put(next6, bVar2);
                        }
                        str2 = str26;
                        obj10 = obj38;
                        str39 = str25;
                        str37 = str24;
                        hashMap5 = hashMap4;
                        it13 = it5;
                    }
                }
                HashMap<String, Integer> hashMap8 = hashMap5;
                str7 = str39;
                obj15 = obj10;
                str8 = str2;
                if (arrayList9 != null) {
                    Iterator<d> it15 = arrayList9.iterator();
                    while (it15.hasNext()) {
                        d next8 = it15.next();
                        if (next8 instanceof j) {
                            j jVar3 = (j) next8;
                            HashMap<String, com.amazon.aps.iva.w2.d> hashMap9 = mVar5.s;
                            jVar3.getClass();
                            Iterator<String> it16 = hashMap9.keySet().iterator();
                            while (it16.hasNext()) {
                                Iterator<d> it17 = it15;
                                String next9 = it16.next();
                                com.amazon.aps.iva.w2.d dVar = hashMap9.get(next9);
                                if (dVar == null) {
                                    arrayList5 = arrayList9;
                                    jVar = jVar3;
                                    mVar4 = mVar5;
                                    str23 = str41;
                                    hashMap3 = hashMap9;
                                    it4 = it16;
                                } else {
                                    if (next9.startsWith(str41)) {
                                        hashMap3 = hashMap9;
                                        androidx.constraintlayout.widget.a aVar4 = jVar3.c.get(next9.substring(7));
                                        if (aVar4 != null) {
                                            d.b bVar5 = (d.b) dVar;
                                            it4 = it16;
                                            int i15 = jVar3.a;
                                            str23 = str41;
                                            float f4 = jVar3.r;
                                            arrayList5 = arrayList9;
                                            int i16 = jVar3.q;
                                            mVar4 = mVar5;
                                            float f5 = jVar3.s;
                                            jVar2 = jVar3;
                                            bVar5.l.append(i15, aVar4);
                                            bVar5.m.append(i15, new float[]{f4, f5});
                                            bVar5.b = Math.max(bVar5.b, i16);
                                            it15 = it17;
                                        } else {
                                            arrayList5 = arrayList9;
                                            mVar4 = mVar5;
                                            str23 = str41;
                                            it4 = it16;
                                            jVar = jVar3;
                                        }
                                    } else {
                                        arrayList5 = arrayList9;
                                        jVar2 = jVar3;
                                        mVar4 = mVar5;
                                        str23 = str41;
                                        hashMap3 = hashMap9;
                                        it4 = it16;
                                        switch (next9.hashCode()) {
                                            case -1249320806:
                                                obj33 = obj3;
                                                obj34 = obj4;
                                                obj32 = obj9;
                                                if (next9.equals(obj33)) {
                                                    c8 = 0;
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case -1249320805:
                                                obj34 = obj4;
                                                obj32 = obj9;
                                                if (next9.equals(obj34)) {
                                                    c8 = 1;
                                                    obj33 = obj3;
                                                    break;
                                                } else {
                                                    obj33 = obj3;
                                                    c8 = 65535;
                                                    break;
                                                }
                                            case -1225497657:
                                                obj32 = obj9;
                                                if (next9.equals(obj32)) {
                                                    c8 = 2;
                                                    obj33 = obj3;
                                                    obj34 = obj4;
                                                    break;
                                                }
                                                obj33 = obj3;
                                                obj34 = obj4;
                                                c8 = 65535;
                                                break;
                                            case -1225497656:
                                                if (next9.equals(obj15)) {
                                                    c8 = 3;
                                                    obj33 = obj3;
                                                    obj34 = obj4;
                                                    obj32 = obj9;
                                                    break;
                                                }
                                                obj32 = obj9;
                                                obj33 = obj3;
                                                obj34 = obj4;
                                                c8 = 65535;
                                                break;
                                            case -1225497655:
                                                if (next9.equals(str8)) {
                                                    c8 = 4;
                                                    obj33 = obj3;
                                                    obj34 = obj4;
                                                    obj32 = obj9;
                                                    break;
                                                }
                                                obj32 = obj9;
                                                obj33 = obj3;
                                                obj34 = obj4;
                                                c8 = 65535;
                                                break;
                                            case -1001078227:
                                                if (next9.equals(str5)) {
                                                    c8 = 5;
                                                    obj33 = obj3;
                                                    obj34 = obj4;
                                                    obj32 = obj9;
                                                    break;
                                                }
                                                obj32 = obj9;
                                                obj33 = obj3;
                                                obj34 = obj4;
                                                c8 = 65535;
                                                break;
                                            case -908189618:
                                                if (next9.equals(obj12)) {
                                                    c8 = 6;
                                                    obj33 = obj3;
                                                    obj34 = obj4;
                                                    obj32 = obj9;
                                                    break;
                                                }
                                                obj33 = obj3;
                                                obj34 = obj4;
                                                obj32 = obj9;
                                                c8 = 65535;
                                                break;
                                            case -908189617:
                                                if (next9.equals(obj13)) {
                                                    c8 = 7;
                                                    obj33 = obj3;
                                                    obj34 = obj4;
                                                    obj32 = obj9;
                                                    break;
                                                }
                                                obj33 = obj3;
                                                obj34 = obj4;
                                                obj32 = obj9;
                                                c8 = 65535;
                                                break;
                                            case -40300674:
                                                if (next9.equals(obj11)) {
                                                    c8 = '\b';
                                                    obj33 = obj3;
                                                    obj34 = obj4;
                                                    obj32 = obj9;
                                                    break;
                                                }
                                                obj33 = obj3;
                                                obj34 = obj4;
                                                obj32 = obj9;
                                                c8 = 65535;
                                                break;
                                            case -4379043:
                                                if (next9.equals(obj)) {
                                                    c8 = '\t';
                                                    obj33 = obj3;
                                                    obj34 = obj4;
                                                    obj32 = obj9;
                                                    break;
                                                }
                                                obj33 = obj3;
                                                obj34 = obj4;
                                                obj32 = obj9;
                                                c8 = 65535;
                                                break;
                                            case 37232917:
                                                if (next9.equals("transitionPathRotate")) {
                                                    c8 = '\n';
                                                    obj33 = obj3;
                                                    obj34 = obj4;
                                                    obj32 = obj9;
                                                    break;
                                                }
                                                obj33 = obj3;
                                                obj34 = obj4;
                                                obj32 = obj9;
                                                c8 = 65535;
                                                break;
                                            case 92909918:
                                                if (next9.equals(str3)) {
                                                    c8 = 11;
                                                    obj33 = obj3;
                                                    obj34 = obj4;
                                                    obj32 = obj9;
                                                    break;
                                                }
                                                obj33 = obj3;
                                                obj34 = obj4;
                                                obj32 = obj9;
                                                c8 = 65535;
                                                break;
                                            default:
                                                obj33 = obj3;
                                                obj34 = obj4;
                                                obj32 = obj9;
                                                c8 = 65535;
                                                break;
                                        }
                                        switch (c8) {
                                            case 0:
                                                obj4 = obj34;
                                                obj3 = obj33;
                                                jVar = jVar2;
                                                if (!Float.isNaN(jVar.h)) {
                                                    dVar.b(jVar.h, jVar.r, jVar.s, jVar.a, jVar.q);
                                                }
                                                jVar3 = jVar;
                                                obj9 = obj32;
                                                hashMap9 = hashMap3;
                                                it16 = it4;
                                                str41 = str23;
                                                arrayList9 = arrayList5;
                                                mVar5 = mVar4;
                                                it15 = it17;
                                            case 1:
                                                obj4 = obj34;
                                                obj3 = obj33;
                                                jVar = jVar2;
                                                if (!Float.isNaN(jVar.i)) {
                                                    dVar.b(jVar.i, jVar.r, jVar.s, jVar.a, jVar.q);
                                                }
                                                jVar3 = jVar;
                                                obj9 = obj32;
                                                hashMap9 = hashMap3;
                                                it16 = it4;
                                                str41 = str23;
                                                arrayList9 = arrayList5;
                                                mVar5 = mVar4;
                                                it15 = it17;
                                            case 2:
                                                obj4 = obj34;
                                                obj3 = obj33;
                                                jVar = jVar2;
                                                if (!Float.isNaN(jVar.m)) {
                                                    dVar.b(jVar.m, jVar.r, jVar.s, jVar.a, jVar.q);
                                                }
                                                jVar3 = jVar;
                                                obj9 = obj32;
                                                hashMap9 = hashMap3;
                                                it16 = it4;
                                                str41 = str23;
                                                arrayList9 = arrayList5;
                                                mVar5 = mVar4;
                                                it15 = it17;
                                            case 3:
                                                obj4 = obj34;
                                                obj3 = obj33;
                                                jVar = jVar2;
                                                if (!Float.isNaN(jVar.n)) {
                                                    dVar.b(jVar.n, jVar.r, jVar.s, jVar.a, jVar.q);
                                                }
                                                jVar3 = jVar;
                                                obj9 = obj32;
                                                hashMap9 = hashMap3;
                                                it16 = it4;
                                                str41 = str23;
                                                arrayList9 = arrayList5;
                                                mVar5 = mVar4;
                                                it15 = it17;
                                            case 4:
                                                obj4 = obj34;
                                                obj3 = obj33;
                                                jVar = jVar2;
                                                if (!Float.isNaN(jVar.o)) {
                                                    dVar.b(jVar.o, jVar.r, jVar.s, jVar.a, jVar.q);
                                                }
                                                jVar3 = jVar;
                                                obj9 = obj32;
                                                hashMap9 = hashMap3;
                                                it16 = it4;
                                                str41 = str23;
                                                arrayList9 = arrayList5;
                                                mVar5 = mVar4;
                                                it15 = it17;
                                            case 5:
                                                obj4 = obj34;
                                                obj3 = obj33;
                                                jVar = jVar2;
                                                if (!Float.isNaN(jVar.p)) {
                                                    dVar.b(jVar.p, jVar.r, jVar.s, jVar.a, jVar.q);
                                                }
                                                jVar3 = jVar;
                                                obj9 = obj32;
                                                hashMap9 = hashMap3;
                                                it16 = it4;
                                                str41 = str23;
                                                arrayList9 = arrayList5;
                                                mVar5 = mVar4;
                                                it15 = it17;
                                            case 6:
                                                obj4 = obj34;
                                                obj3 = obj33;
                                                jVar = jVar2;
                                                if (!Float.isNaN(jVar.k)) {
                                                    dVar.b(jVar.k, jVar.r, jVar.s, jVar.a, jVar.q);
                                                }
                                                jVar3 = jVar;
                                                obj9 = obj32;
                                                hashMap9 = hashMap3;
                                                it16 = it4;
                                                str41 = str23;
                                                arrayList9 = arrayList5;
                                                mVar5 = mVar4;
                                                it15 = it17;
                                            case 7:
                                                obj4 = obj34;
                                                obj3 = obj33;
                                                jVar = jVar2;
                                                if (!Float.isNaN(jVar.l)) {
                                                    dVar.b(jVar.l, jVar.r, jVar.s, jVar.a, jVar.q);
                                                }
                                                jVar3 = jVar;
                                                obj9 = obj32;
                                                hashMap9 = hashMap3;
                                                it16 = it4;
                                                str41 = str23;
                                                arrayList9 = arrayList5;
                                                mVar5 = mVar4;
                                                it15 = it17;
                                            case '\b':
                                                obj4 = obj34;
                                                obj3 = obj33;
                                                jVar = jVar2;
                                                if (!Float.isNaN(jVar.g)) {
                                                    dVar.b(jVar.g, jVar.r, jVar.s, jVar.a, jVar.q);
                                                }
                                                jVar3 = jVar;
                                                obj9 = obj32;
                                                hashMap9 = hashMap3;
                                                it16 = it4;
                                                str41 = str23;
                                                arrayList9 = arrayList5;
                                                mVar5 = mVar4;
                                                it15 = it17;
                                            case '\t':
                                                obj4 = obj34;
                                                obj3 = obj33;
                                                jVar = jVar2;
                                                if (!Float.isNaN(jVar.f)) {
                                                    dVar.b(jVar.f, jVar.r, jVar.s, jVar.a, jVar.q);
                                                }
                                                jVar3 = jVar;
                                                obj9 = obj32;
                                                hashMap9 = hashMap3;
                                                it16 = it4;
                                                str41 = str23;
                                                arrayList9 = arrayList5;
                                                mVar5 = mVar4;
                                                it15 = it17;
                                            case '\n':
                                                obj4 = obj34;
                                                obj3 = obj33;
                                                jVar = jVar2;
                                                if (!Float.isNaN(jVar.j)) {
                                                    dVar.b(jVar.j, jVar.r, jVar.s, jVar.a, jVar.q);
                                                }
                                                jVar3 = jVar;
                                                obj9 = obj32;
                                                hashMap9 = hashMap3;
                                                it16 = it4;
                                                str41 = str23;
                                                arrayList9 = arrayList5;
                                                mVar5 = mVar4;
                                                it15 = it17;
                                            case 11:
                                                jVar = jVar2;
                                                if (Float.isNaN(jVar.e)) {
                                                    obj4 = obj34;
                                                    obj3 = obj33;
                                                } else {
                                                    obj3 = obj33;
                                                    obj4 = obj34;
                                                    dVar.b(jVar.e, jVar.r, jVar.s, jVar.a, jVar.q);
                                                }
                                                jVar3 = jVar;
                                                obj9 = obj32;
                                                hashMap9 = hashMap3;
                                                it16 = it4;
                                                str41 = str23;
                                                arrayList9 = arrayList5;
                                                mVar5 = mVar4;
                                                it15 = it17;
                                            default:
                                                it15 = it17;
                                                obj9 = obj32;
                                                obj4 = obj34;
                                                obj3 = obj33;
                                                break;
                                        }
                                    }
                                    hashMap9 = hashMap3;
                                    it16 = it4;
                                    str41 = str23;
                                    arrayList9 = arrayList5;
                                    mVar5 = mVar4;
                                    jVar3 = jVar2;
                                }
                                obj32 = obj9;
                                jVar3 = jVar;
                                obj9 = obj32;
                                hashMap9 = hashMap3;
                                it16 = it4;
                                str41 = str23;
                                arrayList9 = arrayList5;
                                mVar5 = mVar4;
                                it15 = it17;
                            }
                        }
                        it15 = it15;
                        obj9 = obj9;
                        str41 = str41;
                        arrayList9 = arrayList9;
                        mVar5 = mVar5;
                    }
                }
                arrayList4 = arrayList9;
                str6 = str41;
                obj14 = obj9;
                mVar = mVar5;
                for (String str45 : mVar.s.keySet()) {
                    HashMap<String, Integer> hashMap10 = hashMap8;
                    mVar.s.get(str45).c(hashMap10.containsKey(str45) ? hashMap10.get(str45).intValue() : 0);
                    hashMap8 = hashMap10;
                }
            }
            int size = arrayList3.size() + 2;
            p[] pVarArr = new p[size];
            pVarArr[0] = pVar;
            pVarArr[size - 1] = pVar2;
            if (arrayList3.size() > 0 && mVar.c == -1) {
                mVar.c = 0;
            }
            Iterator<p> it18 = arrayList3.iterator();
            int i17 = 1;
            while (it18.hasNext()) {
                pVarArr[i17] = it18.next();
                i17++;
            }
            HashSet hashSet17 = new HashSet();
            Iterator<String> it19 = pVar2.l.keySet().iterator();
            while (it19.hasNext()) {
                String next10 = it19.next();
                Object obj69 = obj14;
                Iterator<String> it20 = it19;
                p pVar10 = pVar;
                if (pVar10.l.containsKey(next10)) {
                    pVar = pVar10;
                    hashSet5 = hashSet3;
                    if (!hashSet5.contains(str7 + next10)) {
                        hashSet17.add(next10);
                    }
                } else {
                    pVar = pVar10;
                    hashSet5 = hashSet3;
                }
                hashSet3 = hashSet5;
                obj14 = obj69;
                it19 = it20;
            }
            Object obj70 = obj14;
            String[] strArr = (String[]) hashSet17.toArray(new String[0]);
            mVar.n = strArr;
            mVar.o = new int[strArr.length];
            int i18 = 0;
            while (true) {
                String[] strArr2 = mVar.n;
                if (i18 < strArr2.length) {
                    String str46 = strArr2[i18];
                    mVar.o[i18] = 0;
                    int i19 = 0;
                    while (true) {
                        if (i19 >= size) {
                            break;
                        } else if (!pVarArr[i19].l.containsKey(str46) || (aVar = pVarArr[i19].l.get(str46)) == null) {
                            i19++;
                        } else {
                            int[] iArr2 = mVar.o;
                            iArr2[i18] = aVar.c() + iArr2[i18];
                        }
                    }
                    i18++;
                } else {
                    boolean z = pVarArr[0].j != -1;
                    int length = strArr2.length + 18;
                    boolean[] zArr = new boolean[length];
                    int i20 = 1;
                    while (i20 < size) {
                        Object obj71 = obj15;
                        p pVar11 = pVarArr[i20];
                        String str47 = str8;
                        p pVar12 = pVarArr[i20 - 1];
                        String str48 = str5;
                        Object obj72 = obj12;
                        boolean a2 = p.a(pVar11.e, pVar12.e);
                        boolean a3 = p.a(pVar11.f, pVar12.f);
                        zArr[0] = p.a(pVar11.d, pVar12.d) | zArr[0];
                        boolean z2 = a2 | a3 | z;
                        zArr[1] = zArr[1] | z2;
                        zArr[2] = z2 | zArr[2];
                        zArr[3] = zArr[3] | p.a(pVar11.g, pVar12.g);
                        zArr[4] = zArr[4] | p.a(pVar11.h, pVar12.h);
                        i20++;
                        obj = obj;
                        str5 = str48;
                        obj11 = obj11;
                        obj12 = obj72;
                        obj13 = obj13;
                        obj15 = obj71;
                        str8 = str47;
                    }
                    Object obj73 = obj11;
                    Object obj74 = obj12;
                    String str49 = str8;
                    String str50 = str5;
                    Object obj75 = obj;
                    Object obj76 = obj15;
                    Object obj77 = obj13;
                    int i21 = 0;
                    for (int i22 = 1; i22 < length; i22++) {
                        if (zArr[i22]) {
                            i21++;
                        }
                    }
                    mVar.k = new int[i21];
                    int max = Math.max(2, i21);
                    mVar.l = new double[max];
                    mVar.m = new double[max];
                    int i23 = 0;
                    for (int i24 = 1; i24 < length; i24++) {
                        if (zArr[i24]) {
                            mVar.k[i23] = i24;
                            i23++;
                        }
                    }
                    double[][] dArr3 = (double[][]) Array.newInstance(Double.TYPE, size, mVar.k.length);
                    double[] dArr4 = new double[size];
                    for (int i25 = 0; i25 < size; i25++) {
                        p pVar13 = pVarArr[i25];
                        double[] dArr5 = dArr3[i25];
                        int[] iArr3 = mVar.k;
                        float[] fArr3 = {pVar13.d, pVar13.e, pVar13.f, pVar13.g, pVar13.h, pVar13.i};
                        int i26 = 0;
                        int i27 = 0;
                        while (i26 < iArr3.length) {
                            if (iArr3[i26] < 6) {
                                iArr = iArr3;
                                fArr2 = fArr3;
                                dArr5[i27] = fArr3[i3];
                                i27++;
                            } else {
                                iArr = iArr3;
                                fArr2 = fArr3;
                            }
                            i26++;
                            iArr3 = iArr;
                            fArr3 = fArr2;
                        }
                        dArr4[i25] = pVarArr[i25].c;
                    }
                    int i28 = 0;
                    while (true) {
                        int[] iArr4 = mVar.k;
                        if (i28 < iArr4.length) {
                            if (iArr4[i28] < 6) {
                                String c17 = defpackage.b.c(new StringBuilder(), p.o[mVar.k[i28]], " [");
                                for (int i29 = 0; i29 < size; i29++) {
                                    StringBuilder b = defpackage.c.b(c17);
                                    b.append(dArr3[i29][i28]);
                                    c17 = b.toString();
                                }
                            }
                            i28++;
                        } else {
                            mVar.h = new com.amazon.aps.iva.t2.b[mVar.n.length + 1];
                            int i30 = 0;
                            while (true) {
                                String[] strArr3 = mVar.n;
                                if (i30 < strArr3.length) {
                                    String str51 = strArr3[i30];
                                    int i31 = 0;
                                    int i32 = 0;
                                    double[] dArr6 = null;
                                    double[][] dArr7 = null;
                                    while (i31 < size) {
                                        if (pVarArr[i31].l.containsKey(str51)) {
                                            if (dArr7 == null) {
                                                dArr6 = new double[size];
                                                androidx.constraintlayout.widget.a aVar5 = pVarArr[i31].l.get(str51);
                                                dArr7 = (double[][]) Array.newInstance(Double.TYPE, size, aVar5 == null ? 0 : aVar5.c());
                                            }
                                            p pVar14 = pVarArr[i31];
                                            dArr6[i32] = pVar14.c;
                                            double[] dArr8 = dArr7[i32];
                                            androidx.constraintlayout.widget.a aVar6 = pVar14.l.get(str51);
                                            if (aVar6 == null) {
                                                str21 = str51;
                                                dArr2 = dArr6;
                                                str22 = str3;
                                                dArr = dArr7;
                                            } else {
                                                str21 = str51;
                                                if (aVar6.c() == 1) {
                                                    dArr = dArr7;
                                                    dArr8[0] = aVar6.a();
                                                } else {
                                                    dArr = dArr7;
                                                    int c18 = aVar6.c();
                                                    aVar6.b(new float[c18]);
                                                    int i33 = 0;
                                                    int i34 = 0;
                                                    while (i33 < c18) {
                                                        dArr8[i34] = fArr[i33];
                                                        i33++;
                                                        i34++;
                                                        c18 = c18;
                                                        str3 = str3;
                                                        dArr6 = dArr6;
                                                    }
                                                }
                                                dArr2 = dArr6;
                                                str22 = str3;
                                            }
                                            i32++;
                                            dArr7 = dArr;
                                            dArr6 = dArr2;
                                        } else {
                                            str21 = str51;
                                            str22 = str3;
                                        }
                                        i31++;
                                        str51 = str21;
                                        str3 = str22;
                                    }
                                    i30++;
                                    mVar.h[i30] = com.amazon.aps.iva.t2.b.a(mVar.c, Arrays.copyOf(dArr6, i32), (double[][]) Arrays.copyOf(dArr7, i32));
                                } else {
                                    String str52 = str3;
                                    mVar.h[0] = com.amazon.aps.iva.t2.b.a(mVar.c, dArr4, dArr3);
                                    if (pVarArr[0].j != -1) {
                                        int[] iArr5 = new int[size];
                                        double[] dArr9 = new double[size];
                                        double[][] dArr10 = (double[][]) Array.newInstance(Double.TYPE, size, 2);
                                        for (int i35 = 0; i35 < size; i35++) {
                                            iArr5[i35] = pVarArr[i35].j;
                                            dArr9[i35] = pVar4.c;
                                            double[] dArr11 = dArr10[i35];
                                            dArr11[0] = pVar4.e;
                                            dArr11[1] = pVar4.f;
                                        }
                                        mVar.i = new com.amazon.aps.iva.t2.a(iArr5, dArr9, dArr10);
                                    }
                                    mVar.u = new HashMap<>();
                                    if (arrayList4 != null) {
                                        Iterator<String> it21 = hashSet4.iterator();
                                        float f6 = Float.NaN;
                                        while (it21.hasNext()) {
                                            String next11 = it21.next();
                                            String str53 = str6;
                                            if (next11.startsWith(str53)) {
                                                it3 = it21;
                                                c0814b = new b.C0814b();
                                                obj24 = obj75;
                                                str16 = str4;
                                                str17 = str52;
                                                str18 = str50;
                                                obj25 = obj73;
                                                obj27 = obj74;
                                                obj28 = obj77;
                                                obj29 = obj70;
                                                obj30 = obj76;
                                                str19 = str49;
                                            } else {
                                                switch (next11.hashCode()) {
                                                    case -1249320806:
                                                        it3 = it21;
                                                        obj24 = obj75;
                                                        str16 = str4;
                                                        str17 = str52;
                                                        str18 = str50;
                                                        obj25 = obj73;
                                                        obj26 = obj3;
                                                        obj27 = obj74;
                                                        obj28 = obj77;
                                                        obj29 = obj70;
                                                        obj30 = obj76;
                                                        str19 = str49;
                                                        if (next11.equals(obj26)) {
                                                            c4 = 0;
                                                            break;
                                                        }
                                                        c4 = 65535;
                                                        break;
                                                    case -1249320805:
                                                        it3 = it21;
                                                        obj24 = obj75;
                                                        str16 = str4;
                                                        str17 = str52;
                                                        str18 = str50;
                                                        obj25 = obj73;
                                                        Object obj78 = obj4;
                                                        obj27 = obj74;
                                                        obj28 = obj77;
                                                        obj29 = obj70;
                                                        obj30 = obj76;
                                                        str19 = str49;
                                                        if (next11.equals(obj78)) {
                                                            c4 = 1;
                                                            obj4 = obj78;
                                                            obj26 = obj3;
                                                            break;
                                                        } else {
                                                            obj4 = obj78;
                                                            obj26 = obj3;
                                                            c4 = 65535;
                                                            break;
                                                        }
                                                    case -1225497657:
                                                        obj24 = obj75;
                                                        str16 = str4;
                                                        str17 = str52;
                                                        str18 = str50;
                                                        obj25 = obj73;
                                                        obj27 = obj74;
                                                        obj28 = obj77;
                                                        obj29 = obj70;
                                                        obj30 = obj76;
                                                        str19 = str49;
                                                        if (next11.equals(obj29)) {
                                                            c4 = 2;
                                                            it3 = it21;
                                                            obj26 = obj3;
                                                            break;
                                                        }
                                                        it3 = it21;
                                                        obj26 = obj3;
                                                        c4 = 65535;
                                                        break;
                                                    case -1225497656:
                                                        obj24 = obj75;
                                                        str16 = str4;
                                                        str17 = str52;
                                                        str18 = str50;
                                                        obj25 = obj73;
                                                        obj27 = obj74;
                                                        obj28 = obj77;
                                                        obj30 = obj76;
                                                        str19 = str49;
                                                        if (next11.equals(obj30)) {
                                                            c5 = 3;
                                                            it3 = it21;
                                                            c4 = c5;
                                                            obj26 = obj3;
                                                            obj29 = obj70;
                                                            break;
                                                        } else {
                                                            obj29 = obj70;
                                                            it3 = it21;
                                                            obj26 = obj3;
                                                            c4 = 65535;
                                                            break;
                                                        }
                                                    case -1225497655:
                                                        obj24 = obj75;
                                                        str16 = str4;
                                                        str17 = str52;
                                                        str18 = str50;
                                                        obj25 = obj73;
                                                        obj27 = obj74;
                                                        obj28 = obj77;
                                                        str19 = str49;
                                                        if (next11.equals(str19)) {
                                                            c5 = 4;
                                                            obj30 = obj76;
                                                            it3 = it21;
                                                            c4 = c5;
                                                            obj26 = obj3;
                                                            obj29 = obj70;
                                                            break;
                                                        } else {
                                                            it3 = it21;
                                                            obj26 = obj3;
                                                            obj29 = obj70;
                                                            obj30 = obj76;
                                                            c4 = 65535;
                                                            break;
                                                        }
                                                    case -1001078227:
                                                        obj24 = obj75;
                                                        str16 = str4;
                                                        str17 = str52;
                                                        str18 = str50;
                                                        obj25 = obj73;
                                                        obj27 = obj74;
                                                        obj28 = obj77;
                                                        if (next11.equals(str18)) {
                                                            c5 = 5;
                                                            obj30 = obj76;
                                                            str19 = str49;
                                                            it3 = it21;
                                                            c4 = c5;
                                                            obj26 = obj3;
                                                            obj29 = obj70;
                                                            break;
                                                        }
                                                        it3 = it21;
                                                        obj26 = obj3;
                                                        obj29 = obj70;
                                                        obj30 = obj76;
                                                        str19 = str49;
                                                        c4 = 65535;
                                                        break;
                                                    case -908189618:
                                                        obj24 = obj75;
                                                        str16 = str4;
                                                        str17 = str52;
                                                        obj25 = obj73;
                                                        obj27 = obj74;
                                                        obj28 = obj77;
                                                        if (next11.equals(obj27)) {
                                                            c5 = 6;
                                                            str18 = str50;
                                                            obj30 = obj76;
                                                            str19 = str49;
                                                            it3 = it21;
                                                            c4 = c5;
                                                            obj26 = obj3;
                                                            obj29 = obj70;
                                                            break;
                                                        }
                                                        str18 = str50;
                                                        it3 = it21;
                                                        obj26 = obj3;
                                                        obj29 = obj70;
                                                        obj30 = obj76;
                                                        str19 = str49;
                                                        c4 = 65535;
                                                        break;
                                                    case -908189617:
                                                        obj24 = obj75;
                                                        str16 = str4;
                                                        str17 = str52;
                                                        obj25 = obj73;
                                                        obj28 = obj77;
                                                        if (next11.equals(obj28)) {
                                                            c5 = 7;
                                                            str18 = str50;
                                                            obj27 = obj74;
                                                            obj30 = obj76;
                                                            str19 = str49;
                                                            it3 = it21;
                                                            c4 = c5;
                                                            obj26 = obj3;
                                                            obj29 = obj70;
                                                            break;
                                                        }
                                                        obj27 = obj74;
                                                        str18 = str50;
                                                        it3 = it21;
                                                        obj26 = obj3;
                                                        obj29 = obj70;
                                                        obj30 = obj76;
                                                        str19 = str49;
                                                        c4 = 65535;
                                                        break;
                                                    case -797520672:
                                                        obj24 = obj75;
                                                        str16 = str4;
                                                        str17 = str52;
                                                        obj25 = obj73;
                                                        if (next11.equals("waveVariesBy")) {
                                                            c6 = '\b';
                                                            it3 = it21;
                                                            c4 = c6;
                                                            str18 = str50;
                                                            obj26 = obj3;
                                                            obj27 = obj74;
                                                            obj28 = obj77;
                                                            obj29 = obj70;
                                                            obj30 = obj76;
                                                            str19 = str49;
                                                            break;
                                                        }
                                                        obj28 = obj77;
                                                        obj27 = obj74;
                                                        str18 = str50;
                                                        it3 = it21;
                                                        obj26 = obj3;
                                                        obj29 = obj70;
                                                        obj30 = obj76;
                                                        str19 = str49;
                                                        c4 = 65535;
                                                        break;
                                                    case -40300674:
                                                        obj24 = obj75;
                                                        str16 = str4;
                                                        str17 = str52;
                                                        obj25 = obj73;
                                                        if (next11.equals(obj25)) {
                                                            c6 = '\t';
                                                            it3 = it21;
                                                            c4 = c6;
                                                            str18 = str50;
                                                            obj26 = obj3;
                                                            obj27 = obj74;
                                                            obj28 = obj77;
                                                            obj29 = obj70;
                                                            obj30 = obj76;
                                                            str19 = str49;
                                                            break;
                                                        }
                                                        obj28 = obj77;
                                                        obj27 = obj74;
                                                        str18 = str50;
                                                        it3 = it21;
                                                        obj26 = obj3;
                                                        obj29 = obj70;
                                                        obj30 = obj76;
                                                        str19 = str49;
                                                        c4 = 65535;
                                                        break;
                                                    case -4379043:
                                                        obj24 = obj75;
                                                        str16 = str4;
                                                        str17 = str52;
                                                        if (next11.equals(obj24)) {
                                                            c5 = '\n';
                                                            str18 = str50;
                                                            obj25 = obj73;
                                                            obj27 = obj74;
                                                            obj28 = obj77;
                                                            obj30 = obj76;
                                                            str19 = str49;
                                                            it3 = it21;
                                                            c4 = c5;
                                                            obj26 = obj3;
                                                            obj29 = obj70;
                                                            break;
                                                        } else {
                                                            obj25 = obj73;
                                                            obj28 = obj77;
                                                            obj27 = obj74;
                                                            str18 = str50;
                                                            it3 = it21;
                                                            obj26 = obj3;
                                                            obj29 = obj70;
                                                            obj30 = obj76;
                                                            str19 = str49;
                                                            c4 = 65535;
                                                            break;
                                                        }
                                                    case 37232917:
                                                        str16 = str4;
                                                        str17 = str52;
                                                        if (next11.equals("transitionPathRotate")) {
                                                            c7 = 11;
                                                            it3 = it21;
                                                            str18 = str50;
                                                            obj25 = obj73;
                                                            obj26 = obj3;
                                                            obj27 = obj74;
                                                            obj28 = obj77;
                                                            obj29 = obj70;
                                                            obj30 = obj76;
                                                            str19 = str49;
                                                            Object obj79 = obj75;
                                                            c4 = c7;
                                                            obj24 = obj79;
                                                            break;
                                                        }
                                                        it3 = it21;
                                                        obj24 = obj75;
                                                        str18 = str50;
                                                        obj25 = obj73;
                                                        obj26 = obj3;
                                                        obj27 = obj74;
                                                        obj28 = obj77;
                                                        obj29 = obj70;
                                                        obj30 = obj76;
                                                        str19 = str49;
                                                        c4 = 65535;
                                                        break;
                                                    case 92909918:
                                                        str16 = str4;
                                                        str17 = str52;
                                                        if (next11.equals(str17)) {
                                                            c7 = '\f';
                                                            it3 = it21;
                                                            str18 = str50;
                                                            obj25 = obj73;
                                                            obj26 = obj3;
                                                            obj27 = obj74;
                                                            obj28 = obj77;
                                                            obj29 = obj70;
                                                            obj30 = obj76;
                                                            str19 = str49;
                                                            Object obj792 = obj75;
                                                            c4 = c7;
                                                            obj24 = obj792;
                                                            break;
                                                        }
                                                        it3 = it21;
                                                        obj24 = obj75;
                                                        str18 = str50;
                                                        obj25 = obj73;
                                                        obj26 = obj3;
                                                        obj27 = obj74;
                                                        obj28 = obj77;
                                                        obj29 = obj70;
                                                        obj30 = obj76;
                                                        str19 = str49;
                                                        c4 = 65535;
                                                        break;
                                                    case 156108012:
                                                        str16 = str4;
                                                        if (next11.equals(str16)) {
                                                            obj24 = obj75;
                                                            str17 = str52;
                                                            str18 = str50;
                                                            obj25 = obj73;
                                                            obj27 = obj74;
                                                            obj28 = obj77;
                                                            obj30 = obj76;
                                                            str19 = str49;
                                                            c5 = '\r';
                                                            it3 = it21;
                                                            c4 = c5;
                                                            obj26 = obj3;
                                                            obj29 = obj70;
                                                            break;
                                                        } else {
                                                            it3 = it21;
                                                            obj24 = obj75;
                                                            str17 = str52;
                                                            str18 = str50;
                                                            obj25 = obj73;
                                                            obj26 = obj3;
                                                            obj27 = obj74;
                                                            obj28 = obj77;
                                                            obj29 = obj70;
                                                            obj30 = obj76;
                                                            str19 = str49;
                                                            c4 = 65535;
                                                            break;
                                                        }
                                                    default:
                                                        it3 = it21;
                                                        obj24 = obj75;
                                                        str16 = str4;
                                                        str17 = str52;
                                                        str18 = str50;
                                                        obj25 = obj73;
                                                        obj26 = obj3;
                                                        obj27 = obj74;
                                                        obj28 = obj77;
                                                        obj29 = obj70;
                                                        obj30 = obj76;
                                                        str19 = str49;
                                                        c4 = 65535;
                                                        break;
                                                }
                                                switch (c4) {
                                                    case 0:
                                                        gVar = new b.g();
                                                        break;
                                                    case 1:
                                                        gVar = new b.h();
                                                        break;
                                                    case 2:
                                                        gVar = new b.k();
                                                        break;
                                                    case 3:
                                                        gVar = new b.l();
                                                        break;
                                                    case 4:
                                                        gVar = new b.m();
                                                        break;
                                                    case 5:
                                                        gVar = new b.e();
                                                        break;
                                                    case 6:
                                                        gVar = new b.i();
                                                        break;
                                                    case 7:
                                                        gVar = new b.j();
                                                        break;
                                                    case '\b':
                                                        gVar = new b.a();
                                                        break;
                                                    case '\t':
                                                        gVar = new b.f();
                                                        break;
                                                    case '\n':
                                                        gVar = new b.c();
                                                        break;
                                                    case 11:
                                                        gVar = new b.d();
                                                        break;
                                                    case '\f':
                                                        gVar = new b.a();
                                                        break;
                                                    case '\r':
                                                        gVar = new b.a();
                                                        break;
                                                    default:
                                                        gVar = null;
                                                        break;
                                                }
                                                obj3 = obj26;
                                                c0814b = gVar;
                                            }
                                            if (c0814b == null) {
                                                it21 = it3;
                                                str6 = str53;
                                                str4 = str16;
                                                str52 = str17;
                                                obj75 = obj24;
                                                obj73 = obj25;
                                                obj77 = obj28;
                                                obj74 = obj27;
                                                str50 = str18;
                                                str49 = str19;
                                                obj76 = obj30;
                                                obj70 = obj29;
                                            } else {
                                                obj70 = obj29;
                                                obj76 = obj30;
                                                if ((c0814b.e == 1) && Float.isNaN(f6)) {
                                                    float[] fArr4 = new float[2];
                                                    float f7 = 1.0f / 99;
                                                    double d2 = 0.0d;
                                                    int i36 = 0;
                                                    str50 = str18;
                                                    float f8 = 0.0f;
                                                    double d3 = 0.0d;
                                                    str20 = str19;
                                                    int i37 = 100;
                                                    while (i36 < i37) {
                                                        float f9 = i36 * f7;
                                                        Object obj80 = obj28;
                                                        Object obj81 = obj27;
                                                        double d4 = f9;
                                                        p pVar15 = pVar;
                                                        com.amazon.aps.iva.t2.c cVar3 = pVar15.b;
                                                        Iterator<p> it22 = arrayList3.iterator();
                                                        float f10 = Float.NaN;
                                                        float f11 = 0.0f;
                                                        while (it22.hasNext()) {
                                                            p pVar16 = pVar15;
                                                            p next12 = it22.next();
                                                            float f12 = f7;
                                                            com.amazon.aps.iva.t2.c cVar4 = next12.b;
                                                            if (cVar4 != null) {
                                                                float f13 = next12.c;
                                                                if (f13 < f9) {
                                                                    f11 = f13;
                                                                    cVar3 = cVar4;
                                                                } else if (Float.isNaN(f10)) {
                                                                    f10 = next12.c;
                                                                }
                                                            }
                                                            f7 = f12;
                                                            pVar15 = pVar16;
                                                        }
                                                        p pVar17 = pVar15;
                                                        float f14 = f7;
                                                        if (cVar3 != null) {
                                                            if (Float.isNaN(f10)) {
                                                                f10 = 1.0f;
                                                            }
                                                            obj31 = obj25;
                                                            d = (((float) cVar3.a((f9 - f11) / f3)) * (f10 - f11)) + f11;
                                                        } else {
                                                            obj31 = obj25;
                                                            d = d4;
                                                        }
                                                        mVar.h[0].c(d, mVar.l);
                                                        mVar.d.b(d, mVar.k, mVar.l, fArr4, 0);
                                                        if (i36 > 0) {
                                                            double d5 = d2 - fArr4[1];
                                                            i2 = i36;
                                                            f8 = (float) (Math.hypot(d5, d3 - fArr4[0]) + f8);
                                                        } else {
                                                            i2 = i36;
                                                        }
                                                        double d6 = fArr4[1];
                                                        int i38 = i2 + 1;
                                                        d3 = fArr4[0];
                                                        d2 = d6;
                                                        i37 = 100;
                                                        f7 = f14;
                                                        pVar = pVar17;
                                                        obj25 = obj31;
                                                        obj28 = obj80;
                                                        i36 = i38;
                                                        obj27 = obj81;
                                                    }
                                                    obj73 = obj25;
                                                    obj77 = obj28;
                                                    obj74 = obj27;
                                                    pVar3 = pVar;
                                                    f6 = f8;
                                                } else {
                                                    obj73 = obj25;
                                                    obj77 = obj28;
                                                    obj74 = obj27;
                                                    str50 = str18;
                                                    str20 = str19;
                                                    pVar3 = pVar;
                                                }
                                                c0814b.b = next11;
                                                mVar.u.put(next11, c0814b);
                                                it21 = it3;
                                                str6 = str53;
                                                str4 = str16;
                                                str52 = str17;
                                                obj75 = obj24;
                                                str49 = str20;
                                                pVar = pVar3;
                                            }
                                        }
                                        Object obj82 = obj75;
                                        String str54 = str4;
                                        String str55 = str52;
                                        String str56 = str6;
                                        String str57 = str49;
                                        Iterator<d> it23 = arrayList4.iterator();
                                        while (it23.hasNext()) {
                                            d next13 = it23.next();
                                            if (next13 instanceof f) {
                                                f fVar2 = (f) next13;
                                                HashMap<String, com.amazon.aps.iva.w2.b> hashMap11 = mVar.u;
                                                fVar2.getClass();
                                                Iterator<String> it24 = hashMap11.keySet().iterator();
                                                while (it24.hasNext()) {
                                                    String next14 = it24.next();
                                                    if (next14.startsWith(str56)) {
                                                        androidx.constraintlayout.widget.a aVar7 = fVar2.c.get(next14.substring(7));
                                                        if (aVar7 != null) {
                                                            if (aVar7.c == a.b.FLOAT_TYPE && (bVar = hashMap11.get(next14)) != null) {
                                                                int i39 = fVar2.a;
                                                                int i40 = fVar2.e;
                                                                String str58 = fVar2.f;
                                                                int i41 = fVar2.k;
                                                                it = it23;
                                                                it2 = it24;
                                                                mVar3 = mVar;
                                                                hashMap = hashMap11;
                                                                str9 = str56;
                                                                bVar.f.add(new e.b(fVar2.g, fVar2.h, fVar2.i, aVar7.a(), i39));
                                                                if (i41 != -1) {
                                                                    bVar.e = i41;
                                                                }
                                                                bVar.c = i40;
                                                                bVar.b(aVar7);
                                                                bVar.d = str58;
                                                            } else {
                                                                it = it23;
                                                                mVar3 = mVar;
                                                                hashMap = hashMap11;
                                                                str9 = str56;
                                                                it2 = it24;
                                                            }
                                                            fVar = fVar2;
                                                            str10 = str55;
                                                            obj16 = obj82;
                                                            str11 = str57;
                                                            str12 = str9;
                                                            obj17 = obj3;
                                                            obj18 = obj4;
                                                            obj19 = obj70;
                                                            obj20 = obj76;
                                                            str13 = str34;
                                                            str14 = str54;
                                                            it23 = it;
                                                            obj76 = obj20;
                                                            obj70 = obj19;
                                                            obj4 = obj18;
                                                            obj3 = obj17;
                                                            str56 = str12;
                                                            mVar = mVar3;
                                                            str34 = str13;
                                                            hashMap11 = hashMap;
                                                            str54 = str14;
                                                            str55 = str10;
                                                            fVar2 = fVar;
                                                            obj82 = obj16;
                                                            str57 = str11;
                                                            it24 = it2;
                                                        }
                                                    } else {
                                                        it = it23;
                                                        mVar3 = mVar;
                                                        HashMap<String, com.amazon.aps.iva.w2.b> hashMap12 = hashMap11;
                                                        String str59 = str56;
                                                        it2 = it24;
                                                        switch (next14.hashCode()) {
                                                            case -1249320806:
                                                                str11 = str57;
                                                                str15 = str50;
                                                                obj21 = obj73;
                                                                obj17 = obj3;
                                                                obj18 = obj4;
                                                                obj22 = obj74;
                                                                obj23 = obj77;
                                                                obj19 = obj70;
                                                                obj20 = obj76;
                                                                if (next14.equals(obj17)) {
                                                                    c = 0;
                                                                    break;
                                                                }
                                                                c = 65535;
                                                                break;
                                                            case -1249320805:
                                                                str11 = str57;
                                                                str15 = str50;
                                                                obj21 = obj73;
                                                                obj18 = obj4;
                                                                obj22 = obj74;
                                                                obj23 = obj77;
                                                                obj19 = obj70;
                                                                obj20 = obj76;
                                                                if (next14.equals(obj18)) {
                                                                    c = 1;
                                                                    obj17 = obj3;
                                                                    break;
                                                                } else {
                                                                    obj17 = obj3;
                                                                    c = 65535;
                                                                    break;
                                                                }
                                                            case -1225497657:
                                                                str11 = str57;
                                                                str15 = str50;
                                                                obj21 = obj73;
                                                                obj22 = obj74;
                                                                obj23 = obj77;
                                                                obj19 = obj70;
                                                                obj20 = obj76;
                                                                if (next14.equals(obj19)) {
                                                                    c = 2;
                                                                    obj17 = obj3;
                                                                    obj18 = obj4;
                                                                    break;
                                                                } else {
                                                                    obj17 = obj3;
                                                                    obj18 = obj4;
                                                                    c = 65535;
                                                                    break;
                                                                }
                                                            case -1225497656:
                                                                str11 = str57;
                                                                str15 = str50;
                                                                obj21 = obj73;
                                                                obj22 = obj74;
                                                                obj23 = obj77;
                                                                obj20 = obj76;
                                                                if (next14.equals(obj20)) {
                                                                    c = 3;
                                                                    obj17 = obj3;
                                                                    obj18 = obj4;
                                                                    obj19 = obj70;
                                                                    break;
                                                                } else {
                                                                    obj17 = obj3;
                                                                    obj18 = obj4;
                                                                    obj19 = obj70;
                                                                    c = 65535;
                                                                    break;
                                                                }
                                                            case -1225497655:
                                                                str11 = str57;
                                                                str15 = str50;
                                                                obj21 = obj73;
                                                                obj22 = obj74;
                                                                obj23 = obj77;
                                                                if (next14.equals(str11)) {
                                                                    c = 4;
                                                                    obj17 = obj3;
                                                                    obj18 = obj4;
                                                                    obj19 = obj70;
                                                                    obj20 = obj76;
                                                                    break;
                                                                }
                                                                obj17 = obj3;
                                                                obj18 = obj4;
                                                                obj19 = obj70;
                                                                obj20 = obj76;
                                                                c = 65535;
                                                                break;
                                                            case -1001078227:
                                                                str15 = str50;
                                                                obj21 = obj73;
                                                                obj22 = obj74;
                                                                obj23 = obj77;
                                                                if (next14.equals(str15)) {
                                                                    c = 5;
                                                                    str11 = str57;
                                                                    obj17 = obj3;
                                                                    obj18 = obj4;
                                                                    obj19 = obj70;
                                                                    obj20 = obj76;
                                                                    break;
                                                                } else {
                                                                    str11 = str57;
                                                                    obj17 = obj3;
                                                                    obj18 = obj4;
                                                                    obj19 = obj70;
                                                                    obj20 = obj76;
                                                                    c = 65535;
                                                                    break;
                                                                }
                                                            case -908189618:
                                                                obj21 = obj73;
                                                                obj22 = obj74;
                                                                obj23 = obj77;
                                                                if (next14.equals(obj22)) {
                                                                    c = 6;
                                                                    str11 = str57;
                                                                    str15 = str50;
                                                                    obj17 = obj3;
                                                                    obj18 = obj4;
                                                                    obj19 = obj70;
                                                                    obj20 = obj76;
                                                                    break;
                                                                }
                                                                str11 = str57;
                                                                str15 = str50;
                                                                obj17 = obj3;
                                                                obj18 = obj4;
                                                                obj19 = obj70;
                                                                obj20 = obj76;
                                                                c = 65535;
                                                                break;
                                                            case -908189617:
                                                                obj21 = obj73;
                                                                obj23 = obj77;
                                                                if (next14.equals(obj23)) {
                                                                    c = 7;
                                                                    str11 = str57;
                                                                    str15 = str50;
                                                                    obj17 = obj3;
                                                                    obj18 = obj4;
                                                                    obj22 = obj74;
                                                                    obj19 = obj70;
                                                                    obj20 = obj76;
                                                                    break;
                                                                } else {
                                                                    obj22 = obj74;
                                                                    str11 = str57;
                                                                    str15 = str50;
                                                                    obj17 = obj3;
                                                                    obj18 = obj4;
                                                                    obj19 = obj70;
                                                                    obj20 = obj76;
                                                                    c = 65535;
                                                                    break;
                                                                }
                                                            case -40300674:
                                                                obj21 = obj73;
                                                                if (next14.equals(obj21)) {
                                                                    c2 = '\b';
                                                                    c = c2;
                                                                    str11 = str57;
                                                                    str15 = str50;
                                                                    obj17 = obj3;
                                                                    obj18 = obj4;
                                                                    obj22 = obj74;
                                                                    obj23 = obj77;
                                                                    obj19 = obj70;
                                                                    obj20 = obj76;
                                                                    break;
                                                                }
                                                                obj22 = obj74;
                                                                obj23 = obj77;
                                                                str11 = str57;
                                                                str15 = str50;
                                                                obj17 = obj3;
                                                                obj18 = obj4;
                                                                obj19 = obj70;
                                                                obj20 = obj76;
                                                                c = 65535;
                                                                break;
                                                            case -4379043:
                                                                if (next14.equals(obj82)) {
                                                                    c2 = '\t';
                                                                    obj21 = obj73;
                                                                    c = c2;
                                                                    str11 = str57;
                                                                    str15 = str50;
                                                                    obj17 = obj3;
                                                                    obj18 = obj4;
                                                                    obj22 = obj74;
                                                                    obj23 = obj77;
                                                                    obj19 = obj70;
                                                                    obj20 = obj76;
                                                                    break;
                                                                } else {
                                                                    obj21 = obj73;
                                                                    obj22 = obj74;
                                                                    obj23 = obj77;
                                                                    str11 = str57;
                                                                    str15 = str50;
                                                                    obj17 = obj3;
                                                                    obj18 = obj4;
                                                                    obj19 = obj70;
                                                                    obj20 = obj76;
                                                                    c = 65535;
                                                                    break;
                                                                }
                                                            case 37232917:
                                                                if (next14.equals(str34)) {
                                                                    c3 = '\n';
                                                                    c2 = c3;
                                                                    obj21 = obj73;
                                                                    c = c2;
                                                                    str11 = str57;
                                                                    str15 = str50;
                                                                    obj17 = obj3;
                                                                    obj18 = obj4;
                                                                    obj22 = obj74;
                                                                    obj23 = obj77;
                                                                    obj19 = obj70;
                                                                    obj20 = obj76;
                                                                    break;
                                                                }
                                                                str11 = str57;
                                                                str15 = str50;
                                                                obj21 = obj73;
                                                                obj17 = obj3;
                                                                obj18 = obj4;
                                                                obj22 = obj74;
                                                                obj23 = obj77;
                                                                obj19 = obj70;
                                                                obj20 = obj76;
                                                                c = 65535;
                                                                break;
                                                            case 92909918:
                                                                if (next14.equals(str55)) {
                                                                    c3 = 11;
                                                                    c2 = c3;
                                                                    obj21 = obj73;
                                                                    c = c2;
                                                                    str11 = str57;
                                                                    str15 = str50;
                                                                    obj17 = obj3;
                                                                    obj18 = obj4;
                                                                    obj22 = obj74;
                                                                    obj23 = obj77;
                                                                    obj19 = obj70;
                                                                    obj20 = obj76;
                                                                    break;
                                                                }
                                                                str11 = str57;
                                                                str15 = str50;
                                                                obj21 = obj73;
                                                                obj17 = obj3;
                                                                obj18 = obj4;
                                                                obj22 = obj74;
                                                                obj23 = obj77;
                                                                obj19 = obj70;
                                                                obj20 = obj76;
                                                                c = 65535;
                                                                break;
                                                            case 156108012:
                                                                if (next14.equals(str54)) {
                                                                    c3 = '\f';
                                                                    c2 = c3;
                                                                    obj21 = obj73;
                                                                    c = c2;
                                                                    str11 = str57;
                                                                    str15 = str50;
                                                                    obj17 = obj3;
                                                                    obj18 = obj4;
                                                                    obj22 = obj74;
                                                                    obj23 = obj77;
                                                                    obj19 = obj70;
                                                                    obj20 = obj76;
                                                                    break;
                                                                }
                                                                str11 = str57;
                                                                str15 = str50;
                                                                obj21 = obj73;
                                                                obj17 = obj3;
                                                                obj18 = obj4;
                                                                obj22 = obj74;
                                                                obj23 = obj77;
                                                                obj19 = obj70;
                                                                obj20 = obj76;
                                                                c = 65535;
                                                                break;
                                                            case 1530034690:
                                                                if (next14.equals("wavePhase")) {
                                                                    c3 = '\r';
                                                                    c2 = c3;
                                                                    obj21 = obj73;
                                                                    c = c2;
                                                                    str11 = str57;
                                                                    str15 = str50;
                                                                    obj17 = obj3;
                                                                    obj18 = obj4;
                                                                    obj22 = obj74;
                                                                    obj23 = obj77;
                                                                    obj19 = obj70;
                                                                    obj20 = obj76;
                                                                    break;
                                                                }
                                                                str11 = str57;
                                                                str15 = str50;
                                                                obj21 = obj73;
                                                                obj17 = obj3;
                                                                obj18 = obj4;
                                                                obj22 = obj74;
                                                                obj23 = obj77;
                                                                obj19 = obj70;
                                                                obj20 = obj76;
                                                                c = 65535;
                                                                break;
                                                            default:
                                                                str11 = str57;
                                                                str15 = str50;
                                                                obj21 = obj73;
                                                                obj17 = obj3;
                                                                obj18 = obj4;
                                                                obj22 = obj74;
                                                                obj23 = obj77;
                                                                obj19 = obj70;
                                                                obj20 = obj76;
                                                                c = 65535;
                                                                break;
                                                        }
                                                        switch (c) {
                                                            case 0:
                                                                f = fVar2.p;
                                                                f2 = f;
                                                                str12 = str59;
                                                                break;
                                                            case 1:
                                                                f = fVar2.q;
                                                                f2 = f;
                                                                str12 = str59;
                                                                break;
                                                            case 2:
                                                                f = fVar2.t;
                                                                f2 = f;
                                                                str12 = str59;
                                                                break;
                                                            case 3:
                                                                f = fVar2.u;
                                                                f2 = f;
                                                                str12 = str59;
                                                                break;
                                                            case 4:
                                                                f = fVar2.v;
                                                                f2 = f;
                                                                str12 = str59;
                                                                break;
                                                            case 5:
                                                                f = fVar2.j;
                                                                f2 = f;
                                                                str12 = str59;
                                                                break;
                                                            case 6:
                                                                f = fVar2.r;
                                                                f2 = f;
                                                                str12 = str59;
                                                                break;
                                                            case 7:
                                                                f = fVar2.s;
                                                                f2 = f;
                                                                str12 = str59;
                                                                break;
                                                            case '\b':
                                                                f = fVar2.n;
                                                                f2 = f;
                                                                str12 = str59;
                                                                break;
                                                            case '\t':
                                                                f = fVar2.m;
                                                                f2 = f;
                                                                str12 = str59;
                                                                break;
                                                            case '\n':
                                                                f = fVar2.o;
                                                                f2 = f;
                                                                str12 = str59;
                                                                break;
                                                            case 11:
                                                                f = fVar2.l;
                                                                f2 = f;
                                                                str12 = str59;
                                                                break;
                                                            case '\f':
                                                                f = fVar2.h;
                                                                f2 = f;
                                                                str12 = str59;
                                                                break;
                                                            case '\r':
                                                                f = fVar2.i;
                                                                f2 = f;
                                                                str12 = str59;
                                                                break;
                                                            default:
                                                                str12 = str59;
                                                                next14.startsWith(str12);
                                                                f2 = Float.NaN;
                                                                break;
                                                        }
                                                        if (Float.isNaN(f2)) {
                                                            obj73 = obj21;
                                                            hashMap2 = hashMap12;
                                                        } else {
                                                            obj73 = obj21;
                                                            hashMap2 = hashMap12;
                                                            com.amazon.aps.iva.w2.b bVar6 = hashMap2.get(next14);
                                                            if (bVar6 != null) {
                                                                hashMap = hashMap2;
                                                                int i42 = fVar2.a;
                                                                str13 = str34;
                                                                int i43 = fVar2.e;
                                                                obj77 = obj23;
                                                                String str60 = fVar2.f;
                                                                obj74 = obj22;
                                                                int i44 = fVar2.k;
                                                                str50 = str15;
                                                                str14 = str54;
                                                                str10 = str55;
                                                                fVar = fVar2;
                                                                obj16 = obj82;
                                                                bVar6.f.add(new e.b(fVar2.g, fVar2.h, fVar2.i, f2, i42));
                                                                if (i44 != -1) {
                                                                    bVar6.e = i44;
                                                                }
                                                                bVar6.c = i43;
                                                                bVar6.d = str60;
                                                                it23 = it;
                                                                obj76 = obj20;
                                                                obj70 = obj19;
                                                                obj4 = obj18;
                                                                obj3 = obj17;
                                                                str56 = str12;
                                                                mVar = mVar3;
                                                                str34 = str13;
                                                                hashMap11 = hashMap;
                                                                str54 = str14;
                                                                str55 = str10;
                                                                fVar2 = fVar;
                                                                obj82 = obj16;
                                                                str57 = str11;
                                                                it24 = it2;
                                                            }
                                                        }
                                                        obj77 = obj23;
                                                        obj74 = obj22;
                                                        str50 = str15;
                                                        str57 = str11;
                                                        obj76 = obj20;
                                                        obj70 = obj19;
                                                        obj4 = obj18;
                                                        obj3 = obj17;
                                                        str56 = str12;
                                                        it24 = it2;
                                                        mVar = mVar3;
                                                        hashMap11 = hashMap2;
                                                        it23 = it;
                                                    }
                                                }
                                            }
                                            it23 = it23;
                                            obj76 = obj76;
                                            obj70 = obj70;
                                            obj4 = obj4;
                                            obj3 = obj3;
                                            str56 = str56;
                                            mVar = mVar;
                                            str34 = str34;
                                            str54 = str54;
                                            str55 = str55;
                                            obj82 = obj82;
                                            str57 = str57;
                                        }
                                        mVar2 = mVar;
                                        for (com.amazon.aps.iva.w2.b bVar7 : mVar2.u.values()) {
                                            bVar7.c();
                                        }
                                    } else {
                                        mVar2 = mVar;
                                    }
                                    int i45 = this.h;
                                    int i46 = this.i;
                                    int i47 = this.b;
                                    Context context = oVar.getContext();
                                    int i48 = this.l;
                                    if (i48 == -2) {
                                        loadInterpolator = AnimationUtils.loadInterpolator(context, this.n);
                                    } else if (i48 == -1) {
                                        loadInterpolator = new v(com.amazon.aps.iva.t2.c.c(this.m));
                                    } else if (i48 == 0) {
                                        loadInterpolator = new AccelerateDecelerateInterpolator();
                                    } else if (i48 == 1) {
                                        loadInterpolator = new AccelerateInterpolator();
                                    } else if (i48 == 2) {
                                        loadInterpolator = new DecelerateInterpolator();
                                    } else if (i48 == 4) {
                                        loadInterpolator = new BounceInterpolator();
                                    } else if (i48 != 5) {
                                        loadInterpolator = i48 != 6 ? null : new AnticipateInterpolator();
                                    } else {
                                        loadInterpolator = new OvershootInterpolator();
                                    }
                                    new a(xVar, mVar2, i45, i46, i47, loadInterpolator, this.p, this.q);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            c.a aVar8 = this.g;
            if (i6 == 1) {
                for (int i49 : oVar.getConstraintSetIds()) {
                    if (i49 != i) {
                        q qVar = oVar.b;
                        androidx.constraintlayout.widget.c b2 = qVar == null ? null : qVar.b(i49);
                        for (View view2 : viewArr) {
                            c.a l = b2.l(view2.getId());
                            if (aVar8 != null) {
                                c.a.C0024a c0024a = aVar8.h;
                                if (c0024a != null) {
                                    c0024a.e(l);
                                }
                                l.g.putAll(aVar8.g);
                            }
                        }
                    }
                }
            }
            androidx.constraintlayout.widget.c cVar5 = new androidx.constraintlayout.widget.c();
            HashMap<Integer, c.a> hashMap13 = cVar5.e;
            hashMap13.clear();
            for (Integer num2 : cVar.e.keySet()) {
                c.a aVar9 = cVar.e.get(num2);
                if (aVar9 != null) {
                    hashMap13.put(num2, aVar9.clone());
                }
            }
            for (View view3 : viewArr) {
                c.a l2 = cVar5.l(view3.getId());
                if (aVar8 != null) {
                    c.a.C0024a c0024a2 = aVar8.h;
                    if (c0024a2 != null) {
                        c0024a2.e(l2);
                    }
                    l2.g.putAll(aVar8.g);
                }
            }
            q qVar2 = oVar.b;
            if (qVar2 != null) {
                qVar2.g.put(i, cVar5);
            }
            oVar.b.b(oVar.e);
            oVar.b.b(oVar.g);
            throw null;
        }
    }

    public final boolean b(View view) {
        boolean z;
        boolean z2;
        int i = this.r;
        if (i == -1 || view.getTag(i) != null) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.s;
        if (i2 == -1 || view.getTag(i2) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public final boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.j == -1 && this.k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.j) {
            return true;
        }
        if (this.k == null || !(view.getLayoutParams() instanceof ConstraintLayout.b) || (str = ((ConstraintLayout.b) view.getLayoutParams()).Y) == null || !str.matches(this.k)) {
            return false;
        }
        return true;
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), com.amazon.aps.iva.y2.d.w);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = obtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == 8) {
                int i2 = o.R;
                if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.k = obtainStyledAttributes.getString(index);
                } else {
                    this.j = obtainStyledAttributes.getResourceId(index, this.j);
                }
            } else if (index == 9) {
                this.b = obtainStyledAttributes.getInt(index, this.b);
            } else if (index == 12) {
                this.c = obtainStyledAttributes.getBoolean(index, this.c);
            } else if (index == 10) {
                this.d = obtainStyledAttributes.getInt(index, this.d);
            } else if (index == 4) {
                this.h = obtainStyledAttributes.getInt(index, this.h);
            } else if (index == 13) {
                this.i = obtainStyledAttributes.getInt(index, this.i);
            } else if (index == 14) {
                this.e = obtainStyledAttributes.getInt(index, this.e);
            } else if (index == 7) {
                int i3 = obtainStyledAttributes.peekValue(index).type;
                if (i3 == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    this.n = resourceId;
                    if (resourceId != -1) {
                        this.l = -2;
                    }
                } else if (i3 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.m = string;
                    if (string != null && string.indexOf("/") > 0) {
                        this.n = obtainStyledAttributes.getResourceId(index, -1);
                        this.l = -2;
                    } else {
                        this.l = -1;
                    }
                } else {
                    this.l = obtainStyledAttributes.getInteger(index, this.l);
                }
            } else if (index == 11) {
                this.p = obtainStyledAttributes.getResourceId(index, this.p);
            } else if (index == 3) {
                this.q = obtainStyledAttributes.getResourceId(index, this.q);
            } else if (index == 6) {
                this.r = obtainStyledAttributes.getResourceId(index, this.r);
            } else if (index == 5) {
                this.s = obtainStyledAttributes.getResourceId(index, this.s);
            } else if (index == 2) {
                this.u = obtainStyledAttributes.getResourceId(index, this.u);
            } else if (index == 1) {
                this.t = obtainStyledAttributes.getInteger(index, this.t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + com.amazon.aps.iva.x2.a.b(this.a, this.o) + ")";
    }
}
