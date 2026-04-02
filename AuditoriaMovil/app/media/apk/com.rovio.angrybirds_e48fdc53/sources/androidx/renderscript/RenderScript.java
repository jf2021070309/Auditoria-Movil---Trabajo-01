package androidx.renderscript;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import androidx.renderscript.Element;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* loaded from: classes6.dex */
public class RenderScript {
    private static final String CACHE_PATH = "com.android.renderscript.cache";
    public static final int CREATE_FLAG_NONE = 0;
    static final boolean DEBUG = false;
    static final boolean LOG_ENABLED = false;
    static final String LOG_TAG = "RenderScript_jni";
    static final int SUPPORT_LIB_API = 23;
    static final int SUPPORT_LIB_VERSION = 2301;
    static String mCachePath;
    static Method registerNativeAllocation;
    static Method registerNativeFree;
    static boolean sInitialized;
    static int sPointerSize;
    static Object sRuntime;
    static boolean sUseGCHooks;
    private static boolean useNative;
    private Context mApplicationContext;
    long mContext;
    Element mElement_ALLOCATION;
    Element mElement_A_8;
    Element mElement_BOOLEAN;
    Element mElement_CHAR_2;
    Element mElement_CHAR_3;
    Element mElement_CHAR_4;
    Element mElement_DOUBLE_2;
    Element mElement_DOUBLE_3;
    Element mElement_DOUBLE_4;
    Element mElement_ELEMENT;
    Element mElement_F32;
    Element mElement_F64;
    Element mElement_FLOAT_2;
    Element mElement_FLOAT_3;
    Element mElement_FLOAT_4;
    Element mElement_I16;
    Element mElement_I32;
    Element mElement_I64;
    Element mElement_I8;
    Element mElement_INT_2;
    Element mElement_INT_3;
    Element mElement_INT_4;
    Element mElement_LONG_2;
    Element mElement_LONG_3;
    Element mElement_LONG_4;
    Element mElement_MATRIX_2X2;
    Element mElement_MATRIX_3X3;
    Element mElement_MATRIX_4X4;
    Element mElement_RGBA_4444;
    Element mElement_RGBA_5551;
    Element mElement_RGBA_8888;
    Element mElement_RGB_565;
    Element mElement_RGB_888;
    Element mElement_SAMPLER;
    Element mElement_SCRIPT;
    Element mElement_SHORT_2;
    Element mElement_SHORT_3;
    Element mElement_SHORT_4;
    Element mElement_TYPE;
    Element mElement_U16;
    Element mElement_U32;
    Element mElement_U64;
    Element mElement_U8;
    Element mElement_UCHAR_2;
    Element mElement_UCHAR_3;
    Element mElement_UCHAR_4;
    Element mElement_UINT_2;
    Element mElement_UINT_3;
    Element mElement_UINT_4;
    Element mElement_ULONG_2;
    Element mElement_ULONG_3;
    Element mElement_ULONG_4;
    Element mElement_USHORT_2;
    Element mElement_USHORT_3;
    Element mElement_USHORT_4;
    long mIncCon;
    boolean mIncLoaded;
    MessageThread mMessageThread;
    private String mNativeLibDir;
    ReentrantReadWriteLock mRWLock;
    Sampler mSampler_CLAMP_LINEAR;
    Sampler mSampler_CLAMP_LINEAR_MIP_LINEAR;
    Sampler mSampler_CLAMP_NEAREST;
    Sampler mSampler_MIRRORED_REPEAT_LINEAR;
    Sampler mSampler_MIRRORED_REPEAT_LINEAR_MIP_LINEAR;
    Sampler mSampler_MIRRORED_REPEAT_NEAREST;
    Sampler mSampler_WRAP_LINEAR;
    Sampler mSampler_WRAP_LINEAR_MIP_LINEAR;
    Sampler mSampler_WRAP_NEAREST;
    private static ArrayList<RenderScript> mProcessContextList = new ArrayList<>();
    private static String mBlackList = "";
    static Object lock = new Object();
    private static int sNative = -1;
    private static int sSdkVersion = -1;
    private static boolean useIOlib = false;
    private boolean mIsProcessContext = false;
    private boolean mEnableMultiInput = false;
    private int mDispatchAPILevel = 0;
    private int mContextFlags = 0;
    private int mContextSdkVersion = 0;
    private boolean mDestroyed = false;
    RSMessageHandler mMessageCallback = null;
    RSErrorHandler mErrorCallback = null;
    ContextType mContextType = ContextType.NORMAL;

    static native int rsnSystemGetPointerSize();

    native void nContextDeinitToClient(long j);

    native String nContextGetErrorMessage(long j);

    native int nContextGetUserMessage(long j, int[] iArr);

    native void nContextInitToClient(long j);

    native int nContextPeekMessage(long j, int[] iArr);

    native long nDeviceCreate();

    native void nDeviceDestroy(long j);

    native void nDeviceSetConfig(long j, int i, int i2);

    native long nIncDeviceCreate();

    native void nIncDeviceDestroy(long j);

    native boolean nIncLoadSO(int i, String str);

    native boolean nLoadIOSO();

    native boolean nLoadSO(boolean z, int i, String str);

    native void rsnAllocationCopyFromBitmap(long j, long j2, Bitmap bitmap);

    native void rsnAllocationCopyToBitmap(long j, long j2, Bitmap bitmap);

    native long rsnAllocationCreateBitmapBackedAllocation(long j, long j2, int i, Bitmap bitmap, int i2);

    native long rsnAllocationCreateBitmapRef(long j, long j2, Bitmap bitmap);

    native long rsnAllocationCreateFromAssetStream(long j, int i, int i2, int i3);

    native long rsnAllocationCreateFromBitmap(long j, long j2, int i, Bitmap bitmap, int i2);

    native long rsnAllocationCreateTyped(long j, long j2, int i, int i2, long j3);

    native long rsnAllocationCubeCreateFromBitmap(long j, long j2, int i, Bitmap bitmap, int i2);

    native void rsnAllocationData1D(long j, long j2, int i, int i2, int i3, Object obj, int i4, int i5, int i6, boolean z);

    native void rsnAllocationData2D(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, long j3, int i7, int i8, int i9, int i10);

    native void rsnAllocationData2D(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, Object obj, int i7, int i8, int i9, boolean z);

    native void rsnAllocationData2D(long j, long j2, int i, int i2, int i3, int i4, Bitmap bitmap);

    native void rsnAllocationData3D(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j3, int i8, int i9, int i10, int i11);

    native void rsnAllocationData3D(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj, int i8, int i9, int i10, boolean z);

    native void rsnAllocationElementData1D(long j, long j2, int i, int i2, int i3, byte[] bArr, int i4);

    native void rsnAllocationGenerateMipmaps(long j, long j2);

    native ByteBuffer rsnAllocationGetByteBuffer(long j, long j2, int i, int i2, int i3);

    native long rsnAllocationGetStride(long j, long j2);

    native long rsnAllocationGetType(long j, long j2);

    native void rsnAllocationIoReceive(long j, long j2);

    native void rsnAllocationIoSend(long j, long j2);

    native void rsnAllocationRead(long j, long j2, Object obj, int i, int i2, boolean z);

    native void rsnAllocationRead1D(long j, long j2, int i, int i2, int i3, Object obj, int i4, int i5, int i6, boolean z);

    native void rsnAllocationRead2D(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, Object obj, int i7, int i8, int i9, boolean z);

    native void rsnAllocationResize1D(long j, long j2, int i);

    native void rsnAllocationResize2D(long j, long j2, int i, int i2);

    native void rsnAllocationSetSurface(long j, long j2, Surface surface);

    native void rsnAllocationSyncAll(long j, long j2, int i);

    native long rsnClosureCreate(long j, long j2, long j3, long[] jArr, long[] jArr2, int[] iArr, long[] jArr3, long[] jArr4);

    native void rsnClosureSetArg(long j, long j2, int i, long j3, int i2);

    native void rsnClosureSetGlobal(long j, long j2, long j3, long j4, int i);

    native long rsnContextCreate(long j, int i, int i2, int i3, String str);

    native void rsnContextDestroy(long j);

    native void rsnContextDump(long j, int i);

    native void rsnContextFinish(long j);

    native void rsnContextSendMessage(long j, int i, int[] iArr);

    native void rsnContextSetPriority(long j, int i);

    native long rsnElementCreate(long j, long j2, int i, boolean z, int i2);

    native long rsnElementCreate2(long j, long[] jArr, String[] strArr, int[] iArr);

    native void rsnElementGetNativeData(long j, long j2, int[] iArr);

    native void rsnElementGetSubElements(long j, long j2, long[] jArr, String[] strArr, int[] iArr);

    native long rsnIncAllocationCreateTyped(long j, long j2, long j3, long j4, int i);

    native long rsnIncContextCreate(long j, int i, int i2, int i3);

    native void rsnIncContextDestroy(long j);

    native void rsnIncContextFinish(long j);

    native long rsnIncElementCreate(long j, long j2, int i, boolean z, int i2);

    native void rsnIncObjDestroy(long j, long j2);

    native long rsnIncTypeCreate(long j, long j2, int i, int i2, int i3, boolean z, boolean z2, int i4);

    native long rsnInvokeClosureCreate(long j, long j2, byte[] bArr, long[] jArr, long[] jArr2, int[] iArr);

    native void rsnObjDestroy(long j, long j2);

    native long rsnSamplerCreate(long j, int i, int i2, int i3, int i4, int i5, float f);

    native void rsnScriptBindAllocation(long j, long j2, long j3, int i, boolean z);

    native long rsnScriptCCreate(long j, String str, String str2, byte[] bArr, int i);

    native long rsnScriptFieldIDCreate(long j, long j2, int i, boolean z);

    native void rsnScriptForEach(long j, long j2, int i, long[] jArr, long j3, byte[] bArr, int[] iArr);

    native void rsnScriptForEach(long j, long j2, long j3, int i, long j4, long j5, boolean z);

    native void rsnScriptForEach(long j, long j2, long j3, int i, long j4, long j5, byte[] bArr, boolean z);

    native void rsnScriptForEachClipped(long j, long j2, long j3, int i, long j4, long j5, int i2, int i3, int i4, int i5, int i6, int i7, boolean z);

    native void rsnScriptForEachClipped(long j, long j2, long j3, int i, long j4, long j5, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z);

    native long rsnScriptGroup2Create(long j, String str, String str2, long[] jArr);

    native void rsnScriptGroup2Execute(long j, long j2);

    native long rsnScriptGroupCreate(long j, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long[] jArr5);

    native void rsnScriptGroupExecute(long j, long j2);

    native void rsnScriptGroupSetInput(long j, long j2, long j3, long j4);

    native void rsnScriptGroupSetOutput(long j, long j2, long j3, long j4);

    native void rsnScriptIntrinsicBLAS_BNNM(long j, long j2, long j3, int i, int i2, int i3, long j4, int i4, long j5, int i5, long j6, int i6, int i7, boolean z);

    native void rsnScriptIntrinsicBLAS_Complex(long j, long j2, long j3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, float f2, long j4, long j5, float f3, float f4, long j6, int i10, int i11, int i12, int i13, boolean z);

    native void rsnScriptIntrinsicBLAS_Double(long j, long j2, long j3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, double d, long j4, long j5, double d2, long j6, int i10, int i11, int i12, int i13, boolean z);

    native void rsnScriptIntrinsicBLAS_Single(long j, long j2, long j3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, long j4, long j5, float f2, long j6, int i10, int i11, int i12, int i13, boolean z);

    native void rsnScriptIntrinsicBLAS_Z(long j, long j2, long j3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, double d, double d2, long j4, long j5, double d3, double d4, long j6, int i10, int i11, int i12, int i13, boolean z);

    native long rsnScriptIntrinsicCreate(long j, int i, long j2, boolean z);

    native void rsnScriptInvoke(long j, long j2, int i, boolean z);

    native long rsnScriptInvokeIDCreate(long j, long j2, int i);

    native void rsnScriptInvokeV(long j, long j2, int i, byte[] bArr, boolean z);

    native long rsnScriptKernelIDCreate(long j, long j2, int i, int i2, boolean z);

    native void rsnScriptReduce(long j, long j2, int i, long[] jArr, long j3, int[] iArr);

    native void rsnScriptSetTimeZone(long j, long j2, byte[] bArr, boolean z);

    native void rsnScriptSetVarD(long j, long j2, int i, double d, boolean z);

    native void rsnScriptSetVarF(long j, long j2, int i, float f, boolean z);

    native void rsnScriptSetVarI(long j, long j2, int i, int i2, boolean z);

    native void rsnScriptSetVarJ(long j, long j2, int i, long j3, boolean z);

    native void rsnScriptSetVarObj(long j, long j2, int i, long j3, boolean z);

    native void rsnScriptSetVarV(long j, long j2, int i, byte[] bArr, boolean z);

    native void rsnScriptSetVarVE(long j, long j2, int i, byte[] bArr, long j3, int[] iArr, boolean z);

    native long rsnTypeCreate(long j, long j2, int i, int i2, int i3, boolean z, boolean z2, int i4);

    native void rsnTypeGetNativeData(long j, long j2, long[] jArr);

    public static void setBlackList(String blackList) {
        if (blackList != null) {
            mBlackList = blackList;
        }
    }

    public static void forceCompat() {
        sNative = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getDispatchAPILevel() {
        return this.mDispatchAPILevel;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isUseNative() {
        return useNative;
    }

    public static int getPointerSize() {
        synchronized (lock) {
            if (!sInitialized) {
                throw new RSInvalidStateException("Calling getPointerSize() before any RenderScript instantiated");
            }
        }
        return sPointerSize;
    }

    private static boolean setupNative(int sdkVersion, Context ctx) {
        if (Build.VERSION.SDK_INT < sdkVersion && Build.VERSION.SDK_INT < 21) {
            sNative = 0;
        }
        if (sNative == -1) {
            int forcecompat = 0;
            try {
                Class<?> sysprop = Class.forName("android.os.SystemProperties");
                Class[] signature = {String.class, Integer.TYPE};
                Method getint = sysprop.getDeclaredMethod("getInt", signature);
                Object[] args = {"debug.rs.forcecompat", new Integer(0)};
                forcecompat = ((Integer) getint.invoke(null, args)).intValue();
            } catch (Exception e) {
            }
            if (Build.VERSION.SDK_INT >= 19 && forcecompat == 0) {
                sNative = 1;
            } else {
                sNative = 0;
            }
            if (sNative == 1) {
                try {
                    ApplicationInfo info = ctx.getPackageManager().getApplicationInfo(ctx.getPackageName(), 128);
                    long minorVersion = 0;
                    try {
                        Class<?> javaRS = Class.forName("android.renderscript.RenderScript");
                        Method getMinorID = javaRS.getDeclaredMethod("getMinorID", new Class[0]);
                        minorVersion = ((Long) getMinorID.invoke(null, new Object[0])).longValue();
                    } catch (Exception e2) {
                    }
                    if (info.metaData != null) {
                        if (info.metaData.getBoolean("androidx.renderscript.EnableAsyncTeardown") && minorVersion == 0) {
                            sNative = 0;
                        }
                        if (info.metaData.getBoolean("androidx.renderscript.EnableBlurWorkaround") && Build.VERSION.SDK_INT <= 19) {
                            sNative = 0;
                        }
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    return true;
                }
            }
        }
        int forcecompat2 = sNative;
        if (forcecompat2 == 1) {
            if (mBlackList.length() > 0) {
                String deviceInfo = '(' + Build.MANUFACTURER + ':' + Build.PRODUCT + ':' + Build.MODEL + ')';
                if (mBlackList.contains(deviceInfo)) {
                    sNative = 0;
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void setupDiskCache(File cacheDir) {
        File f = new File(cacheDir, CACHE_PATH);
        mCachePath = f.getAbsolutePath();
        f.mkdirs();
    }

    /* loaded from: classes6.dex */
    public enum ContextType {
        NORMAL(0),
        DEBUG(1),
        PROFILE(2);
        
        int mID;

        ContextType(int id) {
            this.mID = id;
        }
    }

    synchronized long nContextCreate(long dev, int ver, int sdkVer, int contextType, String nativeLibDir) {
        return rsnContextCreate(dev, ver, sdkVer, contextType, nativeLibDir);
    }

    synchronized void nContextDestroy() {
        validate();
        ReentrantReadWriteLock.WriteLock wlock = this.mRWLock.writeLock();
        wlock.lock();
        long curCon = this.mContext;
        this.mContext = 0L;
        wlock.unlock();
        rsnContextDestroy(curCon);
    }

    synchronized void nContextSetPriority(int p) {
        validate();
        rsnContextSetPriority(this.mContext, p);
    }

    synchronized void nContextDump(int bits) {
        validate();
        rsnContextDump(this.mContext, bits);
    }

    synchronized void nContextFinish() {
        validate();
        rsnContextFinish(this.mContext);
    }

    synchronized void nContextSendMessage(int id, int[] data) {
        validate();
        rsnContextSendMessage(this.mContext, id, data);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void nObjDestroy(long id) {
        long j = this.mContext;
        if (j != 0) {
            rsnObjDestroy(j, id);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long nElementCreate(long type, int kind, boolean norm, int vecSize) {
        validate();
        return rsnElementCreate(this.mContext, type, kind, norm, vecSize);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long nElementCreate2(long[] elements, String[] names, int[] arraySizes) {
        validate();
        return rsnElementCreate2(this.mContext, elements, names, arraySizes);
    }

    synchronized void nElementGetNativeData(long id, int[] elementData) {
        validate();
        rsnElementGetNativeData(this.mContext, id, elementData);
    }

    synchronized void nElementGetSubElements(long id, long[] IDs, String[] names, int[] arraySizes) {
        validate();
        rsnElementGetSubElements(this.mContext, id, IDs, names, arraySizes);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long nTypeCreate(long eid, int x, int y, int z, boolean mips, boolean faces, int yuv) {
        validate();
        return rsnTypeCreate(this.mContext, eid, x, y, z, mips, faces, yuv);
    }

    synchronized void nTypeGetNativeData(long id, long[] typeData) {
        validate();
        rsnTypeGetNativeData(this.mContext, id, typeData);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long nAllocationCreateTyped(long type, int mip, int usage, long pointer) {
        validate();
        return rsnAllocationCreateTyped(this.mContext, type, mip, usage, pointer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long nAllocationCreateFromBitmap(long type, int mip, Bitmap bmp, int usage) {
        validate();
        return rsnAllocationCreateFromBitmap(this.mContext, type, mip, bmp, usage);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long nAllocationCreateBitmapBackedAllocation(long type, int mip, Bitmap bmp, int usage) {
        validate();
        return rsnAllocationCreateBitmapBackedAllocation(this.mContext, type, mip, bmp, usage);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long nAllocationCubeCreateFromBitmap(long type, int mip, Bitmap bmp, int usage) {
        validate();
        return rsnAllocationCubeCreateFromBitmap(this.mContext, type, mip, bmp, usage);
    }

    synchronized long nAllocationCreateBitmapRef(long type, Bitmap bmp) {
        validate();
        return rsnAllocationCreateBitmapRef(this.mContext, type, bmp);
    }

    synchronized long nAllocationCreateFromAssetStream(int mips, int assetStream, int usage) {
        validate();
        return rsnAllocationCreateFromAssetStream(this.mContext, mips, assetStream, usage);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nAllocationCopyToBitmap(long alloc, Bitmap bmp) {
        validate();
        rsnAllocationCopyToBitmap(this.mContext, alloc, bmp);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nAllocationSyncAll(long alloc, int src) {
        validate();
        rsnAllocationSyncAll(this.mContext, alloc, src);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nAllocationSetSurface(long alloc, Surface sur) {
        validate();
        rsnAllocationSetSurface(this.mContext, alloc, sur);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nAllocationIoSend(long alloc) {
        validate();
        rsnAllocationIoSend(this.mContext, alloc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nAllocationIoReceive(long alloc) {
        validate();
        rsnAllocationIoReceive(this.mContext, alloc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized ByteBuffer nAllocationGetByteBuffer(long alloc, int xBytesSize, int dimY, int dimZ) {
        validate();
        return rsnAllocationGetByteBuffer(this.mContext, alloc, xBytesSize, dimY, dimZ);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long nAllocationGetStride(long alloc) {
        validate();
        return rsnAllocationGetStride(this.mContext, alloc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nAllocationGenerateMipmaps(long alloc) {
        validate();
        rsnAllocationGenerateMipmaps(this.mContext, alloc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nAllocationCopyFromBitmap(long alloc, Bitmap bmp) {
        validate();
        rsnAllocationCopyFromBitmap(this.mContext, alloc, bmp);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nAllocationData1D(long id, int off, int mip, int count, Object d, int sizeBytes, Element.DataType dt, int mSize, boolean usePadding) {
        validate();
        rsnAllocationData1D(this.mContext, id, off, mip, count, d, sizeBytes, dt.mID, mSize, usePadding);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nAllocationElementData1D(long id, int xoff, int mip, int compIdx, byte[] d, int sizeBytes) {
        validate();
        rsnAllocationElementData1D(this.mContext, id, xoff, mip, compIdx, d, sizeBytes);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nAllocationData2D(long dstAlloc, int dstXoff, int dstYoff, int dstMip, int dstFace, int width, int height, long srcAlloc, int srcXoff, int srcYoff, int srcMip, int srcFace) {
        validate();
        rsnAllocationData2D(this.mContext, dstAlloc, dstXoff, dstYoff, dstMip, dstFace, width, height, srcAlloc, srcXoff, srcYoff, srcMip, srcFace);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nAllocationData2D(long id, int xoff, int yoff, int mip, int face, int w, int h, Object d, int sizeBytes, Element.DataType dt, int mSize, boolean usePadding) {
        validate();
        rsnAllocationData2D(this.mContext, id, xoff, yoff, mip, face, w, h, d, sizeBytes, dt.mID, mSize, usePadding);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nAllocationData2D(long id, int xoff, int yoff, int mip, int face, Bitmap b) {
        validate();
        rsnAllocationData2D(this.mContext, id, xoff, yoff, mip, face, b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nAllocationData3D(long dstAlloc, int dstXoff, int dstYoff, int dstZoff, int dstMip, int width, int height, int depth, long srcAlloc, int srcXoff, int srcYoff, int srcZoff, int srcMip) {
        validate();
        rsnAllocationData3D(this.mContext, dstAlloc, dstXoff, dstYoff, dstZoff, dstMip, width, height, depth, srcAlloc, srcXoff, srcYoff, srcZoff, srcMip);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nAllocationData3D(long id, int xoff, int yoff, int zoff, int mip, int w, int h, int depth, Object d, int sizeBytes, Element.DataType dt, int mSize, boolean usePadding) {
        validate();
        rsnAllocationData3D(this.mContext, id, xoff, yoff, zoff, mip, w, h, depth, d, sizeBytes, dt.mID, mSize, usePadding);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nAllocationRead(long id, Object d, Element.DataType dt, int mSize, boolean usePadding) {
        validate();
        rsnAllocationRead(this.mContext, id, d, dt.mID, mSize, usePadding);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nAllocationRead1D(long id, int off, int mip, int count, Object d, int sizeBytes, Element.DataType dt, int mSize, boolean usePadding) {
        validate();
        rsnAllocationRead1D(this.mContext, id, off, mip, count, d, sizeBytes, dt.mID, mSize, usePadding);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nAllocationRead2D(long id, int xoff, int yoff, int mip, int face, int w, int h, Object d, int sizeBytes, Element.DataType dt, int mSize, boolean usePadding) {
        validate();
        rsnAllocationRead2D(this.mContext, id, xoff, yoff, mip, face, w, h, d, sizeBytes, dt.mID, mSize, usePadding);
    }

    synchronized long nAllocationGetType(long id) {
        validate();
        return rsnAllocationGetType(this.mContext, id);
    }

    synchronized void nAllocationResize1D(long id, int dimX) {
        validate();
        rsnAllocationResize1D(this.mContext, id, dimX);
    }

    synchronized void nAllocationResize2D(long id, int dimX, int dimY) {
        validate();
        rsnAllocationResize2D(this.mContext, id, dimX, dimY);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptBindAllocation(long script, long alloc, int slot, boolean mUseInc) {
        long curCon;
        validate();
        long curCon2 = this.mContext;
        if (!mUseInc) {
            curCon = curCon2;
        } else {
            long curCon3 = this.mIncCon;
            curCon = curCon3;
        }
        rsnScriptBindAllocation(curCon, script, alloc, slot, mUseInc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptSetTimeZone(long script, byte[] timeZone, boolean mUseInc) {
        long curCon;
        validate();
        long curCon2 = this.mContext;
        if (!mUseInc) {
            curCon = curCon2;
        } else {
            long curCon3 = this.mIncCon;
            curCon = curCon3;
        }
        rsnScriptSetTimeZone(curCon, script, timeZone, mUseInc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptInvoke(long id, int slot, boolean mUseInc) {
        long curCon;
        validate();
        long curCon2 = this.mContext;
        if (!mUseInc) {
            curCon = curCon2;
        } else {
            long curCon3 = this.mIncCon;
            curCon = curCon3;
        }
        rsnScriptInvoke(curCon, id, slot, mUseInc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptForEach(long id, int slot, long ain, long aout, byte[] params, boolean mUseInc) {
        validate();
        if (params == null) {
            rsnScriptForEach(this.mContext, this.mIncCon, id, slot, ain, aout, mUseInc);
        } else {
            rsnScriptForEach(this.mContext, this.mIncCon, id, slot, ain, aout, params, mUseInc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptForEachClipped(long id, int slot, long ain, long aout, byte[] params, int xstart, int xend, int ystart, int yend, int zstart, int zend, boolean mUseInc) {
        validate();
        if (params == null) {
            rsnScriptForEachClipped(this.mContext, this.mIncCon, id, slot, ain, aout, xstart, xend, ystart, yend, zstart, zend, mUseInc);
        } else {
            rsnScriptForEachClipped(this.mContext, this.mIncCon, id, slot, ain, aout, params, xstart, xend, ystart, yend, zstart, zend, mUseInc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptForEach(long id, int slot, long[] ains, long aout, byte[] params, int[] limits) {
        if (!this.mEnableMultiInput) {
            Log.e(LOG_TAG, "Multi-input kernels are not supported, please change targetSdkVersion to >= 23");
            throw new RSRuntimeException("Multi-input kernels are not supported before API 23)");
        } else {
            validate();
            rsnScriptForEach(this.mContext, id, slot, ains, aout, params, limits);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptReduce(long id, int slot, long[] ains, long aout, int[] limits) {
        validate();
        rsnScriptReduce(this.mContext, id, slot, ains, aout, limits);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptInvokeV(long id, int slot, byte[] params, boolean mUseInc) {
        long curCon;
        validate();
        long curCon2 = this.mContext;
        if (!mUseInc) {
            curCon = curCon2;
        } else {
            long curCon3 = this.mIncCon;
            curCon = curCon3;
        }
        rsnScriptInvokeV(curCon, id, slot, params, mUseInc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptSetVarI(long id, int slot, int val, boolean mUseInc) {
        long curCon;
        validate();
        long curCon2 = this.mContext;
        if (!mUseInc) {
            curCon = curCon2;
        } else {
            long curCon3 = this.mIncCon;
            curCon = curCon3;
        }
        rsnScriptSetVarI(curCon, id, slot, val, mUseInc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptSetVarJ(long id, int slot, long val, boolean mUseInc) {
        long curCon;
        validate();
        long curCon2 = this.mContext;
        if (!mUseInc) {
            curCon = curCon2;
        } else {
            long curCon3 = this.mIncCon;
            curCon = curCon3;
        }
        rsnScriptSetVarJ(curCon, id, slot, val, mUseInc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptSetVarF(long id, int slot, float val, boolean mUseInc) {
        long curCon;
        validate();
        long curCon2 = this.mContext;
        if (!mUseInc) {
            curCon = curCon2;
        } else {
            long curCon3 = this.mIncCon;
            curCon = curCon3;
        }
        rsnScriptSetVarF(curCon, id, slot, val, mUseInc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptSetVarD(long id, int slot, double val, boolean mUseInc) {
        long curCon;
        validate();
        long curCon2 = this.mContext;
        if (!mUseInc) {
            curCon = curCon2;
        } else {
            long curCon3 = this.mIncCon;
            curCon = curCon3;
        }
        rsnScriptSetVarD(curCon, id, slot, val, mUseInc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptSetVarV(long id, int slot, byte[] val, boolean mUseInc) {
        long curCon;
        validate();
        long curCon2 = this.mContext;
        if (!mUseInc) {
            curCon = curCon2;
        } else {
            long curCon3 = this.mIncCon;
            curCon = curCon3;
        }
        rsnScriptSetVarV(curCon, id, slot, val, mUseInc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptSetVarVE(long id, int slot, byte[] val, long e, int[] dims, boolean mUseInc) {
        long curCon;
        validate();
        long curCon2 = this.mContext;
        if (!mUseInc) {
            curCon = curCon2;
        } else {
            long curCon3 = this.mIncCon;
            curCon = curCon3;
        }
        rsnScriptSetVarVE(curCon, id, slot, val, e, dims, mUseInc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptSetVarObj(long id, int slot, long val, boolean mUseInc) {
        long curCon;
        validate();
        long curCon2 = this.mContext;
        if (!mUseInc) {
            curCon = curCon2;
        } else {
            long curCon3 = this.mIncCon;
            curCon = curCon3;
        }
        rsnScriptSetVarObj(curCon, id, slot, val, mUseInc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long nScriptCCreate(String resName, String cacheDir, byte[] script, int length) {
        validate();
        return rsnScriptCCreate(this.mContext, resName, cacheDir, script, length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long nScriptIntrinsicCreate(int id, long eid, boolean mUseInc) {
        validate();
        if (mUseInc) {
            if (Build.VERSION.SDK_INT < 21) {
                Log.e(LOG_TAG, "Incremental Intrinsics are not supported, please change targetSdkVersion to >= 21");
                throw new RSRuntimeException("Incremental Intrinsics are not supported before Lollipop (API 21)");
            }
            if (!this.mIncLoaded) {
                try {
                    System.loadLibrary("RSSupport");
                    if (!nIncLoadSO(23, this.mNativeLibDir + "/libRSSupport.so")) {
                        throw new RSRuntimeException("Error loading libRSSupport library for Incremental Intrinsic Support");
                    }
                    this.mIncLoaded = true;
                } catch (UnsatisfiedLinkError e) {
                    Log.e(LOG_TAG, "Error loading RS Compat library for Incremental Intrinsic Support: " + e);
                    throw new RSRuntimeException("Error loading RS Compat library for Incremental Intrinsic Support: " + e);
                }
            }
            if (this.mIncCon == 0) {
                long device = nIncDeviceCreate();
                this.mIncCon = nIncContextCreate(device, 0, 0, 0);
            }
            return rsnScriptIntrinsicCreate(this.mIncCon, id, eid, mUseInc);
        }
        return rsnScriptIntrinsicCreate(this.mContext, id, eid, mUseInc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long nScriptKernelIDCreate(long sid, int slot, int sig, boolean mUseInc) {
        long curCon;
        validate();
        long curCon2 = this.mContext;
        if (!mUseInc) {
            curCon = curCon2;
        } else {
            long curCon3 = this.mIncCon;
            curCon = curCon3;
        }
        return rsnScriptKernelIDCreate(curCon, sid, slot, sig, mUseInc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long nScriptInvokeIDCreate(long sid, int slot) {
        validate();
        return rsnScriptInvokeIDCreate(this.mContext, sid, slot);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long nScriptFieldIDCreate(long sid, int slot, boolean mUseInc) {
        long curCon;
        validate();
        long curCon2 = this.mContext;
        if (!mUseInc) {
            curCon = curCon2;
        } else {
            long curCon3 = this.mIncCon;
            curCon = curCon3;
        }
        return rsnScriptFieldIDCreate(curCon, sid, slot, mUseInc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long nScriptGroupCreate(long[] kernels, long[] src, long[] dstk, long[] dstf, long[] types) {
        validate();
        return rsnScriptGroupCreate(this.mContext, kernels, src, dstk, dstf, types);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptGroupSetInput(long group, long kernel, long alloc) {
        validate();
        rsnScriptGroupSetInput(this.mContext, group, kernel, alloc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptGroupSetOutput(long group, long kernel, long alloc) {
        validate();
        rsnScriptGroupSetOutput(this.mContext, group, kernel, alloc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptGroupExecute(long group) {
        validate();
        rsnScriptGroupExecute(this.mContext, group);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long nSamplerCreate(int magFilter, int minFilter, int wrapS, int wrapT, int wrapR, float aniso) {
        validate();
        return rsnSamplerCreate(this.mContext, magFilter, minFilter, wrapS, wrapT, wrapR, aniso);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long nClosureCreate(long kernelID, long returnValue, long[] fieldIDs, long[] values, int[] sizes, long[] depClosures, long[] depFieldIDs) {
        long c;
        validate();
        c = rsnClosureCreate(this.mContext, kernelID, returnValue, fieldIDs, values, sizes, depClosures, depFieldIDs);
        if (c == 0) {
            throw new RSRuntimeException("Failed creating closure.");
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long nInvokeClosureCreate(long invokeID, byte[] params, long[] fieldIDs, long[] values, int[] sizes) {
        long c;
        validate();
        c = rsnInvokeClosureCreate(this.mContext, invokeID, params, fieldIDs, values, sizes);
        if (c == 0) {
            throw new RSRuntimeException("Failed creating closure.");
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nClosureSetArg(long closureID, int index, long value, int size) {
        validate();
        rsnClosureSetArg(this.mContext, closureID, index, value, size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nClosureSetGlobal(long closureID, long fieldID, long value, int size) {
        validate();
        rsnClosureSetGlobal(this.mContext, closureID, fieldID, value, size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long nScriptGroup2Create(String name, String cachePath, long[] closures) {
        validate();
        return rsnScriptGroup2Create(this.mContext, name, cachePath, closures);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptGroup2Execute(long groupID) {
        validate();
        rsnScriptGroup2Execute(this.mContext, groupID);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptIntrinsicBLAS_Single(long id, int func, int TransA, int TransB, int Side, int Uplo, int Diag, int M, int N, int K, float alpha, long A, long B, float beta, long C, int incX, int incY, int KL, int KU, boolean mUseInc) {
        validate();
        rsnScriptIntrinsicBLAS_Single(this.mContext, this.mIncCon, id, func, TransA, TransB, Side, Uplo, Diag, M, N, K, alpha, A, B, beta, C, incX, incY, KL, KU, mUseInc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptIntrinsicBLAS_Double(long id, int func, int TransA, int TransB, int Side, int Uplo, int Diag, int M, int N, int K, double alpha, long A, long B, double beta, long C, int incX, int incY, int KL, int KU, boolean mUseInc) {
        validate();
        rsnScriptIntrinsicBLAS_Double(this.mContext, this.mIncCon, id, func, TransA, TransB, Side, Uplo, Diag, M, N, K, alpha, A, B, beta, C, incX, incY, KL, KU, mUseInc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptIntrinsicBLAS_Complex(long id, int func, int TransA, int TransB, int Side, int Uplo, int Diag, int M, int N, int K, float alphaX, float alphaY, long A, long B, float betaX, float betaY, long C, int incX, int incY, int KL, int KU, boolean mUseInc) {
        validate();
        rsnScriptIntrinsicBLAS_Complex(this.mContext, this.mIncCon, id, func, TransA, TransB, Side, Uplo, Diag, M, N, K, alphaX, alphaY, A, B, betaX, betaY, C, incX, incY, KL, KU, mUseInc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptIntrinsicBLAS_Z(long id, int func, int TransA, int TransB, int Side, int Uplo, int Diag, int M, int N, int K, double alphaX, double alphaY, long A, long B, double betaX, double betaY, long C, int incX, int incY, int KL, int KU, boolean mUseInc) {
        validate();
        rsnScriptIntrinsicBLAS_Z(this.mContext, this.mIncCon, id, func, TransA, TransB, Side, Uplo, Diag, M, N, K, alphaX, alphaY, A, B, betaX, betaY, C, incX, incY, KL, KU, mUseInc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void nScriptIntrinsicBLAS_BNNM(long id, int M, int N, int K, long A, int a_offset, long B, int b_offset, long C, int c_offset, int c_mult_int, boolean mUseInc) {
        validate();
        rsnScriptIntrinsicBLAS_BNNM(this.mContext, this.mIncCon, id, M, N, K, A, a_offset, B, b_offset, C, c_offset, c_mult_int, mUseInc);
    }

    synchronized long nIncContextCreate(long dev, int ver, int sdkVer, int contextType) {
        return rsnIncContextCreate(dev, ver, sdkVer, contextType);
    }

    synchronized void nIncContextDestroy() {
        validate();
        ReentrantReadWriteLock.WriteLock wlock = this.mRWLock.writeLock();
        wlock.lock();
        long curCon = this.mIncCon;
        this.mIncCon = 0L;
        wlock.unlock();
        rsnIncContextDestroy(curCon);
    }

    synchronized void nIncContextFinish() {
        validate();
        rsnIncContextFinish(this.mIncCon);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void nIncObjDestroy(long id) {
        long j = this.mIncCon;
        if (j != 0) {
            rsnIncObjDestroy(j, id);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long nIncElementCreate(long type, int kind, boolean norm, int vecSize) {
        validate();
        return rsnIncElementCreate(this.mIncCon, type, kind, norm, vecSize);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long nIncTypeCreate(long eid, int x, int y, int z, boolean mips, boolean faces, int yuv) {
        validate();
        return rsnIncTypeCreate(this.mIncCon, eid, x, y, z, mips, faces, yuv);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized long nIncAllocationCreateTyped(long alloc, long type, int xBytesSize) {
        validate();
        return rsnIncAllocationCreateTyped(this.mContext, this.mIncCon, alloc, type, xBytesSize);
    }

    /* loaded from: classes6.dex */
    public static class RSMessageHandler implements Runnable {
        protected int[] mData;
        protected int mID;
        protected int mLength;

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public void setMessageHandler(RSMessageHandler msg) {
        this.mMessageCallback = msg;
    }

    public RSMessageHandler getMessageHandler() {
        return this.mMessageCallback;
    }

    public void sendMessage(int id, int[] data) {
        nContextSendMessage(id, data);
    }

    /* loaded from: classes6.dex */
    public static class RSErrorHandler implements Runnable {
        protected String mErrorMessage;
        protected int mErrorNum;

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public void setErrorHandler(RSErrorHandler msg) {
        this.mErrorCallback = msg;
    }

    public RSErrorHandler getErrorHandler() {
        return this.mErrorCallback;
    }

    /* loaded from: classes6.dex */
    public enum Priority {
        LOW(15),
        NORMAL(-4);
        
        int mID;

        Priority(int id) {
            this.mID = id;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void validateObject(BaseObj o) {
        if (o != null && o.mRS != this) {
            throw new RSIllegalArgumentException("Attempting to use an object across contexts.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void validate() {
        if (this.mContext == 0) {
            throw new RSInvalidStateException("Calling RS with no Context active.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean usingIO() {
        return useIOlib;
    }

    public void setPriority(Priority p) {
        validate();
        nContextSetPriority(p.mID);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class MessageThread extends Thread {
        static final int RS_ERROR_FATAL_DEBUG = 2048;
        static final int RS_ERROR_FATAL_UNKNOWN = 4096;
        static final int RS_MESSAGE_TO_CLIENT_ERROR = 3;
        static final int RS_MESSAGE_TO_CLIENT_EXCEPTION = 1;
        static final int RS_MESSAGE_TO_CLIENT_NONE = 0;
        static final int RS_MESSAGE_TO_CLIENT_RESIZE = 2;
        static final int RS_MESSAGE_TO_CLIENT_USER = 4;
        int[] mAuxData;
        RenderScript mRS;
        boolean mRun;

        MessageThread(RenderScript rs) {
            super("RSMessageThread");
            this.mRun = true;
            this.mAuxData = new int[2];
            this.mRS = rs;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int[] rbuf = new int[16];
            RenderScript renderScript = this.mRS;
            renderScript.nContextInitToClient(renderScript.mContext);
            while (this.mRun) {
                rbuf[0] = 0;
                RenderScript renderScript2 = this.mRS;
                int msg = renderScript2.nContextPeekMessage(renderScript2.mContext, this.mAuxData);
                int[] iArr = this.mAuxData;
                int size = iArr[1];
                int subID = iArr[0];
                if (msg == 4) {
                    if ((size >> 2) >= rbuf.length) {
                        rbuf = new int[(size + 3) >> 2];
                    }
                    RenderScript renderScript3 = this.mRS;
                    if (renderScript3.nContextGetUserMessage(renderScript3.mContext, rbuf) != 4) {
                        throw new RSDriverException("Error processing message from RenderScript.");
                    }
                    if (this.mRS.mMessageCallback != null) {
                        this.mRS.mMessageCallback.mData = rbuf;
                        this.mRS.mMessageCallback.mID = subID;
                        this.mRS.mMessageCallback.mLength = size;
                        this.mRS.mMessageCallback.run();
                    } else {
                        throw new RSInvalidStateException("Received a message from the script with no message handler installed.");
                    }
                } else if (msg != 3) {
                    try {
                        sleep(1L, 0);
                    } catch (InterruptedException e) {
                    }
                } else {
                    RenderScript renderScript4 = this.mRS;
                    String e2 = renderScript4.nContextGetErrorMessage(renderScript4.mContext);
                    if (subID >= 4096 || (subID >= 2048 && (this.mRS.mContextType != ContextType.DEBUG || this.mRS.mErrorCallback == null))) {
                        Log.e(RenderScript.LOG_TAG, "fatal RS error, " + e2);
                        throw new RSRuntimeException("Fatal error " + subID + ", details: " + e2);
                    } else if (this.mRS.mErrorCallback != null) {
                        this.mRS.mErrorCallback.mErrorMessage = e2;
                        this.mRS.mErrorCallback.mErrorNum = subID;
                        this.mRS.mErrorCallback.run();
                    } else {
                        Log.e(RenderScript.LOG_TAG, "non fatal RS error, " + e2);
                    }
                }
            }
        }
    }

    RenderScript(Context ctx) {
        if (ctx != null) {
            Context applicationContext = ctx.getApplicationContext();
            this.mApplicationContext = applicationContext;
            this.mNativeLibDir = applicationContext.getApplicationInfo().nativeLibraryDir;
        }
        this.mIncCon = 0L;
        this.mIncLoaded = false;
        this.mRWLock = new ReentrantReadWriteLock();
    }

    public final Context getApplicationContext() {
        return this.mApplicationContext;
    }

    private static RenderScript internalCreate(Context ctx, int sdkVersion, ContextType ct, int flags) {
        int dispatchAPI;
        String rssupportPath;
        RenderScript rs = new RenderScript(ctx);
        int i = sSdkVersion;
        if (i == -1) {
            sSdkVersion = sdkVersion;
        } else if (i != sdkVersion) {
            throw new RSRuntimeException("Can't have two contexts with different SDK versions in support lib");
        }
        useNative = setupNative(sSdkVersion, ctx);
        synchronized (lock) {
            if (!sInitialized) {
                try {
                    Class<?> vm_runtime = Class.forName("dalvik.system.VMRuntime");
                    Method get_runtime = vm_runtime.getDeclaredMethod("getRuntime", new Class[0]);
                    sRuntime = get_runtime.invoke(null, new Object[0]);
                    Class<?> argClass = Build.VERSION.SDK_INT >= 29 ? Long.TYPE : Integer.TYPE;
                    registerNativeAllocation = vm_runtime.getDeclaredMethod("registerNativeAllocation", argClass);
                    registerNativeFree = vm_runtime.getDeclaredMethod("registerNativeFree", argClass);
                    sUseGCHooks = true;
                } catch (Exception e) {
                    Log.e(LOG_TAG, "No GC methods");
                    sUseGCHooks = false;
                }
                try {
                    if (Build.VERSION.SDK_INT < 23 && rs.mNativeLibDir != null) {
                        System.load(rs.mNativeLibDir + "/librsjni.so");
                    } else {
                        System.loadLibrary("rsjni");
                    }
                    sInitialized = true;
                    sPointerSize = rsnSystemGetPointerSize();
                } catch (UnsatisfiedLinkError e2) {
                    Log.e(LOG_TAG, "Error loading RS jni library: " + e2);
                    throw new RSRuntimeException("Error loading RS jni library: " + e2 + " Support lib API: " + SUPPORT_LIB_VERSION);
                }
            }
        }
        if (useNative) {
            Log.v(LOG_TAG, "RS native mode");
        } else {
            Log.v(LOG_TAG, "RS compat mode");
        }
        if (Build.VERSION.SDK_INT >= 14) {
            useIOlib = true;
        }
        if (sdkVersion >= Build.VERSION.SDK_INT) {
            dispatchAPI = sdkVersion;
        } else {
            int dispatchAPI2 = Build.VERSION.SDK_INT;
            dispatchAPI = dispatchAPI2;
        }
        if (Build.VERSION.SDK_INT < 23 && rs.mNativeLibDir != null) {
            String rssupportPath2 = rs.mNativeLibDir + "/libRSSupport.so";
            rssupportPath = rssupportPath2;
        } else {
            rssupportPath = null;
        }
        if (!rs.nLoadSO(useNative, dispatchAPI, rssupportPath)) {
            if (useNative) {
                Log.v(LOG_TAG, "Unable to load libRS.so, falling back to compat mode");
                useNative = false;
            }
            try {
                if (Build.VERSION.SDK_INT < 23 && rs.mNativeLibDir != null) {
                    System.load(rssupportPath);
                } else {
                    System.loadLibrary("RSSupport");
                }
                if (!rs.nLoadSO(false, dispatchAPI, rssupportPath)) {
                    Log.e(LOG_TAG, "Error loading RS Compat library: nLoadSO() failed; Support lib version: 2301");
                    throw new RSRuntimeException("Error loading libRSSupport library, Support lib version: 2301");
                }
            } catch (UnsatisfiedLinkError e3) {
                Log.e(LOG_TAG, "Error loading RS Compat library: " + e3 + " Support lib version: " + SUPPORT_LIB_VERSION);
                throw new RSRuntimeException("Error loading RS Compat library: " + e3 + " Support lib version: " + SUPPORT_LIB_VERSION);
            }
        }
        if (useIOlib) {
            try {
                System.loadLibrary("RSSupportIO");
            } catch (UnsatisfiedLinkError e4) {
                useIOlib = false;
            }
            if (!useIOlib || !rs.nLoadIOSO()) {
                Log.v(LOG_TAG, "Unable to load libRSSupportIO.so, USAGE_IO not supported");
                useIOlib = false;
            }
        }
        if (dispatchAPI >= 23) {
            rs.mEnableMultiInput = true;
            try {
                System.loadLibrary("blasV8");
            } catch (UnsatisfiedLinkError e5) {
                Log.v(LOG_TAG, "Unable to load BLAS lib, ONLY BNNM will be supported: " + e5);
            }
        }
        long device = rs.nDeviceCreate();
        long nContextCreate = rs.nContextCreate(device, 0, sdkVersion, ct.mID, rs.mNativeLibDir);
        rs.mContext = nContextCreate;
        rs.mContextType = ct;
        rs.mContextFlags = flags;
        rs.mContextSdkVersion = sdkVersion;
        rs.mDispatchAPILevel = dispatchAPI;
        if (nContextCreate == 0) {
            throw new RSDriverException("Failed to create RS context.");
        }
        MessageThread messageThread = new MessageThread(rs);
        rs.mMessageThread = messageThread;
        messageThread.start();
        return rs;
    }

    public static RenderScript create(Context ctx) {
        return create(ctx, ContextType.NORMAL);
    }

    public static RenderScript create(Context ctx, ContextType ct) {
        return create(ctx, ct, 0);
    }

    public static RenderScript create(Context ctx, ContextType ct, int flags) {
        int v = ctx.getApplicationInfo().targetSdkVersion;
        return create(ctx, v, ct, flags);
    }

    public static RenderScript create(Context ctx, int sdkVersion) {
        return create(ctx, sdkVersion, ContextType.NORMAL, 0);
    }

    public static RenderScript create(Context ctx, int sdkVersion, ContextType ct) {
        return create(ctx, sdkVersion, ct, 0);
    }

    public static RenderScript create(Context ctx, int sdkVersion, ContextType ct, int flags) {
        synchronized (mProcessContextList) {
            Iterator<RenderScript> it = mProcessContextList.iterator();
            while (it.hasNext()) {
                RenderScript prs = it.next();
                if (prs.mContextType == ct && prs.mContextFlags == flags && prs.mContextSdkVersion == sdkVersion) {
                    return prs;
                }
            }
            RenderScript prs2 = internalCreate(ctx, sdkVersion, ct, flags);
            prs2.mIsProcessContext = true;
            mProcessContextList.add(prs2);
            return prs2;
        }
    }

    public static void releaseAllContexts() {
        ArrayList<RenderScript> oldList;
        synchronized (mProcessContextList) {
            oldList = mProcessContextList;
            mProcessContextList = new ArrayList<>();
        }
        Iterator<RenderScript> it = oldList.iterator();
        while (it.hasNext()) {
            RenderScript prs = it.next();
            prs.mIsProcessContext = false;
            prs.destroy();
        }
        oldList.clear();
    }

    public static RenderScript createMultiContext(Context ctx, ContextType ct, int flags, int API_number) {
        return internalCreate(ctx, API_number, ct, flags);
    }

    public void contextDump() {
        validate();
        nContextDump(0);
    }

    public void finish() {
        nContextFinish();
    }

    private void helpDestroy() {
        boolean shouldDestroy = false;
        synchronized (this) {
            if (!this.mDestroyed) {
                shouldDestroy = true;
                this.mDestroyed = true;
            }
        }
        if (shouldDestroy) {
            nContextFinish();
            if (this.mIncCon != 0) {
                nIncContextFinish();
                nIncContextDestroy();
                this.mIncCon = 0L;
            }
            nContextDeinitToClient(this.mContext);
            this.mMessageThread.mRun = false;
            this.mMessageThread.interrupt();
            boolean hasJoined = false;
            boolean interrupted = false;
            while (!hasJoined) {
                try {
                    this.mMessageThread.join();
                    hasJoined = true;
                } catch (InterruptedException e) {
                    interrupted = true;
                }
            }
            if (interrupted) {
                Log.v(LOG_TAG, "Interrupted during wait for MessageThread to join");
                Thread.currentThread().interrupt();
            }
            nContextDestroy();
        }
    }

    protected void finalize() throws Throwable {
        helpDestroy();
        super.finalize();
    }

    public void destroy() {
        if (this.mIsProcessContext) {
            return;
        }
        validate();
        helpDestroy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isAlive() {
        return this.mContext != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long safeID(BaseObj o) {
        if (o != null) {
            return o.getID(this);
        }
        return 0L;
    }
}
