package e.a.c;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.preference.Preference;
@TargetApi(11)
/* loaded from: classes.dex */
public class c7 extends c.t.f {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f5043i = 0;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5044j = false;

    @Override // c.t.f
    public void b(Bundle bundle, String str) {
        d();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:4|5|6|(1:8)|9|(2:(1:12)|13)(1:97)|(2:15|(1:19))|20|b4|29|(21:85|(2:87|(1:90)(1:89))|91|92|(9:33|(2:36|34)|37|38|(2:41|39)|42|43|(1:45)|46)|47|48|49|(1:51)|52|(1:54)|55|56|57|58|59|(3:63|(1:68)|67)|69|(1:71)|72|(2:74|75)(1:77))(0)|31|(0)|47|48|49|(0)|52|(0)|55|56|57|58|59|(5:61|63|(1:65)|68|67)|69|(0)|72|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(30:3|4|5|6|(1:8)|9|(2:(1:12)|13)(1:97)|(2:15|(1:19))|20|b4|29|(21:85|(2:87|(1:90)(1:89))|91|92|(9:33|(2:36|34)|37|38|(2:41|39)|42|43|(1:45)|46)|47|48|49|(1:51)|52|(1:54)|55|56|57|58|59|(3:63|(1:68)|67)|69|(1:71)|72|(2:74|75)(1:77))(0)|31|(0)|47|48|49|(0)|52|(0)|55|56|57|58|59|(5:61|63|(1:65)|68|67)|69|(0)|72|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x025b, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x025c, code lost:
        e.h.g.s1.l(r4, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b9 A[Catch: Exception -> 0x01ee, TryCatch #0 {Exception -> 0x01ee, blocks: (B:56:0x019d, B:58:0x01b9, B:59:0x01be, B:61:0x01da, B:62:0x01e1), top: B:96:0x019d }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01da A[Catch: Exception -> 0x01ee, TryCatch #0 {Exception -> 0x01ee, blocks: (B:56:0x019d, B:58:0x01b9, B:59:0x01be, B:61:0x01da, B:62:0x01e1), top: B:96:0x019d }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0310  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.c.c7.d():void");
    }

    public final void e(Preference preference, int i2) {
        Drawable c2 = c.i.d.a.c(requireContext(), i2);
        if (preference.f483k != c2) {
            preference.f483k = c2;
            preference.f482j = 0;
            preference.m();
        }
    }

    @Override // c.t.f, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5044j = c.i.g.h.x();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f5044j != c.i.g.h.x()) {
            this.f5044j = c.i.g.h.x();
            d();
        }
    }
}
