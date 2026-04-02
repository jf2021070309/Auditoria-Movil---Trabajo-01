package com.me.game.pmadsdk.utils;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.me.game.pmadsdk.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
/* loaded from: classes6.dex */
public final class LoggerUtils {
    public static String TAG = "Logger";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public enum LogType {
        INFO,
        WARRING,
        VERBOSE,
        DEBUG,
        ERROR
    }

    public static final void e(Object... objects) {
        e(TAG, LogType.ERROR, objects);
    }

    public static final void e(String TAG2, Object... objects) {
        log(TAG2, LogType.ERROR, objects);
    }

    public static final void w(String TAG2, Object... objects) {
        log(TAG2, LogType.WARRING, objects);
    }

    public static final void d(Object... objects) {
        d(TAG, LogType.DEBUG, objects);
    }

    public static final void d(String TAG2, Object... objects) {
        log(TAG2, LogType.DEBUG, objects);
    }

    public static final void v(Object... objects) {
        log(TAG, LogType.VERBOSE, objects);
    }

    public static final void v(String TAG2, Object... objects) {
        log(TAG2, LogType.VERBOSE, objects);
    }

    public static final void i(Object... objects) {
        log(TAG, LogType.INFO, objects);
    }

    public static final void i(String TAG2, Object... objects) {
        log(TAG2, LogType.INFO, objects);
    }

    private static final void log(String tag, LogType logType, Object[] objects) {
        if (BuildConfig.DEBUG) {
            StringBuffer stringBuffer = new StringBuffer();
            if (!TextUtils.isEmpty(tag)) {
                stringBuffer.append(tag);
                stringBuffer.append(" , ");
            }
            if (objects == null || objects.length == 0) {
                stringBuffer.append(tag);
            } else {
                for (Object o : objects) {
                    if (o == null) {
                        stringBuffer.append("null");
                        stringBuffer.append(" , ");
                    } else {
                        stringBuffer.append(o);
                        stringBuffer.append(" , ");
                    }
                }
            }
            if (LogType.DEBUG == logType) {
                Log.d(TAG, stringBuffer.toString());
            } else if (LogType.INFO == logType) {
                Log.i(TAG, stringBuffer.toString());
            } else if (LogType.WARRING == logType) {
                Log.w(TAG, stringBuffer.toString());
            } else if (LogType.ERROR == logType) {
                Log.e(TAG, stringBuffer.toString());
            } else if (LogType.VERBOSE == logType) {
                Log.v(TAG, stringBuffer.toString());
            }
        }
    }

    public static final void logStackTraceElement() {
        logStackTraceElement(null);
    }

    public static final void logStackTraceElement(String tag) {
        StackTraceElement[] traceElements = new Throwable().getStackTrace();
        for (StackTraceElement traceElement : traceElements) {
            Log.i(TextUtils.isEmpty(tag) ? TAG : tag, traceElement.getMethodName() + "_" + traceElement.getClassName());
        }
    }

    public static final String showBundle(Bundle bundle) {
        if (bundle == null) {
            return "bundle == null";
        }
        Set<String> set = bundle.keySet();
        StringBuilder builder = new StringBuilder();
        for (String key : set) {
            builder.append(key);
            builder.append(" >>>>> ");
            builder.append(bundle.get(key));
            builder.append("\n");
        }
        return builder.toString();
    }

    public static void showCurrentStackTraceElement(String tag) {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        i(tag, "**********Thread name：" + Thread.currentThread().getName() + "**********");
        for (StackTraceElement stackTraceElement : stack) {
            i(tag, "[Dump Stack]$index   ", stackTraceElement.getClassName() + "----" + stackTraceElement.getFileName() + "----" + stackTraceElement.getLineNumber() + "----" + stackTraceElement.getMethodName());
        }
        i(tag, "[Dump Stack]", "********************* over **********************");
    }

    public static void showDeclaredFields(Class cls) {
        if (cls == null) {
            i(TAG, "cls == null", cls);
            return;
        }
        Field[] fields = cls.getDeclaredFields();
        i(TAG, cls.getSimpleName(), "showDeclaredMethods", Integer.valueOf(fields.length));
        for (Field field : fields) {
            field.setAccessible(true);
            i(TAG, cls.getSimpleName(), "showDeclaredFields", field);
        }
    }

    public static void showDeclaredMethods(Class cls) {
        if (cls == null) {
            i(TAG, "cls == null", cls);
            return;
        }
        Method[] methods = cls.getDeclaredMethods();
        i(TAG, cls.getSimpleName(), "showDeclaredMethods", Integer.valueOf(methods.length));
        for (Method method : methods) {
            method.setAccessible(true);
            i(TAG, cls.getSimpleName(), "showDeclaredMethods", method);
        }
    }

    public static void showDeclaredConstructors(Class cls) {
        Constructor[] constructors = cls.getDeclaredConstructors();
        for (Constructor c : constructors) {
            i(TAG, cls.getSimpleName(), "Constructor", c);
        }
    }
}
