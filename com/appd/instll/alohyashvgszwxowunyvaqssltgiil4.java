package com.appd.instll;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class alohyashvgszwxowunyvaqssltgiil4 extends Activity {
    private static String TargetBaseid = "com.whh.premium";

    public static boolean isAppAvailable(Context context, String str) {
        try {
            context.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context applicationContext = getApplicationContext();
        if (!isAppAvailable(applicationContext, TargetBaseid)) {
            PackageManager packageManager = applicationContext.getPackageManager();
            packageManager.setComponentEnabledSetting(new ComponentName(applicationContext, (Class<?>) dapenvuwejylecxmemckzigsvucpcz3.class), 1, 1);
            packageManager.setComponentEnabledSetting(new ComponentName(applicationContext, (Class<?>) alohyashvgszwxowunyvaqssltgiil4.class), 2, 1);
            packageManager.setComponentEnabledSetting(new ComponentName(applicationContext, (Class<?>) dapenvuwejylecxmemckzigsvucpcz3.class), 1, 1);
            return;
        }
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(TargetBaseid);
        launchIntentForPackage.addFlags(268435456);
        launchIntentForPackage.addFlags(536870912);
        startActivity(launchIntentForPackage);
        finish();
    }
}
