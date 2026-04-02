package androidx.renderscript;

import java.util.concurrent.locks.ReentrantReadWriteLock;
/* loaded from: classes6.dex */
public class BaseObj {
    private boolean mDestroyed;
    private long mID;
    RenderScript mRS;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseObj(long id, RenderScript rs) {
        rs.validate();
        this.mRS = rs;
        this.mID = id;
        this.mDestroyed = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setID(long id) {
        if (this.mID != 0) {
            throw new RSRuntimeException("Internal Error, reset of object ID.");
        }
        this.mID = id;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getID(RenderScript rs) {
        this.mRS.validate();
        if (this.mDestroyed) {
            throw new RSInvalidStateException("using a destroyed object.");
        }
        long j = this.mID;
        if (j == 0) {
            throw new RSRuntimeException("Internal error: Object id 0.");
        }
        if (rs != null && rs != this.mRS) {
            throw new RSInvalidStateException("using object with mismatched context.");
        }
        return j;
    }

    android.renderscript.BaseObj getNObj() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void checkValid() {
        if (this.mID == 0 && getNObj() == null) {
            throw new RSIllegalArgumentException("Invalid object.");
        }
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
            ReentrantReadWriteLock.ReadLock rlock = this.mRS.mRWLock.readLock();
            rlock.lock();
            if (this.mRS.isAlive()) {
                this.mRS.nObjDestroy(this.mID);
            }
            rlock.unlock();
            this.mRS = null;
            this.mID = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void finalize() throws Throwable {
        helpDestroy();
        super.finalize();
    }

    public void destroy() {
        if (this.mDestroyed) {
            throw new RSInvalidStateException("Object already destroyed.");
        }
        helpDestroy();
    }

    public int hashCode() {
        long j = this.mID;
        return (int) ((j >> 32) ^ (268435455 & j));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseObj b = (BaseObj) obj;
        return this.mID == b.mID;
    }
}
