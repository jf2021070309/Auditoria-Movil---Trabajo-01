package e.h.d;
/* loaded from: classes2.dex */
public enum w0 {
    NOT_SHUTTING_DOWN,
    ANDROID_HUNG,
    ON_TASK_REMOVED,
    USER_REQUESTED,
    NORMAL;

    public static boolean removeNotification(w0 w0Var) {
        int ordinal = w0Var.ordinal();
        return ordinal == 1 || ordinal == 3;
    }
}
