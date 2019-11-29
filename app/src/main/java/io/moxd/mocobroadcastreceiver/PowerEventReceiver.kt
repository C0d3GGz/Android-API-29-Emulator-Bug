package io.moxd.mocobroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class PowerEventReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == null) return
        when(intent.action) {
            Intent.ACTION_POWER_CONNECTED -> showToast(context, "Power connected")
            Intent.ACTION_POWER_DISCONNECTED -> showToast(context, "Power disconnected")
        }
    }

    private fun showToast(context: Context, text: String){
        Toast.makeText(context, text, Toast.LENGTH_LONG).show()
    }
}