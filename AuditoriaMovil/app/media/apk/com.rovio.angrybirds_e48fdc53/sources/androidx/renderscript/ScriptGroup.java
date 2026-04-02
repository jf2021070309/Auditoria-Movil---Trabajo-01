package androidx.renderscript;

import android.os.Build;
import android.util.Log;
import android.util.Pair;
import androidx.renderscript.Allocation;
import androidx.renderscript.Script;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes6.dex */
public final class ScriptGroup extends BaseObj {
    private static final int MIN_API_VERSION = 23;
    private static final String TAG = "ScriptGroup";
    private List<Closure> mClosures;
    IO[] mInputs;
    private List<Input> mInputs2;
    private String mName;
    private ArrayList<Node> mNodes;
    IO[] mOutputs;
    private Future[] mOutputs2;
    private boolean mUseIncSupp;

    /* loaded from: classes6.dex */
    static class IO {
        Allocation mAllocation;
        Script.KernelID mKID;

        IO(Script.KernelID s) {
            this.mKID = s;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class ConnectLine {
        Allocation mAllocation;
        Type mAllocationType;
        Script.KernelID mFrom;
        Script.FieldID mToF;
        Script.KernelID mToK;

        ConnectLine(Type t, Script.KernelID from, Script.KernelID to) {
            this.mFrom = from;
            this.mToK = to;
            this.mAllocationType = t;
        }

        ConnectLine(Type t, Script.KernelID from, Script.FieldID to) {
            this.mFrom = from;
            this.mToF = to;
            this.mAllocationType = t;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class Node {
        int dagNumber;
        Node mNext;
        int mOrder;
        Script mScript;
        boolean mSeen;
        ArrayList<Script.KernelID> mKernels = new ArrayList<>();
        ArrayList<ConnectLine> mInputs = new ArrayList<>();
        ArrayList<ConnectLine> mOutputs = new ArrayList<>();

        Node(Script s) {
            this.mScript = s;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Closure extends BaseObj {
        private static final String TAG = "Closure";
        private Object[] mArgs;
        private Map<Script.FieldID, Object> mBindings;
        private FieldPacker mFP;
        private Map<Script.FieldID, Future> mGlobalFuture;
        private Future mReturnFuture;
        private Allocation mReturnValue;

        Closure(long id, RenderScript rs) {
            super(id, rs);
        }

        Closure(RenderScript rs, Script.KernelID kernelID, Type returnType, Object[] args, Map<Script.FieldID, Object> globals) {
            super(0L, rs);
            if (Build.VERSION.SDK_INT < 23 && rs.isUseNative()) {
                throw new RSRuntimeException("ScriptGroup2 not supported in this API level");
            }
            this.mArgs = args;
            this.mReturnValue = Allocation.createTyped(rs, returnType);
            this.mBindings = globals;
            this.mGlobalFuture = new HashMap();
            int numValues = args.length + globals.size();
            long[] fieldIDs = new long[numValues];
            long[] values = new long[numValues];
            int[] sizes = new int[numValues];
            long[] depClosures = new long[numValues];
            long[] depFieldIDs = new long[numValues];
            int i = 0;
            while (i < args.length) {
                fieldIDs[i] = 0;
                long[] depFieldIDs2 = depFieldIDs;
                long[] depClosures2 = depClosures;
                int[] sizes2 = sizes;
                retrieveValueAndDependenceInfo(rs, i, null, args[i], values, sizes2, depClosures2, depFieldIDs2);
                i++;
                depFieldIDs = depFieldIDs2;
                depClosures = depClosures2;
                sizes = sizes2;
                values = values;
                fieldIDs = fieldIDs;
                numValues = numValues;
            }
            long[] depFieldIDs3 = depFieldIDs;
            long[] depClosures3 = depClosures;
            int[] sizes3 = sizes;
            long[] values2 = values;
            long[] fieldIDs2 = fieldIDs;
            int i2 = i;
            for (Map.Entry<Script.FieldID, Object> entry : globals.entrySet()) {
                Object obj = entry.getValue();
                Script.FieldID fieldID = entry.getKey();
                fieldIDs2[i2] = fieldID.getID(rs);
                retrieveValueAndDependenceInfo(rs, i2, fieldID, obj, values2, sizes3, depClosures3, depFieldIDs3);
                i2++;
            }
            long id = rs.nClosureCreate(kernelID.getID(rs), this.mReturnValue.getID(rs), fieldIDs2, values2, sizes3, depClosures3, depFieldIDs3);
            setID(id);
        }

        Closure(RenderScript rs, Script.InvokeID invokeID, Object[] args, Map<Script.FieldID, Object> globals) {
            super(0L, rs);
            if (Build.VERSION.SDK_INT >= 23 || !rs.isUseNative()) {
                this.mFP = FieldPacker.createFromArray(args);
                this.mArgs = args;
                this.mBindings = globals;
                this.mGlobalFuture = new HashMap();
                int numValues = globals.size();
                long[] fieldIDs = new long[numValues];
                long[] values = new long[numValues];
                int[] sizes = new int[numValues];
                long[] jArr = new long[numValues];
                long[] depFieldIDs = new long[numValues];
                int i = 0;
                for (Map.Entry<Script.FieldID, Object> entry : globals.entrySet()) {
                    Object obj = entry.getValue();
                    Script.FieldID fieldID = entry.getKey();
                    fieldIDs[i] = fieldID.getID(rs);
                    long[] depFieldIDs2 = depFieldIDs;
                    retrieveValueAndDependenceInfo(rs, i, fieldID, obj, values, sizes, jArr, depFieldIDs2);
                    i++;
                    depFieldIDs = depFieldIDs2;
                    sizes = sizes;
                }
                long id = rs.nInvokeClosureCreate(invokeID.getID(rs), this.mFP.getData(), fieldIDs, values, sizes);
                setID(id);
                return;
            }
            throw new RSRuntimeException("ScriptGroup2 not supported in this API level");
        }

        private void retrieveValueAndDependenceInfo(RenderScript rs, int index, Script.FieldID fid, Object obj, long[] values, int[] sizes, long[] depClosures, long[] depFieldIDs) {
            if (obj instanceof Future) {
                Future f = (Future) obj;
                obj = f.getValue();
                depClosures[index] = f.getClosure().getID(rs);
                Script.FieldID fieldID = f.getFieldID();
                depFieldIDs[index] = fieldID != null ? fieldID.getID(rs) : 0L;
            } else {
                depClosures[index] = 0;
                depFieldIDs[index] = 0;
            }
            if (obj instanceof Input) {
                Input unbound = (Input) obj;
                if (index < this.mArgs.length) {
                    unbound.addReference(this, index);
                } else {
                    unbound.addReference(this, fid);
                }
                values[index] = 0;
                sizes[index] = 0;
                return;
            }
            ValueAndSize vs = new ValueAndSize(rs, obj);
            values[index] = vs.value;
            sizes[index] = vs.size;
        }

        public Future getReturn() {
            if (this.mReturnFuture == null) {
                this.mReturnFuture = new Future(this, null, this.mReturnValue);
            }
            return this.mReturnFuture;
        }

        public Future getGlobal(Script.FieldID field) {
            Future f = this.mGlobalFuture.get(field);
            if (f == null) {
                Object obj = this.mBindings.get(field);
                if (obj instanceof Future) {
                    obj = ((Future) obj).getValue();
                }
                Future f2 = new Future(this, field, obj);
                this.mGlobalFuture.put(field, f2);
                return f2;
            }
            return f;
        }

        void setArg(int index, Object obj) {
            if (obj instanceof Future) {
                obj = ((Future) obj).getValue();
            }
            this.mArgs[index] = obj;
            ValueAndSize vs = new ValueAndSize(this.mRS, obj);
            this.mRS.nClosureSetArg(getID(this.mRS), index, vs.value, vs.size);
        }

        void setGlobal(Script.FieldID fieldID, Object obj) {
            if (obj instanceof Future) {
                obj = ((Future) obj).getValue();
            }
            this.mBindings.put(fieldID, obj);
            ValueAndSize vs = new ValueAndSize(this.mRS, obj);
            this.mRS.nClosureSetGlobal(getID(this.mRS), fieldID.getID(this.mRS), vs.value, vs.size);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes6.dex */
        public static final class ValueAndSize {
            public int size;
            public long value;

            public ValueAndSize(RenderScript rs, Object obj) {
                if (obj instanceof Allocation) {
                    this.value = ((Allocation) obj).getID(rs);
                    this.size = -1;
                } else if (obj instanceof Boolean) {
                    this.value = ((Boolean) obj).booleanValue() ? 1L : 0L;
                    this.size = 4;
                } else if (obj instanceof Integer) {
                    this.value = ((Integer) obj).longValue();
                    this.size = 4;
                } else if (obj instanceof Long) {
                    this.value = ((Long) obj).longValue();
                    this.size = 8;
                } else if (obj instanceof Float) {
                    this.value = Float.floatToRawIntBits(((Float) obj).floatValue());
                    this.size = 4;
                } else if (obj instanceof Double) {
                    this.value = Double.doubleToRawLongBits(((Double) obj).doubleValue());
                    this.size = 8;
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class Future {
        Closure mClosure;
        Script.FieldID mFieldID;
        Object mValue;

        Future(Closure closure, Script.FieldID fieldID, Object value) {
            this.mClosure = closure;
            this.mFieldID = fieldID;
            this.mValue = value;
        }

        Closure getClosure() {
            return this.mClosure;
        }

        Script.FieldID getFieldID() {
            return this.mFieldID;
        }

        Object getValue() {
            return this.mValue;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Input {
        Object mValue;
        List<Pair<Closure, Script.FieldID>> mFieldID = new ArrayList();
        List<Pair<Closure, Integer>> mArgIndex = new ArrayList();

        Input() {
        }

        void addReference(Closure closure, int index) {
            this.mArgIndex.add(Pair.create(closure, Integer.valueOf(index)));
        }

        void addReference(Closure closure, Script.FieldID fieldID) {
            this.mFieldID.add(Pair.create(closure, fieldID));
        }

        void set(Object value) {
            this.mValue = value;
            for (Pair<Closure, Integer> p : this.mArgIndex) {
                Closure closure = (Closure) p.first;
                int index = ((Integer) p.second).intValue();
                closure.setArg(index, value);
            }
            for (Pair<Closure, Script.FieldID> p2 : this.mFieldID) {
                Closure closure2 = (Closure) p2.first;
                Script.FieldID fieldID = (Script.FieldID) p2.second;
                closure2.setGlobal(fieldID, value);
            }
        }

        Object get() {
            return this.mValue;
        }
    }

    ScriptGroup(long id, RenderScript rs) {
        super(id, rs);
        this.mUseIncSupp = false;
        this.mNodes = new ArrayList<>();
    }

    ScriptGroup(RenderScript rs, String name, List<Closure> closures, List<Input> inputs, Future[] outputs) {
        super(0L, rs);
        this.mUseIncSupp = false;
        this.mNodes = new ArrayList<>();
        if (Build.VERSION.SDK_INT < 23 && rs.isUseNative()) {
            throw new RSRuntimeException("ScriptGroup2 not supported in this API level");
        }
        this.mName = name;
        this.mClosures = closures;
        this.mInputs2 = inputs;
        this.mOutputs2 = outputs;
        long[] closureIDs = new long[closures.size()];
        for (int i = 0; i < closureIDs.length; i++) {
            closureIDs[i] = closures.get(i).getID(rs);
        }
        String cachePath = rs.getApplicationContext().getCacheDir().toString();
        long id = rs.nScriptGroup2Create(name, cachePath, closureIDs);
        setID(id);
    }

    public Object[] execute(Object... inputs) {
        if (inputs.length < this.mInputs2.size()) {
            Log.e(TAG, toString() + " receives " + inputs.length + " inputs, less than expected " + this.mInputs2.size());
            return null;
        }
        if (inputs.length > this.mInputs2.size()) {
            Log.i(TAG, toString() + " receives " + inputs.length + " inputs, more than expected " + this.mInputs2.size());
        }
        for (int i = 0; i < this.mInputs2.size(); i++) {
            Object obj = inputs[i];
            if ((obj instanceof Future) || (obj instanceof Input)) {
                Log.e(TAG, toString() + ": input " + i + " is a future or unbound value");
                return null;
            }
            Input unbound = this.mInputs2.get(i);
            unbound.set(obj);
        }
        this.mRS.nScriptGroup2Execute(getID(this.mRS));
        Future[] futureArr = this.mOutputs2;
        Object[] outputObjs = new Object[futureArr.length];
        int i2 = 0;
        int length = futureArr.length;
        int i3 = 0;
        while (i3 < length) {
            Future f = futureArr[i3];
            Object output = f.getValue();
            if (output instanceof Input) {
                output = ((Input) output).get();
            }
            outputObjs[i2] = output;
            i3++;
            i2++;
        }
        return outputObjs;
    }

    @Deprecated
    public void setInput(Script.KernelID s, Allocation a) {
        int ct = 0;
        while (true) {
            IO[] ioArr = this.mInputs;
            if (ct < ioArr.length) {
                if (ioArr[ct].mKID != s) {
                    ct++;
                } else {
                    this.mInputs[ct].mAllocation = a;
                    if (!this.mUseIncSupp) {
                        this.mRS.nScriptGroupSetInput(getID(this.mRS), s.getID(this.mRS), this.mRS.safeID(a));
                        return;
                    }
                    return;
                }
            } else {
                throw new RSIllegalArgumentException("Script not found");
            }
        }
    }

    @Deprecated
    public void setOutput(Script.KernelID s, Allocation a) {
        int ct = 0;
        while (true) {
            IO[] ioArr = this.mOutputs;
            if (ct < ioArr.length) {
                if (ioArr[ct].mKID != s) {
                    ct++;
                } else {
                    this.mOutputs[ct].mAllocation = a;
                    if (!this.mUseIncSupp) {
                        this.mRS.nScriptGroupSetOutput(getID(this.mRS), s.getID(this.mRS), this.mRS.safeID(a));
                        return;
                    }
                    return;
                }
            } else {
                throw new RSIllegalArgumentException("Script not found");
            }
        }
    }

    @Deprecated
    public void execute() {
        IO[] ioArr;
        IO[] ioArr2;
        if (!this.mUseIncSupp) {
            this.mRS.nScriptGroupExecute(getID(this.mRS));
            return;
        }
        for (int ct = 0; ct < this.mNodes.size(); ct++) {
            Node n = this.mNodes.get(ct);
            for (int ct2 = 0; ct2 < n.mOutputs.size(); ct2++) {
                ConnectLine l = n.mOutputs.get(ct2);
                if (l.mAllocation == null) {
                    Allocation alloc = Allocation.createTyped(this.mRS, l.mAllocationType, Allocation.MipmapControl.MIPMAP_NONE, 1);
                    l.mAllocation = alloc;
                    for (int ct3 = ct2 + 1; ct3 < n.mOutputs.size(); ct3++) {
                        if (n.mOutputs.get(ct3).mFrom == l.mFrom) {
                            n.mOutputs.get(ct3).mAllocation = alloc;
                        }
                    }
                }
            }
        }
        Iterator<Node> it = this.mNodes.iterator();
        while (it.hasNext()) {
            Node node = it.next();
            Iterator<Script.KernelID> it2 = node.mKernels.iterator();
            while (it2.hasNext()) {
                Script.KernelID kernel = it2.next();
                Allocation ain = null;
                Allocation aout = null;
                Iterator<ConnectLine> it3 = node.mInputs.iterator();
                while (it3.hasNext()) {
                    ConnectLine nodeInput = it3.next();
                    if (nodeInput.mToK == kernel) {
                        ain = nodeInput.mAllocation;
                    }
                }
                for (IO sgInput : this.mInputs) {
                    if (sgInput.mKID == kernel) {
                        ain = sgInput.mAllocation;
                    }
                }
                Iterator<ConnectLine> it4 = node.mOutputs.iterator();
                while (it4.hasNext()) {
                    ConnectLine nodeOutput = it4.next();
                    if (nodeOutput.mFrom == kernel) {
                        aout = nodeOutput.mAllocation;
                    }
                }
                for (IO sgOutput : this.mOutputs) {
                    if (sgOutput.mKID == kernel) {
                        aout = sgOutput.mAllocation;
                    }
                }
                kernel.mScript.forEach(kernel.mSlot, ain, aout, (FieldPacker) null);
            }
        }
    }

    @Deprecated
    /* loaded from: classes6.dex */
    public static final class Builder {
        private int mKernelCount;
        private RenderScript mRS;
        private ArrayList<Node> mNodes = new ArrayList<>();
        private ArrayList<ConnectLine> mLines = new ArrayList<>();
        private boolean mUseIncSupp = false;

        public Builder(RenderScript rs) {
            this.mRS = rs;
        }

        private void validateCycle(Node target, Node original) {
            for (int ct = 0; ct < target.mOutputs.size(); ct++) {
                ConnectLine cl = target.mOutputs.get(ct);
                if (cl.mToK != null) {
                    Node tn = findNode(cl.mToK.mScript);
                    if (tn.equals(original)) {
                        throw new RSInvalidStateException("Loops in group not allowed.");
                    }
                    validateCycle(tn, original);
                }
                if (cl.mToF != null) {
                    Node tn2 = findNode(cl.mToF.mScript);
                    if (tn2.equals(original)) {
                        throw new RSInvalidStateException("Loops in group not allowed.");
                    }
                    validateCycle(tn2, original);
                }
            }
        }

        private void mergeDAGs(int valueUsed, int valueKilled) {
            for (int ct = 0; ct < this.mNodes.size(); ct++) {
                if (this.mNodes.get(ct).dagNumber == valueKilled) {
                    this.mNodes.get(ct).dagNumber = valueUsed;
                }
            }
        }

        private void validateDAGRecurse(Node n, int dagNumber) {
            if (n.dagNumber != 0 && n.dagNumber != dagNumber) {
                mergeDAGs(n.dagNumber, dagNumber);
                return;
            }
            n.dagNumber = dagNumber;
            for (int ct = 0; ct < n.mOutputs.size(); ct++) {
                ConnectLine cl = n.mOutputs.get(ct);
                if (cl.mToK != null) {
                    Node tn = findNode(cl.mToK.mScript);
                    validateDAGRecurse(tn, dagNumber);
                }
                if (cl.mToF != null) {
                    Node tn2 = findNode(cl.mToF.mScript);
                    validateDAGRecurse(tn2, dagNumber);
                }
            }
        }

        private void validateDAG() {
            for (int ct = 0; ct < this.mNodes.size(); ct++) {
                Node n = this.mNodes.get(ct);
                if (n.mInputs.size() == 0) {
                    if (n.mOutputs.size() == 0 && this.mNodes.size() > 1) {
                        throw new RSInvalidStateException("Groups cannot contain unconnected scripts");
                    }
                    validateDAGRecurse(n, ct + 1);
                }
            }
            int dagNumber = this.mNodes.get(0).dagNumber;
            for (int ct2 = 0; ct2 < this.mNodes.size(); ct2++) {
                if (this.mNodes.get(ct2).dagNumber != dagNumber) {
                    throw new RSInvalidStateException("Multiple DAGs in group not allowed.");
                }
            }
        }

        private Node findNode(Script s) {
            for (int ct = 0; ct < this.mNodes.size(); ct++) {
                if (s == this.mNodes.get(ct).mScript) {
                    return this.mNodes.get(ct);
                }
            }
            return null;
        }

        private Node findNode(Script.KernelID k) {
            for (int ct = 0; ct < this.mNodes.size(); ct++) {
                Node n = this.mNodes.get(ct);
                for (int ct2 = 0; ct2 < n.mKernels.size(); ct2++) {
                    if (k == n.mKernels.get(ct2)) {
                        return n;
                    }
                }
            }
            return null;
        }

        public Builder addKernel(Script.KernelID k) {
            if (this.mLines.size() != 0) {
                throw new RSInvalidStateException("Kernels may not be added once connections exist.");
            }
            if (k.mScript.isIncSupp()) {
                this.mUseIncSupp = true;
            }
            if (findNode(k) != null) {
                return this;
            }
            this.mKernelCount++;
            Node n = findNode(k.mScript);
            if (n == null) {
                n = new Node(k.mScript);
                this.mNodes.add(n);
            }
            n.mKernels.add(k);
            return this;
        }

        public Builder addConnection(Type t, Script.KernelID from, Script.FieldID to) {
            Node nf = findNode(from);
            if (nf == null) {
                throw new RSInvalidStateException("From script not found.");
            }
            Node nt = findNode(to.mScript);
            if (nt == null) {
                throw new RSInvalidStateException("To script not found.");
            }
            ConnectLine cl = new ConnectLine(t, from, to);
            this.mLines.add(new ConnectLine(t, from, to));
            nf.mOutputs.add(cl);
            nt.mInputs.add(cl);
            validateCycle(nf, nf);
            return this;
        }

        public Builder addConnection(Type t, Script.KernelID from, Script.KernelID to) {
            Node nf = findNode(from);
            if (nf == null) {
                throw new RSInvalidStateException("From script not found.");
            }
            Node nt = findNode(to);
            if (nt == null) {
                throw new RSInvalidStateException("To script not found.");
            }
            ConnectLine cl = new ConnectLine(t, from, to);
            this.mLines.add(new ConnectLine(t, from, to));
            nf.mOutputs.add(cl);
            nt.mInputs.add(cl);
            validateCycle(nf, nf);
            return this;
        }

        private boolean calcOrderRecurse(Node node0, int depth) {
            Node node1;
            node0.mSeen = true;
            if (node0.mOrder < depth) {
                node0.mOrder = depth;
            }
            boolean ret = true;
            Iterator<ConnectLine> it = node0.mOutputs.iterator();
            while (it.hasNext()) {
                ConnectLine link = it.next();
                if (link.mToF != null) {
                    node1 = findNode(link.mToF.mScript);
                } else {
                    node1 = findNode(link.mToK.mScript);
                }
                if (!node1.mSeen) {
                    ret &= calcOrderRecurse(node1, node0.mOrder + 1);
                } else {
                    return false;
                }
            }
            return ret;
        }

        private boolean calcOrder() {
            boolean ret = true;
            Iterator<Node> it = this.mNodes.iterator();
            while (it.hasNext()) {
                Node n0 = it.next();
                if (n0.mInputs.size() == 0) {
                    Iterator<Node> it2 = this.mNodes.iterator();
                    while (it2.hasNext()) {
                        Node n1 = it2.next();
                        n1.mSeen = false;
                    }
                    ret &= calcOrderRecurse(n0, 1);
                }
            }
            Collections.sort(this.mNodes, new Comparator<Node>() { // from class: androidx.renderscript.ScriptGroup.Builder.1
                @Override // java.util.Comparator
                public int compare(Node n12, Node n2) {
                    return n12.mOrder - n2.mOrder;
                }
            });
            return ret;
        }

        public ScriptGroup create() {
            if (this.mNodes.size() == 0) {
                throw new RSInvalidStateException("Empty script groups are not allowed");
            }
            for (int ct = 0; ct < this.mNodes.size(); ct++) {
                this.mNodes.get(ct).dagNumber = 0;
            }
            validateDAG();
            ArrayList<IO> inputs = new ArrayList<>();
            ArrayList<IO> outputs = new ArrayList<>();
            long[] kernels = new long[this.mKernelCount];
            int idx = 0;
            for (int ct2 = 0; ct2 < this.mNodes.size(); ct2++) {
                Node n = this.mNodes.get(ct2);
                int ct22 = 0;
                while (ct22 < n.mKernels.size()) {
                    Script.KernelID kid = n.mKernels.get(ct22);
                    int idx2 = idx + 1;
                    kernels[idx] = kid.getID(this.mRS);
                    boolean hasInput = false;
                    boolean hasOutput = false;
                    for (int ct3 = 0; ct3 < n.mInputs.size(); ct3++) {
                        if (n.mInputs.get(ct3).mToK == kid) {
                            hasInput = true;
                        }
                    }
                    for (int ct32 = 0; ct32 < n.mOutputs.size(); ct32++) {
                        if (n.mOutputs.get(ct32).mFrom == kid) {
                            hasOutput = true;
                        }
                    }
                    if (!hasInput) {
                        inputs.add(new IO(kid));
                    }
                    if (!hasOutput) {
                        outputs.add(new IO(kid));
                    }
                    ct22++;
                    idx = idx2;
                }
            }
            if (idx != this.mKernelCount) {
                throw new RSRuntimeException("Count mismatch, should not happen.");
            }
            long id = 0;
            if (!this.mUseIncSupp) {
                long[] src = new long[this.mLines.size()];
                long[] dstk = new long[this.mLines.size()];
                long[] dstf = new long[this.mLines.size()];
                long[] types = new long[this.mLines.size()];
                for (int ct4 = 0; ct4 < this.mLines.size(); ct4++) {
                    ConnectLine cl = this.mLines.get(ct4);
                    src[ct4] = cl.mFrom.getID(this.mRS);
                    if (cl.mToK != null) {
                        dstk[ct4] = cl.mToK.getID(this.mRS);
                    }
                    if (cl.mToF != null) {
                        dstf[ct4] = cl.mToF.getID(this.mRS);
                    }
                    types[ct4] = cl.mAllocationType.getID(this.mRS);
                }
                id = this.mRS.nScriptGroupCreate(kernels, src, dstk, dstf, types);
                if (id == 0) {
                    throw new RSRuntimeException("Object creation error, should not happen.");
                }
            } else {
                calcOrder();
            }
            ScriptGroup sg = new ScriptGroup(id, this.mRS);
            sg.mOutputs = new IO[outputs.size()];
            for (int ct5 = 0; ct5 < outputs.size(); ct5++) {
                sg.mOutputs[ct5] = outputs.get(ct5);
            }
            int ct6 = inputs.size();
            sg.mInputs = new IO[ct6];
            for (int ct7 = 0; ct7 < inputs.size(); ct7++) {
                sg.mInputs[ct7] = inputs.get(ct7);
            }
            sg.mNodes = this.mNodes;
            sg.mUseIncSupp = this.mUseIncSupp;
            return sg;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Binding {
        private final Script.FieldID mField;
        private final Object mValue;

        public Binding(Script.FieldID field, Object value) {
            this.mField = field;
            this.mValue = value;
        }

        public Script.FieldID getField() {
            return this.mField;
        }

        public Object getValue() {
            return this.mValue;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Builder2 {
        private static final String TAG = "ScriptGroup.Builder2";
        List<Closure> mClosures = new ArrayList();
        List<Input> mInputs = new ArrayList();
        RenderScript mRS;

        public Builder2(RenderScript rs) {
            this.mRS = rs;
        }

        private Closure addKernelInternal(Script.KernelID k, Type returnType, Object[] args, Map<Script.FieldID, Object> globalBindings) {
            Closure c = new Closure(this.mRS, k, returnType, args, globalBindings);
            this.mClosures.add(c);
            return c;
        }

        private Closure addInvokeInternal(Script.InvokeID invoke, Object[] args, Map<Script.FieldID, Object> globalBindings) {
            Closure c = new Closure(this.mRS, invoke, args, globalBindings);
            this.mClosures.add(c);
            return c;
        }

        public Input addInput() {
            Input unbound = new Input();
            this.mInputs.add(unbound);
            return unbound;
        }

        public Closure addKernel(Script.KernelID k, Type returnType, Object... argsAndBindings) {
            ArrayList<Object> args = new ArrayList<>();
            Map<Script.FieldID, Object> bindingMap = new HashMap<>();
            if (!seperateArgsAndBindings(argsAndBindings, args, bindingMap)) {
                return null;
            }
            return addKernelInternal(k, returnType, args.toArray(), bindingMap);
        }

        public Closure addInvoke(Script.InvokeID invoke, Object... argsAndBindings) {
            ArrayList<Object> args = new ArrayList<>();
            Map<Script.FieldID, Object> bindingMap = new HashMap<>();
            if (!seperateArgsAndBindings(argsAndBindings, args, bindingMap)) {
                return null;
            }
            return addInvokeInternal(invoke, args.toArray(), bindingMap);
        }

        public ScriptGroup create(String name, Future... outputs) {
            if (name == null || name.isEmpty() || name.length() > 100 || !name.equals(name.replaceAll("[^a-zA-Z0-9-]", "_"))) {
                throw new RSIllegalArgumentException("invalid script group name");
            }
            ScriptGroup ret = new ScriptGroup(this.mRS, name, this.mClosures, this.mInputs, outputs);
            return ret;
        }

        private boolean seperateArgsAndBindings(Object[] argsAndBindings, ArrayList<Object> args, Map<Script.FieldID, Object> bindingMap) {
            int i = 0;
            while (i < argsAndBindings.length && !(argsAndBindings[i] instanceof Binding)) {
                args.add(argsAndBindings[i]);
                i++;
            }
            while (i < argsAndBindings.length) {
                if (!(argsAndBindings[i] instanceof Binding)) {
                    return false;
                }
                Binding b = (Binding) argsAndBindings[i];
                bindingMap.put(b.getField(), b.getValue());
                i++;
            }
            return true;
        }
    }
}
