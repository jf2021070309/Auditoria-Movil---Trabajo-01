package c.i.k.m0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import c.b.i.t;
import c.i.k.m0.e;
/* loaded from: classes.dex */
public class b extends InputConnectionWrapper {
    public final /* synthetic */ d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InputConnection inputConnection, boolean z, d dVar) {
        super(inputConnection, z);
        this.a = dVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        d dVar = this.a;
        e eVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            eVar = new e(new e.a(inputContentInfo));
        }
        if (((t) dVar).a(eVar, i2, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i2, bundle);
    }
}
