package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* JADX WARN: Classes with same name are omitted:
  classes2.dex
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface OnLifecycleEvent {
    Lifecycle.Event value();
}
