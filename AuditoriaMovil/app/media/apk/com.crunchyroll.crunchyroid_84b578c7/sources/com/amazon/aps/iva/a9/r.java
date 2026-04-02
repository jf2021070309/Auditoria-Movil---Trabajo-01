package com.amazon.aps.iva.a9;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.a9.n;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: TransitionSet.java */
/* loaded from: classes.dex */
public class r extends n {
    public int d;
    public ArrayList<n> b = new ArrayList<>();
    public boolean c = true;
    public boolean e = false;
    public int f = 0;

    /* compiled from: TransitionSet.java */
    /* loaded from: classes.dex */
    public class a extends o {
        public final /* synthetic */ n a;

        public a(n nVar) {
            this.a = nVar;
        }

        @Override // com.amazon.aps.iva.a9.n.g
        public final void onTransitionEnd(n nVar) {
            this.a.runAnimators();
            nVar.removeListener(this);
        }
    }

    /* compiled from: TransitionSet.java */
    /* loaded from: classes.dex */
    public static class b extends o {
        public final r a;

        public b(r rVar) {
            this.a = rVar;
        }

        @Override // com.amazon.aps.iva.a9.n.g
        public final void onTransitionEnd(n nVar) {
            r rVar = this.a;
            int i = rVar.d - 1;
            rVar.d = i;
            if (i == 0) {
                rVar.e = false;
                rVar.end();
            }
            nVar.removeListener(this);
        }

        @Override // com.amazon.aps.iva.a9.o, com.amazon.aps.iva.a9.n.g
        public final void onTransitionStart(n nVar) {
            r rVar = this.a;
            if (!rVar.e) {
                rVar.start();
                rVar.e = true;
            }
        }
    }

    public final void a(n nVar) {
        this.b.add(nVar);
        nVar.mParent = this;
        long j = this.mDuration;
        if (j >= 0) {
            nVar.setDuration(j);
        }
        if ((this.f & 1) != 0) {
            nVar.setInterpolator(getInterpolator());
        }
        if ((this.f & 2) != 0) {
            getPropagation();
            nVar.setPropagation(null);
        }
        if ((this.f & 4) != 0) {
            nVar.setPathMotion(getPathMotion());
        }
        if ((this.f & 8) != 0) {
            nVar.setEpicenterCallback(getEpicenterCallback());
        }
    }

    @Override // com.amazon.aps.iva.a9.n
    public final n addListener(n.g gVar) {
        return (r) super.addListener(gVar);
    }

    @Override // com.amazon.aps.iva.a9.n
    public final n addTarget(View view) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).addTarget(view);
        }
        return (r) super.addTarget(view);
    }

    public final void b(n nVar) {
        this.b.remove(nVar);
        nVar.mParent = null;
    }

    public final void c(long j) {
        ArrayList<n> arrayList;
        super.setDuration(j);
        if (this.mDuration >= 0 && (arrayList = this.b) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.b.get(i).setDuration(j);
            }
        }
    }

    @Override // com.amazon.aps.iva.a9.n
    public final void cancel() {
        super.cancel();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.b.get(i).cancel();
        }
    }

    @Override // com.amazon.aps.iva.a9.n
    public final void captureEndValues(u uVar) {
        if (isValidTarget(uVar.b)) {
            Iterator<n> it = this.b.iterator();
            while (it.hasNext()) {
                n next = it.next();
                if (next.isValidTarget(uVar.b)) {
                    next.captureEndValues(uVar);
                    uVar.c.add(next);
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.a9.n
    public final void capturePropagationValues(u uVar) {
        super.capturePropagationValues(uVar);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.b.get(i).capturePropagationValues(uVar);
        }
    }

    @Override // com.amazon.aps.iva.a9.n
    public final void captureStartValues(u uVar) {
        if (isValidTarget(uVar.b)) {
            Iterator<n> it = this.b.iterator();
            while (it.hasNext()) {
                n next = it.next();
                if (next.isValidTarget(uVar.b)) {
                    next.captureStartValues(uVar);
                    uVar.c.add(next);
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.a9.n
    public final void createAnimators(ViewGroup viewGroup, v vVar, v vVar2, ArrayList<u> arrayList, ArrayList<u> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            n nVar = this.b.get(i);
            if (startDelay > 0 && (this.c || i == 0)) {
                long startDelay2 = nVar.getStartDelay();
                if (startDelay2 > 0) {
                    nVar.setStartDelay(startDelay2 + startDelay);
                } else {
                    nVar.setStartDelay(startDelay);
                }
            }
            nVar.createAnimators(viewGroup, vVar, vVar2, arrayList, arrayList2);
        }
    }

    @Override // com.amazon.aps.iva.a9.n
    /* renamed from: d */
    public final r setInterpolator(TimeInterpolator timeInterpolator) {
        this.f |= 1;
        ArrayList<n> arrayList = this.b;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.b.get(i).setInterpolator(timeInterpolator);
            }
        }
        return (r) super.setInterpolator(timeInterpolator);
    }

    public final void e(int i) {
        if (i != 0) {
            if (i == 1) {
                this.c = false;
                return;
            }
            throw new AndroidRuntimeException(com.amazon.aps.iva.q.c0.a("Invalid parameter for TransitionSet ordering: ", i));
        }
        this.c = true;
    }

    @Override // com.amazon.aps.iva.a9.n
    public final n excludeTarget(View view, boolean z) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).excludeTarget(view, z);
        }
        return super.excludeTarget(view, z);
    }

    @Override // com.amazon.aps.iva.a9.n
    public final void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.b.get(i).forceToEnd(viewGroup);
        }
    }

    @Override // com.amazon.aps.iva.a9.n
    public final void pause(View view) {
        super.pause(view);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.b.get(i).pause(view);
        }
    }

    @Override // com.amazon.aps.iva.a9.n
    public final n removeListener(n.g gVar) {
        return (r) super.removeListener(gVar);
    }

    @Override // com.amazon.aps.iva.a9.n
    public final n removeTarget(int i) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            this.b.get(i2).removeTarget(i);
        }
        return (r) super.removeTarget(i);
    }

    @Override // com.amazon.aps.iva.a9.n
    public final void resume(View view) {
        super.resume(view);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.b.get(i).resume(view);
        }
    }

    @Override // com.amazon.aps.iva.a9.n
    public final void runAnimators() {
        if (this.b.isEmpty()) {
            start();
            end();
            return;
        }
        b bVar = new b(this);
        Iterator<n> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().addListener(bVar);
        }
        this.d = this.b.size();
        if (!this.c) {
            for (int i = 1; i < this.b.size(); i++) {
                this.b.get(i - 1).addListener(new a(this.b.get(i)));
            }
            n nVar = this.b.get(0);
            if (nVar != null) {
                nVar.runAnimators();
                return;
            }
            return;
        }
        Iterator<n> it2 = this.b.iterator();
        while (it2.hasNext()) {
            it2.next().runAnimators();
        }
    }

    @Override // com.amazon.aps.iva.a9.n
    public final void setCanRemoveViews(boolean z) {
        super.setCanRemoveViews(z);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.b.get(i).setCanRemoveViews(z);
        }
    }

    @Override // com.amazon.aps.iva.a9.n
    public final /* bridge */ /* synthetic */ n setDuration(long j) {
        c(j);
        return this;
    }

    @Override // com.amazon.aps.iva.a9.n
    public final void setEpicenterCallback(n.f fVar) {
        super.setEpicenterCallback(fVar);
        this.f |= 8;
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.b.get(i).setEpicenterCallback(fVar);
        }
    }

    @Override // com.amazon.aps.iva.a9.n
    public final void setPathMotion(j jVar) {
        super.setPathMotion(jVar);
        this.f |= 4;
        if (this.b != null) {
            for (int i = 0; i < this.b.size(); i++) {
                this.b.get(i).setPathMotion(jVar);
            }
        }
    }

    @Override // com.amazon.aps.iva.a9.n
    public final void setPropagation(q qVar) {
        super.setPropagation(null);
        this.f |= 2;
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.b.get(i).setPropagation(null);
        }
    }

    @Override // com.amazon.aps.iva.a9.n
    public final n setStartDelay(long j) {
        return (r) super.setStartDelay(j);
    }

    @Override // com.amazon.aps.iva.a9.n
    public final String toString(String str) {
        String nVar = super.toString(str);
        for (int i = 0; i < this.b.size(); i++) {
            StringBuilder b2 = com.amazon.aps.iva.b6.x.b(nVar, "\n");
            b2.append(this.b.get(i).toString(str + "  "));
            nVar = b2.toString();
        }
        return nVar;
    }

    @Override // com.amazon.aps.iva.a9.n
    /* renamed from: clone */
    public final n mo4clone() {
        r rVar = (r) super.mo4clone();
        rVar.b = new ArrayList<>();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            n mo4clone = this.b.get(i).mo4clone();
            rVar.b.add(mo4clone);
            mo4clone.mParent = rVar;
        }
        return rVar;
    }

    @Override // com.amazon.aps.iva.a9.n
    public final n addTarget(int i) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            this.b.get(i2).addTarget(i);
        }
        return (r) super.addTarget(i);
    }

    @Override // com.amazon.aps.iva.a9.n
    public final n excludeTarget(String str, boolean z) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).excludeTarget(str, z);
        }
        return super.excludeTarget(str, z);
    }

    @Override // com.amazon.aps.iva.a9.n
    public final n removeTarget(View view) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).removeTarget(view);
        }
        return (r) super.removeTarget(view);
    }

    @Override // com.amazon.aps.iva.a9.n
    public final n addTarget(String str) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).addTarget(str);
        }
        return (r) super.addTarget(str);
    }

    @Override // com.amazon.aps.iva.a9.n
    public final n excludeTarget(int i, boolean z) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            this.b.get(i2).excludeTarget(i, z);
        }
        return super.excludeTarget(i, z);
    }

    @Override // com.amazon.aps.iva.a9.n
    public final n removeTarget(Class cls) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).removeTarget(cls);
        }
        return (r) super.removeTarget(cls);
    }

    @Override // com.amazon.aps.iva.a9.n
    public final n addTarget(Class cls) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).addTarget(cls);
        }
        return (r) super.addTarget(cls);
    }

    @Override // com.amazon.aps.iva.a9.n
    public final n excludeTarget(Class<?> cls, boolean z) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).excludeTarget(cls, z);
        }
        return super.excludeTarget(cls, z);
    }

    @Override // com.amazon.aps.iva.a9.n
    public final n removeTarget(String str) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).removeTarget(str);
        }
        return (r) super.removeTarget(str);
    }
}
