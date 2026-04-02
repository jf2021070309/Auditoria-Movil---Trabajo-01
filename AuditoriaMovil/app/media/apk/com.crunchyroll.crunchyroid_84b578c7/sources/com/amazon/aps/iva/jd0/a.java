package com.amazon.aps.iva.jd0;

import com.amazon.aps.iva.ec0.i;
import com.amazon.aps.iva.ec0.j;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: BuiltInsBinaryVersion.kt */
/* loaded from: classes4.dex */
public final class a extends com.amazon.aps.iva.kd0.a {
    public static final a f = new a(1, 0, 7);

    /* compiled from: BuiltInsBinaryVersion.kt */
    /* renamed from: com.amazon.aps.iva.jd0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0413a {
        public static a a(InputStream inputStream) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            j jVar = new j(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(r.Y(jVar));
            i it = jVar.iterator();
            while (it.d) {
                it.b();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] W0 = x.W0(arrayList);
            return new a(Arrays.copyOf(W0, W0.length));
        }
    }

    static {
        new a(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        com.amazon.aps.iva.yb0.j.f(iArr, "numbers");
    }
}
