package com.amazon.aps.iva.i;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.amazon.aps.iva.yb0.j;
import java.io.Serializable;
/* compiled from: ActivityResultContract.kt */
/* loaded from: classes.dex */
public abstract class a<I, O> {

    /* compiled from: ActivityResultContract.kt */
    /* renamed from: com.amazon.aps.iva.i.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0348a<T> {
        public final T a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0348a(Serializable serializable) {
            this.a = serializable;
        }
    }

    public abstract Intent a(ComponentActivity componentActivity, Object obj);

    public C0348a b(ComponentActivity componentActivity, Object obj) {
        j.f(componentActivity, "context");
        return null;
    }

    public abstract O c(int i, Intent intent);
}
