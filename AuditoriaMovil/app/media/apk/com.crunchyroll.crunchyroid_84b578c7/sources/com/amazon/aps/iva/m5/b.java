package com.amazon.aps.iva.m5;

import androidx.lifecycle.u;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.i5.g0;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.x.i;
import java.io.PrintWriter;
/* compiled from: LoaderManagerImpl.java */
/* loaded from: classes.dex */
public final class b extends com.amazon.aps.iva.m5.a {
    public final o a;
    public final C0502b b;

    /* compiled from: LoaderManagerImpl.java */
    /* loaded from: classes.dex */
    public static class a<D> extends v<D> {
        @Override // androidx.lifecycle.LiveData
        public final void g() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public final void h() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public final void j(w<? super D> wVar) {
            super.j(wVar);
        }

        @Override // com.amazon.aps.iva.i5.v, androidx.lifecycle.LiveData
        public final void k(D d) {
            super.k(d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #0 : ");
            com.amazon.aps.iva.cq.b.r(sb, null);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: com.amazon.aps.iva.m5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0502b extends f0 {
        public static final a c = new a();
        public final i<a> b = new i<>();

        /* compiled from: LoaderManagerImpl.java */
        /* renamed from: com.amazon.aps.iva.m5.b$b$a */
        /* loaded from: classes.dex */
        public static class a implements u.b {
            @Override // androidx.lifecycle.u.b
            public final <T extends f0> T b(Class<T> cls) {
                return new C0502b();
            }
        }

        @Override // com.amazon.aps.iva.i5.f0
        public final void onCleared() {
            super.onCleared();
            i<a> iVar = this.b;
            if (iVar.g() <= 0) {
                int i = iVar.e;
                Object[] objArr = iVar.d;
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = null;
                }
                iVar.e = 0;
                iVar.b = false;
                return;
            }
            iVar.h(0).getClass();
            throw null;
        }
    }

    public b(o oVar, g0 g0Var) {
        this.a = oVar;
        this.b = (C0502b) new u(g0Var, C0502b.c).a(C0502b.class);
    }

    @Deprecated
    public final void b(String str, PrintWriter printWriter) {
        i<a> iVar = this.b.b;
        if (iVar.g() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (iVar.g() > 0) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(iVar.e(0));
                printWriter.print(": ");
                printWriter.println(iVar.h(0).toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println((Object) null);
                throw null;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        com.amazon.aps.iva.cq.b.r(sb, this.a);
        sb.append("}}");
        return sb.toString();
    }
}
