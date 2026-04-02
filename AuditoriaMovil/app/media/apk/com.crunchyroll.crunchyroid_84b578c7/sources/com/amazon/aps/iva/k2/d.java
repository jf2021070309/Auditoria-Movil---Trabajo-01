package com.amazon.aps.iva.k2;

import android.text.Layout;
import android.text.TextPaint;
import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.c2.b;
import com.amazon.aps.iva.c2.p;
import com.amazon.aps.iva.c2.u;
import com.amazon.aps.iva.h2.k;
import com.amazon.aps.iva.o0.p3;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
/* compiled from: AndroidParagraphIntrinsics.android.kt */
/* loaded from: classes.dex */
public final class d implements com.amazon.aps.iva.c2.k {
    public final String a;
    public final a0 b;
    public final List<b.C0158b<u>> c;
    public final List<b.C0158b<p>> d;
    public final k.a e;
    public final com.amazon.aps.iva.o2.c f;
    public final f g;
    public final CharSequence h;
    public final com.amazon.aps.iva.d2.j i;
    public j j;
    public final boolean k;
    public final int l;

    /* JADX WARN: Code restructure failed: missing block: B:201:0x0398, code lost:
        if (com.amazon.aps.iva.e.z.F(r10.c) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c4, code lost:
        if (r11 == null) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
        if (r11 == 1) goto L432;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0173  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List<com.amazon.aps.iva.c2.b$b<com.amazon.aps.iva.c2.u>>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(com.amazon.aps.iva.c2.a0 r40, com.amazon.aps.iva.h2.k.a r41, com.amazon.aps.iva.o2.c r42, java.lang.String r43, java.util.List r44, java.util.List r45) {
        /*
            Method dump skipped, instructions count: 2175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k2.d.<init>(com.amazon.aps.iva.c2.a0, com.amazon.aps.iva.h2.k$a, com.amazon.aps.iva.o2.c, java.lang.String, java.util.List, java.util.List):void");
    }

    @Override // com.amazon.aps.iva.c2.k
    public final boolean a() {
        boolean z;
        j jVar = this.j;
        if (jVar != null) {
            z = jVar.a();
        } else {
            z = false;
        }
        if (!z) {
            if (this.k || !e.a(this.b)) {
                return false;
            }
            g gVar = h.a;
            g gVar2 = h.a;
            p3<Boolean> p3Var = gVar2.a;
            if (p3Var == null) {
                if (androidx.emoji2.text.d.c()) {
                    p3Var = gVar2.a();
                    gVar2.a = p3Var;
                } else {
                    p3Var = t.c;
                }
            }
            if (!p3Var.getValue().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.amazon.aps.iva.c2.k
    public final float b() {
        return this.i.b();
    }

    @Override // com.amazon.aps.iva.c2.k
    public final float c() {
        com.amazon.aps.iva.d2.j jVar = this.i;
        if (!Float.isNaN(jVar.e)) {
            return jVar.e;
        }
        CharSequence charSequence = jVar.a;
        com.amazon.aps.iva.yb0.j.f(charSequence, "text");
        TextPaint textPaint = jVar.b;
        com.amazon.aps.iva.yb0.j.f(textPaint, "paint");
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        lineInstance.setText(new com.amazon.aps.iva.d2.g(charSequence, charSequence.length()));
        int i = 0;
        PriorityQueue priorityQueue = new PriorityQueue(10, new com.amazon.aps.iva.d2.k(0));
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new com.amazon.aps.iva.kb0.j(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                com.amazon.aps.iva.kb0.j jVar2 = (com.amazon.aps.iva.kb0.j) priorityQueue.peek();
                if (jVar2 != null && ((Number) jVar2.c).intValue() - ((Number) jVar2.b).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new com.amazon.aps.iva.kb0.j(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        Iterator it = priorityQueue.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            com.amazon.aps.iva.kb0.j jVar3 = (com.amazon.aps.iva.kb0.j) it.next();
            f = Math.max(f, Layout.getDesiredWidth(charSequence, ((Number) jVar3.b).intValue(), ((Number) jVar3.c).intValue(), textPaint));
        }
        jVar.e = f;
        return f;
    }
}
