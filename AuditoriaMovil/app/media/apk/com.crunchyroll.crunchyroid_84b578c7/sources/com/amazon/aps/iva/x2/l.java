package com.amazon.aps.iva.x2;

import android.view.View;
import com.amazon.aps.iva.w2.c;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
/* compiled from: MotionConstrainedPoint.java */
/* loaded from: classes.dex */
public final class l implements Comparable<l> {
    public int c;
    public float b = 1.0f;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public float h = 1.0f;
    public float i = 1.0f;
    public float j = Float.NaN;
    public float k = Float.NaN;
    public float l = 0.0f;
    public float m = 0.0f;
    public float n = 0.0f;
    public final float o = Float.NaN;
    public final float p = Float.NaN;
    public final LinkedHashMap<String, androidx.constraintlayout.widget.a> q = new LinkedHashMap<>();

    public static boolean b(float f, float f2) {
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            if (Math.abs(f - f2) > 1.0E-6f) {
                return true;
            }
            return false;
        } else if (Float.isNaN(f) != Float.isNaN(f2)) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(HashMap<String, com.amazon.aps.iva.w2.c> hashMap, int i) {
        char c;
        for (String str : hashMap.keySet()) {
            com.amazon.aps.iva.w2.c cVar = hashMap.get(str);
            str.getClass();
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            float f = 1.0f;
            float f2 = 0.0f;
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.f)) {
                        f2 = this.f;
                    }
                    cVar.b(f2, i);
                    break;
                case 1:
                    if (!Float.isNaN(this.g)) {
                        f2 = this.g;
                    }
                    cVar.b(f2, i);
                    break;
                case 2:
                    if (!Float.isNaN(this.l)) {
                        f2 = this.l;
                    }
                    cVar.b(f2, i);
                    break;
                case 3:
                    if (!Float.isNaN(this.m)) {
                        f2 = this.m;
                    }
                    cVar.b(f2, i);
                    break;
                case 4:
                    if (!Float.isNaN(this.n)) {
                        f2 = this.n;
                    }
                    cVar.b(f2, i);
                    break;
                case 5:
                    float f3 = this.p;
                    if (!Float.isNaN(f3)) {
                        f2 = f3;
                    }
                    cVar.b(f2, i);
                    break;
                case 6:
                    if (!Float.isNaN(this.h)) {
                        f = this.h;
                    }
                    cVar.b(f, i);
                    break;
                case 7:
                    if (!Float.isNaN(this.i)) {
                        f = this.i;
                    }
                    cVar.b(f, i);
                    break;
                case '\b':
                    if (!Float.isNaN(this.j)) {
                        f2 = this.j;
                    }
                    cVar.b(f2, i);
                    break;
                case '\t':
                    if (!Float.isNaN(this.k)) {
                        f2 = this.k;
                    }
                    cVar.b(f2, i);
                    break;
                case '\n':
                    if (!Float.isNaN(this.e)) {
                        f2 = this.e;
                    }
                    cVar.b(f2, i);
                    break;
                case 11:
                    if (!Float.isNaN(this.d)) {
                        f2 = this.d;
                    }
                    cVar.b(f2, i);
                    break;
                case '\f':
                    float f4 = this.o;
                    if (!Float.isNaN(f4)) {
                        f2 = f4;
                    }
                    cVar.b(f2, i);
                    break;
                case '\r':
                    if (!Float.isNaN(this.b)) {
                        f = this.b;
                    }
                    cVar.b(f, i);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        LinkedHashMap<String, androidx.constraintlayout.widget.a> linkedHashMap = this.q;
                        if (linkedHashMap.containsKey(str2)) {
                            androidx.constraintlayout.widget.a aVar = linkedHashMap.get(str2);
                            if (cVar instanceof c.b) {
                                ((c.b) cVar).f.append(i, aVar);
                                break;
                            } else {
                                aVar.a();
                                Objects.toString(cVar);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
            }
        }
    }

    public final void c(View view) {
        float alpha;
        view.getX();
        view.getY();
        view.getWidth();
        view.getHeight();
        this.c = view.getVisibility();
        if (view.getVisibility() != 0) {
            alpha = 0.0f;
        } else {
            alpha = view.getAlpha();
        }
        this.b = alpha;
        this.d = view.getElevation();
        this.e = view.getRotation();
        this.f = view.getRotationX();
        this.g = view.getRotationY();
        this.h = view.getScaleX();
        this.i = view.getScaleY();
        this.j = view.getPivotX();
        this.k = view.getPivotY();
        this.l = view.getTranslationX();
        this.m = view.getTranslationY();
        this.n = view.getTranslationZ();
    }

    @Override // java.lang.Comparable
    public final int compareTo(l lVar) {
        lVar.getClass();
        return Float.compare(0.0f, 0.0f);
    }
}
