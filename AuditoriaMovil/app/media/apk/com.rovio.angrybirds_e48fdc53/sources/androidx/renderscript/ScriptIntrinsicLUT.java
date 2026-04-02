package androidx.renderscript;

import android.os.Build;
import androidx.renderscript.Script;
/* loaded from: classes6.dex */
public class ScriptIntrinsicLUT extends ScriptIntrinsic {
    private static final int INTRINSIC_API_LEVEL = 19;
    private final byte[] mCache;
    private boolean mDirty;
    private final Matrix4f mMatrix;
    private Allocation mTables;

    protected ScriptIntrinsicLUT(long id, RenderScript rs) {
        super(id, rs);
        this.mMatrix = new Matrix4f();
        this.mCache = new byte[1024];
        this.mDirty = true;
    }

    public static ScriptIntrinsicLUT create(RenderScript rs, Element e) {
        boolean mUseIncSupp = rs.isUseNative() && Build.VERSION.SDK_INT < 19;
        long id = rs.nScriptIntrinsicCreate(3, e.getID(rs), mUseIncSupp);
        ScriptIntrinsicLUT si = new ScriptIntrinsicLUT(id, rs);
        si.setIncSupp(mUseIncSupp);
        si.mTables = Allocation.createSized(rs, Element.U8(rs), 1024);
        for (int ct = 0; ct < 256; ct++) {
            byte[] bArr = si.mCache;
            bArr[ct] = (byte) ct;
            bArr[ct + 256] = (byte) ct;
            bArr[ct + 512] = (byte) ct;
            bArr[ct + 768] = (byte) ct;
        }
        si.setVar(0, si.mTables);
        return si;
    }

    private void validate(int index, int value) {
        if (index < 0 || index > 255) {
            throw new RSIllegalArgumentException("Index out of range (0-255).");
        }
        if (value < 0 || value > 255) {
            throw new RSIllegalArgumentException("Value out of range (0-255).");
        }
    }

    public void setRed(int index, int value) {
        validate(index, value);
        this.mCache[index] = (byte) value;
        this.mDirty = true;
    }

    public void setGreen(int index, int value) {
        validate(index, value);
        this.mCache[index + 256] = (byte) value;
        this.mDirty = true;
    }

    public void setBlue(int index, int value) {
        validate(index, value);
        this.mCache[index + 512] = (byte) value;
        this.mDirty = true;
    }

    public void setAlpha(int index, int value) {
        validate(index, value);
        this.mCache[index + 768] = (byte) value;
        this.mDirty = true;
    }

    public void forEach(Allocation ain, Allocation aout) {
        if (this.mDirty) {
            this.mDirty = false;
            this.mTables.copyFromUnchecked(this.mCache);
        }
        forEach(0, ain, aout, (FieldPacker) null);
    }

    public Script.KernelID getKernelID() {
        return createKernelID(0, 3, null, null);
    }
}
