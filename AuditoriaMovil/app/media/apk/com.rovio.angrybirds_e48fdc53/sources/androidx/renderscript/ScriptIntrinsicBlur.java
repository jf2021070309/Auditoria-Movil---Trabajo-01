package androidx.renderscript;

import android.os.Build;
import androidx.renderscript.Script;
/* loaded from: classes6.dex */
public class ScriptIntrinsicBlur extends ScriptIntrinsic {
    private static final int INTRINSIC_API_LEVEL = 19;
    private Allocation mInput;
    private final float[] mValues;

    protected ScriptIntrinsicBlur(long id, RenderScript rs) {
        super(id, rs);
        this.mValues = new float[9];
    }

    public static ScriptIntrinsicBlur create(RenderScript rs, Element e) {
        if (!e.isCompatible(Element.U8_4(rs)) && !e.isCompatible(Element.U8(rs))) {
            throw new RSIllegalArgumentException("Unsupported element type.");
        }
        boolean mUseIncSupp = rs.isUseNative() && Build.VERSION.SDK_INT < 19;
        long id = rs.nScriptIntrinsicCreate(5, e.getID(rs), mUseIncSupp);
        ScriptIntrinsicBlur si = new ScriptIntrinsicBlur(id, rs);
        si.setIncSupp(mUseIncSupp);
        si.setRadius(5.0f);
        return si;
    }

    public void setInput(Allocation ain) {
        if (ain.getType().getY() == 0) {
            throw new RSIllegalArgumentException("Input set to a 1D Allocation");
        }
        this.mInput = ain;
        setVar(1, ain);
    }

    public void setRadius(float radius) {
        if (radius <= 0.0f || radius > 25.0f) {
            throw new RSIllegalArgumentException("Radius out of range (0 < r <= 25).");
        }
        setVar(0, radius);
    }

    public void forEach(Allocation aout) {
        if (aout.getType().getY() == 0) {
            throw new RSIllegalArgumentException("Output is a 1D Allocation");
        }
        forEach(0, (Allocation) null, aout, (FieldPacker) null);
    }

    public Script.KernelID getKernelID() {
        return createKernelID(0, 2, null, null);
    }

    public Script.FieldID getFieldID_Input() {
        return createFieldID(1, null);
    }
}
