package c.i.d.c;

import android.content.res.ColorStateList;
import android.graphics.Shader;
/* loaded from: classes.dex */
public final class d {
    public final Shader a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f2006b;

    /* renamed from: c  reason: collision with root package name */
    public int f2007c;

    public d(Shader shader, ColorStateList colorStateList, int i2) {
        this.a = shader;
        this.f2006b = colorStateList;
        this.f2007c = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c4, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static c.i.d.c.d a(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.i.d.c.d.a(android.content.res.Resources, int, android.content.res.Resources$Theme):c.i.d.c.d");
    }

    public boolean b() {
        return this.a != null;
    }

    public boolean c() {
        ColorStateList colorStateList;
        return this.a == null && (colorStateList = this.f2006b) != null && colorStateList.isStateful();
    }

    public boolean d(int[] iArr) {
        if (c()) {
            ColorStateList colorStateList = this.f2006b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f2007c) {
                this.f2007c = colorForState;
                return true;
            }
        }
        return false;
    }
}
