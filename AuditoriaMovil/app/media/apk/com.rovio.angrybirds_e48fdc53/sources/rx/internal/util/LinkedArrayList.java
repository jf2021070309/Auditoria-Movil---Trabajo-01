package rx.internal.util;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class LinkedArrayList {
    final int h;
    Object[] i;
    Object[] j;
    volatile int k;
    int l;

    public LinkedArrayList(int i) {
        this.h = i;
    }

    public void add(Object obj) {
        if (this.k == 0) {
            this.i = new Object[this.h + 1];
            this.j = this.i;
            this.i[0] = obj;
            this.l = 1;
            this.k = 1;
        } else if (this.l == this.h) {
            Object[] objArr = new Object[this.h + 1];
            objArr[0] = obj;
            this.j[this.h] = objArr;
            this.j = objArr;
            this.l = 1;
            this.k++;
        } else {
            this.j[this.l] = obj;
            this.l++;
            this.k++;
        }
    }

    public Object[] head() {
        return this.i;
    }

    public Object[] tail() {
        return this.j;
    }

    public int size() {
        return this.k;
    }

    public int indexInTail() {
        return this.l;
    }

    public int capacityHint() {
        return this.h;
    }

    List<Object> c() {
        int i = this.h;
        int i2 = this.k;
        ArrayList arrayList = new ArrayList(i2 + 1);
        int i3 = 0;
        Object[] head = head();
        int i4 = 0;
        while (i3 < i2) {
            arrayList.add(head[i4]);
            i3++;
            i4++;
            if (i4 == i) {
                head = (Object[]) head[i];
                i4 = 0;
            }
        }
        return arrayList;
    }

    public String toString() {
        return c().toString();
    }
}
