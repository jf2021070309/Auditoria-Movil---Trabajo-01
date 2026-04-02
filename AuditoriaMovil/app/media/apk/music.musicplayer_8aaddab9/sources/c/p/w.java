package c.p;

import androidx.lifecycle.LiveData;
/* loaded from: classes.dex */
public class w<T> extends LiveData<T> {
    @Override // androidx.lifecycle.LiveData
    public void h(T t) {
        LiveData.a("setValue");
        this.f453h++;
        this.f451f = t;
        c(null);
    }

    public void i(T t) {
        boolean z;
        synchronized (this.f447b) {
            z = this.f452g == LiveData.a;
            this.f452g = t;
        }
        if (z) {
            c.c.a.a.a.d().f1298c.c(this.f456k);
        }
    }
}
