package androidx.renderscript;

import android.renderscript.Script;
import android.util.SparseArray;
import java.io.UnsupportedEncodingException;
/* loaded from: classes6.dex */
public class Script extends BaseObj {
    private final SparseArray<FieldID> mFIDs;
    private final SparseArray<InvokeID> mIIDs;
    private final SparseArray<KernelID> mKIDs;
    private boolean mUseIncSupp;

    /* JADX INFO: Access modifiers changed from: protected */
    public void setIncSupp(boolean useInc) {
        this.mUseIncSupp = useInc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isIncSupp() {
        return this.mUseIncSupp;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getDummyAlloc(Allocation ain) {
        if (ain == null) {
            return 0L;
        }
        Type inType = ain.getType();
        long dInElement = inType.getElement().getDummyElement(this.mRS);
        long dInType = inType.getDummyType(this.mRS, dInElement);
        int xBytesSize = inType.getX() * inType.getElement().getBytesSize();
        long dummyAlloc = this.mRS.nIncAllocationCreateTyped(ain.getID(this.mRS), dInType, xBytesSize);
        ain.setIncAllocID(dummyAlloc);
        return dummyAlloc;
    }

    /* loaded from: classes6.dex */
    public static final class KernelID extends BaseObj {
        Script.KernelID mN;
        Script mScript;
        int mSig;
        int mSlot;

        KernelID(long id, RenderScript rs, Script s, int slot, int sig) {
            super(id, rs);
            this.mScript = s;
            this.mSlot = slot;
            this.mSig = sig;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public KernelID createKernelID(int slot, int sig, Element ein, Element eout) {
        KernelID k = this.mKIDs.get(slot);
        if (k == null) {
            long id = this.mRS.nScriptKernelIDCreate(getID(this.mRS), slot, sig, this.mUseIncSupp);
            if (id == 0) {
                throw new RSDriverException("Failed to create KernelID");
            }
            KernelID k2 = new KernelID(id, this.mRS, this, slot, sig);
            this.mKIDs.put(slot, k2);
            return k2;
        }
        return k;
    }

    /* loaded from: classes6.dex */
    public static final class InvokeID extends BaseObj {
        Script mScript;
        int mSlot;

        InvokeID(long id, RenderScript rs, Script s, int slot) {
            super(id, rs);
            this.mScript = s;
            this.mSlot = slot;
        }
    }

    protected InvokeID createInvokeID(int slot) {
        InvokeID i = this.mIIDs.get(slot);
        if (i != null) {
            return i;
        }
        long id = this.mRS.nScriptInvokeIDCreate(getID(this.mRS), slot);
        if (id == 0) {
            throw new RSDriverException("Failed to create KernelID");
        }
        InvokeID i2 = new InvokeID(id, this.mRS, this, slot);
        this.mIIDs.put(slot, i2);
        return i2;
    }

    /* loaded from: classes6.dex */
    public static final class FieldID extends BaseObj {
        Script.FieldID mN;
        Script mScript;
        int mSlot;

        FieldID(long id, RenderScript rs, Script s, int slot) {
            super(id, rs);
            this.mScript = s;
            this.mSlot = slot;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FieldID createFieldID(int slot, Element e) {
        FieldID f = this.mFIDs.get(slot);
        if (f != null) {
            return f;
        }
        long id = this.mRS.nScriptFieldIDCreate(getID(this.mRS), slot, this.mUseIncSupp);
        if (id == 0) {
            throw new RSDriverException("Failed to create FieldID");
        }
        FieldID f2 = new FieldID(id, this.mRS, this, slot);
        this.mFIDs.put(slot, f2);
        return f2;
    }

    protected void invoke(int slot) {
        this.mRS.nScriptInvoke(getID(this.mRS), slot, this.mUseIncSupp);
    }

    protected void invoke(int slot, FieldPacker v) {
        if (v != null) {
            this.mRS.nScriptInvokeV(getID(this.mRS), slot, v.getData(), this.mUseIncSupp);
        } else {
            this.mRS.nScriptInvoke(getID(this.mRS), slot, this.mUseIncSupp);
        }
    }

    public void bindAllocation(Allocation va, int slot) {
        this.mRS.validate();
        if (va != null) {
            this.mRS.nScriptBindAllocation(getID(this.mRS), va.getID(this.mRS), slot, this.mUseIncSupp);
        } else {
            this.mRS.nScriptBindAllocation(getID(this.mRS), 0L, slot, this.mUseIncSupp);
        }
    }

    public void setTimeZone(String timeZone) {
        this.mRS.validate();
        try {
            this.mRS.nScriptSetTimeZone(getID(this.mRS), timeZone.getBytes("UTF-8"), this.mUseIncSupp);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void forEach(int slot, Allocation ain, Allocation aout, FieldPacker v) {
        byte[] params;
        if (ain == null && aout == null) {
            throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
        }
        long in_id = 0;
        long out_id = 0;
        if (ain != null) {
            in_id = ain.getID(this.mRS);
        }
        if (aout != null) {
            out_id = aout.getID(this.mRS);
        }
        if (v == null) {
            params = null;
        } else {
            byte[] params2 = v.getData();
            params = params2;
        }
        if (!this.mUseIncSupp) {
            this.mRS.nScriptForEach(getID(this.mRS), slot, in_id, out_id, params, this.mUseIncSupp);
            return;
        }
        long ainInc = getDummyAlloc(ain);
        long aoutInc = getDummyAlloc(aout);
        this.mRS.nScriptForEach(getID(this.mRS), slot, ainInc, aoutInc, params, this.mUseIncSupp);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void forEach(int slot, Allocation ain, Allocation aout, FieldPacker v, LaunchOptions sc) {
        byte[] params;
        if (ain == null && aout == null) {
            throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
        }
        if (sc == null) {
            forEach(slot, ain, aout, v);
            return;
        }
        long in_id = 0;
        long out_id = 0;
        if (ain != null) {
            in_id = ain.getID(this.mRS);
        }
        if (aout != null) {
            out_id = aout.getID(this.mRS);
        }
        if (v == null) {
            params = null;
        } else {
            byte[] params2 = v.getData();
            params = params2;
        }
        if (!this.mUseIncSupp) {
            this.mRS.nScriptForEachClipped(getID(this.mRS), slot, in_id, out_id, params, sc.xstart, sc.xend, sc.ystart, sc.yend, sc.zstart, sc.zend, this.mUseIncSupp);
            return;
        }
        long ainInc = getDummyAlloc(ain);
        long aoutInc = getDummyAlloc(aout);
        this.mRS.nScriptForEachClipped(getID(this.mRS), slot, ainInc, aoutInc, params, sc.xstart, sc.xend, sc.ystart, sc.yend, sc.zstart, sc.zend, this.mUseIncSupp);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Script(long id, RenderScript rs) {
        super(id, rs);
        this.mKIDs = new SparseArray<>();
        this.mIIDs = new SparseArray<>();
        this.mFIDs = new SparseArray<>();
        this.mUseIncSupp = false;
    }

    protected void forEach(int slot, Allocation[] ains, Allocation aout, FieldPacker v) {
        forEach(slot, ains, aout, v, (LaunchOptions) null);
    }

    protected void forEach(int slot, Allocation[] ains, Allocation aout, FieldPacker v, LaunchOptions sc) {
        long[] in_ids;
        long out_id;
        byte[] params;
        int[] limits;
        this.mRS.validate();
        if (ains != null) {
            for (Allocation ain : ains) {
                this.mRS.validateObject(ain);
            }
        }
        this.mRS.validateObject(aout);
        if (ains == null && aout == null) {
            throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
        }
        if (ains != null) {
            in_ids = new long[ains.length];
            for (int index = 0; index < ains.length; index++) {
                in_ids[index] = ains[index].getID(this.mRS);
            }
        } else {
            in_ids = null;
        }
        if (aout == null) {
            out_id = 0;
        } else {
            long out_id2 = aout.getID(this.mRS);
            out_id = out_id2;
        }
        if (v == null) {
            params = null;
        } else {
            byte[] params2 = v.getData();
            params = params2;
        }
        if (sc != null) {
            int[] limits2 = {sc.xstart, sc.xend, sc.ystart, sc.yend, sc.zstart, sc.zend};
            limits = limits2;
        } else {
            limits = null;
        }
        this.mRS.nScriptForEach(getID(this.mRS), slot, in_ids, out_id, params, limits);
    }

    protected void reduce(int slot, Allocation[] ains, Allocation aout, LaunchOptions sc) {
        int[] limits;
        this.mRS.validate();
        if (ains == null || ains.length < 1) {
            throw new RSIllegalArgumentException("At least one input is required.");
        }
        if (aout == null) {
            throw new RSIllegalArgumentException("aout is required to be non-null.");
        }
        for (Allocation ain : ains) {
            this.mRS.validateObject(ain);
        }
        long[] in_ids = new long[ains.length];
        for (int index = 0; index < ains.length; index++) {
            in_ids[index] = ains[index].getID(this.mRS);
        }
        long out_id = aout.getID(this.mRS);
        if (sc != null) {
            int[] limits2 = {sc.xstart, sc.xend, sc.ystart, sc.yend, sc.zstart, sc.zend};
            limits = limits2;
        } else {
            limits = null;
        }
        this.mRS.nScriptReduce(getID(this.mRS), slot, in_ids, out_id, limits);
    }

    public void setVar(int index, float v) {
        this.mRS.nScriptSetVarF(getID(this.mRS), index, v, this.mUseIncSupp);
    }

    public void setVar(int index, double v) {
        this.mRS.nScriptSetVarD(getID(this.mRS), index, v, this.mUseIncSupp);
    }

    public void setVar(int index, int v) {
        this.mRS.nScriptSetVarI(getID(this.mRS), index, v, this.mUseIncSupp);
    }

    public void setVar(int index, long v) {
        this.mRS.nScriptSetVarJ(getID(this.mRS), index, v, this.mUseIncSupp);
    }

    public void setVar(int index, boolean v) {
        this.mRS.nScriptSetVarI(getID(this.mRS), index, v ? 1 : 0, this.mUseIncSupp);
    }

    public void setVar(int index, BaseObj o) {
        if (this.mUseIncSupp) {
            long oInc = getDummyAlloc((Allocation) o);
            this.mRS.nScriptSetVarObj(getID(this.mRS), index, o == null ? 0L : oInc, this.mUseIncSupp);
            return;
        }
        this.mRS.nScriptSetVarObj(getID(this.mRS), index, o != null ? o.getID(this.mRS) : 0L, this.mUseIncSupp);
    }

    public void setVar(int index, FieldPacker v) {
        this.mRS.nScriptSetVarV(getID(this.mRS), index, v.getData(), this.mUseIncSupp);
    }

    public void setVar(int index, FieldPacker v, Element e, int[] dims) {
        if (!this.mUseIncSupp) {
            this.mRS.nScriptSetVarVE(getID(this.mRS), index, v.getData(), e.getID(this.mRS), dims, this.mUseIncSupp);
            return;
        }
        long dElement = e.getDummyElement(this.mRS);
        this.mRS.nScriptSetVarVE(getID(this.mRS), index, v.getData(), dElement, dims, this.mUseIncSupp);
    }

    /* loaded from: classes6.dex */
    public static class Builder {
        RenderScript mRS;

        Builder(RenderScript rs) {
            this.mRS = rs;
        }
    }

    /* loaded from: classes6.dex */
    public static class FieldBase {
        protected Allocation mAllocation;
        protected Element mElement;

        protected void init(RenderScript rs, int dimx) {
            this.mAllocation = Allocation.createSized(rs, this.mElement, dimx, 1);
        }

        protected void init(RenderScript rs, int dimx, int usages) {
            this.mAllocation = Allocation.createSized(rs, this.mElement, dimx, usages | 1);
        }

        protected FieldBase() {
        }

        public Element getElement() {
            return this.mElement;
        }

        public Type getType() {
            return this.mAllocation.getType();
        }

        public Allocation getAllocation() {
            return this.mAllocation;
        }

        public void updateAllocation() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class LaunchOptions {
        private int strategy;
        private int xstart = 0;
        private int ystart = 0;
        private int xend = 0;
        private int yend = 0;
        private int zstart = 0;
        private int zend = 0;

        public LaunchOptions setX(int xstartArg, int xendArg) {
            if (xstartArg < 0 || xendArg <= xstartArg) {
                throw new RSIllegalArgumentException("Invalid dimensions");
            }
            this.xstart = xstartArg;
            this.xend = xendArg;
            return this;
        }

        public LaunchOptions setY(int ystartArg, int yendArg) {
            if (ystartArg < 0 || yendArg <= ystartArg) {
                throw new RSIllegalArgumentException("Invalid dimensions");
            }
            this.ystart = ystartArg;
            this.yend = yendArg;
            return this;
        }

        public LaunchOptions setZ(int zstartArg, int zendArg) {
            if (zstartArg < 0 || zendArg <= zstartArg) {
                throw new RSIllegalArgumentException("Invalid dimensions");
            }
            this.zstart = zstartArg;
            this.zend = zendArg;
            return this;
        }

        public int getXStart() {
            return this.xstart;
        }

        public int getXEnd() {
            return this.xend;
        }

        public int getYStart() {
            return this.ystart;
        }

        public int getYEnd() {
            return this.yend;
        }

        public int getZStart() {
            return this.zstart;
        }

        public int getZEnd() {
            return this.zend;
        }
    }
}
