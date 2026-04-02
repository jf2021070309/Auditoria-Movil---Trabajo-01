package e.d.b.e.a.a;

import ch.qos.logback.core.rolling.helper.Compressor;
import java.io.File;
/* loaded from: classes2.dex */
public final class n0 {
    public static final e.d.b.e.a.c.e a = new e.d.b.e.a.c.e("ExtractChunkTaskHandler");

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f6868b = new byte[Compressor.BUFFER_SIZE];

    /* renamed from: c  reason: collision with root package name */
    public final z f6869c;

    /* renamed from: d  reason: collision with root package name */
    public final e.d.b.e.a.c.b0<e3> f6870d;

    /* renamed from: e  reason: collision with root package name */
    public final e.d.b.e.a.c.b0<t> f6871e;

    /* renamed from: f  reason: collision with root package name */
    public final t0 f6872f;

    public n0(z zVar, e.d.b.e.a.c.b0<e3> b0Var, e.d.b.e.a.c.b0<t> b0Var2, t0 t0Var) {
        this.f6869c = zVar;
        this.f6870d = b0Var;
        this.f6871e = b0Var2;
        this.f6872f = t0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:1|(1:3)|4|5|6|(1:8)(2:138|139)|9|10|11|(2:13|(13:15|16|(1:(1:(2:20|(1:22)(2:98|99))(2:100|101))(2:102|(10:104|(7:25|(4:26|(2:30|(1:39)(4:34|(1:36)|37|38))|40|(1:42)(1:66))|44|45|(1:47)|48|(2:50|(1:52)(2:53|(1:55)(3:56|(2:58|(1:60)(2:62|63))(1:65)|61))))|67|68|(2:92|93)|70|71|72|73|(4:75|308|84|85)(1:89))(2:105|106)))(2:107|(4:109|(4:110|(1:112)|113|(1:1)(1:116))|118|(3:120|121|122))(2:125|126))|23|(0)|67|68|(0)|70|71|72|73|(0)(0))(2:131|132))|133|(0)|67|68|(0)|70|71|72|73|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02da, code lost:
        e.d.b.e.a.a.n0.a.a(5, "Could not close file for chunk %s of slice %s of pack %s.", new java.lang.Object[]{java.lang.Integer.valueOf(r23.f6852g), r23.f6850e, r23.f6822b});
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0345 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x027d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0187 A[Catch: all -> 0x0271, TryCatch #1 {all -> 0x0271, blocks: (B:58:0x0187, B:59:0x0190, B:61:0x0198, B:63:0x019c, B:65:0x01a2, B:67:0x01a8, B:69:0x01c8, B:70:0x01d4, B:71:0x01d8, B:72:0x01dd, B:74:0x01e1, B:76:0x01e5, B:78:0x01e9, B:79:0x01f7, B:81:0x01fd, B:83:0x0201, B:84:0x0212, B:86:0x0216, B:87:0x0225, B:89:0x0229, B:95:0x0264, B:92:0x024b, B:93:0x0252, B:94:0x0253, B:50:0x0153, B:52:0x0159, B:53:0x0163, B:54:0x0164, B:55:0x0182), top: B:140:0x0044 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(e.d.b.e.a.a.m0 r23) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.b.e.a.a.n0.a(e.d.b.e.a.a.m0):void");
    }

    public final File b(m0 m0Var) {
        File b2 = this.f6869c.b(m0Var.f6822b, m0Var.f6848c, m0Var.f6849d, m0Var.f6850e);
        if (!b2.exists()) {
            b2.mkdirs();
        }
        return b2;
    }
}
