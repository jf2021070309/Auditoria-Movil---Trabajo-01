package gonemad.gmmp.audioengine;
/* loaded from: classes2.dex */
public class DspManager {
    public static final int BUTTERWORTH_FILTER = 0;
    public static final int RBJ_BIQUAD_FILTER = 1;
    private static DspManager m_Instance;

    public DspManager() {
        create();
    }

    public static native double calculateCenterFrequency(int i2, int i3);

    private static native void create();

    private static native void destroy();

    public native double getBalance();

    public native double getBandFreq(int i2);

    public native double getBandGain(int i2);

    public native double getPreampGain();

    public native double getTempo();

    public void release() {
        destroy();
    }

    public native void reset();

    public native void setBalance(double d2);

    public native void setBandGain(int i2, double d2);

    public native void setBassGain(double d2);

    public native void setEqualizer(int i2, int i3, int i4, int i5, int i6);

    public native void setLimiterEnabled(boolean z);

    public native void setLimiterParams(int i2, int i3);

    public native void setPreampGain(double d2);

    public native void setTempo(double d2);
}
