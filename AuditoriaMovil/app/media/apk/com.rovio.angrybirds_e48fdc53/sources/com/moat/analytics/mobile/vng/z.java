package com.moat.analytics.mobile.vng;

import android.app.Activity;
import android.graphics.Rect;
import android.location.Location;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.facebook.places.model.PlaceFields;
import com.umeng.analytics.pro.bg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class z {
    private JSONObject c;
    private Rect d;
    private Rect e;
    private JSONObject f;
    private JSONObject g;
    private Location h;
    private Map<String, Object> i = new HashMap();
    String a = "{}";
    private a b = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a {
        Rect a = new Rect(0, 0, 0, 0);
        double b = PangleAdapterUtils.CPM_DEFLAUT_VALUE;
        double c = PangleAdapterUtils.CPM_DEFLAUT_VALUE;

        a() {
        }
    }

    static int a(Rect rect, Set<Rect> set) {
        if (set.isEmpty()) {
            return 0;
        }
        ArrayList<Rect> arrayList = new ArrayList();
        arrayList.addAll(set);
        Collections.sort(arrayList, new Comparator<Rect>() { // from class: com.moat.analytics.mobile.vng.z.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(Rect rect2, Rect rect3) {
                return Integer.valueOf(rect2.top).compareTo(Integer.valueOf(rect3.top));
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (Rect rect2 : arrayList) {
            arrayList2.add(Integer.valueOf(rect2.left));
            arrayList2.add(Integer.valueOf(rect2.right));
        }
        Collections.sort(arrayList2);
        int i = 0;
        for (int i2 = 0; i2 < arrayList2.size() - 1; i2++) {
            if (!((Integer) arrayList2.get(i2)).equals(arrayList2.get(i2 + 1))) {
                Rect rect3 = new Rect(((Integer) arrayList2.get(i2)).intValue(), rect.top, ((Integer) arrayList2.get(i2 + 1)).intValue(), rect.bottom);
                int i3 = rect.top;
                Iterator it = arrayList.iterator();
                while (true) {
                    int i4 = i;
                    int i5 = i3;
                    if (!it.hasNext()) {
                        i = i4;
                        break;
                    }
                    Rect rect4 = (Rect) it.next();
                    if (Rect.intersects(rect4, rect3)) {
                        if (rect4.bottom > i5) {
                            i4 += (rect4.bottom - Math.max(i5, rect4.top)) * rect3.width();
                            i5 = rect4.bottom;
                        }
                        if (rect4.bottom == rect3.bottom) {
                            i = i4;
                            break;
                        }
                    }
                    i3 = i5;
                    i = i4;
                }
            }
        }
        return i;
    }

    private static Rect a(DisplayMetrics displayMetrics) {
        return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Rect a(View view) {
        return view != null ? h(view) : new Rect(0, 0, 0, 0);
    }

    private static a a(View view, Rect rect, boolean z, boolean z2, boolean z3) {
        a aVar = new a();
        int b = b(rect);
        if (view != null && z && z2 && !z3 && b > 0) {
            Rect rect2 = new Rect(0, 0, 0, 0);
            if (view.getGlobalVisibleRect(rect2)) {
                int b2 = b(rect2);
                if (b2 < b) {
                    p.b(2, "VisibilityInfo", null, "Ad is clipped");
                }
                HashSet hashSet = new HashSet();
                if (view.getRootView() instanceof ViewGroup) {
                    aVar.a = rect2;
                    boolean a2 = a(rect2, view, hashSet);
                    if (a2) {
                        aVar.c = 1.0d;
                    }
                    if (!a2) {
                        int a3 = a(rect2, hashSet);
                        if (a3 > 0) {
                            aVar.c = a3 / (b2 * 1.0d);
                        }
                        aVar.b = (b2 - a3) / (b * 1.0d);
                    }
                }
            }
        }
        return aVar;
    }

    private static Map<String, String> a(Rect rect) {
        HashMap hashMap = new HashMap();
        hashMap.put("x", String.valueOf(rect.left));
        hashMap.put("y", String.valueOf(rect.top));
        hashMap.put("w", String.valueOf(rect.right - rect.left));
        hashMap.put(bg.aG, String.valueOf(rect.bottom - rect.top));
        return hashMap;
    }

    private static Map<String, String> a(Rect rect, DisplayMetrics displayMetrics) {
        return a(b(rect, displayMetrics));
    }

    private static JSONObject a(Location location) {
        Map<String, String> b = b(location);
        if (b == null) {
            return null;
        }
        return new JSONObject(b);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(android.graphics.Rect r11, android.view.View r12, java.util.Set<android.graphics.Rect> r13) {
        /*
            r10 = 2
            r3 = 0
            r4 = 1
            android.view.View r0 = r12.getRootView()
            java.util.ArrayDeque r7 = new java.util.ArrayDeque
            r7.<init>()
            r7.add(r0)
            java.lang.String r0 = "VisibilityInfo"
            java.lang.String r1 = "starting covering rect search"
            com.moat.analytics.mobile.vng.p.b(r10, r0, r12, r1)
            r2 = r3
            r0 = r3
        L18:
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L22
            r1 = 250(0xfa, float:3.5E-43)
            if (r0 < r1) goto L24
        L22:
            r4 = r3
        L23:
            return r4
        L24:
            int r5 = r0 + 1
            java.lang.Object r0 = r7.pollLast()
            android.view.View r0 = (android.view.View) r0
            boolean r1 = r0.equals(r12)
            if (r1 == 0) goto L3c
            java.lang.String r0 = "VisibilityInfo"
            java.lang.String r1 = "found target"
            com.moat.analytics.mobile.vng.p.b(r10, r0, r11, r1)
            r2 = r4
            r0 = r5
            goto L18
        L3c:
            boolean r1 = g(r0)
            if (r1 != 0) goto L44
            r0 = r5
            goto L18
        L44:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L61
            boolean r1 = r0 instanceof android.widget.ListView
            if (r1 != 0) goto L61
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r6 = r1.getChildCount()
            int r6 = r6 + (-1)
        L55:
            if (r6 < 0) goto L61
            android.view.View r8 = r1.getChildAt(r6)
            r7.add(r8)
            int r6 = r6 + (-1)
            goto L55
        L61:
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 21
            if (r1 < r6) goto Lca
            float r1 = r0.getElevation()
            float r6 = r12.getElevation()
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 <= 0) goto Lba
            r1 = r4
        L74:
            if (r1 == 0) goto Lb7
            android.graphics.Rect r1 = h(r0)
            boolean r6 = r1.setIntersect(r11, r1)
            if (r6 == 0) goto Lb7
            java.lang.String r6 = "VisibilityInfo"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Covered by "
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.Class r9 = r0.getClass()
            java.lang.String r9 = r9.getSimpleName()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = "-"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = r1.toString()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.moat.analytics.mobile.vng.p.b(r10, r6, r0, r8)
            r13.add(r1)
            boolean r0 = r1.contains(r11)
            if (r0 != 0) goto L23
        Lb7:
            r0 = r5
            goto L18
        Lba:
            if (r2 == 0) goto Lce
            float r1 = r0.getElevation()
            float r6 = r12.getElevation()
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto Lce
            r1 = r4
            goto L74
        Lca:
            if (r2 == 0) goto Lce
            r1 = r4
            goto L74
        Lce:
            r1 = r3
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moat.analytics.mobile.vng.z.a(android.graphics.Rect, android.view.View, java.util.Set):boolean");
    }

    private static int b(Rect rect) {
        return rect.width() * rect.height();
    }

    private static Rect b(Rect rect, DisplayMetrics displayMetrics) {
        float f = displayMetrics.density;
        if (f == 0.0f) {
            return rect;
        }
        return new Rect(Math.round(rect.left / f), Math.round(rect.top / f), Math.round(rect.right / f), Math.round(rect.bottom / f));
    }

    private static Map<String, String> b(Location location) {
        if (location == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("latitude", Double.toString(location.getLatitude()));
        hashMap.put("longitude", Double.toString(location.getLongitude()));
        hashMap.put("timestamp", Long.toString(location.getTime()));
        hashMap.put("horizontalAccuracy", Float.toString(location.getAccuracy()));
        return hashMap;
    }

    private static boolean b(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view != null && view.isAttachedToWindow() : (view == null || view.getWindowToken() == null) ? false : true;
    }

    private static boolean c(View view) {
        return view != null && view.hasWindowFocus();
    }

    private static boolean d(View view) {
        return view == null || !view.isShown();
    }

    private static float e(View view) {
        if (view == null) {
            return 0.0f;
        }
        return f(view);
    }

    private static float f(View view) {
        float alpha = view.getAlpha();
        while (view != null && view.getParent() != null && alpha != PangleAdapterUtils.CPM_DEFLAUT_VALUE && (view.getParent() instanceof View)) {
            alpha *= ((View) view.getParent()).getAlpha();
            view = (View) view.getParent();
        }
        return alpha;
    }

    private static boolean g(View view) {
        return view.isShown() && ((double) view.getAlpha()) > PangleAdapterUtils.CPM_DEFLAUT_VALUE;
    }

    private static Rect h(View view) {
        int[] iArr = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    private static DisplayMetrics i(View view) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 17 || com.moat.analytics.mobile.vng.a.a == null || (activity = com.moat.analytics.mobile.vng.a.a.get()) == null) {
            return view.getContext().getResources().getDisplayMetrics();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, View view) {
        HashMap hashMap = new HashMap();
        boolean z = false;
        if (view != null) {
            try {
                DisplayMetrics i = i(view);
                boolean b = b(view);
                boolean c = c(view);
                boolean d = d(view);
                float e = e(view);
                hashMap.put("dr", Float.valueOf(i.density));
                hashMap.put("dv", Double.valueOf(s.a()));
                hashMap.put("adKey", str);
                hashMap.put("isAttached", Integer.valueOf(b ? 1 : 0));
                hashMap.put("inFocus", Integer.valueOf(c ? 1 : 0));
                hashMap.put("isHidden", Integer.valueOf(d ? 1 : 0));
                hashMap.put("opacity", Float.valueOf(e));
                Rect a2 = a(i);
                Rect a3 = a(view);
                a a4 = a(view, a3, b, c, d);
                if (this.c == null || a4.b != this.b.b || !a4.a.equals(this.b.a) || a4.c != this.b.c) {
                    this.b = a4;
                    this.c = new JSONObject(a(this.b.a, i));
                    z = true;
                }
                hashMap.put("coveredPercent", Double.valueOf(a4.c));
                if (this.g == null || !a2.equals(this.e)) {
                    this.e = a2;
                    this.g = new JSONObject(a(a2, i));
                    z = true;
                }
                if (this.f == null || !a3.equals(this.d)) {
                    this.d = a3;
                    this.f = new JSONObject(a(a3, i));
                    z = true;
                }
                if (this.i == null || !hashMap.equals(this.i)) {
                    this.i = hashMap;
                    z = true;
                }
                Location b2 = o.a().b();
                if (!o.a(b2, this.h)) {
                    z = true;
                    this.h = b2;
                }
                if (!z) {
                    String str2 = this.a;
                    return;
                }
                JSONObject jSONObject = new JSONObject(this.i);
                jSONObject.accumulate("screen", this.g);
                jSONObject.accumulate("view", this.f);
                jSONObject.accumulate("visible", this.c);
                jSONObject.accumulate("maybe", this.c);
                jSONObject.accumulate("visiblePercent", Double.valueOf(this.b.b));
                if (b2 != null) {
                    jSONObject.accumulate(PlaceFields.LOCATION, a(b2));
                }
                this.a = jSONObject.toString();
            } catch (Exception e2) {
                m.a(e2);
                this.a = "{}";
            }
        }
    }
}
