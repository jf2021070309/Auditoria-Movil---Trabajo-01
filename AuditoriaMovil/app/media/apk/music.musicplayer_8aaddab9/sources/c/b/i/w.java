package c.b.i;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;
/* loaded from: classes.dex */
public class w extends h0 {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner.d f1260j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f1261k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(AppCompatSpinner appCompatSpinner, View view, AppCompatSpinner.d dVar) {
        super(view);
        this.f1261k = appCompatSpinner;
        this.f1260j = dVar;
    }

    @Override // c.b.i.h0
    public c.b.h.i.p b() {
        return this.f1260j;
    }

    @Override // c.b.i.h0
    @SuppressLint({"SyntheticAccessor"})
    public boolean c() {
        if (this.f1261k.getInternalPopup().a()) {
            return true;
        }
        this.f1261k.b();
        return true;
    }
}
