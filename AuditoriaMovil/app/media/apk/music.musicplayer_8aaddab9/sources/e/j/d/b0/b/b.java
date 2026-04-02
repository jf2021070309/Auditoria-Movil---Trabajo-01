package e.j.d.b0.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.zipoapps.premiumhelper.ui.preferences.PreferenceHelper;
import e.j.d.k;
import e.j.d.w;
import e.j.d.x;
import h.o.c.j;
import h.t.g;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class b extends PreferenceHelper {

    /* renamed from: g  reason: collision with root package name */
    public final Context f8571g;

    /* renamed from: h  reason: collision with root package name */
    public List<Integer> f8572h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ArrayList arrayList;
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f8571g = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.a);
        j.d(obtainStyledAttributes, "context.obtainStyledAttr…leable.PremiumPreference)");
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string == null) {
                arrayList = null;
            } else {
                List<String> p = g.p(string, new String[]{","}, false, 0, 6);
                ArrayList arrayList2 = new ArrayList(w.s(p, 10));
                for (String str : p) {
                    arrayList2.add(Integer.valueOf(Integer.parseInt(g.v(str).toString())));
                }
                arrayList = arrayList2;
            }
            this.f8572h = arrayList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // com.zipoapps.premiumhelper.ui.preferences.PreferenceHelper
    public void c() {
        if (!k.a.a().e()) {
            List<Integer> list = this.f8572h;
            boolean z = true;
            if (!((list == null || !(list.isEmpty() ^ true)) ? false : false)) {
                b();
                return;
            }
        }
        TextView textView = this.a;
        if (textView == null) {
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }
}
