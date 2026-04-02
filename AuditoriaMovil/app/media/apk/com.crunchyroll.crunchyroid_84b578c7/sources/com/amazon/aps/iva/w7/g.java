package com.amazon.aps.iva.w7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.amazon.aps.iva.s5.a;
import com.amazon.aps.iva.t5.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
/* compiled from: TtmlSubtitle.java */
/* loaded from: classes.dex */
public final class g implements com.amazon.aps.iva.q7.d {
    public final d b;
    public final long[] c;
    public final Map<String, f> d;
    public final Map<String, e> e;
    public final Map<String, String> f;

    public g(d dVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.b = dVar;
        this.e = hashMap2;
        this.f = hashMap3;
        this.d = Collections.unmodifiableMap(hashMap);
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        dVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        this.c = jArr;
    }

    @Override // com.amazon.aps.iva.q7.d
    public final int a(long j) {
        long[] jArr = this.c;
        int b = g0.b(jArr, j, false);
        if (b >= jArr.length) {
            return -1;
        }
        return b;
    }

    @Override // com.amazon.aps.iva.q7.d
    public final List<com.amazon.aps.iva.s5.a> b(long j) {
        a[] aVarArr;
        Map<String, f> map = this.d;
        Map<String, e> map2 = this.e;
        d dVar = this.b;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        dVar.g(j, dVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        dVar.i(j, false, dVar.h, treeMap);
        dVar.h(j, map, map2, dVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = this.f.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = map2.get(pair.first);
                eVar.getClass();
                a.C0695a c0695a = new a.C0695a();
                c0695a.b = decodeByteArray;
                c0695a.h = eVar.b;
                c0695a.i = 0;
                c0695a.e = eVar.c;
                c0695a.f = 0;
                c0695a.g = eVar.e;
                c0695a.l = eVar.f;
                c0695a.m = eVar.g;
                c0695a.p = eVar.j;
                arrayList2.add(c0695a.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = map2.get(entry.getKey());
            eVar2.getClass();
            a.C0695a c0695a2 = (a.C0695a) entry.getValue();
            CharSequence charSequence = c0695a2.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c0695a2.e = eVar2.c;
            c0695a2.f = eVar2.d;
            c0695a2.g = eVar2.e;
            c0695a2.h = eVar2.b;
            c0695a2.l = eVar2.f;
            c0695a2.k = eVar2.i;
            c0695a2.j = eVar2.h;
            c0695a2.p = eVar2.j;
            arrayList2.add(c0695a2.a());
        }
        return arrayList2;
    }

    @Override // com.amazon.aps.iva.q7.d
    public final long c(int i) {
        return this.c[i];
    }

    @Override // com.amazon.aps.iva.q7.d
    public final int f() {
        return this.c.length;
    }
}
