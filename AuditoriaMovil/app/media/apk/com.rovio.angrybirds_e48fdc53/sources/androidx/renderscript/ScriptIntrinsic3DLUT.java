package androidx.renderscript;

import android.os.Build;
import androidx.renderscript.Script;
/* loaded from: classes6.dex */
public class ScriptIntrinsic3DLUT extends ScriptIntrinsic {
    private static final int INTRINSIC_API_LEVEL = 19;
    private Element mElement;
    private Allocation mLUT;

    protected ScriptIntrinsic3DLUT(long id, RenderScript rs, Element e) {
        super(id, rs);
        this.mElement = e;
    }

    public static ScriptIntrinsic3DLUT create(RenderScript rs, Element e) {
        if (!e.isCompatible(Element.U8_4(rs))) {
            throw new RSIllegalArgumentException("Element must be compatible with uchar4.");
        }
        boolean mUseIncSupp = rs.isUseNative() && Build.VERSION.SDK_INT < 19;
        long id = rs.nScriptIntrinsicCreate(8, e.getID(rs), mUseIncSupp);
        ScriptIntrinsic3DLUT si = new ScriptIntrinsic3DLUT(id, rs, e);
        si.setIncSupp(mUseIncSupp);
        return si;
    }

    public void setLUT(Allocation lut) {
        Type t = lut.getType();
        if (t.getZ() == 0) {
            throw new RSIllegalArgumentException("LUT must be 3d.");
        }
        if (!t.getElement().isCompatible(this.mElement)) {
            throw new RSIllegalArgumentException("LUT element type must match.");
        }
        this.mLUT = lut;
        setVar(0, lut);
    }

    public void forEach(Allocation ain, Allocation aout) {
        forEach(0, ain, aout, (FieldPacker) null);
    }

    public Script.KernelID getKernelID() {
        return createKernelID(0, 3, null, null);
    }
}
