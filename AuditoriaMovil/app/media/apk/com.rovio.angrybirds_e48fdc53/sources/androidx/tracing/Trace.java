package androidx.tracing;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes6.dex */
public final class Trace {
    static final String TAG = "Trace";
    private static Method sAsyncTraceBeginMethod;
    private static Method sAsyncTraceEndMethod;
    private static boolean sHasAppTracingEnabled;
    private static Method sIsTagEnabledMethod;
    private static Method sTraceCounterMethod;
    private static long sTraceTagApp;

    public static boolean isEnabled() {
        if (Build.VERSION.SDK_INT >= 29) {
            return TraceApi29Impl.isEnabled();
        }
        return isEnabledFallback();
    }

    public static void forceEnableAppTracing() {
        if (Build.VERSION.SDK_INT >= 18 && Build.VERSION.SDK_INT < 31) {
            try {
                if (!sHasAppTracingEnabled) {
                    sHasAppTracingEnabled = true;
                    Method setAppTracingAllowed = android.os.Trace.class.getMethod("setAppTracingAllowed", Boolean.TYPE);
                    setAppTracingAllowed.invoke(null, true);
                }
            } catch (Exception exception) {
                handleException("setAppTracingAllowed", exception);
            }
        }
    }

    public static void beginSection(String label) {
        if (Build.VERSION.SDK_INT >= 18) {
            TraceApi18Impl.beginSection(label);
        }
    }

    public static void endSection() {
        if (Build.VERSION.SDK_INT >= 18) {
            TraceApi18Impl.endSection();
        }
    }

    public static void beginAsyncSection(String methodName, int cookie) {
        if (Build.VERSION.SDK_INT >= 29) {
            TraceApi29Impl.beginAsyncSection(methodName, cookie);
        } else {
            beginAsyncSectionFallback(methodName, cookie);
        }
    }

    public static void endAsyncSection(String methodName, int cookie) {
        if (Build.VERSION.SDK_INT >= 29) {
            TraceApi29Impl.endAsyncSection(methodName, cookie);
        } else {
            endAsyncSectionFallback(methodName, cookie);
        }
    }

    public static void setCounter(String counterName, int counterValue) {
        if (Build.VERSION.SDK_INT >= 29) {
            TraceApi29Impl.setCounter(counterName, counterValue);
        } else {
            setCounterFallback(counterName, counterValue);
        }
    }

    private static boolean isEnabledFallback() {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (sIsTagEnabledMethod == null) {
                    Field traceTagAppField = android.os.Trace.class.getField("TRACE_TAG_APP");
                    sTraceTagApp = traceTagAppField.getLong(null);
                    sIsTagEnabledMethod = android.os.Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                return ((Boolean) sIsTagEnabledMethod.invoke(null, Long.valueOf(sTraceTagApp))).booleanValue();
            } catch (Exception exception) {
                handleException("isTagEnabled", exception);
            }
        }
        return false;
    }

    private static void beginAsyncSectionFallback(String methodName, int cookie) {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (sAsyncTraceBeginMethod == null) {
                    sAsyncTraceBeginMethod = android.os.Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                sAsyncTraceBeginMethod.invoke(null, Long.valueOf(sTraceTagApp), methodName, Integer.valueOf(cookie));
            } catch (Exception exception) {
                handleException("asyncTraceBegin", exception);
            }
        }
    }

    private static void endAsyncSectionFallback(String methodName, int cookie) {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (sAsyncTraceEndMethod == null) {
                    sAsyncTraceEndMethod = android.os.Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                }
                sAsyncTraceEndMethod.invoke(null, Long.valueOf(sTraceTagApp), methodName, Integer.valueOf(cookie));
            } catch (Exception exception) {
                handleException("asyncTraceEnd", exception);
            }
        }
    }

    private static void setCounterFallback(String counterName, int counterValue) {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (sTraceCounterMethod == null) {
                    sTraceCounterMethod = android.os.Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
                }
                sTraceCounterMethod.invoke(null, Long.valueOf(sTraceTagApp), counterName, Integer.valueOf(counterValue));
            } catch (Exception exception) {
                handleException("traceCounter", exception);
            }
        }
    }

    private static void handleException(String methodName, Exception exception) {
        if (exception instanceof InvocationTargetException) {
            Throwable cause = exception.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v(TAG, "Unable to call " + methodName + " via reflection", exception);
    }

    private Trace() {
    }
}
