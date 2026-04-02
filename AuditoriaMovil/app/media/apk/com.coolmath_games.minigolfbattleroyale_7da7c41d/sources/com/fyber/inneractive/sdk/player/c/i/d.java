package com.fyber.inneractive.sdk.player.c.i;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.fyber.inneractive.sdk.player.c.g.i;
import com.fyber.inneractive.sdk.player.c.i.e;
import com.fyber.inneractive.sdk.player.c.o;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class d extends g {
    private final SparseArray<Map<i, b>> b = new SparseArray<>();
    private final SparseBooleanArray c = new SparseBooleanArray();
    private int d = 0;
    private a e;

    /* loaded from: classes.dex */
    public static final class b {
        public final e.a a;
    }

    protected abstract e[] a(o[] oVarArr, i[] iVarArr, int[][][] iArr) throws com.fyber.inneractive.sdk.player.c.d;

    /* JADX WARN: Removed duplicated region for block: B:86:0x0186  */
    @Override // com.fyber.inneractive.sdk.player.c.i.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fyber.inneractive.sdk.player.c.i.h a(com.fyber.inneractive.sdk.player.c.o[] r19, com.fyber.inneractive.sdk.player.c.g.i r20) throws com.fyber.inneractive.sdk.player.c.d {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.i.d.a(com.fyber.inneractive.sdk.player.c.o[], com.fyber.inneractive.sdk.player.c.g.i):com.fyber.inneractive.sdk.player.c.i.h");
    }

    @Override // com.fyber.inneractive.sdk.player.c.i.g
    public final void a(Object obj) {
        this.e = (a) obj;
    }

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        private final int[] b;
        private final i[] c;
        private final int[] d;
        private final int[][][] e;
        private final i f;

        a(int[] iArr, i[] iVarArr, int[] iArr2, int[][][] iArr3, i iVar) {
            this.b = iArr;
            this.c = iVarArr;
            this.e = iArr3;
            this.d = iArr2;
            this.f = iVar;
            this.a = iVarArr.length;
        }
    }
}
